# Extension Validation Report

- Extension: tachiyomi-es.asialotus-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3655128076360662290
- Source name: Asia Lotus
- Source language: es
- Selected manga input: popular offset 0: Lluvia de Verano (`.../lluvia-de-verano`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Lluvia de Verano (`.../lluvia-de-verano`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | La reseña de hoy (`.../la-resena-de-hoy`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | El cazador quiere vivir tranquilamente Novela (`.../el-cazador-quiere-vivir-tranquilamente-novela`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Fantasma del anexo (`.../fantasma-del-anexo`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Lluvia de Verano (`.../lluvia-de-verano`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Lluvia de Verano (`.../lluvia-de-verano`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 127 | Chapter 1 (`.../182`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lluvia de Verano, URL=`.../lluvia-de-verano` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://asialotuss.com/.../newport-225x300.jpg` (image/jpeg, 19498 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lluvia-de-verano` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://asialotuss.com/.../newport.jpg` (image/jpeg, 739759 bytes, 1080x1440) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Bl+18, Comedia, Drama, Romance, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | En el camino de regreso después de confesarme a un mayor que me gusta. Han Seo-woo muere en un accidente inesperado. Poco después, debido a la muerte del ángel de la muerte, se convierte en un muerto temporal, ¡y finalmente es monitoreado por el ángel de la muerte…! ¡Una cohabitación con un hombre extramatrimonial (?) que ni siquiera estuvo a la mitad del día está por comenzar! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 127 chapters |  |  |  |
| chapter dates | LINT | 126 of 127 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=126 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imagizer.imageshack.com/.../tolIBh.jpg` (image/webp (container: extended), 104342 bytes, 1080x3305) |  |  |  |
