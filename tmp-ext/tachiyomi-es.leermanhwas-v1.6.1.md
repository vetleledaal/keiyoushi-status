# Extension Validation Report

- Extension: tachiyomi-es.leermanhwas-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8701445043633550960
- Source name: LeerManhwas
- Source language: es
- Selected manga input: popular offset 0: La red cerebral es una vía de sentido único (`.../la-red-cerebral-es-una-via-de-sentido-unico`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | La red cerebral es una vía de sentido único (`.../la-red-cerebral-es-una-via-de-sentido-unico`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Onegai, Nugashite (`.../onegai-nugashite`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | La red cerebral es una vía de sentido único (`.../la-red-cerebral-es-una-via-de-sentido-unico`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Onegai, Nugashite (`.../onegai-nugashite`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La red cerebral es una vía de sentido único (`.../la-red-cerebral-es-una-via-de-sentido-unico`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La red cerebral es una vía de sentido único (`.../la-red-cerebral-es-una-via-de-sentido-unico`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 16 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La red cerebral es una vía de sentido único, URL=`.../la-red-cerebral-es-una-via-de-sentido-unico` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://leermanhwas.com/.../la-red-cerebral-es-una-via-de-sentido-unico-thumbnail.jpg` (image/webp (encoding: lossy), 24844 bytes, 241x350; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../la-red-cerebral-es-una-via-de-sentido-unico` |  |  |  |
| details thumbnail URL | PASS | `https://leermanhwas.com/.../la-red-cerebral-es-una-via-de-sentido-unico-thumbnail.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adulto, Comedia, Josei, Romance, Smut, Sobrenatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Leer Manhwa One-Way Brainwork/ A One-Way Mind Link/ The Network Is One-Way/ 뇌트워크는 일방통행 --------------------- Todo marchaba con normalidad hasta que Baek Eunsu obtuvo una extraña habilidad: leer los recuerdos de las personas mediante el contacto. Como líder de un equipo de I+D, siempre ha sido un hombre reservado y obsesionado con la perfección. En cambio, Han Yui, la nueva empleada, es sincera, impulsiva y no teme decir lo que piensa. La convivencia diaria entre ambos estará llena de choques, situaciones divertidas y una atracción que crecerá sin que se den cuenta. Sin embargo, cuando los secretos del corazón comiencen a revelarse, deberán decidir si pueden confiar el uno en el otro. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 16 chapters |  |  |  |
| chapter dates | LINT | All 16 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=16 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn01.leermanhwas.com/.../1-d58.jpg` (image/webp (encoding: lossy), 991292 bytes, 900x10000; server Content-Type: image/jpeg) |  |  |  |
