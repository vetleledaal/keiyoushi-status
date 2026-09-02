# Extension Validation Report

- Extension: tachiyomi-es.inventariooculto-v1.6.54
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 609477585841458199
- Source name: Inventario Oculto
- Source language: es
- Selected manga input: popular offset 0: Jujutsu Kaisen Módulo (`.../2796`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Jujutsu Kaisen Módulo (`.../2796`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 5 | Jujutsu Kaisen 0 (`.../2868`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Madan no Ichi (`.../2530`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 5 | Trigun Maximum (`.../2609`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Jujutsu Kaisen Módulo (`.../2796`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jujutsu Kaisen Módulo (`.../2796`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 29 | Capítulo 1 - Incidente de Grado Especial (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | 1-10s |

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
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jujutsu Kaisen Módulo, URL=`2796` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://inventariooculto.com/.../JUJUTSU-KAISEN-MODULO_PORTADA-1-1-350x476.png` (image/png, 103362 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2796` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://inventariooculto.com/.../JUJUTSU-KAISEN-MODULO_PORTADA-1-1.png` (image/png, 96135 bytes, 352x528) |  |  |  |
| details author | PASS | Gege Akutami |  |  |  |
| details artist | PASS | Yuji Iwasaki |  |  |  |
| details genres | PASS | Adventure, Fantasy, Shounen, Supernatural, gege, jjk2 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Spin-off de Jujutsu Kaisen.<br><br>Han pasado 68 años desde el Juego de Sacrificio. En el año 2086, una raza alienígena conocida como los Simurianos llega a la Tierra en una nave espacial. El destino del mundo recae en las manos de dos hechiceros: Okkotsu Yuka y Tsurugi. Hechiceros y extraterrestres, ¿qué caos nacerá de este encuentro?<br><br>Nombres Alternativos: JJK Modulo |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 29 chapters |  |  |  |
| chapter dates | LINT | 6 of 29 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://inventariooculto.com/.../0a.png` (image/png, 174258 bytes, 945x614) |  |  |  |
