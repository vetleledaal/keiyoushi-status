# Extension Validation Report

- Extension: tachiyomi-es.kazokuden-v1.6.54
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
- Source ID: 475788948976592183
- Source name: Kazoku Den
- Source language: es
- Selected manga input: popular offset 0: Nakama Wo Mamotte Shindara Nijuunen Go No Onaji Sekai Ni Umarekawatta Kudan……demo Ore, Tensei Nikame Nandakedo (`.../163`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Nakama Wo Mamotte Shindara Nijuunen Go No Onaji Sekai Ni Umarekawatta Kudan……demo Ore, Tensei Nikame Nandakedo (`.../163`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Aprovechando que no tengo clientes (`.../504`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | La Princesa de Sangre y el Caballero (`.../576`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | NTR Kaeshi (`.../620`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nakama Wo Mamotte Shindara Nijuunen Go No Onaji Sekai Ni Umarekawatta Kudan……demo Ore, Tensei Nikame Nandakedo (`.../163`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nakama Wo Mamotte Shindara Nijuunen Go No Onaji Sekai Ni Umarekawatta Kudan……demo Ore, Tensei Nikame Nandakedo (`.../163`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | Capítulo 1.00 (`.../capitulo-1-00`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nakama Wo Mamotte Shindara Nijuunen Go No Onaji Sekai Ni Umarekawatta Kudan……demo Ore, Tensei Nikame Nandakedo, URL=`163` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.kazokuden.com/.../portada_manga-2-350x476.jpg` (image/jpeg, 44339 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `163` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.kazokuden.com/.../portada_manga-2.jpg` (image/jpeg, 355556 bytes, 600x900) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | comedia, harem, isekai |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ¡La última obra de Tomoyuki Hino, creador del éxito «The Hidden Dungeon Only I Can Enter», con más de 2 millones de copias en circulación! Comienza una historia de harén y fantasía en la que el protagonista es perseguido por heroínas no humanas♡♡ Tras morir para proteger a mis compañeros del Rey Demonio, reencarné en un bebé indefenso. Mientras me sentía deprimido, quien me dijo «yo te protegeré» fue una hermosa hermana mayor vampiro, de la que se rumorea que es la «próxima reina de la noche». #One-Shota #Apariencia hermosa #El amor de todas las heroínas es intenso |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | LINT | 6 of 8 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.kazokuden.com/.../0.webp` (image/webp (encoding: lossy), 203810 bytes, 3041x1011) |  |  |  |
