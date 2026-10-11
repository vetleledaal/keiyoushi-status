# Extension Validation Report

- Extension: tachiyomi-es.manhwaweb-v1.6.13
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5943212552955476721
- Source name: ManhwaWeb
- Source language: es
- Selected manga input: popular offset 0: La Venganza del Sabueso de Sangre de Hierro (`.../comic-el-men-de-la-venzanza_1694253402800`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | La Venganza del Sabueso de Sangre de Hierro (`.../comic-el-men-de-la-venzanza_1694253402800`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 103 | Rikei ga Koi ni Ochita no de Shoumei Shitemita (`.../rikei-ga-koi-ni-ochita-no-de-shoumei-shitemita_1746483618485`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | The Return of the Iron-blood Sword Hound (`.../the-return-of-the-iron-blood-sword-hound_1752094484215`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La Venganza del Sabueso de Sangre de Hierro (`.../comic-el-men-de-la-venzanza_1694253402800`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 184 | Capítulo 1 (`.../comic-el-men-de-la-venzanza_1694253402800-1_01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 103 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=La Venganza del Sabueso de Sangre de Hierro, URL=`manhwa/comic-el-men-de-la-venzanza_1694253402800` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 124/124 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 124/124 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img1mw.xyz/.../cover_1787860931264i5bk8737.webp` (image/webp (encoding: lossy), 274258 bytes, 1054x1492) |  |  |  |
| details identity | PASS | Details preserved selected URL `manhwa/comic-el-men-de-la-venzanza_1694253402800` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://img1mw.xyz/.../cover_1791427960097jils8k66.webp` (image/webp (encoding: lossy), 143468 bytes, 760x1026) |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Accion, Venganza, Harem, Academia, Fantasia, Aventura, Magia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[Por el estudio que te trajo <Solo Leveling>, <Asesino de la Luna a la deriva>, ¡y muchos más!\] Era el sabueso de la familia Baskerville: Vikir. Sin embargo, su lealtad fue recompensada con la cuchilla de una guillotina ensuciada por la calumnia. "Nunca viviré la vida de un sabueso sacrificado después de cazar al conejo". En lugar de la muerte, le espera una oportunidad inesperada. Los ojos de Vikir brillaron en rojo mientras afilaba sus caninos en la oscuridad. "Sólo espera, Hugo. Esta vez te arrancaré la garganta". Es hora de que el sabueso se vengue sangrientamente de su dueño.<br><br>Nombres alternativos: Revenge of the Iron-Blooded Sword Hound |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 184 chapters |  |  |  |
| chapter dates | PASS | 184 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img1mw.xyz/.../001.jpg` (image/jpeg, 44671 bytes, 700x394) |  |  |  |
