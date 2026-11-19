# Extension Validation Report

- Extension: tachiyomi-es.jeazscans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8103409233756077332
- Source name: Jeaz Scans
- Source language: es
- Selected manga input: latest offset 0: ¡Yo el Señor Demonio estoy siendo el objetivo de mis discípulas! (`.../-yo-el-se-or-demonio-estoy-siendo-el-objetivo-de-mis-disc-pulas-`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 0 |  |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | ¡Yo el Señor Demonio estoy siendo el objetivo de mis discípulas! (`.../-yo-el-se-or-demonio-estoy-siendo-el-objetivo-de-mis-disc-pulas-`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ¡Yo el Señor Demonio estoy siendo el objetivo de mis discípulas! (`.../manga.php <redacted query values: id>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ¡Yo el Señor Demonio estoy siendo el objetivo de mis discípulas! (`.../-yo-el-se-or-demonio-estoy-siendo-el-objetivo-de-mis-disc-pulas-`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 150 | Capítulo 1 (`.../capitulo-1.00`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 35 |  |  | 1-10s |

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
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=¡Yo el Señor Demonio estoy siendo el objetivo de mis discípulas!, URL=`.../manga.php <redacted query values: id>` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 13/13 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 13/13 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://lectorhub.j5z.xyz/.../005395ee7c4cb955f3f3bdcc2f2f1500.webp` -> 2 manga URLs (examples: `.../-yo-el-se-or-demonio-estoy-siendo-el-objetivo-de-mis-disc-pulas-`, `.../manga.php <redacted query values: id>`) |  |  |  |
| thumbnail | PASS | `https://lectorhub.j5z.xyz/.../005395ee7c4cb955f3f3bdcc2f2f1500.webp` (image/webp (encoding: lossy), 99926 bytes, 600x784) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../-yo-el-se-or-demonio-estoy-siendo-el-objetivo-de-mis-disc-pulas-` |  |  |  |
| details thumbnail URL | PASS | `https://lectorhub.j5z.xyz/.../005395ee7c4cb955f3f3bdcc2f2f1500.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Aventura, Cultivo, Sistemas, Artes marciales, Harem, Manhua, Reencarnación |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ¡Yo el Señor Demonio estoy siendo el objetivo de mis discípulas! Bai Feng viaja a través de un juego de amor de estilo nacional y se convierte en el gigante de la magia, Bai Qingling. En el juego, Bai Qingling es astuto y frío, practicando la brujería y manipulando a las personas sin escrúpulos en busca de la inmortalidad. Lo más despreciable es que considera a las tres hermosas discípulas que ha adoptado como simples peones, siendo el principal villano en las rutas «amor puro» y «corrupción malévola» del juego. ¿Cómo se las arreglará Bai Feng en esta situación extrema, utilizando el sistema de «Gran Amor» para cambiar las tornas? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 150 chapters |  |  |  |
| chapter dates | PASS | 150 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lectorhub.j5z.xyz/.../imagen-capitulo <redacted query values: t and v>` (image/png, 3710954 bytes, 900x4540) |  |  |  |
