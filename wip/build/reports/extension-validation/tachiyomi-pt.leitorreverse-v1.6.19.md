# Extension Validation Report

- Extension: tachiyomi-pt.leitorreverse-v1.6.19
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 3373598802026857820
- Source name: Leitor Reverse
- Source language: pt-BR
- Selected manga input: popular offset 0: Eleceed (`.../eleceed.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 3 | Eleceed (`.../eleceed.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Eleceed (`.../eleceed.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Eleceed (`.../eleceed.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Chapter 334 (`.../capitulo-334.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Eleceed, URL=`.../eleceed.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 4/4 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 4/4 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../Eleceed.png` (image/jpeg, 189540 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../eleceed.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../Eleceed.png` (image/jpeg, 236165 bytes, 736x1104) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Ação, Artes Marciais, Escolar, Fantasia |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Seo Jiwoo é um jovem de bom coração que aproveita os reflexos rápidos de um gato para secretamente tornar o mundo um lugar melhor - uma criança salva ou um animal de estimação adotivo de cada vez. Kayden é um agente secreto em fuga, que se encontra preso no corpo de um... hum... decididamente gordo velho gato fofo. Juntos, armados com os superpoderes de Ji-U e a super inteligência de Kayden, eles estão prontos para lutar contra as forças que deixariam o mal governar este mundo. Isto é, se eles aguentarem um ao outro tempo suficiente para fazer o trabalho.” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0.png` (image/png, 449183 bytes, 1066x800) |  |  |  |
