# Extension Validation Report

- Extension: tachiyomi-id.crotpedia-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 20
- Lint: 6
- Warnings: 1
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zmanga
- Source ID: 4023890583976163058
- Source name: CrotPedia
- Source language: id
- Selected manga input: popular offset 0: Tachikiru Hodo ni Koishikute (`.../tachikiru-hodo-ni-koishikute`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Tachikiru Hodo ni Koishikute (`.../tachikiru-hodo-ni-koishikute`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | Moto Mahou Shoujo no Hikikomori Seikatsu (`.../moto-mahou-shoujo-no-hikikomori-seikatsu`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 16 | Kitto Hatsukoi (`.../kitto-hatsukoi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Nagisanite (`.../nagisanite`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tachikiru Hodo ni Koishikute (`.../tachikiru-hodo-ni-koishikute`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tachikiru Hodo ni Koishikute (`.../tachikiru-hodo-ni-koishikute`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tachikiru Hodo ni Koishikute, URL=`.../tachikiru-hodo-ni-koishikute` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../Tachikiru-Hodo-ni-Koishikute.jpg <redacted query values: resize>` (image/jpeg, 24580 bytes, 225x310) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tachikiru-hodo-ni-koishikute` |  |  |  |
| details thumbnail URL | LINT | Thumbnail URL is empty; use null when unknown |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://crotpedia.net/.../tachikiru-hodo-ni-koishikute` to `https://crotpedia.net/.../login` (2 redirects); popular: `https://crotpedia.net/.../tachikiru-hodo-ni-koishikute` to `https://crotpedia.net/.../login` (2 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
