# Extension Validation Report

- Extension: tachiyomi-es.templescanesp-v1.4.64
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3451196845457607826
- Source name: Temple Scan
- Source language: es
- Selected manga input: latest offset 0: Diario de Hospedaje (`.../diario-de-hospedaje`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | ¡Deja De Fumar! (`.../deja-de-fumar`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Ordenanza Especial Del Pueblo (`.../ordenanza-especial-del-pueblo`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Diario de Hospedaje (`.../diario-de-hospedaje`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Villa Paraíso (`.../villa-paraiso`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Diario de Hospedaje (`.../diario-de-hospedaje`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Diario de Hospedaje (`.../diario-de-hospedaje`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 10 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Diario de Hospedaje, URL=`.../diario-de-hospedaje` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://aedexnox.akan01.com/.../00Portada.webp` (image/webp (container: extended), 113660 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../diario-de-hospedaje` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | HETERO, Comedia, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Jun-woo Kim, un universitario de primer año, se muda a la casa de un amigo cerca de la universidad. Allí vive bajo el cuidado de Mi-kyung Cho, la dueña de la casa. Todo parece tranquilo… hasta que un día, por accidente, la ve en su habitación viendo un video secreto.<br><br>—Señora… lo que acabo de ver… ¿No es lo que parece, verdad? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://aedexnox.akan01.com/.../00DiarioDeHospedaje-copia.webp` (image/webp (container: extended), 841836 bytes, 1721x1117) |  |  |  |
