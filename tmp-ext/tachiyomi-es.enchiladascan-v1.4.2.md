# Extension Validation Report

- Extension: tachiyomi-es.enchiladascan-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8884198347282365114
- Source name: EnchiladaScan
- Source language: es
- Selected manga input: popular offset 0: 2.5 Dimensional Seduction (Ririsa) (`.../inicio`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 28 | 2.5 Dimensional Seduction (Ririsa) (`.../inicio`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 2.5 Dimensional Seduction (Ririsa) (`.../inicio`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 2.5 Jigen no Ririsa (`.../inicio`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 158 | Capítulo 1 (`.../cap1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=2.5 Dimensional Seduction (Ririsa), URL=`.../inicio` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 29/29 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 29/29 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://enchiladascan.github.io/.../ririsa-cover.jpg` (image/jpeg, 471347 bytes, 1765x2509) |  |  |  |
| details identity | UNUSUAL | Details changed selected title 2.5 Dimensional Seduction (Ririsa) to 2.5 Jigen no Ririsa |  |  |  |
| details thumbnail URL | PASS | `https://enchiladascan.github.io/.../ririsa-cover.jpg` |  |  |  |
| details author | PASS | Yu Hashimoto |  |  |  |
| details artist | PASS | Yu Hashimoto |  |  |  |
| details genres | PASS | Harem, Comedia Romántica, Ecchi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Okumura Masamune, un estudiante de secundaria y el único miembro del club de investigación de manga, ve su vida cambiar cuando Ririsa Amaori, una apasionada del cosplay y fanática del personaje 'Liliel', se une al club. Juntos, exploran el mundo del cosplay y la fusión entre la vida real y la fantasía de los personajes de manga. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 158 chapters |  |  |  |
| chapter dates | LINT | All 158 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=158 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://drive.usercontent.google.com/.../uc <redacted query values: id and export-download>` (image/jpeg, 2154441 bytes, 2000x2850) |  |  |  |
