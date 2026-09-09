# Extension Validation Report

- Extension: tachiyomi-de.mangatube-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 2
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6851437974515624757
- Source name: Manga Tube
- Source language: de
- Selected manga input: popular offset 0: Tales of Demons and Gods (`.../tales_of_demons_and_gods`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Tales of Demons and Gods (`.../tales_of_demons_and_gods`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Let's Lagoon (`.../lets_lagoon`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 13 | Revenge of the Baskerville Bloodhound (`.../revenge_of_the_baskerville_bloodhound`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Tales of Demons and Gods (`.../tales_of_demons_and_gods`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tales of Demons and Gods (`.../tales_of_demons_and_gods`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 334 | Vol. 1 Ch. 1 - Wiedergeburt (`.../8683`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tales of Demons and Gods, URL=`.../tales_of_demons_and_gods` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Tales of Demons and Gods, URL=`.../tales_of_demons_and_gods` at page 1 offset 1 and page 2 offset 6, title=All-Master Necromancer, URL=`.../all_master_necromancer` at page 1 offset 2 and page 2 offset 7, title=One Piece, URL=`.../one_piece` at page 1 offset 3 and page 2 offset 8, title=Revenge of the Baskerville Bloodhound, URL=`.../revenge_of_the_baskerville_bloodhound` at page 1 offset 4 and page 2 offset 0, title=Release that Witch, URL=`.../release_that_witch` at page 1 offset 5 and page 2 offset 1, title=Volcanic Age, URL=`.../volcanic_age` at page 1 offset 6 and page 2 offset 9, title=Superhuman Era, URL=`.../superhuman_era` at page 1 offset 7 and page 2 offset 2, title=Fairy Tail: 100 Years Quest, URL=`.../fairy_tail_100_years_quest` at page 1 offset 8 and page 2 offset 5, title=Flying Witch, URL=`.../flying_witch` at page 1 offset 9 and page 2 offset 11, title=Boku Girl, URL=`.../boku_girl` at page 1 offset 10 and page 2 offset 3 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 36/36 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 36/36 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://a.mtcdn.org/.../min_843fc3e088cbf45af1c7cd3af6ab50bbc9dd6e61.jpg` (image/jpeg, 4975 bytes, 74x117) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tales_of_demons_and_gods` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://a.mtcdn.org/.../max_843fc3e088cbf45af1c7cd3af6ab50bbc9dd6e61.jpg` (image/jpeg, 23310 bytes, 200x315) |  |  |  |
| details author | PASS | Mad Snail |  |  |  |
| details artist | PASS | Mad Snail |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Nachdem er vom Sage Emporer getötet wurde und als sein 13-jähriges Ich wiederbelebt wurde, bekommt Nie Li eine zweite Chance. Eine zweite Chance, alles zu verändern, geliebte Menschen und seine Heimatstadt zu beschützen. Mit dem Wissen aus seinem vorherigen Leben, beginnt er noch einmal von vorne um den Sage Emporer zu töten, seinen Tod zu rächen und der Stärkste zu werden. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 39 name, chapter 123 name, chapter 222 name |  |  |  |
| chapters | PASS | 334 chapters |  |  |  |
| chapter dates | PASS | 334 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://a.mtcdn.org/.../page_001_fc415d.png` (image/png, 1252048 bytes, 800x1132) |  |  |  |
