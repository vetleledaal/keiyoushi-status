# Extension Validation Report

- Extension: tachiyomi-en.hentai4free-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6625474581258090106
- Source name: Hentai4Free
- Source language: en
- Selected manga input: popular offset 0: Milf Massage NTR♥ (`.../4751`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Milf Massage NTR♥ (`.../4751`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Tomodachi no Haha wa Boku no Mono His Mother is My Love Hole (`.../17854`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Cross-Dressing TS Delivery Service: Delivery to a Cram School (`.../30286`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | My Mother and the Japanese Inn (`.../30236`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Milf Massage NTR♥ (`.../4751`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Milf Massage NTR♥ (`.../4751`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | artist CG (`.../artist-cg`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Milf Massage NTR♥, URL=`4751` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentai4free.net/.../cover-4752-480x541-78e5fce50c17.webp` (image/webp (encoding: lossy), 14926 bytes, 480x541) |  |  |  |
| details identity | PASS | Details preserved selected URL `4751` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentai4free.net/.../Milf-Massage-NTR%E2%99%A5-193x278.jpg` (image/jpeg, 54392 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Milf Massage NTR♥ |  |  |  |
| details genres | PASS | Artist CG, artistcg, Uncensored, English |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Names: Milf Massage NTR♥ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hentai4free.net/.../1005090_kidmoart_milf_massage.jpg` (image/jpeg, 545604 bytes, 1247x1406) |  |  |  |
