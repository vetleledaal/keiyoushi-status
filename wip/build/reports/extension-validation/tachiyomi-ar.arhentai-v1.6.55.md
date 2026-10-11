# Extension Validation Report

- Extension: tachiyomi-ar.arhentai-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
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
- Source theme: madara
- Source ID: 7652862112029693411
- Source name: آر هنتاي
- Source language: ar
- Selected manga input: popular offset 0: Mom Swap Pact (`.../588`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | Mom Swap Pact (`.../588`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 14 | Reasons for Living in a Haunted Property. (`.../624`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mom Swap Pact (`.../588`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mom Swap Pact (`.../588`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 47 |  |  | <1s |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mom Swap Pact, URL=`588` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 29/29 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 29/29 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arhentai.net/.../i515643-175x238.png` (image/png, 81822 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `588` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Yagyeong |  |  |  |
| details artist | PASS | Baengkki |  |  |  |
| details genres | PASS | بالغ, سينين, كوميديا |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | شون لم يعد قادرًا على إخفاء انجذابه لوالدة صديقه المقرّب مايكي. فيطلق فكرة جريئة وخطيرة… يعرض زوجة أبيه كجزء من صفقة لا تقل جرأة. ومن هنا تبدأ لعبتهم الملتوية—صديقان بلا حدود، كلاهما يخطط لاختراق حياة الآخر الخاصة والوصول إلى أكثر ما كان يجب أن يبقى محرّمًا. “صفقة عادلة… نتبادل الأمهات”. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | PASS | 50 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://arhentai.net/.../001.webp` (image/webp (encoding: lossy), 197732 bytes, 720x5000) |  |  |  |
