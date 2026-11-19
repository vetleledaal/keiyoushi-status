# Extension Validation Report

- Extension: tachiyomi-en.evascans-v1.6.7
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1911019612901009263
- Source name: Eva Scans
- Source language: en
- Selected manga input: popular offset 0: I’ve Fallen for the Empire’s Greatest Villainess (`.../ive-fallen-for-the-empires-greatest-villainess`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | I’ve Fallen for the Empire’s Greatest Villainess (`.../ive-fallen-for-the-empires-greatest-villainess`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | I Don’t Want to Be the Guide of the Villain with Obsessive-Compulsive Disorder (`.../i-dont-want-to-be-the-guide-of-the-villain-with-obsessive-compulsive-disorder`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | She is the Daughter of the Villainess in a Ridiculous Novel (`.../she-is-the-daughter-of-the-villainess-in-a-ridiculous-novel`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Tenseisha no Watashi wa Oshikatsu suru Tame Seijo ni Narimashita! (`.../tenseisha-no-watashi-wa-oshikatsu-suru-tame-seijo-ni-narimashita`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I’ve Fallen for the Empire’s Greatest Villainess (`.../ive-fallen-for-the-empires-greatest-villainess`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 119 | Chapter 1 (`.../ive-fallen-for-the-empires-greatest-villainess-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 160/160 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 160/160 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../2026-09-15-04-45-55-1789490755156.jpg <redacted query values: resize>` (image/jpeg, 20324 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ive-fallen-for-the-empires-greatest-villainess` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../2026-09-15-04-45-55-1789490755156.jpg` (image/jpeg, 581857 bytes, 1041x1511) |  |  |  |
| details author | PASS | Aji (II) |  |  |  |
| details artist | PASS | SORAJIMA |  |  |  |
| details genres | PASS | Drama, Fantasy, Josei, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | In high society, Raven is known as a womanizer and a free spirit. But suddenly, Estella, who’s rumored to hate men and is said to be the cruelest girl in the empire, walks into his bachelor life. And this girl proposes that he marry her! “There’s not a chance in hell this marriage will succeed,” thinks the young guy. But… Estella is convinced he’ll be the one to fall head over heels for her. How will it all pan out, and in the end, who will be right…<br><br>Alternative Names: <br>- 帝国一の悪女に溺愛がとまりません!<br>- 帝国一の悪女に溺愛がとまりません！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 119 chapters |  |  |  |
| chapter dates | PASS | 119 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://evascans.net/.../0.webp` (image/webp (container: extended), 409500 bytes, 720x10194) |  |  |  |
