# Extension Validation Report

- Extension: tachiyomi-es.celestialmoon-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7771256386177960897
- Source name: Celestial Moon
- Source language: es
- Selected manga input: popular offset 0: La verdadera razón por la que tenemos un matrimonio arreglado (`.../wp-27093`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 108 | La verdadera razón por la que tenemos un matrimonio arreglado (`.../wp-27093`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 108 | Bosque de Limoneros (`.../local-2fa04936-7344-4092-868c-5604689ad31d`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La verdadera razón por la que tenemos un matrimonio arreglado (`.../wp-27093`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La verdadera razón por la que tenemos un matrimonio arreglado (`.../wp-27093`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | <1s |

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
| popular listing | PASS | 108 entries |  |  |  |
| latest listing | PASS | 108 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La verdadera razón por la que tenemos un matrimonio arreglado, URL=`wp-27093` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 217/217 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 217/217 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lecturacelestialmoon.site/.../index.php <redacted query values: action and id>` (image/jpeg, 432804 bytes, 960x1392) |  |  |  |
| details identity | PASS | Details preserved selected URL `wp-27093` |  |  |  |
| details thumbnail URL | PASS | `https://lecturacelestialmoon.site/.../index.php <redacted query values: action and id>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Romance, Comedia |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★ 10/10 · 1 valoraciones<br><br>La joven noble Yellowdia, hija del Gran Duque, y el oficial naval Edward, se conocen por primera vez debido a una propuesta de matrimonio arreglado por parte del Emperador.<br>Edward, al notar que Yellowdia es seis años menor que él, decide rechazar amablemente la propuesta imperial.<br>Sin embargo, Yellowdia se enamora de Edward a primera vista y, decidida a conquistarlo, empieza a esforzarse por ganarse su corazón.<br>Pero justo cuando sus caminos comienzan a cruzarse, las maquinaciones de la Emperatriz los hacen alejarse una y otra vez…<br>¿Podrán finalmente casarse sin contratiempos? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | PASS | 50 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lecturacelestialmoon.site/.../index.php <redacted query values: action and id>` (image/webp (encoding: lossy), 1421320 bytes, 960x14275) |  |  |  |
