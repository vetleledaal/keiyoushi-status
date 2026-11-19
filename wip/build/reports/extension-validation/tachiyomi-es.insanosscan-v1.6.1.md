# Extension Validation Report

- Extension: tachiyomi-es.insanosscan-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 18
- Lint: 1
- Warnings: 1
- Skipped: 16
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4982291187322723927
- Source name: InsanosScan
- Source language: es
- Selected manga input: popular offset 0: Contra los Dioses (`.../43`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Contra los Dioses (`.../43`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Contra los Dioses (`.../43`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Contra los Dioses (`.../43`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Contra los Dioses, URL=`43` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://insanoslibrary.com/.../cover` (image/webp (encoding: lossy), 400976 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `43` |  |  |  |
| details thumbnail URL | PASS | `https://insanoslibrary.com/.../cover` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | manhua, Acción,  Artes marciales,  Fantasía,  Reencarnación |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Acorralado por quienes desean arrebatarle un tesoro único, un joven se lanza desde un acantilado antes que entregarlo. Sin embargo, la caída no pone fin a su historia: despierta en otro mundo, dentro del cuerpo de un muchacho que comparte su nombre. Y el tesoro ha viajado con él.<br><br>Esta segunda vida lo arrastra a un mundo de artes marciales, secretos y rivalidades donde el poder decide el destino de las personas. Con los recuerdos de su pasado y una oportunidad que no piensa desperdiciar, deberá abrirse camino frente a enemigos capaces de convertir su nueva existencia en otra persecución. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: genre |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://insanoslibrary.com/.../series` to `https://insanoslibrary.com/.../series` (1 redirects); popular: `https://insanoslibrary.com/.../series` to `https://insanoslibrary.com/.../series` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
