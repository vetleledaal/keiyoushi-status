# Extension Validation Report

- Extension: tachiyomi-ja.jumprookie-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4194563020378281165
- Source name: Jump Rookie!
- Source language: ja
- Selected manga input: latest offset 0: ムスビノカミ (`.../TWpXKpYpZwI`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | 出禁女子高生 (`.../TWpXKpYkknI`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 16 | 『先輩、距離感バグってます！』 (`.../TWpXKpYmmnM`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | ムスビノカミ (`.../TWpXKpYpZwI`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | 『先輩、距離感バグってます！』 (`.../TWpXKpYmmnM`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ムスビノカミ (`.../TWpXKpYpZwI`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ムスビノカミ (`.../TWpXKpYpZwI`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 第 1 話 (`.../TWpXKpYpZwU`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ムスビノカミ, URL=`.../TWpXKpYpZwI` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.rookie.shonenjump.com%2Fpublic%2Fcover_images%2F5578366928871318585-961a39b25890` (image/png, 98472 bytes, 320x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../TWpXKpYpZwI` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-img.rookie.shonenjump.com/.../5578366928871318585-961a39b25890` (image/png, 415670 bytes, 640x640) |  |  |  |
| details author | PASS | ジョー 作 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | バトル, ファンタジー |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 主人公・五月　三千代（サツキ　ミチヨ）は、ある日の放課後、自宅の裏山で野良の妖怪を見つける。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.rookie.shonenjump.com/.../5578366928871318519-3321493ae8c1` (image/png, 1071254 bytes, 1200x1703) |  |  |  |
