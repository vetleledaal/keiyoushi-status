# Extension Validation Report

- Extension: tachiyomi-en.paritehaber-v1.4.53
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
- Source implementation: keiyoushi.source.Generated
- Source ID: 3740623306758763677
- Source name: Paritehaber
- Source language: en
- Selected manga input: popular offset 0: Cuntboy Wives (`.../cuntboy-wives`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Cuntboy Wives (`.../cuntboy-wives`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Tentacle Recipe (`.../tentacle-recipe`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Devoured: The Serpent and the Pomegranate (`.../devoured-the-serpent-and-the-pomegranate`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | I became a first-class guide thanks to my childhood friends (`.../i-became-a-first-class-guide-thanks-to-my-childhood-friends`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Cuntboy Wives (`.../cuntboy-wives`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cuntboy Wives (`.../cuntboy-wives`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 14 | no 0001. Oneshot (`https://www.paritehaber.com/.../no-0001-oneshot`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 51 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cuntboy Wives, URL=`.../cuntboy-wives` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.paritehaber.com/.../fd585f2ef3b9c4c226c92925287d63bb-193x278.jpg` (image/jpeg, 12404 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cuntboy-wives` |  |  |  |
| details thumbnail URL | PASS | `https://www.paritehaber.com/.../fd585f2ef3b9c4c226c92925287d63bb-193x278.jpg` |  |  |  |
| details author | PASS | Stukitora |  |  |  |
| details artist | PASS | Stukitora |  |  |  |
| details genres | PASS | Adult, Doujinshi, Fetish, Full Color, Gender Bender, Gore, Hentai, Incest, Manga, Mature, Oneshot, SM/BDSM/SUB-DOM, Smut, Violence, Yaoi(BL) |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | TW: Non-con/rape, fetish content, amputation kink. — Please read at your own discretion. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 14 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.paritehaber.com/.../001.jpg` (image/jpeg, 405803 bytes, 1826x2880) |  |  |  |
