# Extension Validation Report

- Extension: tachiyomi-pt.apenasumafa-v1.6.15
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 26
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6897166867127039489
- Source name: Apenas Uma Fã
- Source language: pt-BR
- Selected manga input: popular offset 0: Nós, Introvertidos (`.../nos-introvertidos.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Nós, Introvertidos (`.../nos-introvertidos.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nós, Introvertidos (`.../nos-introvertidos.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nós, Introvertidos (`.../nos-introvertidos.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 47 | Chapter 1 (`.../chapter-1_1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nós, Introvertidos, URL=`.../nos-introvertidos.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 13/13 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 13/13 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://files.catbox.moe/.../ch8agm.png` could not be downloaded: okhttp3.internal.http2.StreamResetException: stream was reset: PROTOCOL_ERROR | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../nos-introvertidos.html` |  |  |  |
| details thumbnail URL | PASS | `https://files.catbox.moe/.../ch8agm.png` |  |  |  |
| details author | PASS | Na |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Comédia, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Você já se perguntou como é, de verdade, o garoto mais popular da escola? Acontece que ele pode ser tão desajeitado e tímido quanto qualquer um de nós. É o que Jayu Nam, uma garota discreta e reservada, começa a perceber depois de um encontro inesperado com Jahyeok Yeo, um colega de classe que parece ser bom em tudo na vida. Bem, quase tudo. Por trás do carisma de Jahyeok, esconde-se um super-introvertido que preferiria ficar em casa, mas sua aparência cativante sempre o empurra para situações sociais. Juntos, Jayu e Jahyeok começam a aprender um pouco sobre amizade e, quem sabe, algo mais… |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 8 name |  |  |  |
| chapters | PASS | 47 chapters |  |  |  |
| chapter dates | PASS | 47 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../47db26235d0f43b7895366a602a5cf70.webp` (image/jpeg, 161358 bytes, 854x856) |  |  |  |
