# Extension Validation Report

- Extension: tachiyomi-en.dynasty-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 4
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 669095474988166464
- Source name: Dynasty Scans
- Source language: en
- Selected manga input: popular offset 0: Around The Stars Of Yachiyo (`.../around_the_stars_of_yachiyo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | Around The Stars Of Yachiyo (`.../around_the_stars_of_yachiyo`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 34 | Cosmic Princess Kaguya (`.../cosmic_princess_kaguya`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 33 | Some Prefer Nettles (`.../some_prefer_nettles`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Around the Stars of Yachiyo (`.../around_the_stars_of_yachiyo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Around the Stars of Yachiyo (`.../around_the_stars_of_yachiyo`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../around_the_stars_of_yachiyo`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 34 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Around the Stars of Yachiyo, URL=`.../around_the_stars_of_yachiyo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Cosmic Princess Kaguya, URL=`.../cosmic_princess_kaguya` at page 1 offset 0 and page 2 offset 10, title=Pixiv, URL=`.../pixiv` at page 1 offset 6 and page 2 offset 13, title=A Scummy Gap Student With a Hard Life Calls Upon a Lady of the Night, URL=`.../a_scummy_gap_student_with_a_hard_life_calls_upon_a_lady_of_the_night` at page 1 offset 9 and page 2 offset 15, title=Magical Girl Witch Trials, URL=`.../magical_girl_witch_trials` at page 1 offset 12 and page 2 offset 12, title=All Through the Night, URL=`.../all_through_the_night` at page 1 offset 16 and page 2 offset 7, title=Love Live! Hasunosora Jogakuin School Idol Club, URL=`.../love_live_hasunosora_jogakuin_school_idol_club` at page 1 offset 17 and page 2 offset 8, title=New Princess Knight, URL=`.../new_princess_knight` at page 1 offset 19 and page 2 offset 30, title=Original, URL=`.../original` at page 1 offset 32 and page 2 offset 5, title=Some Prefer Nettles, URL=`.../some_prefer_nettles` at page 1 offset 33 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 74/74 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 57/74 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network; query parameters: permalink>` (image/webp (encoding: lossy), 1530740 bytes, 2160x3035) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Around The Stars Of Yachiyo to Around the Stars of Yachiyo |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://dynasty-scans.com/.../001.webp` (image/webp (encoding: lossy), 1530740 bytes, 2160x3035) |  |  |  |
| details author | PASS | Romi |  |  |  |
| details artist | PASS | Romi |  |  |  |
| details genres | PASS | Yuri, Moderate amounts of sex, NSFW, Spoilers, Drama, Animal ears |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Type:** Chapter · **Scanlator:** Gouma-Den · **Pairing:** Iroha x Yachiyo (Cosmic Princess) · **Doujin:** Cosmic Princess Kaguya · **Released:** 2026-11-13 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dynasty-scans.com/.../001.webp` (image/webp (encoding: lossy), 1530740 bytes, 2160x3035) |  |  |  |
