# Extension Validation Report

- Extension: tachiyomi-en.mangamob-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 954997815643613941
- Source name: Comivex
- Source language: en
- Selected manga input: popular offset 0: The Hero Returns (`.../3616-the-hero-returns`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | The Hero Returns (`.../3616-the-hero-returns`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Black Haze (2025) (`.../6906-black-haze-2025`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 61 | Infinite Level Up in Murim (`.../1653-infinite-level-up-in-murim`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | The Hero Returns (`.../3616-the-hero-returns`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Hero Returns (`.../3616-the-hero-returns`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 171 | Chapter 1 (`.../1-eng-li`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 61 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Hero Returns, URL=`.../3616-the-hero-returns` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 111/111 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 111/111 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imgsrv5.com/.../the-hero-returns.png` (image/png, 69418 bytes, 157x211) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../3616-the-hero-returns` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://imgsrv5.com/.../the-hero-returns.png` (image/png, 218981 bytes, 288x412) |  |  |  |
| details author | PASS | Updating |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Martial Arts, Shounen, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The strongest hero of humanity, Kim Sung Bin. He threw everything on the line and fought… but he still couldn’t prevent the destruction of the world. However, his legend has just begun as he returns 20 years into the past. “I’ll definitely… kill it this time. ” Now fully equipped with overwhelming power and experience, the hero’s raid isn’t over yet! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 171 chapters |  |  |  |
| chapter dates | PASS | 171 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imgsrv5.com/.../1.jpg` (image/jpeg, 147157 bytes, 1080x1920) |  |  |  |
