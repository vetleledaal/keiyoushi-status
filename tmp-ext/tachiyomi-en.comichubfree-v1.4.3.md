# Extension Validation Report

- Extension: tachiyomi-en.comichubfree-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2310489567413492709
- Source name: ComicHubFree
- Source language: en
- Selected manga input: popular offset 0: Invincible (2003) (`.../invincible`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Invincible (2003) (`.../invincible`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Fables (`.../fables`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | The Last Starfighter (2026) (`.../the-last-starfighter-2026`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | X-Men: Outback (`.../x-men-outback`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Invincible (2003) (`.../invincible`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Invincible (2003) (`.../invincible`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 170 | Invincible (2003) Issue #0 (`.../issue-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 18 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Invincible (2003), URL=`.../invincible` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comichubfree.com/.../5061.jpg` (image/jpeg, 16898 bytes, 240x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../invincible` |  |  |  |
| details thumbnail URL | PASS | `https://comichubfree.com/.../5061.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Girls, acne, homework, supervillains. When you're a teenager it pays to be Invincible. Mark Grayson was just an average kid living in a world full of super heroes. It wasn't until he was a teenager that he gained fantastic powers thanks to his biological father Omni-Man. He was able to fly faster than a jet, lift buildings like Hercules, and battle acne like Proactive. Girls, homework, super villains, it's just another day in the life of the one and only Invincible. Join Mark Grayson in his incredible adventures into the unknown and catch some astonishing surprises while you're at it. This is probably the best superhero comic in the entire universe, or so it claims. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 170 chapters |  |  |  |
| chapter dates | PASS | 170 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://comichubfree.com/.../1.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
