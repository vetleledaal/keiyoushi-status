# Extension Validation Report

- Extension: tachiyomi-it.shinobiscans-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 7733551911826034167
- Source name: Shinobi Scans
- Source language: it
- Selected manga input: popular offset 0: Overgeared (`.../456`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Overgeared (`.../456`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 13 | Saurus (`.../483`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Return of the Disaster-Class Hero (`.../521`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 13 | Saurus (`.../483`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Overgeared (`.../456`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Overgeared (`.../456`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 78 | 0 - Prologo (`.../n-a`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Overgeared, URL=`456` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://shinobiscans.com/.../locandina-nuova-logo-350x476.jpg` (image/jpeg, 66911 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `456` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://shinobiscans.com/.../locandina-nuova-logo-193x278.jpg` (image/jpeg, 34255 bytes, 193x278) |  |  |  |
| details author | PASS | Dong Wook Lee |  |  |  |
| details artist | PASS | Team Argo (REDICE studio) |  |  |  |
| details genres | PASS | Avventura, Azione, Commedia, Fantasy, Game, Manhwa, Slice of Life, Webtoon, Manga, Over, Overgeared, Overgeared ITA, Shinobiscans |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Satisfy è il miglior gioco VR (realtà virtuale) al mondo ed ha più di 2 miliardi di giocatori in tutto il globo. Un mondo fantasy così vasto, anche nei contenuti, da poter essere ampliamente considerato un altro mondo in tutto e per tutto. Molte terre sono ancora inesplorate, e queste superano di gran lunga quelle già conosciute.<br><br>\[Shin Young Woo (Username: Grid)\], la sfortuna sembra seguirlo ovunque sia nel gioco che nella vita reale, fin quando non entra in un’area remota e sconosciuta del gioco in una caverna dell’estremo nord, attiva una quest di grado S e trova un oggetto leggendario, il \[Libro raro di Pagma\] che gli permette di ottenere una classe leggendaria. Una classe unica nel suo genere, la più forte e leggendaria tra gli oltre 2 miliardi di utenti.<br><br>“Ma… come fai ad essere ancora vivo…?!” “Beh, semplice… Io sono Overgeared!”<br><br><br><br>Alternative Names: 템빨, Over |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 78 chapters |  |  |  |
| chapter dates | LINT | All 78 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=78 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://shinobiscans.com/.../0.png` (image/png, 1173134 bytes, 720x1089) |  |  |  |
