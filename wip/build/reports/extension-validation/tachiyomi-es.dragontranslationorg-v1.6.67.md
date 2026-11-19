# Extension Validation Report

- Extension: tachiyomi-es.dragontranslationorg-v1.6.67
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

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
| popular_next | `getPopularManga(2)` | success | 25 | Las chicas más sexys del campus (`.../las-chicas-mas-sexys-del-campus`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Moby Dick (`.../moby-dick`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Mairimashita! Iruma-kun (`.../mairimashita-iruma-kun`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Deja de Fumar – Uncensored (`.../deja-de-fumar-uncensored`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Deja de fumar (`.../deja-de-fumar`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 150 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Deja de fumar, URL=`.../deja-de-fumar` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 78/78 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 78/78 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dragontranslation.org/.../fff-857x1024.jpg` (image/jpeg, 143181 bytes, 857x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../deja-de-fumar` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://dragontranslation.org/.../fff-e1788405188657.jpg` (image/jpeg, 46830 bytes, 400x478) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | +18, Comedia, Drama, Ecchi, Harén, Primer amor, Recuentos de la vida, Romance, manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Condenado desde su nacimiento a una estatura que lo encadenaba y un rostro que se negaba a madurar, él había soportado una vida de susurros y desprecio. Pero el verdadero infierno comenzó cuando el aliento viciado del cigarro ajeno invadió la intimidad de su hogar, sofocando no solo el aire, sino también su última chispa de dignidad. Impulsado por una desesperación que superaba años de sumisión, alzó la mirada hacia el origen de su tormento. No era un simple vecino, sino una presencia. Una mujer. Alta, enigmática, con una mirada que prometía tanto el abismo como la redención. Su aura, tan intimidante como el humo que la precedía, lo atrajo y lo repelió a la vez. ¿Sería ella la llama que lo consumiría o el viento que por fin lo liberaría? El destino de dos almas opuestas se entrelaza en una danza de fuego y ceniza. ¿Podrá este encuentro inesperado reescribir sus destinos? Sumérgete en el primer capítulo y descubre el inicio de una pasión inquebrantable. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 150 chapters |  |  |  |
| chapter dates | PASS | 150 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dragontranslation.org/.../001.jpg` (image/jpeg, 554363 bytes, 1100x8000) |  |  |  |
