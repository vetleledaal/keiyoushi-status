# Extension Validation Report

- Extension: tachiyomi-tr.duckscans-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source theme: duckscans
- Source ID: 4089747984244989816
- Source name: Duck Scans
- Source language: tr
- Selected manga input: popular offset 0: Olgami (`.../olgami`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 42 | Olgami (`.../olgami`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 42 | Diz Çökün, Majesteleri! (`.../diz-cokun-majesteleri`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Olgami (`.../olgami`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Olgami (`.../olgami`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 203 | Bölüm 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | <1s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 42 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Olgami, URL=`.../olgami` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 85/85 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 85/85 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://duckscans.com/.../olgami.webp <redacted query values: v>` (image/webp (encoding: lossy), 307916 bytes, 800x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../olgami` |  |  |  |
| details thumbnail URL | PASS | `https://duckscans.com/.../olgami.webp <redacted query values: v>` |  |  |  |
| details author | PASS | Akemi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Drama, Romantik, Psikolojik, Gizem |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Taksi sürücüsü Chaeah kiliseden tanıdığı Park Yoonsoo’yu bir kızla caddede yürürken görür bunun cinayet ve işkence delillerinin gömülmesine ve hayatında tamamen bir değişikliğe yol açacağını hiç düşünmemişti.<br><br>**Alternative Names:**<br>- Trapped |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 203 chapters |  |  |  |
| chapter dates | PASS | 203 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://duckscans.com/.../001.webp <redacted query values: v, t, s, k, and sv>` (image/jpeg, 388575 bytes, 1920x1080; server Content-Type: application/octet-stream) |  |  |  |
