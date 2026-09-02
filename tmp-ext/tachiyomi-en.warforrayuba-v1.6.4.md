# Extension Validation Report

- Extension: tachiyomi-en.warforrayuba-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 17
- Lint: 3
- Warnings: 2
- Skipped: 12
- Failed: 2
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9161629559428486377
- Source name: War For Rayuba
- Source language: en
- Selected manga input: popular offset 0: master-list-1.json (`https://raw.githubusercontent.com/.../master-list-1.json`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 9 | master-list-1.json (`https://raw.githubusercontent.com/.../master-list-1.json`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | War For Rayuba Round 1 (`https://raw.githubusercontent.com/.../master-list-1.json`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 155 | 1 Garuda (`https://cubari.moe/.../OAyjrrN`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 9/9 popular manga have titles and URLs; all absolute (examples: entry 1: `https://raw.githubusercontent.com/.../master-list-1.json`, entry 2: `https://raw.githubusercontent.com/.../master-list-2.json`, entry 3: `https://raw.githubusercontent.com/.../master-list-3.json`) |  |  |  |
| thumbnail URLs | LINT | 0/9 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | UNUSUAL | Details changed selected title master-list-1.json to War For Rayuba Round 1 |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../iNrc7mG.jpg` |  |  |  |
| details author | PASS | Various artists on the WFR Discord (check each comic) |  |  |  |
| details artist | PASS | Various artists on the WFR Discord (check each comic) |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A War for Rayuba master set of comics for round 1.  PLEASE NOTE: This collection only includes comics that were submitted as imgur links; it does not include comics submitted directly through discord, twitter, or anything outside imgur.  You will still need to access the discord and view those battle channels to view those. <br> ...And You should!<br><br> The following characters are not represented here:<br> Heliophage, Vessel Corpse, The King's Players, Yuma Yun Yma, Gromesh, Erasmus, JUGGERNAUT HYLDE, Queen Paguroidea, Escher, KU, Tower of Eyes, Bull, Princess Xanthe Magellan, Brick Witch, Trikol, Scoria, Remiel Andronicus, Vessel & Living Dream, Izer Naam, Elseways, Nipih, The Sour Fruit of Kebby-ya, Lutha-YY-Sur, Te-Shou Haath, Orion, Jaagup, Agyp Aghta, and Prism |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 155 chapters |  |  |  |
| chapter dates | PASS | 155 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 155 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 500 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
