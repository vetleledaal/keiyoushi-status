# Extension Validation Report

- Extension: tachiyomi-es.mundomanhwa-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7121772696835562045
- Source name: Mundo Manhwa
- Source language: es
- Selected manga input: popular offset 0: Mi tia (`.../921`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Mi tia (`.../921`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Casi como hermanos (`.../1104`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Primavera para blossom (`.../3159`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Clases Secretas con mi hermanita (`.../2943`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 15 | Mi tia es mia (`.../2576`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mi tia (`.../921`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 141 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 47 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 2: title=Mi tia, URL=`921` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 115/115 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 110/115 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mundomanhwa.com/.../Mi-tia23-175x238.jpeg` (image/jpeg, 10355 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `921` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mundomanhwa.com/.../Mi-tia23-193x278.jpeg` (image/jpeg, 12827 bytes, 193x278) |  |  |  |
| details author | PASS | Viagra |  |  |  |
| details artist | PASS | Sexy bong |  |  |  |
| details genres | PASS | Drama, Romance, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Mi tia Comic Completo también conocida como (AKA) “숙모, My aunt”. Este manhwa en curso se lanzó en 2018. La historia fue escrita por Viagra y las ilustraciones por Sexy Bong. El webtoon de mi tía trata sobre la historia de Drama, Maduro, Romance, Recuentos de la vida.<br><br>Mi tia – Ver Comic (Toomics) COMPLETO solo en Woomics el mejor sitio de para ver manhwas, mangas y comics, aqui puedes encontrar todos los capítulos de tus manhwas, mangas y cómics favoritos. hacemos todo lo posible para recopilar los capitulos de todos los cómics de tu agrado. Ninguno de los cómics son de nuestra propiedad y ninguno se encuentra alojado en nuestros servidores.<br><br>Enlaces por woomics comic Mi tia completo en linea aqui podras ver todos los cómics más actualizados y nuevos podrás verlos totalmente gratis aquí, solo en woomics, para mas comics puedes visitar esta pagina online: apollcomics.xyz, con miles de historias diferentes estos cómics te entretendrán por horas o hasta días, no te pierdas de ningún capitulo, si deseas algún cómic debes dejar tu comentario pidiendo el cómic que deseas que sea añadido.<br><br>Sinopsis<br><br>Sarah no puede resistir las enormes facciones de su sobrino … ¡y así comienza su vida secretamente promiscua!<br><br>No lo olvides, solo woomics traerá los comics mas actualizados y nuevos para tu gusto y facilidad de descarga, no olvides dejar tu comentario si te gusto el cómic, aquí encontraras toomics nuevos y completos para tu gusto, solo aquí obtendrás los toomics hasta el ultimo capítulo.<br><br>Nombres Alternativos: My aunt |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 141 chapters |  |  |  |
| chapter dates | PASS | 141 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://cdn3.vermanhwa.com/.../16592_1-(1).jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
