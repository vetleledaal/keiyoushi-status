# Extension Validation Report

- Extension: tachiyomi-all.yaoimangaonline-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 24
- Lint: 3
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7988826691692266469
- Source name: Yaoi Manga Online
- Source language: all
- Selected manga input: popular offset 0: YMO Discord Server! (`.../ymo-discord-server`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | YMO Discord Server! (`.../ymo-discord-server`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Ensemble Stars! Dj – NIGHT SCAPE by 1102/Ruka [JP] (`.../ensemble-stars-dj-night-scape-by-1102-ruka-jp`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 14 | YMO Discord Server! (`.../ymo-discord-server`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | YMO Discord Server! (`.../ymo-discord-server`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../ymo-discord-server`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=YMO Discord Server!, URL=`.../ymo-discord-server` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yaoimangaonline.com/.../YMO-Discord-thumb.jpg` (image/jpeg, 18631 bytes, 200x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ymo-discord-server` |  |  |  |
| details thumbnail URL | PASS | `https://yaoimangaonline.com/.../YMO-Discord-thumb.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Yaoi, Yaoi Webtoon |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Hello everyone! YaoiMangaOnline now has a Discord server! https://discord.gg/.../Gwj5sVA5w6<br><br>We will post in there manhwa updates, you can give your suggestions on how we can improve the site, reach us if you need help with creating an account on the site or any other issue you might face, request yaoi material that you’d want to find in here or simply chat about yaoi/BL.<br><br>You can join us at: https://discord.gg/.../Gwj5sVA5w6 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
