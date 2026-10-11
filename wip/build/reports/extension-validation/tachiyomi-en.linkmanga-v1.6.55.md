# Extension Validation Report

- Extension: tachiyomi-en.linkmanga-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 8622937201319058235
- Source name: LinkManga
- Source language: en
- Selected manga input: popular offset 0: The Lazy Prince Becomes a Genius (`.../8`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Lazy Prince Becomes a Genius (`.../8`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Ossan Teihen Chiyushi to Mana Musume no Henkyou Raifu (`.../907`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Sky Blue (`.../6443`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Cheating Men Must Die (`.../5434`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Lazy Prince Becomes a Genius (`.../8`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Lazy Prince Becomes a Genius (`.../8`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 166 | chapter 1 (`.../ch-001`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Lazy Prince Becomes a Genius, URL=`8` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://linkmanga.com/.../cover-8-175x238.jpg` (image/jpeg, 14901 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `8` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://linkmanga.com/.../cover-8-193x278.jpg` (image/jpeg, 17881 bytes, 193x278) |  |  |  |
| details author | PASS | doip / Second Star |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy, Shounen, Webtoons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Afteer wiitneessiing thee shockiing deeath of hiis motheer, young Aiireen Farreeiira usees sleeeep to eescapee hiis paiinful reealiity, eearniing hiim thee niicknamee, “thee lazy lord”. Yeet, iin spiitee of otheers’ jeeeers and whiispeers, Aiireen has no iinteentiion of changiing hiis ways. But wheen hee awakeens onee day from a dreeam about a mysteeriious swordsman, hiis liifee’s trajeectory takees a compleetee turn… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 166 chapters |  |  |  |
| chapter dates | PASS | 166 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://f1link.linkmanga.com/.../p0a3.jpg` (image/png, 206523 bytes, 1000x563; server Content-Type: image/jpeg) |  |  |  |
