# Extension Validation Report

- Extension: tachiyomi-es.comics18-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 264249399620309998
- Source name: Comics18
- Source language: es
- Selected manga input: popular offset 0: WONDER MOMMA vs SUPERBOY [JMoz] (`.../wonder-momma-vs-superboy`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | WONDER MOMMA vs SUPERBOY [JMoz] (`.../wonder-momma-vs-superboy`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | LINCOSIKA [Taki8hiro] (`.../lincosika`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | WONDER MOMMA vs SUPERBOY [JMoz] (`.../wonder-momma-vs-superboy`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | WONDER MOMMA vs SUPERBOY [JMoz] (`.../wonder-momma-vs-superboy`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../wonder-momma-vs-superboy`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=WONDER MOMMA vs SUPERBOY \[JMoz\], URL=`.../wonder-momma-vs-superboy` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 33/33 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 33/33 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comics18.org/.../wondermomma-vs-superboy.jpg` (image/jpeg, 102721 bytes, 390x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../wonder-momma-vs-superboy` |  |  |  |
| details thumbnail URL | PASS | `https://comics18.org/.../wondermomma-vs-superboy.jpg` |  |  |  |
| details author | PASS | JMoz |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Incesto, Liga de la Justicia, Mujer Maravilla, Superboy, Superheroes |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://fullcomics18.org/.../wondermomma-vs-superboy-1.jpg` (image/jpeg, 487422 bytes, 1280x2000) |  |  |  |
