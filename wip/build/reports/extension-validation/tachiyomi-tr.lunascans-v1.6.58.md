# Extension Validation Report

- Extension: tachiyomi-tr.lunascans-v1.6.58
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6989973853577548620
- Source name: Luna Scans
- Source language: tr
- Selected manga input: popular offset 0: No Arguing With Mr. Mo (`.../4501`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | No Arguing With Mr. Mo (`.../4501`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | Monetary Love (`.../3701`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | The Taming (`.../4998`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Black Mirror (`.../5016`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | No Arguing With Mr. Mo (`.../4501`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | No Arguing With Mr. Mo (`.../4501`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 82 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=No Arguing With Mr. Mo, URL=`4501` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Black Mirror, URL=`5016` at page 1 offset 11 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tuhafscans.com/.../mr-mo_c_bannerx500-175x238.png` (image/png, 77908 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `4501` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tuhafscans.com/.../mr-mo_c_bannerx500.png` (image/png, 237961 bytes, 320x455) |  |  |  |
| details author | PASS | Suye |  |  |  |
| details artist | PASS | Pxtar, Suye |  |  |  |
| details genres | PASS | BL, Dram, Komedi, Manhua, Romantik, Shounen Ai, Webtoon, Yaoi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Mo Yanchuan, Mo Elektronik Grup'un soğuk ve mesafeli genel müdürü aynı zamanda da varisidir. Sekreteri Xiao Nuo ise kendini işine adamış, çalışkan bir sekreterdir. Sekreter Xiao, Mo Bey'in kendisinden nefret ettiğine inansa da aslında Mo Bey'in ona olan hisleri hiç de düşündüğü gibi değildir. Aslında, çok daha fazlası olabilirler...<br><br>Alternative Names: 男秘书的使命 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 82 chapters |  |  |  |
| chapter dates | PASS | 82 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://tuhafscans.com/.../1.jpg` (image/jpeg, 774418 bytes, 800x4590) |  |  |  |
