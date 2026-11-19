# Extension Validation Report

- Extension: tachiyomi-ar.dilar-v1.6.21
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7634600808243438399
- Source name: Dilar
- Source language: ar
- Selected manga input: popular offset 0: Remarried Empress (`.../Remarried%20Empress`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Remarried Empress (`.../Remarried%20Empress`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Lookism (`.../Lookism`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Us, After  (`.../Us,%20After`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Remarried Empress (`.../Remarried%20Empress`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Remarried Empress (`.../Remarried%20Empress`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 252 | 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Remarried Empress, URL=`983/Remarried Empress` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dilar.tube/.../large_img_5704.webp` (image/webp (encoding: lossy), 371598 bytes, 929x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `983/Remarried Empress` |  |  |  |
| details thumbnail URL | PASS | `https://dilar.tube/.../large_img_5704.webp` |  |  |  |
| details author | PASS | Alpha Tart |  |  |  |
| details artist | PASS | Sumpul |  |  |  |
| details genres | PASS | رومانسي, دراما, مانهوا, فانتازيا, تاريخي, جوسي |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | نافير الإمبراطورة المثالية و المسؤولة عن الإمبراطورية، مدربةٌ منذ صغرها على أن تشغل هذا المنصب ببراعة و احترافية، لكنها و الإمبراطور لم يكونا أحباء، لذلك سعى لإيجاد محظية تكون التعويض عن نافيرا لرغبته بزوجة لا شريكة عمل. لم تمانع نافيرا قرار الإمبراطور بإبقائه لعبدةٍ هاربة كمحظية أو هذا فقط ما قامت بإظهاره، و استمرت بتحمّل الألم و مجاراة سوء فهم الإمبراطور لنواياها و أفعالها، إلى أن فاض بها الكيل بسبب رغبته بأخذ منصب الإمبراطورة منها و إعطائه لمحظيته، فقررت الطلاق و الزواج من ملك المملكة المجاورة. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 252 chapters |  |  |  |
| chapter dates | PASS | 252 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Timed out waiting for 30000 ms |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
