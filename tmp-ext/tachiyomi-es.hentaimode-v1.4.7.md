# Extension Validation Report

- Extension: tachiyomi-es.hentaimode-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5208759847357095642
- Source name: HentaiMode
- Source language: es
- Selected manga input: popular offset 0: Todos estamos en calor! (`.../2053`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 60 | Todos estamos en calor! (`.../2053`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Todos estamos en calor! (`.../2053`) |  | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | Todos estamos en calor! (`.../2053`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../2053`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 10s+ |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Todos estamos en calor!, URL=`.../2053` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://h1.kmcdn.top/.../0.jpg` (image/jpeg, 215338 bytes, 910x1375) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2053` |  |  |  |
| details thumbnail URL | PASS | `https://h1.kmcdn.top/.../0.jpg` |  |  |  |
| details author | PASS | N/A |  |  |  |
| details artist | PASS | meme50 |  |  |  |
| details genres | PASS | anal, big breasts, glasses |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Serie: N/A Characters<br>Tipo: doujinshi<br>Personajes: N/A<br>Idioma: Español<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://h1.kmcdn.top/.../0.jpg` (image/jpeg, 215338 bytes, 910x1375) |  |  |  |
