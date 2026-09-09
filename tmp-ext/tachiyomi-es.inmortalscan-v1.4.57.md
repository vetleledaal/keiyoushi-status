# Extension Validation Report

- Extension: tachiyomi-es.inmortalscan-v1.4.57
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 8879875375160764811
- Source name: Inmortal Scan
- Source language: es
- Selected manga input: latest offset 0: Abuelo Guerrero y Nieta Suprema (`.../abuelo-guerrero-y-nieta-suprema`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | El pincel divino de Hwarim (`.../el-pincel-divino-de-hwarim`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 16 | Caballero en Eterna Regresión (`.../caballero-en-eterna-regresion`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 16 | Abuelo Guerrero y Nieta Suprema (`.../abuelo-guerrero-y-nieta-suprema`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | El Rey Supremo de Sichuan (`.../el-rey-supremo-de-sichuan`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Abuelo Guerrero y Nieta Suprema (`.../abuelo-guerrero-y-nieta-suprema`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Abuelo Guerrero y Nieta Suprema (`.../abuelo-guerrero-y-nieta-suprema`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 107 | capitulo 1 (`https://scan-inmortal.com/.../capitulo-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 47 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Abuelo Guerrero y Nieta Suprema, URL=`.../abuelo-guerrero-y-nieta-suprema` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://scan-inmortal.com/.../Abuelo-guerrero-y-nieta-suprema.webp` (image/webp (container: extended), 35550 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../abuelo-guerrero-y-nieta-suprema` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Artes marciales, Aventura, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Justo cuando Liu Jinshan pensaba que podía morir sin remordimientos, ¡su familia fue aniquilada! Como resultado, se empeñó en vivir sólo para poder ver a su única nieta superviviente, Liu Seol, llegar a la edad adulta. Mientras luchaba por criarla y entrenarla con su cuerpo envejecido, Liu Seol, que había nacido con el talento de una artista marcial suprema, creció mucho más rápido de lo que él pensaba. «¡No te preocupes, abuelo, yo te protegeré a partir de ahora!».<br><br>Nombres Alternativos: Warrior Grandpa and Supreme Granddaughter |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 107 chapters |  |  |  |
| chapter dates | PASS | 107 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 107 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://wp.scaninmortal.store/.../1.jpg` (image/jpeg, 96208 bytes, 512x512) |  |  |  |
