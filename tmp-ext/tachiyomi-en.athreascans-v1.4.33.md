# Extension Validation Report

- Extension: tachiyomi-en.athreascans-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 427734044452073936
- Source name: Athrea Scans
- Source language: en
- Selected manga input: latest offset 0: Pregnancy Trap (`.../pregnancy-trap`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 35 | Falling (`.../falling`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 35 | Spring Came Just as I Arrived (`.../spring-came-just-as-i-arrived`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 35 | Pregnancy Trap (`.../pregnancy-trap`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 35 | Sleeping Through the Rain (`.../sleeping-through-the-rain`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Pregnancy Trap (`.../pregnancy-trap`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Pregnancy Trap (`.../pregnancy-trap`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 7 | Chapter 1 (`.../pregnancy-trap-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pregnancy Trap, URL=`.../pregnancy-trap` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://athreascans.com/.../tall-1-225x300.webp` (image/webp (encoding: lossy), 16202 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pregnancy-trap` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://athreascans.com/.../tall-1.webp` (image/webp (encoding: lossy), 206030 bytes, 1200x1600) |  |  |  |
| details author | PASS | Kim Ttatta |  |  |  |
| details artist | PASS | Dangddo |  |  |  |
| details genres | PASS | Adult, Drama, Josei, Romance, Seinen, Smut, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A sex-crazed slut. A sexual deviant worse than any male prostitute. Min Hwanseong is a man surrounded by scandalous rumors that seem utterly unfitting for someone from a chaebol family. Through a marriage arrangement between their families, Seorin ends up going on a blind date with him. “Since we’re going to pass on our genes anyway, wouldn’t it be better for both of us if we chose the best possible partner?” Disgusted at being treated like nothing more than a broodmare, Seorin tries to break off the engagement—only to discover that she has already been sold off in exchange for 30 billion won in investment funds to save her family. As Seorin reels in despair, Hwanseong proposes a provocative wager, with the cancellation of their engagement on the line…<br><br>Alternative Names: 임신의 덫 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://athreascans.com/.../1.jpeg` (image/jpeg, 1399881 bytes, 800x14000) |  |  |  |
