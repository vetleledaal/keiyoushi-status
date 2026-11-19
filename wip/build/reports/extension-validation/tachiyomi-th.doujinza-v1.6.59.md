# Extension Validation Report

- Extension: tachiyomi-th.doujinza-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3715220935638762635
- Source name: DoujinZa
- Source language: th
- Selected manga input: popular offset 0: Sister Neighbors พี่สาวข้างบ้าน (`.../34`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Sister Neighbors พี่สาวข้างบ้าน (`.../34`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | New Town (`.../15743`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Sex Story (`.../19560`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Save the World by Hitting it (`.../19354`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sister Neighbors พี่สาวข้างบ้าน (`.../34`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sister Neighbors พี่สาวข้างบ้าน (`.../34`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 160 | ตอนที่ 1 (`.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sister Neighbors พี่สาวข้างบ้าน, URL=`34` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://doujinza.com/.../msedge_P7breYI400-175x238.png` (image/png, 83384 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `34` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://doujinza.com/.../msedge_P7breYI400-193x278.png` (image/png, 105752 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa เกาหลี, ภาพสี full color |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Sister Neighbors พี่สาวข้างบ้าน |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 160 chapters |  |  |  |
| chapter dates | PASS | 160 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://file.doujinza.com/.../GM5D2-20210104_Sister-Neighbors_1.jpg` (image/jpeg, 47928 bytes, 720x1523) |  |  |  |
