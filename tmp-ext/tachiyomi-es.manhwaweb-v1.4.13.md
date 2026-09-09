# Extension Validation Report

- Extension: tachiyomi-es.manhwaweb-v1.4.13
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5943212552955476721
- Source name: ManhwaWeb
- Source language: es
- Selected manga input: latest offset 0: Blue Lock (`.../blue_lock-702790353434`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | La Venganza del Sabueso de Sangre de Hierro (`.../comic-el-men-de-la-venzanza_1694253402800`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 105 | Blue Lock (`.../blue_lock-702790353434`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Blue Lock Episode Nagi  (`.../blue-lock-episode-nagi-_1739275747606`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Blue Lock (`.../blue_lock-702790353434`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 365 | Capítulo 1 (`.../blue_lock-702790353434-1_01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 78 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 105 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Blue Lock, URL=`manhwa/blue_lock-702790353434` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 124/124 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 124/124 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img1mw.xyz/.../cover_1783456623596qwvx66nu.webp` (image/webp (encoding: lossy), 262028 bytes, 902x1350) |  |  |  |
| details identity | PASS | Details preserved selected URL `manhwa/blue_lock-702790353434` |  |  |  |
| details thumbnail URL | PASS | `https://img1mw.xyz/.../cover_1783456623596qwvx66nu.webp` |  |  |  |
| details author | PASS | KANESHIRO Muneyuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Accion, Psicológico |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yoichi Isagi perdió la chance de jugar en las nacionales de preparatoria gracias a que pasó el balón en vez de rematar por su cuenta. Isagi es uno de los 300 delanteros sub-18 elegidos por Jinpachi Ego, un hombre contratado por la Asociación Japonesa de Fútbol luego de la Copa del Mundo de 2018, para guiar a Japón a la cima, destruyendo su estilo y bases de juego. Su plan consiste en aislar a 300 delanteros en una institución similar a una prisión, llamada "Blue Lock", con el fin de crear al mejor delantero/ególatra del mundo, una carencia presente en el fútbol japonés.<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 365 chapters |  |  |  |
| chapter dates | PASS | 365 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 78 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img1mw.xyz/.../001.jpg` (image/jpeg, 459158 bytes, 1244x1920) |  |  |  |
