# Extension Validation Report

- Extension: tachiyomi-es.lectorasteria-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 3
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 698506559036250327
- Source name: Lector Asteria
- Source language: es
- Selected manga input: latest offset 0: Conexión de Una Sola Dirección (`.../conexion-de-una-sola-direccion`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 9 | Me convertí en el miembro más joven de un grupo de idols (`.../me-converti-en-el-miembro-mas-joven-de-un-grupo-de-idols`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | Conexión de Una Sola Dirección (`.../conexion-de-una-sola-direccion`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Conexión de Una Sola Dirección (`.../conexion-de-una-sola-direccion`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Conexión de Una Sola Dirección (`.../conexion-de-una-sola-direccion`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 8 | Capítulo 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | <1s |

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
| popular listing | PASS | 9 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Conexión de Una Sola Dirección, URL=`.../conexion-de-una-sola-direccion` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 22/22 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 22/22 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.lectorasteria.com/.../c8704e5f-b081-4bd4-b0cc-a5ca0aa2bf41.jpg` (image/jpeg, 418018 bytes, 1043x1508) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../conexion-de-una-sola-direccion` |  |  |  |
| details thumbnail URL | PASS | `https://media.lectorasteria.com/.../c8704e5f-b081-4bd4-b0cc-a5ca0aa2bf41.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Adulto, Comedia, Drama, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Baek Eunsoo es el perfeccionista líder del equipo de I+D, criado en una estricta familia de educadores.
<br>Han Yooyi es la nueva empleada, a simple vista parece la típica "hija perfecta de familia rica", pero en realidad no tiene ningún filtro.
<br>
<br>Su tranquila rutina en la oficina colapsa cuando una inesperada habilidad telepática entra en juego. Ahora, un hombre que odia enterarse de los asuntos ajenos y una mujer con fantasías muy subidas de tono que desearía mantener en secreto, se ven envueltos en una dinámica de oficina tan caótica que casi parece que viven juntos.
<br>
<br>Entre los constantes choques de un jefe obsesionado con la limpieza y una novata que es un imán de problemas, saltan chispas y comienza un romance que ninguno de los dos veía venir.
<br>
<br>Con sus pensamientos más vergonzosos al descubierto... ¿podrán sobrevivir a la verdad que tanto intentan ocultar? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://wsrv.nl <redacted query values: url and n>` (image/webp (encoding: lossy), 167226 bytes, 1853x946) |  |  |  |
