# Extension Validation Report

- Extension: tachiyomi-es.nartag-v1.4.64
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
- Source ID: 2973017642163731007
- Source name: Rncalation
- Source language: es
- Selected manga input: latest offset 0: La Leyenda Del Artista Marcial De Nivel Bajo (`.../la-leyenda-del-artista-marcial-de-nivel-bajo-1781062727839`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | La vida después de la muerte (`.../la-vida-despues-de-la-muerte`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 23 | La Leyenda Del Artista Marcial De Nivel Bajo (`.../la-leyenda-del-artista-marcial-de-nivel-bajo-1781062727839`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | La Leyenda Del Artista Marcial De Nivel Bajo (`.../la-leyenda-del-artista-marcial-de-nivel-bajo-1781062727839`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | La Leyenda Del Artista Marcial De Nivel Bajo (`.../la-leyenda-del-artista-marcial-de-nivel-bajo-1781062727839`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 19 | Capítulo 1 (`.../44b26e863d19641c86d7e`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La Leyenda Del Artista Marcial De Nivel Bajo, URL=`.../la-leyenda-del-artista-marcial-de-nivel-bajo-1781062727839` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rncalation.online/.../cover-1783045944217.webp` (image/webp (encoding: lossy), 71694 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../la-leyenda-del-artista-marcial-de-nivel-bajo-1781062727839` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Knight no Scanlation |  |  |  |
| details artist | PASS | Knight no Scanlation |  |  |  |
| details genres | PASS | En emisión, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | PASS | 19 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rncalation.online/.../1781062758751-47c7fd97-8bdd-4775-995c-a0250e294af0.jpg <redacted query values: t>` (image/jpeg, 2215329 bytes, 800x11315) |  |  |  |
