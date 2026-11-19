# Extension Validation Report

- Extension: tachiyomi-es.visormangaunoriginal-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 2
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1691961809877311097
- Source name: VisorManga (unoriginal)
- Source language: es
- Selected manga input: popular offset 0: No Caere por Segunda Vez (`.../no-caere-por-segunda-vez`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | No Caere por Segunda Vez (`.../no-caere-por-segunda-vez`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | Aprendí XX a través de un fanfic (`.../aprendi-xx-a-traves-de-un-fanfic`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 19 | Se respeta tu gusto (`.../se-respeta-tu-gusto`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | No Caere por Segunda Vez (`.../no-caere-por-segunda-vez`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | No Caere por Segunda Vez (`.../no-caere-por-segunda-vez`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 38 | Capítulo 1.00 (`.../no-caere-por-segunda-vez-1.00`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | PASS | 19 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=No Caere por Segunda Vez, URL=`no-caere-por-segunda-vez` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 76/76 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 76/76 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumbs.visormanga.com/.../no-caere-por-segunda-vez.jpg` (image/jpeg, 52889 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `no-caere-por-segunda-vez` |  |  |  |
| details thumbnail URL | PASS | `https://thumbs.visormanga.com/.../no-caere-por-segunda-vez.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Drama, Ecchi, Psicológico, Romance, Harem, Vida Escolar |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Me convertiré en el perdedor perfecto y los juzgaré a todos. Eunhyuk, quien regresó a sus días de escuela secundaria cuando era más tímido, rápidamente se recupera de su ansiedad y comienza a vengarse de sus acosadores usando sus recuerdos pasados. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | LINT | All 38 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=38 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
