# Extension Validation Report

- Extension: tachiyomi-es.uchuujinprojects-v1.4.34
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
- Source ID: 3953107753690791431
- Source name: Uchuujin Projects
- Source language: es
- Selected manga input: popular offset 0: La Elegante Flor Florece con Dignidad (`.../fragante`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | La Elegante Flor Florece con Dignidad (`.../fragante`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Un Viaje a través de otro mundo guiado por la Luna (`.../un-viaje-a-traves-de-otro-mundo-guiado-por-la-luna`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | El Noble más Fuerte y Malvado del Mundo se Esfuerza Humilde y Diligentemente (`.../el-noble-mas-fuerte-y-malvado-del-mundo-se-esfuerza-humilde-y-diligentemente`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Bienvenido a casa, Papi (`.../bienvenido-a-casa`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | La Elegante Flor Florece con Dignidad (`.../fragante`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | La Elegante Flor Florece con Dignidad (`.../fragante`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 221 | Capítulo 1 - Rintaro y Kaoruko (`.../kaoru-hana-wa-rin-to-saku-capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 53 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La Elegante Flor Florece con Dignidad, URL=`.../fragante` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://uchuujinmangas.com/.../Vol-14-P.png` (image/png, 6368706 bytes, 2222x3323) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fragante` |  |  |  |
| details thumbnail URL | PASS | `https://uchuujinmangas.com/.../Vol-14-P.png` |  |  |  |
| details author | PASS | MIKAMI Saka |  |  |  |
| details artist | PASS | MIKAMI Saka |  |  |  |
| details genres | PASS | Comedia, Drama, Recuentos de la vida, Romance, Shounen, Vida escolar |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | En cierto lugar, hay dos escuelas secundarias vecinas. Escuela Chidori una escuela de niños de bajo nivel donde se reúnen los idiotas, y escuela Kikyo Girls’ , una escuela de niñas bien establecida. Rintaro Tsumugi, un estudiante de segundo año fuerte y tranquilo en la escuela secundaria Chidori, conoce a Kaoruko Waguri, una chica que llega como cliente mientras ayuda en la pastelería de su familia. Rintaro se siente cómodo pasando tiempo con Kaoruko, pero ella es estudiante en Kikyo Girls, una escuela vecina a la que no le gusta Chidori High. Esta es la historia de dos personas tan cercanas y a la vez tan distantes.<br><br>Nombres alternativos: Kaoru |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 221 chapters |  |  |  |
| chapter dates | PASS | 221 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://uchuujinmangas.com/.../1.webp` (image/webp (encoding: lossy), 109974 bytes, 960x1378) |  |  |  |
