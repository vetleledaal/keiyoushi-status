# Extension Validation Report

- Extension: tachiyomi-ar.yonabar-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 0
- Warnings: 3
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8019959770180418614
- Source name: Yona Bar
- Source language: ar
- Selected manga input: latest offset 0: IAN’S BINDING (`.../ians-binding`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Jinx (`.../jinx`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 10 | IAN’S BINDING (`.../ians-binding`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | IAN’S BINDING (`.../ians-binding`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 49 | ch-01 (`https://yonaber.com/.../ch-01 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 161 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 19/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ybstatic.aramang.nom.za/.../Internet_20260510_163617_1-193x278-175x238.jpeg` (image/jpeg, 10920 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ians-binding` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ybstatic.aramang.nom.za/.../Internet_20260510_163617_1-193x278.jpeg` (image/jpeg, 15635 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | إذلال, بالغ, جريمة, سادي, عبودية, عنف, ناضج, نفسي, ياوي |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | العميل بنجامين هو المشتبه به الرئيسي الذي تم القبض عليه أثناء مطاردة زعيم المافيا يـان يستيقظ بنجامين في غرفة مليئة بأجهزة التعذيب لا يستسلم حتى بعد التعذيب الذي لا نهاية له، فنحن نحاول كشف أسرار عصابة المخدرات!. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 49 chapters |  |  |  |
| chapter dates | PASS | 49 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 49 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 161 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://medium2x.aramang.nom.za/.../b.jpg` (image/jpeg, 49848 bytes, 1152x648) |  |  |  |
