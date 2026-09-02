# Extension Validation Report

- Extension: tachiyomi-es.yurionline-v1.6.54
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
- Source ID: 3410370616110029377
- Source name: Yuri-Online
- Source language: es
- Selected manga input: popular offset 0: Ame to Muchi (`.../1044`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Ame to Muchi (`.../1044`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | La forma en que mi enemiga me mira está cambiando lentamente (`.../1851`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Hitozuma to JK (`.../4365`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Wicked Spot (`.../4473`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ame to Muchi (`.../1044`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ame to Muchi (`.../1044`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | Capítulo 1 - Tratamiento y castigo (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ame to Muchi, URL=`1044` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yuri-online.com/.../01-175x238.jpg` (image/jpeg, 19548 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1044` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yuri-online.com/.../01.jpg` (image/jpeg, 369519 bytes, 1300x1830) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | drama, ecchi, romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mary, que hacía papa-katsu, pensaba encontrarse con su “papa” como siempre… ¡¿Pero la que apareció fue una mujer casada?! A diferencia de los hombres con segundas intenciones, esta esposa, “S”, le da grandes sumas de dinero y cosméticos mientras salen juntas como si fueran amigas en citas que parecen amistosas… ¡Y Mary empieza a depender cada vez más de ella! ¡Erotismo prohibido entre mujeres!<br><br>Nombres Alternativos: あめとむち |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | LINT | 19 of 20 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=19 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://yuri-online.com/.../01.jpg` (image/jpeg, 393282 bytes, 1350x1900) |  |  |  |
