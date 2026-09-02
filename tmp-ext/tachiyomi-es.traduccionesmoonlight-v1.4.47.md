# Extension Validation Report

- Extension: tachiyomi-es.traduccionesmoonlight-v1.4.47
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
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
- Source ID: 4349338377187141550
- Source name: Traducciones Moonlight
- Source language: es
- Selected manga input: latest offset 0: EL ESPOSO DE MI AMIGA (`.../el-esposo-de-mi-amiga`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 11 | LOS CAMPOS OLVIDADOS (NOVELA) (`.../los-campos-olvidados-novela`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | EL ESPOSO DE MI AMIGA (`.../el-esposo-de-mi-amiga`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | EL ESPOSO DE MI AMIGA (`.../el-esposo-de-mi-amiga`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | EL ESPOSO DE MI AMIGA (`.../el-esposo-de-mi-amiga`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 39 | Capítulo 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 11 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=EL ESPOSO DE MI AMIGA, URL=`.../el-esposo-de-mi-amiga` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 24/24 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 24/24 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.traduccionesmoonlight.com/.../735b2a7f-0d07-4487-ab71-1faf5c95f5ab.png` (image/png, 4953864 bytes, 1684x2528) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el-esposo-de-mi-amiga` |  |  |  |
| details thumbnail URL | PASS | `https://media.traduccionesmoonlight.com/.../735b2a7f-0d07-4487-ab71-1faf5c95f5ab.png` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Drama, Adulto, Smut, Telenovela |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | “Todos los hombres decentes ya están tomados”. Los hombres verdaderamente buenos son reclamados rápidamente por mujeres inteligentes. Al igual que Dongju, el esposo de mi amiga. Con su aspecto guapo, una carrera sólida y una personalidad cálida y cariñosa, Cha Dongju es un hombre probado que ha pasado siete años con mi amiga. ¿Hay realmente alguien más perfecto que él... para ser mi novio? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 39 chapters |  |  |  |
| chapter dates | PASS | 39 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media.traduccionesmoonlight.com/.../f2972018-36d5-451c-8950-111169533fc1.jpg` (image/jpeg, 3377042 bytes, 997x28170) |  |  |  |
