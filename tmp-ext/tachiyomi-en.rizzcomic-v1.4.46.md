# Extension Validation Report

- Extension: tachiyomi-en.rizzcomic-v1.4.46
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3062320139670175675
- Source name: Rizz Comic
- Source language: en
- Selected manga input: popular offset 0: Solo Farming In The Tower (`.../solo-farming-in-the-tower`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 87 | Solo Farming In The Tower (`.../solo-farming-in-the-tower`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 87 | Top Tier Providence (`.../top-tier-providence`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Solo Farming In The Tower (`.../solo-farming-in-the-tower`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Solo Farming In The Tower (`.../solo-farming-in-the-tower`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 101 | Chapter 1 (`.../r2311170-solo-farming-in-the-tower-chapter-1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 87 entries |  |  |  |
| latest listing | PASS | 87 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo Farming In The Tower, URL=`.../solo-farming-in-the-tower` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 175/175 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 175/175 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rizzfables.com/.../25__solofarming-20-06-2023_11_40_10_PM1.webp` (image/webp (encoding: lossy), 29818 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../solo-farming-in-the-tower` |  |  |  |
| details thumbnail URL | PASS | `https://rizzfables.com/.../25__solofarming-20-06-2023_11_40_10_PM1.webp` |  |  |  |
| details author | PASS | Brother Lim |  |  |  |
| details artist | PASS | Lee Hae-kyung |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Monster, Slice of life, System, Tower, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | One sunny day, a mysterious tower suddenly emerged in the city, earning the name "dungeon" from the intrigued populace. Within its confines lie treacherous terrains and menacing creatures, yet it also holds the promise of abundant treasures and untapped opportunities. <br><br>Sejun, a young man leading a mundane life, finds himself unexpectedly invited into the tower. Filled with excitement at the prospect of wealth, he embarks on this adventure, only to find himself stranded in a concealed area of the mysterious tower. <br><br>Armed with nothing more than a handful of seeds and his own physical abilities, Sejun must now adapt to his new reality by farming corps, collecting resources, and figuring out his survival strategy! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.55779955.xyz/.../solo-farming-in-the-tower-chapter-1-Solo-Farming-In-The-Tower-1.webp` (image/webp (encoding: lossy), 151268 bytes, 900x598) |  |  |  |
