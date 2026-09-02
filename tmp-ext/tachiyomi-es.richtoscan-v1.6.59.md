# Extension Validation Report

- Extension: tachiyomi-es.richtoscan-v1.6.59
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1245067583654716116
- Source name: RichtoScan
- Source language: es
- Selected manga input: popular offset 0: EL SUEÑO DE WOO HOO-YOUNG ROBANDO TALENTOS (`.../1922`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | EL SUEÑO DE WOO HOO-YOUNG ROBANDO TALENTOS (`.../1922`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | vivir o morir (`.../3593`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | EN LO ALTO DE LA CLASE (`.../1969`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Invocaciones fuera de control (`.../4034`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | EL SUEÑO DE WOO HOO-YOUNG ROBANDO TALENTOS (`.../1922`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | EL SUEÑO DE WOO HOO-YOUNG ROBANDO TALENTOS (`.../1922`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 105 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 47 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=EL SUEÑO DE WOO HOO-YOUNG ROBANDO TALENTOS, URL=`1922` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://r1.richtoon.top/.../preview-1-350x476.png` (image/png, 393952 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `1922` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://r1.richtoon.top/.../preview-1.png` (image/png, 1468499 bytes, 730x1024) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | DEPORTES, MANHWA-COREANO, REGRESION, SEINEN, SISTEMA, RICHTO, Updating |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Woo Ho-young soñaba con ser futbolista, pero el destino quiso que no tuviera talento y un rayo lo mató sin llegar a realizar su sueño. Después de eso apareció el demonio mamon y le dio la habilidad de robar el talento de otras personas…. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 105 chapters |  |  |  |
| chapter dates | LINT | 101 of 105 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=101 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://r1.richtoon.top/.../0.1_1_11zon.webp` (image/webp (container: extended), 155990 bytes, 900x2187) |  |  |  |
