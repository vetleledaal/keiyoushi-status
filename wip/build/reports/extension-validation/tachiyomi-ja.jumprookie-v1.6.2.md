# Extension Validation Report

- Extension: tachiyomi-ja.jumprookie-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4194563020378281165
- Source name: Jump Rookie!
- Source language: ja
- Selected manga input: latest offset 0: 主演男優賞は俺のモンだ。 (`.../TWpXKpZbFvE`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | シン十二支 (`.../TWpXKpZSk4c`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | まがいもの (`.../TWpXKpZVIzg`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | 主演男優賞は俺のモンだ。 (`.../TWpXKpZbFvE`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | わん太とポクの日常 (`.../TWpXKpZEnhs`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 主演男優賞は俺のモンだ。 (`.../TWpXKpZbFvE`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 主演男優賞は俺のモンだ。 (`.../TWpXKpZbFvE`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 第 1 話 (`.../TWpXKpZbFvM`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=主演男優賞は俺のモンだ。, URL=`.../TWpXKpZbFvE` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.rookie.shonenjump.com%2Fpublic%2Fcover_images%2F5578366928874575599-74b0b654c7cd` (image/jpeg, 29603 bytes, 320x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../TWpXKpZbFvE` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-img.rookie.shonenjump.com/.../5578366928874575599-74b0b654c7cd` (image/jpeg, 86147 bytes, 640x640) |  |  |  |
| details author | PASS | 怨田めりぃ 作 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | バトル |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 読切です |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.rookie.shonenjump.com/.../5578366928874575554-7d674d24daad` (image/jpeg, 330213 bytes, 1200x1669) |  |  |  |
