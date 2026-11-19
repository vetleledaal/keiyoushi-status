# Extension Validation Report

- Extension: tachiyomi-en.xoxocomics-v1.6.16
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: wpcomics
- Source ID: 2385956107618754468
- Source name: XOXO Comics
- Source language: en
- Selected manga input: popular offset 0: Spider-Man: Long Way Home (`.../spider-man-long-way-home`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Spider-Man: Long Way Home (`.../spider-man-long-way-home`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | Justice League Unlimited (2024) (`.../justice-league-unlimited-2024`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 94 | Midnight X-Men (2026-) (`.../midnight-x-men-2026`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 39 | Civil War: Unmasked (`.../civil-war-unmasked`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Spider-Man: Long Way Home (`.../spider-man-long-way-home`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Spider-Man: Long Way Home (`.../spider-man-long-way-home`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Spider-Man: Long Way Home Issue #1 (`.../issue-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 28 |  |  | <1s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 94 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Spider-Man: Long Way Home, URL=`.../spider-man-long-way-home` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=D'Orc, URL=`.../dorc` at page 1 offsets 6, 86 and page 2 offset 37, title=Absolute Flash, URL=`.../absolute-flash` at page 1 offsets 15, 76 and page 2 offset 35, title=Punisher vs. The Amazing Spider-Man (2026-), URL=`.../punisher-vs-the-amazing-spider-man-2026` at page 1 offsets 17, 52 and page 2 offset 33, title=Detective Comics (2016), URL=`.../detective-comics-2016` at page 1 offsets 18, 78 and page 2 offset 2, title=Batwoman (2026), URL=`.../batwoman-2026` at page 1 offsets 23, 80 and page 2 offset 3, title=Deathstroke: The Terminator, URL=`.../deathstroke-the-terminator` at page 1 offsets 24, 81 and page 2 offset 4, title=Lobo (2026), URL=`.../lobo-2026` at page 1 offsets 25, 82 and page 2 offset 6, title=Daredevil (2026), URL=`.../daredevil-2026` at page 1 offsets 31, 50 and page 2 offset 5, title=Miles Morales: Spider-Man (2026-), URL=`.../miles-morales-spider-man-2026` at page 1 offsets 35, 70 and page 2 offset 11, title=Monstress, URL=`.../monstress` at page 1 offset 43 and page 2 offset 8, title=Absolute Wonder Woman, URL=`.../absolute-wonder-woman` at page 1 offset 51 and page 2 offset 26, title=Spider-Man / Hulk: Fire and Brimstone (2026-), URL=`.../spider-man-hulk-fire-and-brimstone-2026` at page 1 offset 53 and page 2 offset 34, title=Superman: Father of Tomorrow, URL=`.../superman-father-of-tomorrow` at page 1 offset 55 and page 2 offset 38, title=Nightwing (2016), URL=`.../nightwing-2016` at page 1 offset 67 and page 2 offset 27, title=Catwoman (2018), URL=`.../catwoman-2018` at page 1 offset 68 and page 2 offset 28, title=Witchblade (2024), URL=`.../witchblade-2024` at page 1 offset 69 and page 2 offset 32, title=Batman/Superman: World’s Finest, URL=`.../batman-superman-world-s-finest` at page 1 offset 72 and page 2 offset 29, title=X-Men: Outback, URL=`.../x-men-outback` at page 1 offset 73 and page 2 offset 1, title=Superman Unlimited, URL=`.../superman-unlimited` at page 1 offset 75 and page 2 offset 30, title=Avengers: Armageddon, URL=`.../avengers-armageddon` at page 1 offset 84 and page 2 offset 31, title=Absolute Green Arrow, URL=`.../absolute-green-arrow` at page 1 offset 89 and page 2 offset 7, title=Civil War: Unmasked, URL=`.../civil-war-unmasked` at page 1 offset 93 and page 2 offset 0 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 20 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 206/206 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 206/206 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://xoxocomic.com/.../spider-man-long-way-home.jpg` (image/jpeg, 16055 bytes, 200x260) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../spider-man-long-way-home` |  |  |  |
| details thumbnail URL | PASS | `https://xoxocomic.com/.../spider-man-long-way-home.jpg` |  |  |  |
| details author | PASS | Jonathan Hickman |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Marvel, Action, Adventure, Superhero |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A DARK HOMECOMING AWAITS...<br>It's a world before the Punisher. A world where the existence of the Hulk is but a whisper of a rumor. A world where A.I.M. has just developed a Cosmic Cube in the jungles of South America. Frank Castle, Bruce Banner and Peter Parker are all on a mission to keep the Cube out of the wrong hands — including each other's. In this three-way free-for-all for the power of the cosmos, who will come out on top? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://xoxocomic.com/.../comic-update <redacted query values: page>` to `https://xoxocomic.com/.../comic-update` (1 redirects); popular: `https://xoxocomic.com/.../search-comic <redacted query values: keyword and page>` to `https://xoxocomic.com/.../search-comic <redacted query values: keyword>` (1 redirects) |  |  |  |
| page load | FAIL | First page URL `https://xoxocomic.com/.../1.jpg` did not contain a decodable image (106040 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
