# Extension Validation Report

- Extension: tachiyomi-all.honeytoon-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 1063521896373496908
- Source name: Honeytoon
- Source language: en
- Selected manga input: popular offset 0: Here lies the wicked (`.../here-lies-the-wicked`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | Here lies the wicked (`.../here-lies-the-wicked`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 21 | Start with a mountain (`.../start-with-a-mountain`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Here Lies the Wicked (`.../here-lies-the-wicked`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Here Lies the Wicked (`.../here-lies-the-wicked`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 71 | Prologue (`.../prologue`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 60 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Here Lies the Wicked, URL=`.../here-lies-the-wicked` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pic.honeytoon.com/.../c8f1b8bc-1641-4e99-b228-a89fbe850b13-1705917964-32.webp` (image/webp (container: extended), 131334 bytes, 744x1104) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Here lies the wicked to Here Lies the Wicked |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Supernatural, #fantasy_world |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Discover how the disappearances in the city, an ancient mystical skin script, and a young boy with nightmares are all co Discover how the disappearances in the city, an ancient mystical skin script, and a young boy with nightmares are all connected in Here Lies the Wicked. These days were so complicated for Fang Zheng but he can't even imaging what challenge future prepared for him. Now only ancient runes can help him. Discover how the disappearances in the city, an ancient mystical skin script, and a young boy with nightmares are all connected in Here Lies the Wicked. These days were so complicated for Fang Zheng but he can't even imaging what challenge future prepared for him. Now only ancient runes can help him. ... Read more Hide |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 71 chapters |  |  |  |
| chapter dates | LINT | 1 of 71 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pic.honeytoon.com/.../a4684e58-b1f5-4dd1-851e-5e3ef86d85c2.webp` (image/webp (encoding: lossy), 49294 bytes, 1000x2141) |  |  |  |
