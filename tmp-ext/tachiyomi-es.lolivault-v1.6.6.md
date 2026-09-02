# Extension Validation Report

- Extension: tachiyomi-es.lolivault-v1.6.6
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 1
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1420213267345607410
- Source name: Lolivault
- Source language: es
- Selected manga input: popular offset 0: A mi joven esposa y yo (`.../a_mi_joven_esposa_y_yo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | A mi joven esposa y yo (`.../a_mi_joven_esposa_y_yo`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Hina Meikyuu (`.../hina_meikyuu`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | A mi joven esposa y yo (`.../a_mi_joven_esposa_y_yo`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Viajeros Interestelares (`.../viajeros_interestelares`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A mi joven esposa y yo (`.../a_mi_joven_esposa_y_yo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A mi joven esposa y yo (`.../a_mi_joven_esposa_y_yo`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 11 | ¡¡Un viaje para dos!! (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A mi joven esposa y yo, URL=`.../a_mi_joven_esposa_y_yo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Variados, URL=`.../variados` at page 1 offset 5 and page 2 offset 5, title=Viajeros Interestelares, URL=`.../viajeros_interestelares` at page 1 offset 17 and page 2 offset 0 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 8 manga entries; Latest page 2 repeats 4 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 84/84 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 50/84 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lector.lolivault.net/.../P001.jpg` (image/jpeg, 1887643 bytes, 1750x2493) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a_mi_joven_esposa_y_yo` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lector.lolivault.net/.../thumb_P001.jpg` (image/jpeg, 23727 bytes, 176x250) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://lector.lolivault.net/.../P001.jpg` (image/jpeg, 1587828 bytes, 5507x2500) |  |  |  |
