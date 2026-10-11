# Extension Validation Report

- Extension: tachiyomi-es.mantrazscan-v1.6.58
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7172992930543738693
- Source name: Mantraz Scan
- Source language: es
- Selected manga input: popular offset 0: ¡Esta bien, Es sola una broma! (`.../esta-bien-es-sola-una-broma`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | ¡Esta bien, Es sola una broma! (`.../esta-bien-es-sola-una-broma`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Amor Obsesivo (`.../amor-obsesivo`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ¡Esta bien, Es sola una broma! (`.../esta-bien-es-sola-una-broma`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ¡Esta bien, Es sola una broma! (`.../esta-bien-es-sola-una-broma`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 77 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=¡Esta bien, Es sola una broma!, URL=`.../esta-bien-es-sola-una-broma` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mantrazscanss.lat/.../GC0RCY-4471.jpg` (image/jpeg, 34619 bytes, 319x449) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../esta-bien-es-sola-una-broma` |  |  |  |
| details thumbnail URL | PASS | `https://mantrazscanss.lat/.../GC0RCY-4471.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedia, Drama, Ecchi, Harem, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Sena, una estrella fugaz cuyo universo se desmoronó bajo el peso de la traición y la mentira. Huyó, buscando refugio en el anonimato de una fábrica remota, donde su identidad era solo un eco de lo que fue, un currículum falso su única armadura contra el mundo. Anhelaba la paz, el olvido, una vida donde el pasado no pudiera alcanzarla. Pero el destino, cruel y caprichoso, tenía otros planes. Allí, entre el eco de la maquinaria y el silencio de su nueva existencia, irrumpió Minsu. Con unos ojos tan claros como el hielo y una mirada que parecía leer el alma, él no solo vio a Sena, sino que desnudó su pasado, las verdades ocultas que ella tanto anhelaba enterrar. ¿Es este hombre su verdugo, el que desvelará sus secretos más íntimos, o el catalizador de un destino entrelazado que desafiará todas sus defensas? Su aparición no es una broma, es el presagio de un torbellino de emociones que amenaza con arrastrarla de nuevo al abismo o, quizás, a un amor tan inesperado como peligroso. Sumérgete en el primer capítulo y descubre el inicio de esta apasionante historia. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 77 chapters |  |  |  |
| chapter dates | PASS | 77 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mantrazscanss.lat/.../1.jpg` (image/jpeg, 304427 bytes, 720x6680) |  |  |  |
