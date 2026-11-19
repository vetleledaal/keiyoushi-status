# Extension Validation Report

- Extension: tachiyomi-ar.mangaar-v1.6.1
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
- Source ID: 262751737011215494
- Source name: مانغا عربي
- Source language: ar
- Selected manga input: popular offset 0: ذروة الفنون القتالية (`.../2123`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 39 | ذروة الفنون القتالية (`.../2123`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | سأتزوجه! (`.../2473`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ذروة الفنون القتالية (`.../2123`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ذروة الفنون القتالية (`.../2123`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3844 | الفصل 1 (`.../123066`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 39 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ذروة الفنون القتالية, URL=`2123` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 70/70 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 70/70 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaar.com/.../2123.webp` (image/webp (encoding: lossy), 45066 bytes, 500x708) |  |  |  |
| details identity | PASS | Details preserved selected URL `2123` |  |  |  |
| details thumbnail URL | PASS | `https://mangaar.com/.../2123.webp` |  |  |  |
| details author | PASS | Momo (莫默) |  |  |  |
| details artist | PASS | Pikapi (噼咔噼) |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 2018<br><br>رحلة الوصول إلى قمة فنون القتال هي رحلة وحيدة موحشة وطويلة. في مواجهة الشدائد يجب عليك البقاء على قيد الحياة والقتال بلا هوادة، وعندها فقط يمكنك الارتقاء ومتابعة رحلتك لتصبح الأقوى. تختبر طائفة الجناح السماوي الأعلى تلاميذها بأقسى الطرق لإعدادهم لهذه الرحلة، وفي أحد الأيام تمكن المتدرب الضعيف يانغ كاي من الحصول على كتاب أسود مما جعله على الطريق إلى قمة عالم فنون القتال.<br><br>**Alternative Names:**<br>- Martial Peak |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 520 name |  |  |  |
| chapters | PASS | 3844 chapters |  |  |  |
| chapter dates | PASS | 3844 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangaar.com/.../001.webp` (image/webp (encoding: lossy), 102228 bytes, 800x1131) |  |  |  |
