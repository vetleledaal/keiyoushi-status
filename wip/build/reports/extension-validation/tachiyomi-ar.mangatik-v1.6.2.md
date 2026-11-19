# Extension Validation Report

- Extension: tachiyomi-ar.mangatik-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7080835850401649994
- Source name: MangaTik
- Source language: ar
- Selected manga input: popular offset 0: little princess mint (`.../little-princess-mint`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | little princess mint (`.../little-princess-mint`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | في الجامعة إلهامي (`.../manga-6a9f6612a8523`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | little princess mint (`.../little-princess-mint`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | العفن (`.../manga-6a9f658ee51f1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 11 | little princess mint (`.../little-princess-mint`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | little princess mint (`.../little-princess-mint`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 115 | الفصل 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=little princess mint, URL=`.../little-princess-mint` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 107/107 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 107/107 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangatik.com/.../little-princess-mint.webp` (image/webp (encoding: lossy), 15772 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../little-princess-mint` |  |  |  |
| details thumbnail URL | PASS | `https://mangatik.com/.../little-princess-mint.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | رومانسى, دراما, حياة يومية |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | مينتيو الفتاه الاكثر رثاثه في دار الايتام, في احد الايام, بعد تعرضها لجميع انواع الانتهاكات, ظهر الارشيدوق العظيم لدوقيه غيدونيا كداعم للميتم “ساخذ هذه الطفله” “هل يمكنني حق االبقاء هنا؟!” رومانسيه مينتيو للشفاء والنمو من فتاه يتيمه الى اميرة الامبراطورية.<br><br>Tags: حياة يومية, دراما, رومانسى |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `https://lh3.googleusercontent.com/.../11JbVblIZbs9DXdtD_O68qwXiM2zZQ_5w=w1600` at pages 14, 15 |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lh3.googleusercontent.com/.../1LknLf87orDd1C3447mYgxpJNh7P6S5Fx=w1600` (image/jpeg, 647930 bytes, 720x8350) |  |  |  |
