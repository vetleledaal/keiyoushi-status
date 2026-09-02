# Extension Validation Report

- Extension: tachiyomi-es.catmanhwas-v1.4.53
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 16
- Lint: 0
- Warnings: 0
- Skipped: 18
- Failed: 2
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 360108012210956342
- Source name: Catoons
- Source language: es
- Selected manga input: popular offset 0: Bestias que cruzan la línea (`.../bestias-que-cruzan-la-linea`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Bestias que cruzan la línea (`.../bestias-que-cruzan-la-linea`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Dome al perro del palacio (`.../dome-al-perro-del-palacio`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Mimosa (`.../mimosa`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Soy el discípulo menor de la mente maestra del murim (`.../soy-el-discipulo-menor-de-la-mente-maestra-del-murim`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Bestias que cruzan la línea (`.../bestias-que-cruzan-la-linea`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |
| chapters | `fetchChapterList(manga)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | 10s+ |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bestias que cruzan la línea, URL=`bestias-que-cruzan-la-linea` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.newcat1.xyz/.../acd92d5f-a57f-48ea-960b-a6765240cbe2.webp` (image/webp (encoding: lossy), 76118 bytes, 1200x1600) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
