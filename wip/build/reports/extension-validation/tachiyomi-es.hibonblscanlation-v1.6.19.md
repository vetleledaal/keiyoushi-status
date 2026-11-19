# Extension Validation Report

- Extension: tachiyomi-es.hibonblscanlation-v1.6.19
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 21
- Lint: 1
- Warnings: 0
- Skipped: 14
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 6836697941845374072
- Source name: Hibon BL Scanlation
- Source language: es
- Selected manga input: popular offset 0: Oazuke wa, Warui Yoru no Aizu (`.../oazuke-wa-warui-yoru-no-aizu.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Oazuke wa, Warui Yoru no Aizu (`.../oazuke-wa-warui-yoru-no-aizu.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Muchuu no hito (`.../muchuu-no-hito.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Oazuke wa, Warui Yoru no Aizu (`.../oazuke-wa-warui-yoru-no-aizu.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Oazuke wa, Warui Yoru no Aizu (`.../oazuke-wa-warui-yoru-no-aizu.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Oazuke wa, Warui Yoru no Aizu, URL=`.../oazuke-wa-warui-yoru-no-aizu.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.chil-chil.net/.../00156240_XL.jpg` (image/jpeg, 106428 bytes, 300x423) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../oazuke-wa-warui-yoru-no-aizu.html` |  |  |  |
| details thumbnail URL | PASS | `https://img.chil-chil.net/.../00156240_XL.jpg` |  |  |  |
| details author | PASS | Kuroshiro |  |  |  |
| details artist | PASS | Kuroshiro |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ¿¡La señal de un gran romance está en otro mundo!?<br>Makoto, un estudiante universitario, ha entrado con su novio Ryohei en una fase de rutina y desgaste. Las ocasiones en que Ryohei lo toca o muestra afecto han disminuido, y él se ahoga en una creciente soledad.<br>Con la esperanza de romper ese estancamiento, Makoto intenta que Yuki, un amigo y senpai de Ryohei, actúe como mediador entre ellos…<br>Pero en su lugar, Yuki le susurra a su cuerpo frustrado: «Si te hacen esperar, ven a mí».<br>No hay escapatoria posible a ese amor intenso y prohibido que ahora se revela…<br><br>**Estreno:** 2024<br><br>**Alternative Names:**<br>- おあずけは、悪い夜の合図<br>- Hazlo esperar<br>- y será una noche ardiente<br>- When holding out leads to a night of temptations |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
