# Extension Validation Report

- Extension: tachiyomi-es.emperorscan-v1.6.75
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source theme: imperiomanhwa
- Source ID: 4562754350961964148
- Source name: Emperor Scan
- Source language: es
- Selected manga input: popular offset 0: Devorador Infinito (`.../bjlptoxcp5pajt3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Devorador Infinito (`.../bjlptoxcp5pajt3`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | El renacimiento del archimago del grupo del héroe (`.../el-r3n4cimient0-del-archim4go-del-grupo-del-hero3`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Mi camino simulado hacia la inmortalidad (`.../mi-camino-simulado-hacia-la-inmortalidad`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Grupo De Estudio (`.../3erw-r4ed3w`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 8 | Devorador Infinito (`.../bjlptoxcp5pajt3`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Devorador Infinito (`.../bjlptoxcp5pajt3`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 208 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Devorador Infinito, URL=`.../bjlptoxcp5pajt3` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 104/104 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 104/104 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imperiomanhwa.com/.../bG9jYWw6Ly8vbGVnYWN5LWltcGVyaW9tYW5odWEtY292ZXJzLzIwMjYvMDgvZW5kbGVzcy1kZXZvdXIud2VicA` (image/webp (container: extended), 20306 bytes, 250x331) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bjlptoxcp5pajt3` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://imperiomanhwa.com/.../bG9jYWw6Ly8vbGVnYWN5LWltcGVyaW9tYW5odWEtY292ZXJzLzIwMjYvMDgvZW5kbGVzcy1kZXZvdXIud2VicA` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhua, Acción, Aventura |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yang Chen, quien no deja de reprobar sus evaluaciones de desempeño en una academia de cultivo inmortal, descubre accidentalmente que posee el Alma del Dragón Ancestral. En un mundo donde tales almas son raras, se convierte rápidamente en un todopoderoso Maestro Celestial y está listo para aventurarse en lo desconocido con su nuevo talento. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 208 chapters |  |  |  |
| chapter dates | PASS | 208 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imperiomanhwa.com/.../bG9jYWw6Ly8vbGVnYWN5LWltcGVyaW9tYW5odWEvbWFuZ2FfNmE5NTgyMmExMTk2Ny9jYXBpdHVsby0xLzAwMS53ZWJw` (image/webp (container: extended), 1017860 bytes, 850x7300) |  |  |  |
