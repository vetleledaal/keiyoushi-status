# Extension Validation Report

- Extension: tachiyomi-th.mikudoujin-v1.6.9
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3142948916822290453
- Source name: MikuDoujin
- Source language: th
- Selected manga input: popular offset 0: จิ๋มกระป๋อง 3 มิติ (Yahiro Pochi) (`.../f23xns`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | จิ๋มกระป๋อง 3 มิติ (Yahiro Pochi) (`.../f23xns`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | เซ็กส์สัมพันธ์กับลูกชาย (`.../ydcsx6`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | จิ๋มกระป๋อง 3 มิติ (Yahiro Pochi) (`.../f23xns`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | จิ๋มกระป๋อง 3 มิติ (Yahiro Pochi) (`.../f23xns`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | จิ๋มกระป๋อง 3 มิติ 1 (`.../ep-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=จิ๋มกระป๋อง 3 มิติ (Yahiro Pochi), URL=`.../f23xns` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://miku-doujin.com/.../e8d7d1ac257ac0fe39c6c3b0c60cd6b5_thumb.webp` (image/webp (encoding: lossy), 15852 bytes, 240x339) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../f23xns` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://miku-doujin.com/.../e8d7d1ac257ac0fe39c6c3b0c60cd6b5.webp` (image/webp (encoding: lossy), 87706 bytes, 790x1116) |  |  |  |
| details author | PASS | Yahiro Pochi |  |  |  |
| details artist | PASS | Yahiro Pochi |  |  |  |
| details genres | PASS | Unknown, Unknown, นมใหญ่ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | No Story |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | LINT | All 4 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=4 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://miku-doujin.com/.../8d9fb5ecd481468be95eff110882749f.webp` (image/webp (encoding: lossy), 87706 bytes, 790x1116) |  |  |  |
