# Extension Validation Report

- Extension: tachiyomi-ja.nicomanga-v1.4.14
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 21
- Lint: 5
- Warnings: 0
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5680590515266301834
- Source name: Nicomanga
- Source language: ja
- Selected manga input: popular offset 0: SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW (`.../1424bfba.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW (`.../1424bfba.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | OCHIKOBORE DATTA ANI GA JITSUHA SAIKYOU: SHIJOU SAIKYOU NO YUUSHA WA TENSEI-SHI, GAKUEN DE MUJIKAKU NI MUSOU SURU (`.../af35c56c.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | DUNGEON NI SUNDE ITA OSSAN, SAIKYOU HAISHIN-SHA NI NARU: SHOKUGYOU TEKISEI "THIEF SSS" NO SEI DE TSUIHOU SARETA ORE, MUSOU SURU TOKORO GA YATARA BAZUTTE DENSETSU NI NARU (`.../a45b6fcb.html`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | NANI NO TORIE MO NAI HEIBON NA ORE GA BIJIN FUTAGO SHIMAI WO INOCHIGAKE DE TASUKETA KEKKA, JITSU WA YANDERE DATTA FUTARI WO GACHI HORESASETE SHIMATTA KEN (`.../abe41ed8.html`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW (`.../1424bfba.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW (`.../1424bfba.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW, URL=`.../1424bfba.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.ihlv1.xyz/.../5faa1046d57cb_5faa10473ef09.jpg <redacted query values: imgmax>` (image/jpeg, 209231 bytes, 320x454) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1424bfba.html` |  |  |  |
| details thumbnail URL | LINT | Thumbnail URL is empty; use null when unknown |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
