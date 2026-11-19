# Extension Validation Report

- Extension: tachiyomi-es.gcomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 26
- Lint: 2
- Warnings: 2
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8954715702841677442
- Source name: Gcomics
- Source language: es
- Selected manga input: popular offset 0: Little nemo (`.../little-nemo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 89 | Little nemo (`.../little-nemo`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Little nemo (`.../little-nemo`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Little Nemo (`.../little-nemo`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 62 | Episodio #0 (`.../little-nemo-capitulo-00`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 89 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Little nemo, URL=`.../little-nemo` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://gcomics.online/.../inicio-tapa-agus-la-chica-fantasia.jpg` -> 2 manga URLs (examples: `.../agus-la-chica-fantasia`, `.../agus-la-chica-fantasia`) |  |  |  |
| thumbnail | PASS | `https://gcomics.online/.../littlenemo-webcomic-tapa-inicio.jpg` (image/jpeg, 55321 bytes, 300x460) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Little nemo to Little Nemo |  |  |  |
| details thumbnail URL | PASS | `https://gcomics.online/.../littlenemo-webcomic-tapa-inicio.jpg` |  |  |  |
| details author | PASS | Winsor McCay |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | “Little Nemo in Slumberland” es una historieta creada por Windsor McCay. Se publicó como página dominical en el diario “New York Herald” desde el 15 de Octubre de 1905 hasta el 23 de Julio de 1911. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 62 chapters |  |  |  |
| chapter dates | LINT | All 62 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=62 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gcomics.online/.../LittleNemo-Webtoon-00_1.jpg` (image/webp (container: extended), 53572 bytes, 800x1280) |  |  |  |
