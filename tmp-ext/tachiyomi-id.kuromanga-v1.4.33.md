# Extension Validation Report

- Extension: tachiyomi-id.kuromanga-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3545985978448263801
- Source name: Kuro Manga
- Source language: id
- Selected manga input: popular offset 0: A Dangerous Deal and the Girl Next Door (`.../a-dangerous-deal-and-the-girl-next-door`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | A Dangerous Deal and the Girl Next Door (`.../a-dangerous-deal-and-the-girl-next-door`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | My Disciples Are All Big Villains (`.../my-disciples-are-all-big-villains`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Jueshi Guzun (`.../jueshi-guzun`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Nano Machine (`.../nano-machine`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | A Dangerous Deal and the Girl Next Door (`.../a-dangerous-deal-and-the-girl-next-door`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | A Dangerous Deal and the Girl Next Door (`.../a-dangerous-deal-and-the-girl-next-door`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 62 | Chapter 1 (`.../a-dangerous-deal-and-the-girl-next-door-chapter-1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 10s+ |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Dangerous Deal and the Girl Next Door, URL=`.../a-dangerous-deal-and-the-girl-next-door` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Nano Machine, URL=`.../nano-machine` at page 1 offset 19 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../a-dangerous-deal-and-the-girl-next-door-cover.webp <redacted query values: resize>` (image/jpeg, 13052 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-dangerous-deal-and-the-girl-next-door` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../a-dangerous-deal-and-the-girl-next-door-cover.webp` (image/jpeg, 143820 bytes, 800x1120) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Drama, Mature, Seinen, Smut, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “My wife… once she’s naked, it’s really game over…” A glimpse at CCTV footage reveals the neighbor woman – completely nude. Wracked with guilt he shouldn’t feel, Scott is caught off guard when Harry makes a dangerous offer: “Wanna have her? On one condition… Do it right in front of me.”<br><br>Alternative Names: Risky Deals and The Girl Next Door |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 62 chapters |  |  |  |
| chapter dates | PASS | 62 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.uqni.net/.../00.jpg` (image/jpeg, 228851 bytes, 720x1080) |  |  |  |
