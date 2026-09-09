# Extension Validation Report

- Extension: tachiyomi-en.flamecomics-v1.4.50
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8531542650987673943
- Source name: Flame Comics
- Source language: en
- Selected manga input: latest offset 0: Is It Bad That the Main Character's a Roleplayer? (`.../163`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 30 Years Have Passed Since the Prologue (`.../165`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Destined Murderer (`.../148`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Is It Bad That the Main Character's a Roleplayer? (`.../163`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Is It Bad That the Main Character's a Roleplayer? (`.../163`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Is It Bad That the Main Character's a Roleplayer? (`.../163`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 30 | Chapter 1 (`.../3b6c604170099f33`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Is It Bad That the Main Character's a Roleplayer?, URL=`.../163` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.flamecomics.xyz/.../thumbnail.webp <redacted query values: 1784118528>` (image/webp (encoding: lossless), 869922 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../163` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.flamecomics.xyz/.../thumbnail.webp <redacted query values: 1784118528>` |  |  |  |
| details author | PASS | Haeinseol, Yebi |  |  |  |
| details artist | PASS | Sangdan Studio, Geona |  |  |  |
| details genres | PASS | Manhwa, Action, Adventure, Comedy, Drama, Fantasy, Psychological, Tragedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | I’m a roleplayer. A gamer who creates characters according to their classes and happily acts as them.“Don’t… Touch me……”“Talk more and see if you can handle my wrath……”My current character was a Demon Knight who kept a Demon sealed in his right arm! One day while I was just acting as my character and enjoying the game as usual……“Log out.”\[This command cannot be carried out.\]“……? Log out.”\[This command cannot be carried out.\]“……???”And as if not being able to log out wasn’t enough…“You disgusting Demon! So you finally took over Sir Demon Knight’s body!”“My eyes cannot be deceived! Sir Demon Knight isn’t that kind!”Because of my damn companions I couldn’t even stop role playing!Can this role playing gamer faithful to their setting ever return to reality? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.flamecomics.xyz/.../MCRP-1-00.jpg <redacted query values: 1784079216>` (image/jpeg, 512466 bytes, 1778x1000) |  |  |  |
