# Extension Validation Report

- Extension: tachiyomi-ja.manga1000-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 3
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2990178902658283254
- Source name: Manga1000
- Source language: ja
- Selected manga input: popular offset 0: ISEKAI H EIYUUDEN ~BISHOUJO SENSHI-TACHI WA SAIKYOU GUNSHI NO MUCHANA ONEGAI NI SAKARAENAI~ RAW (`.../manga-isekai-h-eiyuuden-bishoujo-senshi-tachi-wa-saikyou-gunshi-no-muchana-onegai-ni-sakaraenai-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | ISEKAI H EIYUUDEN ~BISHOUJO SENSHI-TACHI WA SAIKYOU GUNSHI NO MUCHANA ONEGAI NI SAKARAENAI~ RAW (`.../manga-isekai-h-eiyuuden-bishoujo-senshi-tachi-wa-saikyou-gunshi-no-muchana-onegai-ni-sakaraenai-raw`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Tenkaichi: Nihon Saikyou Bugeisha Ketteisen (`.../manga-tenkaichi-nihon-saikyou-bugeisha-ketteisen`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ISEKAI H EIYUUDEN ~BISHOUJO SENSHI-TACHI WA SAIKYOU GUNSHI NO MUCHANA ONEGAI NI SAKARAENAI~ RAW (`.../manga-isekai-h-eiyuuden-bishoujo-senshi-tachi-wa-saikyou-gunshi-no-muchana-onegai-ni-sakaraenai-raw`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ISEKAI H EIYUUDEN ~BISHOUJO SENSHI-TACHI WA SAIKYOU GUNSHI NO MUCHANA ONEGAI NI SAKARAENAI~ RAW (`.../manga-isekai-h-eiyuuden-bishoujo-senshi-tachi-wa-saikyou-gunshi-no-muchana-onegai-ni-sakaraenai-raw`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 27 | Chapter 1 (`.../1362231`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ISEKAI H EIYUUDEN ~BISHOUJO SENSHI-TACHI WA SAIKYOU GUNSHI NO MUCHANA ONEGAI NI SAKARAENAI~ RAW, URL=`.../manga-isekai-h-eiyuuden-bishoujo-senshi-tachi-wa-saikyou-gunshi-no-muchana-onegai-ni-sakaraenai-raw` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i4.hachiraw.win/.../image_682043247253b.png` (image/png, 332507 bytes, 320x454) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga-isekai-h-eiyuuden-bishoujo-senshi-tachi-wa-saikyou-gunshi-no-muchana-onegai-ni-sakaraenai-raw` |  |  |  |
| details thumbnail URL | PASS | `https://i4.hachiraw.win/.../image_682043247253b.png` |  |  |  |
| details author | PASS | OIKAWA Tooru |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Ecchi, Fantasy, Romance, Seinen |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Awaken a brilliant and sensual power. The genius strategist the world has longed for is born here. In the epic battle between humanity and monsters, who will claim victory in this fierce defense war?<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | LINT | All 27 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=27 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://p16-sg.tiktokcdn.com/.../5bfcb1d39d3f679227a44738e65ccb5d` (image/png, 3648269 bytes, 1440x2048) |  |  |  |
