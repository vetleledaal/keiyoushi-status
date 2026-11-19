# Extension Validation Report

- Extension: tachiyomi-es.skymangas-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 4603660728091602676
- Source name: SkyMangas
- Source language: es
- Selected manga input: popular offset 0: El Caballero Pesado Reencarnado Exiliado no tiene rival en conocimiento del juego. (`.../el-caballero-pesado-reencarnado-exiliado-no-tiene-rival-en-conocimiento-del-juego`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | El Caballero Pesado Reencarnado Exiliado no tiene rival en conocimiento del juego. (`.../el-caballero-pesado-reencarnado-exiliado-no-tiene-rival-en-conocimiento-del-juego`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | El Gran Doctor Ling Ran (`.../el-gran-doctor-ling-ran`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | The Bone Uncle (`.../the-bone-uncle`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Diario de Sakura (`.../diario-de-sakura`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El Caballero Pesado Reencarnado Exiliado no tiene rival en conocimiento del juego. (`.../el-caballero-pesado-reencarnado-exiliado-no-tiene-rival-en-conocimiento-del-juego`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El Caballero Pesado Reencarnado Exiliado no tiene rival en conocimiento del juego. (`.../el-caballero-pesado-reencarnado-exiliado-no-tiene-rival-en-conocimiento-del-juego`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 186 | Capítulo 1 (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 39 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Caballero Pesado Reencarnado Exiliado no tiene rival en conocimiento del juego., URL=`el-caballero-pesado-reencarnado-exiliado-no-tiene-rival-en-conocimiento-del-juego` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.skymangas.com/.../el-caballero-pesado-reencarnado-exiliado-no-tiene-rival-en-conocimiento-del-juego_cover.webp` (image/webp (encoding: lossy), 230074 bytes, 800x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `el-caballero-pesado-reencarnado-exiliado-no-tiene-rival-en-conocimiento-del-juego` |  |  |  |
| details thumbnail URL | PASS | `https://api.skymangas.com/.../el-caballero-pesado-reencarnado-exiliado-no-tiene-rival-en-conocimiento-del-juego_cover.webp` |  |  |  |
| details author | PASS | Necoco |  |  |  |
| details artist | PASS | Brocco Lee |  |  |  |
| details genres | PASS | Manga, Shounen, Acción, Aventura, Isekai, Dungeons, Monsters, Magic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★ 5.0 (12)<br><br>«¡Maldito inútil! ¡Eres hijo de un Santo de la Espada y te atreves a usar una clase tan defectuosa!».<br><br>Durante la «Ceremonia de Bendición Divina» de Elymas, un joven de quince años descendiente de un linaje de Santos de la Espada, manifestó una clase comúnmente considerada defectuosa: el Caballero Pesado. Fue destituido de su puesto como próximo líder de la Casa Edvaughn y exiliado. La clase Caballero Pesado tenía un estatus desequilibrado y habilidades inútiles; para colmo, se decía que era una clase propia de cobardes e indolentes.<br><br>Pero Elymas sabía que este mundo era el del juego al que solía jugar, y que el Caballero Pesado era la clase más poderosa que existía. Elymas aprovechó al máximo el conocimiento de su vida anterior y comenzó su eficiente recorrido por el mundo en el que había reencarnado.<br><br>**Títulos alternativos:**<br>- The Exiled Reincarnated Heavy Knight Is Unrivaled in Game Knowledge |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 186 chapters |  |  |  |
| chapter dates | PASS | 186 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.skymangas.com/.../release-page <redacted query values: token, release, page, and format>` (image/webp (encoding: lossy), 229984 bytes, 1124x1600) |  |  |  |
