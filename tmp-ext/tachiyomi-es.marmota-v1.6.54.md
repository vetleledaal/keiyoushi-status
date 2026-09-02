# Extension Validation Report

- Extension: tachiyomi-es.marmota-v1.6.54
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
- Source ID: 5937472249278743372
- Source name: Marmota
- Source language: es
- Selected manga input: popular offset 0: Absolute Batman (2024) (`.../1879`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Absolute Batman (2024) (`.../1879`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Ultimate Black Panther (2024) (`.../1343`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Captain America (2025) (`.../2186`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Absolute Wonder Woman (2024) (`.../1909`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Absolute Batman (2024) (`.../1879`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Absolute Batman (2024) (`.../1879`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 25 | Absolute Batman #1 (`.../absolute-batman-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Absolute Batman (2024), URL=`1879` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://marmota.me/.../Absolute-Batman-001-2024-001-scaled.jpg` (image/jpeg, 608310 bytes, 1665x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `1879` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://marmota.me/.../Absolute-Batman-001-2024-001-scaled.jpg` (image/jpeg, 608310 bytes, 1665x2560) |  |  |  |
| details author | PASS | Scott Snyder |  |  |  |
| details artist | PASS | Nick Dragotta |  |  |  |
| details genres | PASS | DC Comics |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ¡LA LEYENDA DE BATMAN SCOTT SNYDER Y EL ICÓNICO ARTISTA NICK DRAGOTTA TRANSFORMAN LA HISTORIA DEL CABALLERO OSCURO PARA LA ERA MODERNA! Sin ghostwriter diplomarbeit österreich… sin hausarbeiten schreiben lassen… sin el masterarbeit schreiben lassen kosten… ¡lo que ghostwriter projektarbeit es el Caballero Oscuro Absoluto!<br><br>Traducción: Darth Wayne, Mister X, Lucas McLitlick Edición Digital: Black Dahlia<br><br>Nombres Alternativos: Batman Absoluto |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 25 chapters |  |  |  |
| chapter dates | LINT | 23 of 25 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=23 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://marmota.me/.../Absolute-Batman-001-(2024)-001.jpg` (image/jpeg, 236233 bytes, 1050x1615) |  |  |  |
