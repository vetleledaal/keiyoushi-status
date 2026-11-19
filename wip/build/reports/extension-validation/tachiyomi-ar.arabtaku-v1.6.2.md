# Extension Validation Report

- Extension: tachiyomi-ar.arabtaku-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 9180348693074415031
- Source name: Arabtaku
- Source language: ar
- Selected manga input: popular offset 0: Moby Dick (`.../moby-dick`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Moby Dick (`.../moby-dick`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Manitto (`.../manitto`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Pervert Diary (`.../pervert-diary`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Hana’s Demons of Lust (`.../hanas-demons-of-lust`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Moby Dick (`.../moby-dick`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Moby Dick (`.../moby-dick`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 108 | الفصل 1 (`.../moby-dick-1`) |  | <1s |
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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Moby Dick, URL=`.../moby-dick` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arabtaku.com/.../Moby-Dick.webp` (image/webp (encoding: lossy), 62518 bytes, 800x1120) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../moby-dick` |  |  |  |
| details thumbnail URL | PASS | `https://arabtaku.com/.../Moby-Dick.webp` |  |  |  |
| details author | PASS | Yansae |  |  |  |
| details artist | PASS | Yansae |  |  |  |
| details genres | PASS | دراما, سينين, للبالغين, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | في أحد الأيام، تقع بين يدي هون سانغ بطاقة غامضة تحمل عرضًا سيغيّر حياته بالكامل. تمنحه البطاقة فرصة لبدء حياة جديدة في مدينة مختلفة، تُعرف بأنها ملاذ للخيانة والعلاقات المحرّمة، مقابل مبلغ مالي ضخم واستغلال جاذبيته الجسدية. لكن سرعان ما يكتشف أن دوره ليس عاديًا، إذ يُقدَّم لكبار الشخصيات باعتباره هدية استثنائية، وعليه أن يترك في نفوسهم أثرًا لا يُمحى، حتى لو حاولوا نسيانه.<br><br>Alternative Names: <br>- موبي ديك: رحلة الغواية |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 108 chapters |  |  |  |
| chapter dates | PASS | 108 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.arabtaku.com/.../001.webp` (image/webp (encoding: lossy), 1236508 bytes, 720x8818) |  |  |  |
