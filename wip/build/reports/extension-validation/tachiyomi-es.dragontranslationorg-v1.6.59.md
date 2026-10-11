# Extension Validation Report

- Extension: tachiyomi-es.dragontranslationorg-v1.6.59
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4647982373411241498
- Source name: DragonTranslation.org
- Source language: es
- Selected manga input: popular offset 0: Deja de fumar (`.../deja-de-fumar`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Deja de fumar (`.../deja-de-fumar`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Relación inversa (`.../relacion-inversa`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Deja de Fumar – Uncensored (`.../deja-de-fumar-uncensored`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Deja de fumar (`.../deja-de-fumar`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 144 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Deja de fumar, URL=`.../deja-de-fumar` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 has no manga to check |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 54/54 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 54/54 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dragontranslation.org/.../fff-857x1024.jpg` (image/jpeg, 143181 bytes, 857x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../deja-de-fumar` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://dragontranslation.org/.../fff-e1788405188657.jpg` (image/jpeg, 46830 bytes, 400x478) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | +18, Comedia, Drama, Ecchi, Harén, Primer amor, Recuentos de la vida, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Condenado desde su nacimiento a una estatura que lo encadenaba y un rostro que se negaba a madurar, él había soportado una vida de susurros y desprecio. Pero el verdadero infierno comenzó cuando el aliento viciado del cigarro ajeno invadió la intimidad de su hogar, sofocando no solo el aire, sino también su última chispa de dignidad. Impulsado por una desesperación que superaba años de sumisión, alzó la mirada hacia el origen de su tormento. No era un simple vecino, sino una presencia. Una mujer. Alta, enigmática, con una mirada que prometía tanto el abismo como la redención. Su aura, tan intimidante como el humo que la precedía, lo atrajo y lo repelió a la vez. ¿Sería ella la llama que lo consumiría o el viento que por fin lo liberaría? El destino de dos almas opuestas se entrelaza en una danza de fuego y ceniza. ¿Podrá este encuentro inesperado reescribir sus destinos? Sumérgete en el primer capítulo y descubre el inicio de una pasión inquebrantable. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 144 chapters |  |  |  |
| chapter dates | LINT | 18 of 144 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=18 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dragontranslation.org/.../001.jpg` (image/jpeg, 554363 bytes, 1100x8000) |  |  |  |
