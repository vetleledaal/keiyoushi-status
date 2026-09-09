# Extension Validation Report

- Extension: tachiyomi-all.mangadna-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5181311401760417052
- Source name: MangaDNA
- Source language: en
- Selected manga input: latest offset 0: Becoming Alpha (Uncensored) (`.../becoming-alpha-uncensored`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 23 | Dungeon Reset (`.../dungeon-reset`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 23 | Park Moojik Hit the Jackpot (`.../park-moojik-hit-the-jackpot`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 17 | Becoming Alpha (Uncensored) (`.../becoming-alpha-uncensored`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | Dominion Club (`.../dominion-club`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Becoming Alpha (Uncensored) (`.../becoming-alpha-uncensored`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Becoming Alpha (Uncensored) (`.../becoming-alpha-uncensored`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | Chapter 0 (`.../chapter-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Becoming Alpha (Uncensored), URL=`.../becoming-alpha-uncensored` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Princess, Please Distance Yourself A Little, URL=`.../princess-please-distance-yourself-a-little` at page 1 offset 4 and page 2 offset 3, title=I Became The Sex Art Master In My Murim Novel, URL=`.../i-became-the-sex-art-master-in-my-murim-novel` at page 1 offset 5 and page 2 offset 16, title=The Female Professor and the Nude Artist, URL=`.../the-female-professor-and-the-nude-artist` at page 1 offset 6 and page 2 offset 7, title=No to Obsession, Yes to Love, URL=`.../no-to-obsession-yes-to-love` at page 1 offset 9 and page 2 offset 11, title=Becoming Alpha (Uncensored), URL=`.../becoming-alpha-uncensored` at page 1 offset 10 and page 2 offset 5, title=The Princess Covets the Scholar, URL=`.../the-princess-covets-the-scholar` at page 1 offset 13 and page 2 offset 4, title=A Comic Artist’s Survival Guide, URL=`.../a-comic-artists-survival-guide` at page 1 offset 17 and page 2 offset 9, title=I Have Countless Legendary Swords, URL=`.../i-have-countless-legendary-swords` at page 1 offset 18 and page 2 offset 14 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://mangadna.com` -> 15 manga URLs (examples: `.../the-tattoo-artist`, `.../please-marry-me-again-husband`, `.../see-you-in-my-19th-life`) |  |  |  |
| thumbnail | PASS | `https://mangadna.com/.../becoming-alpha-uncensoredm.jpg` (image/jpeg, 16310 bytes, 202x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../becoming-alpha-uncensored` |  |  |  |
| details thumbnail URL | PASS | `https://mangadna.com/.../becoming-alpha-uncensoredm.jpg` |  |  |  |
| details author | PASS | Dream Invader, Furuikashi |  |  |  |
| details artist | PASS | Dream Invader, Furuikashi |  |  |  |
| details genres | PASS | Drama, Uncensored, Romance, Mature, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Patrick spent his life under his mother’s thumb, unable to master his urges around women. To fix him, his father, Roman, teaches him the alpha way: Respect the ...<br><br>Released: 2026<br><br>Rating: 5 / 5 (2 votes) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn11.mangadna.com/.../1-548.jpg` (image/jpeg, 397898 bytes, 720x5346) |  |  |  |
