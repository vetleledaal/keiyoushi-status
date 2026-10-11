# Extension Validation Report

- Extension: tachiyomi-es.heavenmanga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1872740333369520717
- Source name: HeavenManga
- Source language: es
- Selected manga input: popular offset 0: ¡¡Acero, Sangre, Murim!! (`.../acero-sangre-murim`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 200 | ¡¡Acero, Sangre, Murim!! (`.../acero-sangre-murim`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 200 | ¿!Por qué yo!? ~Harem de sexo con mis acosadoras~ (`.../por-qu-yo-harem-de-sexo-con-mis-acosadoras`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Juego para matrimonio (`.../juego-para-matrimonio`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 39 | Desorden y deseo (`.../desorden-y-deseo`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | ¡¡Acero, Sangre, Murim!! (`.../acero-sangre-murim`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ¡¡Acero, Sangre, Murim!! (`.../acero-sangre-murim`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 33 | Capítulo: 12-es (`.../12-es`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| popular listing | PASS | 200 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=¡¡Acero, Sangre, Murim!!, URL=`.../acero-sangre-murim` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=El príncipe con el que me Comprometí era un Asesino, URL=`.../el-principe-con-el-que-me-comprometi-era-un-asesino` at page 1 offset 16 and page 2 offset 15 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 477/477 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 477/477 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://heavenmanga.com/.../cover_250x350.webp` (image/jpeg, 23738 bytes, 250x350; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../acero-sangre-murim` |  |  |  |
| details thumbnail URL | PASS | `https://heavenmanga.com/.../cover_250x350.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Accion, Artes Marciales, Comedia, Aventura |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Del mismo creador y artista de the god of high school El "Demonio Celestial" que nace una vez cada diez mil años. Dos genios nacidos en la misma era. ¿Quién de ellos es el verdadero Demonio Celestial? Y estos dos... ¿serán aliados o enemigos? ¡El verdadero origen del Murim tradicional! ¡¡acero, sangre, murim!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 33 chapters |  |  |  |
| chapter dates | PASS | 33 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0001.jpg` (image/jpeg, 299564 bytes, 720x1305) |  |  |  |
