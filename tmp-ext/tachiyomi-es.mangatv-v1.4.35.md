# Extension Validation Report

- Extension: tachiyomi-es.mangatv-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 3
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7214040353404261084
- Source name: Manga  TV
- Source language: es
- Selected manga input: latest offset 0: Guerrero de otra dimensión (`.../guerrero-de-otra-dimension`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | Guerrero de otra dimensión (`.../guerrero-de-otra-dimension`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 25 | Guerrero de otra dimensión (`.../guerrero-de-otra-dimension`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Guerrero de otra dimensión (`.../guerrero-de-otra-dimension`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Guerrero de otra dimensión (`.../guerrero-de-otra-dimension`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 75 | Capítulo 1 Traducciones Dimensional (`.../37ba2f7471324d`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 74 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Guerrero de otra dimensión, URL=`.../guerrero-de-otra-dimension` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img5.mangatv.net/.../6a641bafd05c0.jpg` (image/jpeg, 359827 bytes, 1016x1548) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../guerrero-de-otra-dimension` |  |  |  |
| details thumbnail URL | PASS | `https://img5.mangatv.net/.../6a641bafd05c0.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ¿Te gustaría encontrar un trabajo? ¿Incluso a costa de tu alma? Si es así, has llegado al lugar indicado. Nuestra página web de consejos para buscar empleo, Soul Sellers, está dirigida a quienes están dispuestos incluso a vender su alma a cambio de un empleo; así es, a gente como tú. ¿Estás lidiando con ángeles o con demonios? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 75 chapters |  |  |  |
| chapter dates | PASS | 75 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 74 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img5.mangatv.net/.../1.jpg` (image/jpeg, 189440 bytes, 720x1098) |  |  |  |
