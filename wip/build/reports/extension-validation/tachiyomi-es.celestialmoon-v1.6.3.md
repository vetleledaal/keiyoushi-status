# Extension Validation Report

- Extension: tachiyomi-es.celestialmoon-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 7771256386177960897
- Source name: Celestial Moon
- Source language: es
- Selected manga input: popular offset 0: Amor de Prisión (`.../amor-de-prision`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Amor de Prisión (`.../amor-de-prision`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | El Tirano Posesivo y su Gata Dormilona (`.../el-tirano-posesivo-y-su-gata-dormilona`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Solo Nuestro (`.../solo-nuestro`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Después de renunciar, no quiero que los protagonistas se obsesionen conmigo (`.../despues-de-renunciar-no-quiero-que-los-protagonistas-se-obsesionen-conmigo`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Amor de Prisión (`.../amor-de-prision`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Amor de Prisión (`.../amor-de-prision`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 100 | Chapter 01 (`.../amor-de-prision-capitulo-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Amor de Prisión, URL=`.../amor-de-prision` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://celestialmoonscan.es/.../0.222-1.jpg` (image/jpeg, 286252 bytes, 960x1392) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../amor-de-prision` |  |  |  |
| details thumbnail URL | PASS | `https://celestialmoonscan.es/.../0.222-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adulto, Drama, Fantasía, Romance, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Nunca he hecho nada malo, he vivido una buena vida, pero de repente me acusan de un asesinato. Todas las pruebas le señalan como sospechosa, Shushu acaba en la prisión “de mujeres” de Ugwell. “Creeme. Encontraré al verdadero asesino y limpiaré tu nombre”. Eso es lo que le dice su novio Edwin, pero la vida en la dura prisión, llena de criminales de todo tipo, es demasiado para ella. Necesita un “esposo carcelario” que le haga la vida más fácil. “¿Quieres ser mi esposa carcelaria para protegerte?”, le preguntó. “Ya tengo uno”. “¿Qué? ¡¿Quién?!” “Mi novio” A pesar de ser la misma mujer, Shushu incluso se declara a Minicat, que dirige la prisión, pero lo único que recibe de vuelta son estupideces. “No quiero ser la esposa de alguien a quien ni siquiera le gusto”. Pero eso no duró mucho, ya que Minicat, el recluso que había aceptado la proposición por capricho, le devolvió el beso. “Es una regla”. La voz arañó el techo de mis oídos, provocándome escalofríos. “Cierra los ojos cuando beses”. “…….” “De ese modo te pones muy guapa”. Estaba segura en ese momento de que no importaba a qué hombre besara después, nunca olvidaría haber besado a Minicat. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 100 chapters |  |  |  |
| chapter dates | PASS | 100 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://celestialmoonscan.es/.../01ADP01-Stitched_celestialm.webp` (image/webp (encoding: lossy), 970974 bytes, 960x14480) |  |  |  |
