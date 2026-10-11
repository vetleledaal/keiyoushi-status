# Extension Validation Report

- Extension: tachiyomi-all.novelcool-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 7570101320206504111
- Source name: NovelCool
- Source language: en
- Selected manga input: popular offset 0: Martial Lord (`.../Martial-Lord.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Martial Lord (`.../Martial-Lord.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | MF Ghost (`.../MF-Ghost.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | With My Netherworld Trillions, Game On! (`.../With-My-Netherworld-Trillions-Game-On.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | HARDCORE LEVELING WARRIOR (`.../HARDCORE-LEVELING-WARRIOR.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Martial Lord (`.../Martial-Lord.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Lord (`.../Martial-Lord.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5461 | Martial Master Chapter 1 (`.../6615804`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Lord, URL=`.../Martial-Lord.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.novelcool.com/.../Martial_Lord6851.png` (image/png, 103965 bytes, 200x267) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Martial-Lord.html` |  |  |  |
| details thumbnail URL | PASS | `https://img.novelcool.com/.../Martial_Lord6851.png` |  |  |  |
| details author | PASS | Snow Step Studio |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ongoing, Official colored, Action, Long strip, Martial Arts, Fantasy, Supernatural, Full color, Official colored, Action, Long strip, Martial Arts, Fantasy, Supernatural, Full color, Official colored, Action, Long strip, Martial Arts, Fantasy, Supernatural, Full color, 2017, Ongoing |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The legend of the Tianwu Continent, Qin Chen, accidentally fell into the martial domain after being double-crossed by his best friends. Three hundred years later, he was reborn as an illegitimate child in a royal family who was being constantly bullied. With his attainments in previous life, cultivation methods, and pill refining skills, he quickly rises against all odds and embarks on an amazing journey that will shock the whole continent... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5461 chapters |  |  |  |
| chapter dates | PASS | 5461 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
