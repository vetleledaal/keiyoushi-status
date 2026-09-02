# Extension Validation Report

- Extension: tachiyomi-all.manhwa18cc-v1.4.59
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 4841602236575491202
- Source name: Manhwa18.cc
- Source language: en
- Selected manga input: popular offset 0: Keep it a secret from your mother! (`.../keep-it-a-secret-from-your-mother-01`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 23 | Keep it a secret from your mother! (`.../keep-it-a-secret-from-your-mother-01`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 22 | My Landlady Noona (`.../my-landlady-noona-01`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 21 | I Banged All My Classmates After Graduation (`.../i-banged-all-my-classmates-after-graduation`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 14 | Mount Hua Sect’s Genius Phantom Swordsman (`.../mount-hua-sects-genius-phantom-swordsman`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Keep it a secret from your mother! (`.../keep-it-a-secret-from-your-mother-01`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Keep it a secret from your mother! (`.../keep-it-a-secret-from-your-mother-01`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 112 | Chapter 1 (`https://manhwa18.cc/.../chapter-1 <redacted query values: style>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 62 |  |  | <1s |

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
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Keep it a secret from your mother!, URL=`.../keep-it-a-secret-from-your-mother-01` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwa18.cc/.../keep-it-a-secret-from-your-motherm.jpg` (image/jpeg, 12956 bytes, 187x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../keep-it-a-secret-from-your-mother-01` |  |  |  |
| details thumbnail URL | PASS | `https://manhwa18.cc/.../keep-it-a-secret-from-your-motherm.jpg` |  |  |  |
| details author | PASS | Noah |  |  |  |
| details artist | PASS | Noah |  |  |  |
| details genres | PASS | Romance, School Life, Slice of Life, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Hae-Seong is staying at his mom’s friend’s house whose name is Yona. He thought it would be enough to study well at school but the top students are good at love too. “The classroom wasn’t only for studying…?!"<br><br>Alternative Names: 엄마한텐 비밀이야 / Secret to your mom |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 112 chapters |  |  |  |
| chapter dates | PASS | 112 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 112 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img01.manhwa18.cc/.../1-534.jpg` (image/jpeg, 359157 bytes, 719x2975) |  |  |  |
