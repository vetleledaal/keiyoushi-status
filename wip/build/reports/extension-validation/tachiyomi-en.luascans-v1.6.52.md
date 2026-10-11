# Extension Validation Report

- Extension: tachiyomi-en.luascans-v1.6.52
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: heancms
- Source ID: 972271455406675873
- Source name: Lua Scans
- Source language: en
- Selected manga input: popular offset 0: I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | I Saved You, but I'm Not Responsible (`.../i-saved-you-but-im-not-responsible`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Secret Lady (`.../secret-lady`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | I Thought I Was the Main Character (`.../i-thought-i-was-the-main-character`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 167 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 99 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Need to Raise My Sister Properly, URL=`.../i-need-to-raise-my-sister-properly` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Secret Lady, URL=`.../secret-lady` at page 1 offset 0 and page 2 offset 5, title=The Villainess Lives Again, URL=`.../the-villainess-lives-again` at page 1 offset 1 and page 2 offset 4, title=I Became the Weakest Demon King’s Mentor, URL=`.../i-became-the-weakest-demon-kings-mentor` at page 1 offset 2 and page 2 offset 3, title=50 Tea Recipes from the Duchess, URL=`.../50-tea-recipes-from-the-duchess` at page 1 offset 3 and page 2 offset 2, title=The White Tiger Princess Isn’t Dangerous, URL=`.../the-white-tiger-princess-isnt-dangerous` at page 1 offset 9 and page 2 offset 9, title=The Unsold Saintess’s White Marriag, URL=`.../the-unsold-saintesss-white-marriag` at page 1 offset 11 and page 2 offset 6 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.luacomic.org/.../oysh4jdz78cza3mqd08i6pih.webp` (image/webp (container: extended), 391454 bytes, 1048x1501) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../i-need-to-raise-my-sister-properly` |  |  |  |
| details thumbnail URL | PASS | `https://media.luacomic.org/.../oysh4jdz78cza3mqd08i6pih.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Transported into a novel as the villain's half-sister, she vows to change their tragic fate. But her plans derail when she catches the attention of the terrifying "Blood Duke," who denies having feelings yet acts like a jealous boyfriend. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 45 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name |  |  |  |
| chapters | PASS | 167 chapters |  |  |  |
| chapter dates | PASS | 167 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 99 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.luacomic.org/.../001.webp` (image/webp (encoding: lossy), 37420 bytes, 720x1199; server Content-Type: image/jpg) |  |  |  |
