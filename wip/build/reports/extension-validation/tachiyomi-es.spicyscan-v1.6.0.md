# Extension Validation Report

- Extension: tachiyomi-es.spicyscan-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2665002677795338092
- Source name: Spicy Scan
- Source language: es
- Selected manga input: popular offset 0: Dome al perro corrompido del palacio imperial (`.../dome-al-perro-corrompido-del-palacio`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Dome al perro corrompido del palacio imperial (`.../dome-al-perro-corrompido-del-palacio`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | El duque quiere tener un heredero  (`.../el-duque-quiere-tener-un-heredero`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Hombre con fantasma (`.../hombre-con-fantasma`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Soy una madre enfermiza, ¡pero criaré a mi hijo malvado! (`.../madrastra-enfermiza`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Dome al perro corrompido del palacio imperial (`.../dome-al-perro-corrompido-del-palacio`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dome al perro corrompido del palacio imperial (`.../dome-al-perro-corrompido-del-palacio`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 124 | Capítulo 1.1 (`.../capitulo-11`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dome al perro corrompido del palacio imperial, URL=`dome-al-perro-corrompido-del-palacio` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.spicyseries.com/.../07093b84-9487-4b9f-ad9d-cf580f6e41cf.jpg` (image/jpeg, 188502 bytes, 720x946) |  |  |  |
| details identity | PASS | Details preserved selected URL `dome-al-perro-corrompido-del-palacio` |  |  |  |
| details thumbnail URL | PASS | `https://media.spicyseries.com/.../07093b84-9487-4b9f-ad9d-cf580f6e41cf.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Smut, Romance, Fantasia, Historia, Adulto |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | La familia Devon tiene una montaña de deudas y está al borde de la bancarrota. No es culpa suya, por supuesto, pero Courtney Devon siempre ha sido la villana de la familia. Sin embargo, la familia está en una situación desesperada y tienen que hacer algo, lo que sea, para conseguir algo de dinero y salir de esta situación. Pero un día llegan noticias del Palacio Imperial de que Su Alteza Real el príncipe heredero ha decidido nombrar princesa heredera a Courtney. Aparentemente un príncipe típico por fuera, Su Alteza Real es en realidad todo un alborotador con un lado oscuro. ¿Resolverá este acuerdo los problemas de Courtney Devon o sólo complicará aún más las cosas? ¿Florecerá un amor contra todo pronóstico o alguien acabará en la caseta del perro...? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 124 chapters |  |  |  |
| chapter dates | PASS | 124 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.spicyseries.com/.../0.jpg` (image/jpeg, 1823029 bytes, 1280x5506) |  |  |  |
