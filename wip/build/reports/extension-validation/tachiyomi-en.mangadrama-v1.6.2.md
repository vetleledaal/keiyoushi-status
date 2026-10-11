# Extension Validation Report

- Extension: tachiyomi-en.mangadrama-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: initmanga
- Source ID: 3174596843279946873
- Source name: Manga Drama
- Source language: en
- Selected manga input: popular offset 0: Shark (`.../shark`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 411 | Shark (`.../shark`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 448 | The Long Way of the Warrior (`.../the-long-way-of-the-warrior`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Shark (`.../shark`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shark (`.../shark`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 409 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 411 entries |  |  |  |
| latest listing | PASS | 448 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shark, URL=`.../shark` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 862/862 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 862/862 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangadrama.com/.../Shark-2-300x400.webp` (image/webp (encoding: lossy), 52342 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shark` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangadrama.com/.../Shark-2-450x600.webp` (image/webp (encoding: lossy), 107716 bytes, 450x600) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | KIM Woo-seop |  |  |  |
| details genres | PASS | Action, Manhwa, Martial arts, Sport |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sharks don't have lungs, but they do have to breathe oxygen to survive. Instead of breathing air, though, sharks get oxygen from the water that surrounds them. So they have to move around, if they stop moving for a while, they sink into the water and die, So Sharks have to move and move constantly from birth to death. The same goes for you. If you want to survive, keep moving, then you will be the best hunter... like a shark. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 409 chapters |  |  |  |
| chapter dates | LINT | 62 of 409 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=62 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangadrama.com/.../2` to `https://mangadrama.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.mangadrama.com/.../63020138df0a-01.jpg` (image/jpeg, 305843 bytes, 750x8061) |  |  |  |
