# Extension Validation Report

- Extension: tachiyomi-en.sacachispa-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 388932303664463452
- Source name: SACACHISPA
- Source language: en
- Selected manga input: popular offset 0: Lonely Gyaru Amasato-san Wants to Make a Friends List! (`.../d70cf04c-e030-4626-b835-fffcc061682f`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Lonely Gyaru Amasato-san Wants to Make a Friends List! (`.../d70cf04c-e030-4626-b835-fffcc061682f`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 19 | Sora o Matotte (`.../75b0c472-a9b8-49f9-858c-95e2838c8812`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lonely Gyaru Amasato-san Wants to Make a Friends List! (`.../d70cf04c-e030-4626-b835-fffcc061682f`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lonely Gyaru Amasato-san Wants to Make a Friends List! (`.../d70cf04c-e030-4626-b835-fffcc061682f`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Chapter 1 (`.../5801de54-2c69-49a8-8edd-5006d9309f7a`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | <1s |

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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 19 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lonely Gyaru Amasato-san Wants to Make a Friends List!, URL=`d70cf04c-e030-4626-b835-fffcc061682f` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 39/39 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 39/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.sacachispa.site/.../28feb614-af74-4446-bdd6-0491195e4704-full.webp` (image/webp (encoding: lossy), 354534 bytes, 1406x2000) |  |  |  |
| details identity | PASS | Details preserved selected URL `d70cf04c-e030-4626-b835-fffcc061682f` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.sacachispa.site/.../28feb614-af74-4446-bdd6-0491195e4704-full.webp` |  |  |  |
| details author | PASS | Alpha Beta |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | SEINEN, EROTICA, SCHOOL LIFE, GYARU, SLICE OF LIFE, ROMANCE, DRAMA, COMEDY |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "...You saw my secret, so you have to take responsibility."<br><br>Amasato Tsumugi is a solitary, peerless beautiful girl feared in class as the "Ice Empress." Showing no emotion toward anyone, she was kept at a distance by other students. Meanwhile, Shiba Yuuri was enjoying a peaceful high school debut while hiding his dark, lonely past from middle school—until the day he accidentally discovers her "secret that she can't tell anyone." Upon realizing Shiba knows her secret, Amasato suddenly starts taking off her clothes...!<br><br>**Alternative titles:**<br>- Bocchi Gyaru no Amasato-san wa Tomodachi Nōto o Tsukuritai!<br>- ぼっちギャルの天里さんはトモダチノートを作りたい！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.sacachispa.site/.../0f00dbac-b5b1-4401-89d6-5172b4a84807.webp` (image/webp (encoding: lossy), 151382 bytes, 1200x686) |  |  |  |
