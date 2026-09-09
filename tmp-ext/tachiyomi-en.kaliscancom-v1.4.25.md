# Extension Validation Report

- Extension: tachiyomi-en.kaliscancom-v1.4.25
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madtheme
- Source ID: 7660637864742395387
- Source name: KaliScan
- Source language: en
- Selected manga input: latest offset 0: Win With Pictures (`.../107539-win-with-pictures`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 48 | Painter of the Night (`.../364-painter-of-the-night`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 48 | Stranger Than Friends (`.../18490-stranger-than-friends`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 48 | Win With Pictures (`.../107539-win-with-pictures`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 48 | Make me lose control (`.../94761-make-me-lose-control`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Win With Pictures (`.../107539-win-with-pictures`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Win With Pictures (`.../107539-win-with-pictures`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Win With Pictures, URL=`.../107539-win-with-pictures` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.1stmangago.com/.../rROHYYKHa8HlWy3U7kHm8eI5JAZfL8aioYFeCQ-cwmDVnaN.jpeg` (image/jpeg, 15911 bytes, 200x261) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../107539-win-with-pictures` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.1stmangago.com/.../rROHYYKHa8HlWy3U7kHm8eI5JAZfL8aioYFeCQ-cwmDVnaN.jpeg` |  |  |  |
| details author | PASS | Wongwong-i |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Shounen, Webtoons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A world invaded by another dimension, and a world where heroes fight back. Kim, a weakling who is only good at drawing, summons 'Martin,' the imaginary hero he has drawn since childhood, into reality. A coming-of-age fantasy action story about a boy who protects the world with creativity and artistic passion, rather than brute force.<br><br>Alt name(s): 그림으로 승부 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s2.1stmggv7.xyz/.../5ec5f85333b6f4b4f9865b5cc2c1dbd9.webp <redacted query values: acc and expires>` (image/webp (encoding: lossy), 11466 bytes, 1500x500) |  |  |  |
