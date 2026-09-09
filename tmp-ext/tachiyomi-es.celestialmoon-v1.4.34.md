# Extension Validation Report

- Extension: tachiyomi-es.celestialmoon-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 7771256386177960897
- Source name: Celestial Moon
- Source language: es
- Selected manga input: latest offset 0: Te pido un Arrepentimiento Glorioso (`.../te-pido-un-arrepentimiento-glorioso`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Amor de Prisión (`.../amor-de-prision`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | El Tirano Posesivo y su Gata Dormilona (`.../el-tirano-posesivo-y-su-gata-dormilona`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Te pido un Arrepentimiento Glorioso (`.../te-pido-un-arrepentimiento-glorioso`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Murmullos de Verano (`.../murmullos-de-verano`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Te pido un Arrepentimiento Glorioso (`.../te-pido-un-arrepentimiento-glorioso`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Te pido un Arrepentimiento Glorioso (`.../te-pido-un-arrepentimiento-glorioso`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 15 | Chapter 01 (`.../te-pido-un-arrepentimiento-glorioso-capitulo-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Te pido un Arrepentimiento Glorioso, URL=`.../te-pido-un-arrepentimiento-glorioso` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://celestialmoonscan.es/.../xxlarge-2.webp` (image/webp (encoding: lossy), 175062 bytes, 960x1392) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../te-pido-un-arrepentimiento-glorioso` |  |  |  |
| details thumbnail URL | PASS | `https://celestialmoonscan.es/.../xxlarge-2.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adulto, Drama, Fantasía, Historico, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cada noche, Arte tiene el mismo sueño. Un sueño que se ha repetido durante años, siempre con el mismo hombre como protagonista. Hace cinco años, Arte perdió la memoria y cayó en un profundo sueño tras sufrir un accidente de carruaje. Para salvarla, la familia Tian lo sacrificó todo, acumulando una enorme deuda que los dejó al borde de la ruina. Desesperados por recuperar su fortuna, organizan un banquete con la intención de encontrar una solución para su territorio. Sin embargo, cuando todo parece estar perdido, Arte se encuentra frente a frente con el hombre que lleva años apareciendo en sus sueños: **Dimion Rocata**. Entre ambos existe una extraña sensación de familiaridad, como si sus destinos ya se hubieran cruzado. Y entonces, Dimion le hace una inesperada propuesta. Un contrato que podría cambiarlo todo. Arte sabe que quizá esté a punto de cometer otro error, pero también sabe que ya no tiene ningún lugar al que retroceder. Mientras los secretos del pasado comienzan a salir a la luz, Arte tendrá que descubrir qué ocurrió realmente antes de perder la memoria… y cuál es el verdadero vínculo que la une al hombre de sus sueños. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://celestialmoonscan.es/.../01CMglorioso01.webp` (image/webp (encoding: lossy), 381602 bytes, 720x7610) |  |  |  |
