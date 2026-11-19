# Extension Validation Report

- Extension: tachiyomi-es.capibaratraductor-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3335229490349802396
- Source name: CapibaraTraductor
- Source language: es
- Selected manga input: popular offset 0: Chainsaw Man (`.../senshimanga`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Chainsaw Man (`.../senshimanga`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | Otaku ni Yasashii Gal wa Inai!? (`.../scanshub`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Kagurabachi (`.../inventariooculto`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Spider-Gwen: Su gran debut | El Manga (`.../achymanga`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Chainsaw Man (`.../senshimanga`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chainsaw Man (`.../senshimanga`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 232 | Capítulo 1 (`.../senshimanga`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalArgumentException: WebView has not loaded content | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalArgumentException: WebView has not loaded content | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chainsaw Man, URL=`chainsaw-man/senshimanga` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://r2.capibaratraductor.com/.../1779657056541_379878.webp` (image/webp (encoding: lossy), 178472 bytes, 816x1280) |  |  |  |
| details identity | PASS | Details preserved selected URL `chainsaw-man/senshimanga` |  |  |  |
| details thumbnail URL | PASS | `https://r2.capibaratraductor.com/.../1779657056541_379878.webp` |  |  |  |
| details author | PASS | Tatsuki Fujimoto |  |  |  |
| details artist | PASS | SenshiManga |  |  |  |
| details genres | PASS | Manga, Shōnen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★ 8.41 (MAL) · Anime<br><br>Cuando su padre murió, Denji se vio obligado a saldar una gran deuda y no había forma de pagarla. Pero gracias a la ayuda de un Demonio Perro que salvó llamado Pochita, Denji es capaz de sobrevivir convirtiéndose en un Cazador de demonios a sueldo, haciendo trabajos para los Yakuza. Los poderes motosierra de Pochita son útiles contra estos poderosos demonios. Y cuando Denji termina siendo asesinado por un demonio, Pochita se sacrifica para revivirlo. Pero ahora Denji ha renacido como una especie de extraño híbrido Demonio-Humano. ¡Ahora es Chainsaw Man! Después de su transformación, es reclutado rápidamente y obligado a unirse a los Cazadores de Demonios de Seguridad Pública bajo amenaza de exterminio ya que técnicamente es un Demonio. Ahora que vive cómodamente por primera vez en su vida, Denji lucha por determinar sus sueños y establecer relaciones significativas mientras mata demonios y trabaja junto a otros excéntricos cazadores.<br><br>**Enlaces:**<br>- \[AniList\](https://anilist.co/.../105778)<br>- \[MyAnimeList\](https://myanimelist.net/.../116778)<br>- \[MyAnimeList (anime)\](https://myanimelist.net/.../Chainsaw_Man) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 232 chapters |  |  |  |
| chapter dates | PASS | 232 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | WebView has not loaded content |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
