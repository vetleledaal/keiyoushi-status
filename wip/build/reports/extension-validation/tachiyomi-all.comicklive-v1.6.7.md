# Extension Validation Report

- Extension: tachiyomi-all.comicklive-v1.6.7
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 1
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4972933717624256217
- Source name: Comick (Unoriginal)
- Source language: all
- Selected manga input: latest offset 0: The Jobless Siblings (`.../the-jobless-siblings`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | My Escort Was My Ex's Mom (`.../my-escort-was-my-exs-mom`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | After Reincarnating as a Villain, Saving the World, and Being Betrayed and Banished, My Former Companions Somehow Came Chasing After Me With Yandere Eyes… (`.../after-reincarnating-as-a-villain-saving-the-world-and-being-betrayed-and-banished-my-former-companions-somehow-came-chasing-after-me-with-yandere-eyes`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | The Jobless Siblings (`.../the-jobless-siblings`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 100 | The Jobless Siblings (`.../the-jobless-siblings`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Jobless Siblings (`.../the-jobless-siblings`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1202 | Ch. 857 (`.../T1ZVxeD-chapter-857-en`) |  | 10s+ |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=My Escort Was My Ex's Mom, URL=`my-escort-was-my-exs-mom` at page 1 offset 0 and page 2 offset 8, title=Fate Reroll: Toppler of Kings, URL=`fate-reroll-toppler-of-kings` at page 1 offset 1 and page 2 offset 14, title=I Want to Be Banished, but Everyone Likes Me Too Much!, URL=`i-want-to-be-banished-but-everyone-likes-me-too-much` at page 1 offset 2 and page 2 offset 20, title=10,000-Fold Amplification: All My Skills Are Forbidden Spells, URL=`10000-fold-amplification-all-my-skills-are-forbidden-spells` at page 1 offset 3 and page 2 offset 28, title=Ahjumma's Secret Employment, URL=`ahjummas-secret-employment` at page 1 offset 4 and page 2 offset 36, title=My Girlfriend Returned as a Dragon, URL=`my-girlfriend-returned-as-a-dragon` at page 1 offset 5 and page 2 offset 43, title=Living in a World Where I'm Rated, URL=`living-in-a-world-where-im-rated` at page 1 offset 6 and page 2 offset 45, title=Damn Reincarnation 2, URL=`damn-reincarnation-2` at page 1 offset 7 and page 2 offset 49 |  |  |  |
| latest pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | FAIL | Latest page 1 repeats 99 manga entries; Latest page 2 repeats 99 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 300/300 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 300/300 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn1.comicknew.pictures/.../40bb6193.webp` (image/webp (encoding: lossy), 356764 bytes, 1800x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-jobless-siblings` |  |  |  |
| details thumbnail URL | PASS | `https://cdn1.comicknew.pictures/.../40bb6193.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Slice of Life, Comedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The Jobless Siblings summary: A slice-of-life story about "life-less" brother and sister, both jobless shut-ins. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1202 chapters |  |  |  |
| chapter dates | PASS | 1202 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn1.comicknew.pictures/.../0.jpg` (image/webp (encoding: lossy), 323370 bytes, 1113x1600) |  |  |  |
