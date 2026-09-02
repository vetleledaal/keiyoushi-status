# Extension Validation Report

- Extension: tachiyomi-es.mangamx-v1.4.19
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2202687009511923782
- Source name: MangaOni
- Source language: es
- Selected manga input: latest offset 0: Youchien wars (`.../youchien-wars`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Boku no Hero Academia (`.../boku-no-hero-academia`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 18 | Berserk (`.../berserk`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Youchien wars (`.../youchien-wars`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Cannon Master (`.../cannon-master`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Youchien wars (`.../youchien-wars`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Youchien wars (`.../youchien-wars`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 163 | Capítulo 1 — Hombre guapo con el pelo negro (`.../296553`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Youchien wars, URL=`.../youchien-wars` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://oni.ntr-files.online/.../cover.jpg <redacted query values: 1755142799>` (image/jpeg, 200207 bytes, 512x728) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../youchien-wars` |  |  |  |
| details thumbnail URL | PASS | `https://oni.ntr-files.online/.../cover.jpg <redacted query values: 1755142799>` |  |  |  |
| details author | PASS | Chiba Yuu |  |  |  |
| details artist | PASS | Chiba Yuu |  |  |  |
| details genres | PASS | Comedia, Acción, Recuentos de la vida |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Encargados de un jardín infantil, son asesinos profesionales y los cuidan con el fin de reducir sus condenas, si logran protegerlos en X tiempo, podrán ser libre pero ¿lo lograran? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 163 chapters |  |  |  |
| chapter dates | PASS | 163 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://oni.ntr-files.online/.../001.webp <redacted query values: up>` (image/webp (encoding: lossy), 515372 bytes, 1644x1200) |  |  |  |
