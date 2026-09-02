# Extension Validation Report

- Extension: tachiyomi-all.mangadna-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5181311401760417052
- Source name: MangaDNA
- Source language: en
- Selected manga input: latest offset 0: Living with My Teacher! (`.../living-with-my-teacher`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 23 | Dungeon Reset (`.../dungeon-reset`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 23 | The Giantess Who Unleashed My Inner Monster (`.../the-giantess-who-unleashed-my-inner-monster`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Living with My Teacher! (`.../living-with-my-teacher`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | Brother’s Woman (Uncensored) (`.../brothers-woman-uncensored`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Living with My Teacher! (`.../living-with-my-teacher`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| latest listing | PASS | 12 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Princess, Please Distance Yourself A Little, URL=`.../princess-please-distance-yourself-a-little` at page 1 offset 4 and page 2 offset 3, title=I Became The Sex Art Master In My Murim Novel, URL=`.../i-became-the-sex-art-master-in-my-murim-novel` at page 1 offset 5 and page 2 offset 15, title=The Female Professor and the Nude Artist, URL=`.../the-female-professor-and-the-nude-artist` at page 1 offset 6 and page 2 offset 6, title=No to Obsession, Yes to Love, URL=`.../no-to-obsession-yes-to-love` at page 1 offset 9 and page 2 offset 10, title=Living with My Teacher!, URL=`.../living-with-my-teacher` at page 1 offset 10 and page 2 offset 21, title=The Princess Covets the Scholar, URL=`.../the-princess-covets-the-scholar` at page 1 offset 13 and page 2 offset 4, title=A Comic Artist’s Survival Guide, URL=`.../a-comic-artists-survival-guide` at page 1 offset 17 and page 2 offset 8, title=I Have Countless Legendary Swords, URL=`.../i-have-countless-legendary-swords` at page 1 offset 18 and page 2 offset 13 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 74/74 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 74/74 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://mangadna.com` -> 15 manga URLs (examples: `.../the-tattoo-artist`, `.../please-marry-me-again-husband`, `.../see-you-in-my-19th-life`) |  |  |  |
| thumbnail | PASS | `https://mangadna.com/.../living-with-my-teacherm.jpg` (image/jpeg, 18851 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../living-with-my-teacher` |  |  |  |
| details thumbnail URL | PASS | `https://mangadna.com/.../living-with-my-teacherm.jpg` |  |  |  |
| details author | PASS | Seokji |  |  |  |
| details artist | PASS | Seokji |  |  |  |
| details genres | PASS | Drama, Mature, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Soohyun loses his place to live after falling victim to a rental deposit scam. Of all people, he ends up staying at his former homeroom teacher’s house. The wom...<br><br>Alternative: 선생님과 산다<br><br>Released: 2026<br><br>Rating: 5 / 5 (1 votes) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn01.mangadna.com/.../1-6f57a.jpg` (image/jpeg, 894042 bytes, 720x16192) |  |  |  |
