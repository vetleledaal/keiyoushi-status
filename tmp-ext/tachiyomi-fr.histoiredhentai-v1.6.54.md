# Extension Validation Report

- Extension: tachiyomi-fr.histoiredhentai-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6899189456839494153
- Source name: HistoireDHentai
- Source language: fr
- Selected manga input: latest offset 0: La femme au foyer qui est venue à ma porte (`.../14176`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Stepmother’s Friends (`.../6617`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | La femme au foyer qui est venue à ma porte (`.../14176`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La femme au foyer qui est venue à ma porte (`.../14176`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La femme au foyer qui est venue à ma porte (`.../14176`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../oneshot`) |  | <1s |
| pages | `getPageList(chapter)` | success | 121 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La femme au foyer qui est venue à ma porte, URL=`14176` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pub-9b104fb2e07640bcb74620f75f1596d2.r2.dev/.../001.webp` (image/webp (encoding: lossy), 240098 bytes, 1280x1818) |  |  |  |
| details identity | PASS | Details preserved selected URL `14176` |  |  |  |
| details thumbnail URL | PASS | `https://pub-9b104fb2e07640bcb74620f75f1596d2.r2.dev/.../001.webp` |  |  |  |
| details author | PASS | Pirates Cat |  |  |  |
| details artist | PASS | Pirates Cat |  |  |  |
| details genres | PASS | Ahegao, Big Ass, Big Breasts, Blowjob, Business suit, Full color, Glasses, Kissing, Milf, Nakadashi, Squirting, Sweating, Very Long hair |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ahegao big ass big breasts blowjob business suit cheating eye-covering bang kissing milf glasses sole male nakadashi pantyhose sole female squirting sweating full color story arc very long hair<br><br>Alternative Names: Todoita no wa Hitozuma deshita |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 121 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.hhentai.fr/.../001.webp` (image/webp (encoding: lossy), 240098 bytes, 1280x1818) |  |  |  |
