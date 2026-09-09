# Extension Validation Report

- Extension: tachiyomi-es.infrafandub-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 5594696691862732725
- Source name: InfraFandub
- Source language: es
- Selected manga input: latest offset 0: Cuñada, Ya no soy tonto (`.../cunada-ya-no-soy-tonto`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Combat Continent IV (`.../combat-continent-iv`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Cuñada, Ya no soy tonto (`.../cunada-ya-no-soy-tonto`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cuñada, Ya no soy tonto (`.../cunada-ya-no-soy-tonto`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 45 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 54 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | SKIP | HTTP error 404 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 36/36 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 36/36 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://infrafandub.com/.../1.jpg` (image/jpeg, 548960 bytes, 1920x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cunada-ya-no-soy-tonto` |  |  |  |
| details thumbnail URL | PASS | `https://infrafandub.com/.../1.jpg` |  |  |  |
| details author | PASS | 九川动漫 |  |  |  |
| details artist | PASS | 九川动漫 |  |  |  |
| details genres | PASS | Accion, Aventura, Fantasia, Harem |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Fingí ser un tonto durante cinco años, ¡y ahora aplastaré a mis enemigos para llegar a la cima! Se acabó el engaño: ¡ahora me toca protegerlos por toda la eternidad! Toda mi familia asesinada… ¿Y ahora siete bellezas quieren casarse conmigo? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 45 chapters |  |  |  |
| chapter dates | PASS | 45 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://infrafandub.com/.../0.webp` (image/webp (container: extended), 69980 bytes, 1070x615) |  |  |  |
