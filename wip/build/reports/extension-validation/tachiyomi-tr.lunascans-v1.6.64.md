# Extension Validation Report

- Extension: tachiyomi-tr.lunascans-v1.6.64
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

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
| popular_next | `getPopularManga(2)` | success | 12 | The Sales Department’s Cupid (`.../5034`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 12 | The Taming (`.../4998`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | My Master (`.../5012`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | No Arguing With Mr. Mo (`.../4501`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | No Arguing With Mr. Mo (`.../4501`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 82 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView to read this chapter | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView to read this chapter | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=No Arguing With Mr. Mo, URL=`4501` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tuhafscans.com/.../mr-mo_c_bannerx500-175x238.png` (image/png, 77908 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `4501` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tuhafscans.com/.../mr-mo_c_bannerx500.png` (image/png, 237961 bytes, 320x455) |  |  |  |
| details author | PASS | Suye |  |  |  |
| details artist | PASS | Pxtar, Suye |  |  |  |
| details genres | PASS | +18, BL, Dram, Komedi, Manhua, Romantik, Shounen Ai, Webtoon, Yaoi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Mo Yanchuan, Mo Elektronik Grup'un soğuk ve mesafeli genel müdürü aynı zamanda da varisidir. Sekreteri Xiao Nuo ise kendini işine adamış, çalışkan bir sekreterdir. Sekreter Xiao, Mo Bey'in kendisinden nefret ettiğine inansa da aslında Mo Bey'in ona olan hisleri hiç de düşündüğü gibi değildir. Aslında, çok daha fazlası olabilirler...<br><br>Alternative Names: 男秘书的使命 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 82 chapters |  |  |  |
| chapter dates | PASS | 82 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView to read this chapter |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
