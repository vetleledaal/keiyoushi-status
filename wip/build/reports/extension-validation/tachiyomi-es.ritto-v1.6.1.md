# Extension Validation Report

- Extension: tachiyomi-es.ritto-v1.6.1
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
- Source ID: 4499871760055077217
- Source name: Ritto
- Source language: es
- Selected manga input: popular offset 0: Kingdom (`.../kingdom`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | Kingdom (`.../kingdom`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Liar Game The Last Game (`.../liar-game-the-last-game`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Futsuu no keionbu (`.../futsuu-no-keionbu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | REAL (`.../real`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kingdom (`.../kingdom`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kingdom (`.../kingdom`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 900 | Cap. 1 - El chico desconocido (`.../capitulo-1 <redacted query values: scan>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 61 |  |  | <1s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kingdom, URL=`.../kingdom` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 78/78 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 78/78 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.solitarionf.one/.../3799f3d5-6538-4c37-88ba-2720a5e6ec0a.webp` (image/webp (encoding: lossy), 214128 bytes, 848x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kingdom` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.solitarionf.one/.../3799f3d5-6538-4c37-88ba-2720a5e6ec0a.webp` |  |  |  |
| details author | PASS | HARA Yasuhisa |  |  |  |
| details artist | PASS | HARA Yasuhisa |  |  |  |
| details genres | PASS | Acción, Historia, Militar, Guerra, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Manga · 2006<br><br>Han pasado millones de años desde los tiempos de las leyendas, cuando los mundos de los hombres y los dioses aún eran uno solo. En aquellos tiempos, eran los deseos de los hombres los que movían el mundo. Ambientado en la era de la guerra de 500 años; el período de los Estados Combatientes. "Kingdom" es la historia de un joven llamado Xin que se convirtió en un gran general, y de todas las pruebas y el derramamiento de sangre que lo llevaron hasta allí.<br><br>**Scan:** Lust no Fansub<br><br>**Alternative Names:**<br>- キングダム |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 900 chapters |  |  |  |
| chapter dates | PASS | 900 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 61 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.solitarionf.one/.../f4c417c2-34b3-4a69-bbff-60f5c4d26717.webp` (image/webp (encoding: lossy), 594210 bytes, 1783x1200) |  |  |  |
