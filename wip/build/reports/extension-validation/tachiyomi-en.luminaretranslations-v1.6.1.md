# Extension Validation Report

- Extension: tachiyomi-en.luminaretranslations-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1698654724978495521
- Source name: Luminare Translations
- Source language: en
- Selected manga input: popular offset 0: Living Together with the Queen from My High School Days Who was Arrogant, Surprisingly isn’t That Uncomfortable (`.../living-together-with-the-queen-from-my-high-school-days-who-was-arrogant-surprisingly-isnt-that-uncomfortable`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 21 | Living Together with the Queen from My High School Days Who was Arrogant, Surprisingly isn’t That Uncomfortable (`.../living-together-with-the-queen-from-my-high-school-days-who-was-arrogant-surprisingly-isnt-that-uncomfortable`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 21 | After I Saved the Cutest Underclassman at School, She Started Coming Over Like My Wife and Pushing for a Relationship (`.../after-i-saved-the-cutest-underclassman-at-school-she-started-coming-over-like-my-wife-and-pushing-for-a-relationship`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Living Together with the Queen from My High School Days Who was Arrogant, Surprisingly isn’t That Uncomfortable (`.../living-together-with-the-queen-from-my-high-school-days-who-was-arrogant-surprisingly-isnt-that-uncomfortable`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Chapter 1 (`.../17296`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://luminaretranslations.com/.../0000-720x1024.webp` (image/webp (encoding: lossy), 108418 bytes, 720x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `living-together-with-the-queen-from-my-high-school-days-who-was-arrogant-surprisingly-isnt-that-uncomfortable` |  |  |  |
| details thumbnail URL | PASS | `https://luminaretranslations.com/.../0000-720x1024.webp` |  |  |  |
| details author | PASS | Dozaemon Misoneta |  |  |  |
| details artist | PASS | Togawa Ritsu |  |  |  |
| details genres | PASS | adaptation, comedy, drama, mystery, psychological, romance, school-life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | "Hey, wanna do it?"<br><br><br><br>One late night, Yamamoto, a college student working part-time at a convenience store, reunites with Hayashi Megumi, his high school classmate and the most beautiful girl in their class. Known as the "Queen" for her strong-willed and arrogant personality, Yamamoto had always found her difficult to get along with. However, during a routine conversation, he notices painful bruises on her wrist. After learning that her boyfriend had been abusing her, Yamamoto decides to let Hayashi stay at his place...!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | PASS | 50 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://luminaretranslations.com/.../living-together-with-the-queen-from-my-high-school-days-who-was-arrogant-surprisingly-isnt-that-uncomfortable` to `https://luminaretranslations.com/.../living-together-with-the-queen-from-my-high-school-days-who-was-arrogant-surprisingly-isnt-that-uncomfortable` (1 redirects) |  |  |  |
| page load | PASS | `https://luminaretranslations.com/.../luminaregroup-4-4.jpg` (image/jpeg, 1801748 bytes, 2304x3072) |  |  |  |
