# Extension Validation Report

- Extension: tachiyomi-en.ezmanga-v1.4.62
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
- Source theme: ezmanhwa
- Source ID: 3317136566565343717
- Source name: EZmanga
- Source language: en
- Selected manga input: popular offset 0: For Your Murder (`.../for-your-murder`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | For Your Murder (`.../for-your-murder`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | My Possession Became a Ghost Story (`.../my-possession-became-a-ghost-story`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | The Despised Stepmother Begins Her Second Life  (`.../the-despised-stepmother-begins-her-second-life`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Tsunami Warning (`.../tsunami-warning`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | For Your Murder (`.../for-your-murder`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | For Your Murder (`.../for-your-murder`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 67 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=For Your Murder, URL=`for-your-murder` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.ezmanga.org/.../088f6d60-c1ca-4e58-a797-a2df6a6055c0.webp` (image/webp (encoding: lossy), 352002 bytes, 1024x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `for-your-murder` |  |  |  |
| details thumbnail URL | PASS | `https://media.ezmanga.org/.../088f6d60-c1ca-4e58-a797-a2df6a6055c0.webp` |  |  |  |
| details author | PASS | Seyoon |  |  |  |
| details artist | PASS | Naver |  |  |  |
| details genres | PASS | Thriller, Drama |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Elementary school teacher Giseong, who has always suppressed her true self, is tormented by demanding parents. Seeking legal help, she visits a nearby lawyer. However, the lawyer she turns to is Oh Inseop, who turns out to be a serial killer.<br><br>Alternative Titles: 당신의 살인을 위하여 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 67 chapters |  |  |  |
| chapter dates | PASS | 67 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.ezmanga.org/.../01.webp` (image/webp (encoding: lossy), 1528722 bytes, 800x14000) |  |  |  |
