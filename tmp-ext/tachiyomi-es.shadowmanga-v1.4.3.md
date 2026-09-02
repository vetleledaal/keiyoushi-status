# Extension Validation Report

- Extension: tachiyomi-es.shadowmanga-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5649269152264667286
- Source name: Shadow Manga
- Source language: es
- Selected manga input: popular offset 0: Shujinkou-sama No Imouto Ni Aisareteiru Kedo, Shikkari Yandere (`.../103339`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 278 | Shujinkou-sama No Imouto Ni Aisareteiru Kedo, Shikkari Yandere (`.../103339`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 299 | Konjiki No Word Master Yuusha Yonin Ni Makikomareta Unique Cheat (`.../24519`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 6 | Juunenme Kikan O Akirameta Tenisha Wa Imasara Shujinkou Ni Naru (`.../22350`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Shujinkou-sama No Imouto Ni Aisareteiru Kedo, Shikkari Yandere (`.../103339`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Cap. 1 - Prólogo (`.../1390705`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| popular listing | PASS | 278 entries |  |  |  |
| latest listing | PASS | 299 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 3: title=Shujinkou-sama No Imouto Ni Aisareteiru Kedo, Shikkari Yandere, URL=`103339` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 583/583 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 583/583 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.shademanga.com/.../portada-1788325226984.webp <redacted query values: v>` (image/webp (encoding: lossy), 89564 bytes, 600x849) |  |  |  |
| details identity | PASS | Details preserved selected URL `103339` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.shademanga.com/.../portada-1788325226984.webp <redacted query values: v>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Romance, Vida escolar, Psicológico, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Usui Shinji, un estudiante de secundaria, tiene un apuesto amigo de la infancia, Ichinose Hinata, tan popular entre las chicas como el protagonista de una historia. Estar al lado de Hinata, cuyo encanto atrae a todos como el sol, siempre hace que Shinji se sienta inferior, y sin darse cuenta, ha empezado a sentir cierta aversión hacia él. Mientras tanto, por alguna razón, Ichinose Runa, la hermana menor de Hinata, está muy apegada a Shinji como si fuera su verdadero hermano mayor. Mientras Shinji vive sus días agobiado por estos sentimientos complejos, la historia comienza cuando recibe una sospechosa carta de amor. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.shademanga.com/.../0001.webp <redacted query values: v>` (image/webp (container: extended), 210526 bytes, 1054x1492) |  |  |  |
