# Extension Validation Report

- Extension: tachiyomi-th.tanukimanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 3
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 422195356897516502
- Source name: Tanuki-Manga
- Source language: th
- Selected manga input: popular offset 0: Magic Emperor (`.../magic-emperor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Magic Emperor (`.../magic-emperor`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Dandadan (`.../dandadan`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | Colori Colore Creare (`.../colori-colore-creare`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | The Village’s Special Law (`.../the-villages-special-law`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 912 | ตอนที่ 1 (`.../magic-emperor-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Magic Emperor, URL=`.../magic-emperor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 162/162 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 162/162 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.tanuki-manga.net/.../noimg165px.png` -> 2 manga URLs (examples: `.../aisanai-to-iwaremashite-mo-moto-maou-no-hakushaku-reijou-wa-kimajime-gunjin-ni-ezuke-wo-sarete-shiawase-ni-naru`, `.../the-emperors-marriage-scam`) |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../Magic-Emperor.jpg <redacted query values: resize>` (image/jpeg, 33721 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../magic-emperor` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../Magic-Emperor.jpg` (image/jpeg, 60286 bytes, 450x600) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manhua, Martial arts, Shounen, Supernatural, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 912 chapters |  |  |  |
| chapter dates | PASS | 912 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://img.tanuki-manga.com/.../CSVQ3GI7RH-1587238097.jpg` to `https://img.tanuki-manga.net/.../CSVQ3GI7RH-1587238097.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://img.tanuki-manga.com/.../CSVQ3GI7RH-1587238097.jpg` (image/jpeg, 220923 bytes, 752x1759) |  |  |  |
