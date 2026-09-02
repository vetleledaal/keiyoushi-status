# Extension Validation Report

- Extension: tachiyomi-es.inmanga-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6963106975536326424
- Source name: InManga
- Source language: es
- Selected manga input: popular offset 0: One Piece (`.../dfc7ecb5-e9b3-4aa5-a61b-a498993cd935`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | One Piece (`.../dfc7ecb5-e9b3-4aa5-a61b-a498993cd935`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Bleach (`.../92ef1c08-d79b-4485-ba5c-2588a7fd25b4`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | One Piece (`.../dfc7ecb5-e9b3-4aa5-a61b-a498993cd935`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Kaiju No. 8 (`.../646317fc-f37c-4686-b568-df8efc60285d`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | One Piece (`.../dfc7ecb5-e9b3-4aa5-a61b-a498993cd935`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | One Piece (`.../dfc7ecb5-e9b3-4aa5-a61b-a498993cd935`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1193 | Chapter 01 (`.../chapterIndexControls <redacted query values: identification>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../dfc7ecb5-e9b3-4aa5-a61b-a498993cd935` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 44/44 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 44/44 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn1.intomanga.com/.../dfc7ecb5-e9b3-4aa5-a61b-a498993cd935.jpg` (image/jpeg, 96261 bytes, 365x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../dfc7ecb5-e9b3-4aa5-a61b-a498993cd935` |  |  |  |
| details thumbnail URL | PASS | `https://cdn1.intomanga.com/.../dfc7ecb5-e9b3-4aa5-a61b-a498993cd935.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | La serie comienza con la ejecución de Gol D. Roger, un hombre conocido como el Rey de los Piratas. Poco antes de su muerte, Roger hace mención a su gran tesoro legendario, el One Piece, ya que puede ser tomado por todo aquél que lo desee. Esto marca el inicio de una era conocida como la Gran Era Pirata. Como resultado, un sinnúmero de piratas zarparon hacia Grand Line con el objetivo de encontrarlo |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1193 chapters |  |  |  |
| chapter dates | PASS | 1193 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://cdn1.intomanga.com/.../e720d0bf-cc16-4419-8118-dcc03433f8b7.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
