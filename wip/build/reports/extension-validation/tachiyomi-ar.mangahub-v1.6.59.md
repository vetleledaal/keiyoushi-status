# Extension Validation Report

- Extension: tachiyomi-ar.mangahub-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 1214953877894211809
- Source name: MangaHub
- Source language: ar
- Selected manga input: popular offset 0: New Town Massage (`.../4611`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | New Town Massage (`.../4611`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | العلاقة العكسية (`.../640`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | New Town Massage (`.../4611`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | New Town Massage (`.../4611`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 17 | الفصل 01 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=New Town Massage, URL=`4611` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.arabmanhwa.com/.../cover.webp` (image/webp (encoding: lossy), 116458 bytes, 1280x1792) |  |  |  |
| details identity | PASS | Details preserved selected URL `4611` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.arabmanhwa.com/.../cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | حريم, دراما, مانجا - مانهوا |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | جي سيونغ مين هو مدلك يعمل في مدينة “سيوتان” الجديدة، التي يسكنها العديد من النساء المتزوجات الشابات والرشيقات. اختار هذه المهنة فقط لأنه يريد لمس النساء، ويعيش الآن أحلامه من خلال عمله. في أحد المواقف، يعترف لإحدى زبائنه قائلاً: “لا أعتقد أنني أستطيع لمس جسد مثلك دون أن أشعر بشيء.” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | LINT | All 17 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=17 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.arabmanhwa.com/.../001.webp` (image/webp (encoding: lossy), 489528 bytes, 800x8160) |  |  |  |
