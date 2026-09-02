# Extension Validation Report

- Extension: tachiyomi-es.nartag-v1.4.64
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
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
- Selected manga input: latest offset 0: GUERRA DE LINDURAS (`.../guerra-de-linduras`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | La vida después de la muerte (`.../la-vida-despues-de-la-muerte`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | GUERRA DE LINDURAS (`.../guerra-de-linduras`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | GUERRA DE LINDURAS (`.../guerra-de-linduras`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | GUERRA DE LINDURAS (`.../guerra-de-linduras`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 36 | Capítulo 1 (`.../d54eeabe7d4298934c017`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=GUERRA DE LINDURAS, URL=`.../guerra-de-linduras` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rncalation.online/.../1780562287357-653717e4-a472-4db4-8f21-52887bd4fa96.png` (image/png, 431061 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../guerra-de-linduras` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Traducciones amistosas |  |  |  |
| details artist | PASS | Traducciones amistosas |  |  |  |
| details genres | PASS | En emisión, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 36 chapters |  |  |  |
| chapter dates | PASS | 36 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://old.nartag.com/.../0.jpg` (image/jpeg, 2575288 bytes, 2377x3919) |  |  |  |
