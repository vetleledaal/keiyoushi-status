# Extension Validation Report

- Extension: tachiyomi-en.mangapill-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 3
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8448310129093543312
- Source name: MangaPill
- Source language: en
- Selected manga input: popular offset 0: Berserk (`.../berserk`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Berserk (`.../berserk`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 120 | Ura no Report (`.../ura-no-report`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | Berserk (`.../berserk`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Berserk (`.../berserk`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 405 | Chapter 1 (`.../berserk-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 92 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 120 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Berserk, URL=`.../berserk` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 5 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 134/134 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 134/134 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.readdetectiveconan.com/.../1.jpeg` (image/jpeg, 49952 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../berserk` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.readdetectiveconan.com/.../1.jpeg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Action, Adventure, Demons, Drama, Fantasy, Horror, Supernatural, Military, Psychological, Thriller |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Guts, a former mercenary now known as the "Black Swordsman," is out for revenge. After a tumultuous childhood, he finally finds someone he respects and believes he can trust, only to have everything fall apart when this person takes away everything important to Guts for the purpose of fulfilling his own desires. Now marked for death, Guts becomes condemned to a fate in which he is relentlessly pursued by demonic beings. Setting out on a dreadful quest riddled with misfortune, Guts, armed with a massive sword and monstrous strength, will let nothing stop him, not even death itself, until he is finally able to take the head of the one who stripped him—and his loved one—of their humanity. \[Written by MAL Rewrite\] Included one-shot: Volume 14: Berserk: The Prototype |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 405 chapters |  |  |  |
| chapter dates | LINT | All 405 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=405 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 92 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.readdetectiveconan.com/.../1.jpg` (image/jpeg, 164210 bytes, 1131x1600) |  |  |  |
