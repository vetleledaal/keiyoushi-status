# Extension Validation Report

- Extension: tachiyomi-en.rizzcomic-v1.4.46
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3062320139670175675
- Source name: Rizz Comic
- Source language: en
- Selected manga input: latest offset 0: Top Tier Providence (`.../top-tier-providence`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 87 | Solo Farming In The Tower (`.../solo-farming-in-the-tower`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 87 | Top Tier Providence (`.../top-tier-providence`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Top Tier Providence (`.../top-tier-providence`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Top Tier Providence (`.../top-tier-providence`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 230 | Chapter 1 (`.../r2311170-top-tier-providence-chapter-1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Top Tier Providence, URL=`.../top-tier-providence` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 175/175 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 175/175 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rizzfables.com/.../ttp11.webp` (image/webp (encoding: lossy), 105798 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../top-tier-providence` |  |  |  |
| details thumbnail URL | PASS | `https://rizzfables.com/.../ttp11.webp` |  |  |  |
| details author | PASS | Let Me Smile |  |  |  |
| details artist | PASS | Meatbag |  |  |  |
| details genres | PASS | Action, Adventure, Cultivation, Reincarnation, System, Xianxia, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Being reincarnated in a cultivation world, Han Jue realizes that he can live his life like a video game. He can reroll his cultivation potential and connate providence.
<br>So, he spends 11 years rerolling for a good one…
<br>
<br>> - \[Unparalleled: Immortal beauty, top-notch charm\]
<br>> - \[Destined Sword fanatic: Top-notch Sword Dao aptitude, top-notch Sword Dao comprehension\]
<br>> - \[Unparalleled Movement Technique: Top-notch movement technique aptitude\]
<br>> - \[Descendant of the Immortal Emperor: You will receive an unparalleled cultivation technique and 1,000 superior-grade spirit stones\]
<br>
<br>In pursuit of longevity, Han Jue decides to cultivate in a low-profile manner.
<br>
<br>A thousand years later, generations of cultivators have become history.
<br>
<br>That is when beings of the immortal world start cleansing the mortal world. Han Jue can no longer hide and has no choice but to take action. 
<br>
<br>Then he realizes deities and gods aren’t that powerful after all!
<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 230 chapters |  |  |  |
| chapter dates | PASS | 230 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.55779955.xyz/.../top-tier-providence-chapter-1-1313-xx.webp` (image/webp (encoding: lossy), 108092 bytes, 900x632) |  |  |  |
