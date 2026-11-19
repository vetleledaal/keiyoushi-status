# Extension Validation Report

- Extension: tachiyomi-ja.comicogyaaa-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 3754263546482783493
- Source name: Comic Ogyaaa
- Source language: ja
- Selected manga input: popular offset 0: 他人のメシ (`.../12207421984504088975`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 82 | 他人のメシ (`.../12207421984504088975`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 82 | 他人のメシ (`.../12207421984504088975`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 他人のメシ (`.../12207421984504088975`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 他人のメシ (`.../12207421984504088975`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 第1話 (`.../12207421984504089424`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| popular listing | PASS | 82 entries |  |  |  |
| latest listing | PASS | 82 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=他人のメシ, URL=`12207421984504088975` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 166/166 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 166/166 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-ogyaaa.com/.../12207421984504088975-06f2d1df789b4abe764a98dc4cb4af12 <redacted query values: 1794288801>` (image/jpeg, 315652 bytes, 600x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984504088975` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-ogyaaa.com/.../12207421984504088975-06f2d1df789b4abe764a98dc4cb4af12 <redacted query values: 1794288801>` |  |  |  |
| details author | PASS | 高橋秀武 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 勤務中の怪我で退職した元刑事・飯島は、同僚刑事だった月岡の家に居候している。リハビリ中で無職の飯島は、今では月岡のためにメシを作ることが毎日の仕事だ。日々事件に向き合う月岡と、食卓で彼の話に耳を傾ける飯島。食べたい現役刑事と、食べさせたい元刑事が事件を解決する、痛快バディ・コメディ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comic-ogyaaa.com/.../12207421984504108249-814ea30dce56fdd54fd53d666c59314b` (image/jpeg, 195876 bytes, 844x1200) |  |  |  |
