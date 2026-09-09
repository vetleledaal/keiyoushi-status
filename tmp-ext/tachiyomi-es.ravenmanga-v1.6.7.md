# Extension Validation Report

- Extension: tachiyomi-es.ravenmanga-v1.6.7
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 698913079501532785
- Source name: RavenManga
- Source language: es
- Selected manga input: popular offset 0: Consegui una esposa en el otro mundo (`.../consegui-una-esposa-en-el-otro-mundo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | Consegui una esposa en el otro mundo (`.../consegui-una-esposa-en-el-otro-mundo`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Mi primavera (`.../mi-primavera`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Consegui una esposa en el otro mundo (`.../consegui-una-esposa-en-el-otro-mundo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Consegui una esposa en el otro mundo (`.../consegui-una-esposa-en-el-otro-mundo`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 26 | Capítulo 1 (`.../01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Consegui una esposa en el otro mundo, URL=`.../consegui-una-esposa-en-el-otro-mundo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 34/34 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 34/34 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.imgur.com/.../Zo2GBZN.png` (image/png, 2127568 bytes, 1040x1512) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../consegui-una-esposa-en-el-otro-mundo` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../Zo2GBZN.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aventura, Familia, Fantasia, Zukulencia / Detonacion, Magia, Reencarnación, Recuentos de la vida |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | En Nochebuena, un hombre cansado de su vida solitaria le pide un deseo especial a un misterioso Papá Noel: “Quiero tener una esposa tan dulce como un conejo y una hija tan linda como una mangosta”. Al regresar a casa, abre los ojos y descubre que ha sido transportado a un mundo de fantasía completamente diferente. Ahora, en este nuevo universo lleno de sorpresas, criaturas peculiares y oportunidades inesperadas, deberá adaptarse a su nueva realidad mientras intenta hacer realidad el deseo que tanto anhelaba. ¿Podrá formar la familia dulce y adorable con la que siempre soñó? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 26 chapters |  |  |  |
| chapter dates | PASS | 26 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://wsrv.nl <redacted query values: url>` (image/jpeg, 501050 bytes, 690x8000) |  |  |  |
