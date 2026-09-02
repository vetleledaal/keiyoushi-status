# Extension Validation Report

- Extension: tachiyomi-es.inmortalscan-v1.4.57
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8879875375160764811
- Source name: Inmortal Scan
- Source language: es
- Selected manga input: latest offset 0: Superestrella desde los 0 años (`.../superestrella-desde-los-0-anos`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | El pincel divino de Hwarim (`.../el-pincel-divino-de-hwarim`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 16 | Caballero en Eterna Regresión (`.../caballero-en-eterna-regresion`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 16 | Superestrella desde los 0 años (`.../superestrella-desde-los-0-anos`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | En Kunlun vive un dragón (`.../en-kunlun-vive-un-dragon`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Superestrella desde los 0 años (`.../superestrella-desde-los-0-anos`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Superestrella desde los 0 años (`.../superestrella-desde-los-0-anos`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 101 | capitulo 1 (`https://scan-inmortal.com/.../capitulo-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Superestrella desde los 0 años, URL=`.../superestrella-desde-los-0-anos` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://scan-inmortal.com/.../Superestrella-desde-los-0-anos.webp` (image/webp (container: extended), 52018 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../superestrella-desde-los-0-anos` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasía, Reencarnación |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Después de incontables reencarnaciones como elfo, hada, slime y muchas otras criaturas, Lee Seo Jun finalmente nace como un niño humano.<br><br>En la biblioteca que conserva los recuerdos de todas sus vidas descubre el sueño que nunca pudo cumplir: convertirse en una estrella. Con experiencias imposibles de encontrar en un actor común y habilidades capaces de atraer todas las miradas, Seo Jun decide conquistar el mundo del espectáculo desde la infancia.<br><br>Esta vez no piensa conformarse con un papel secundario: quiere convertirse en una superestrella.<br><br>Ideal si buscas una historia alegre de actuación, vida cotidiana y crecimiento desde los primeros años del protagonista.<br><br>Nombres Alternativos: Superstar From Age 0 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 101 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://wp.scaninmortal.store/.../1.jpg` (image/jpeg, 350066 bytes, 720x1038) |  |  |  |
