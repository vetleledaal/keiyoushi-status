# Extension Validation Report

- Extension: tachiyomi-es.locorabiazine-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1864828683788496159
- Source name: Loco Rabia Zine
- Source language: es
- Selected manga input: popular offset 0: Novedades de nuestra editorial LOCO RABIA (`.../preventas-novedades-de-nuestra-editorial`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 117 | Novedades de nuestra editorial LOCO RABIA (`.../preventas-novedades-de-nuestra-editorial`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Novedades de nuestra editorial LOCO RABIA (`.../preventas-novedades-de-nuestra-editorial`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Novedades de nuestra editorial LOCO RABIA (`.../preventas-novedades-de-nuestra-editorial`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 34 | Parte 1 (`.../01852159-cbe6-42c0-9051-28988255622a`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| popular listing | PASS | 117 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Novedades de nuestra editorial LOCO RABIA, URL=`.../preventas-novedades-de-nuestra-editorial` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 118/118 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 118/118 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.myportfolio.com/.../1b4ee74c-78ab-434d-a192-3867f741f7be_rwc_0x0x639x500x639.jpg <redacted query values: h>` (image/jpeg, 84159 bytes, 639x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../preventas-novedades-de-nuestra-editorial` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.myportfolio.com/.../1b4ee74c-78ab-434d-a192-3867f741f7be_rwc_0x0x639x500x639.jpg <redacted query values: h>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Descubrí las novedades de nuestra editorial Loco Rabia editora. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 34 chapters |  |  |  |
| chapter dates | LINT | 17 of 34 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=17 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.myportfolio.com/.../01852159-cbe6-42c0-9051-28988255622a.jpg <redacted query values: h>` (image/jpeg, 74897 bytes, 640x500) |  |  |  |
