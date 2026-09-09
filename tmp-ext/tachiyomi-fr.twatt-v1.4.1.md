# Extension Validation Report

- Extension: tachiyomi-fr.twatt-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 20
- Lint: 0
- Warnings: 0
- Skipped: 16
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5157242904926355900
- Source name: Twatt
- Source language: fr
- Selected manga input: popular offset 0: Nation Class Dungeon Architect (`.../7a119403-a88c-42d8-9fe0-9fba6c1849ac`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | Nation Class Dungeon Architect (`.../7a119403-a88c-42d8-9fe0-9fba6c1849ac`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Nation Class Dungeon Architect (`.../7a119403-a88c-42d8-9fe0-9fba6c1849ac`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Nation Class Dungeon Architect (`.../7a119403-a88c-42d8-9fe0-9fba6c1849ac`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | <1s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nation Class Dungeon Architect, URL=`.../7a119403-a88c-42d8-9fe0-9fba6c1849ac` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 18/18 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 18/18 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://twatt.fr/.../cover_1778527205573_8052d85c11570513.webp` (image/webp (encoding: lossy), 18656 bytes, 186x271) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../7a119403-a88c-42d8-9fe0-9fba6c1849ac` |  |  |  |
| details thumbnail URL | PASS | `https://twatt.fr/.../cover_1778527205573_8052d85c11570513.webp` |  |  |  |
| details author | PASS | Ambertail Scans |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Par le studio à l'origine de \[ <The Necromancer Family’s Young Heir> and <The Back-Alley Mage’s Return> \] Seo Yul est chef d'équipe de sauvetage et éclaireur, chargé des opérations de recherche et de sauvetage sur les sites de catastrophes dans les donjons. Au cours d’une opération de sauvetage, il risque sa vie pour sauver un camarade, mais finit par être capturé par le boss du donjon. À l’article de la mort, Seo Yul se réveille avec une classe cachée : « Architecte de donjon ». Doté de la capacité de concevoir et de développer son propre labyrinthe, Seo Yul se dresse pour affronter une menace imminente qui met en péril le monde entier… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
