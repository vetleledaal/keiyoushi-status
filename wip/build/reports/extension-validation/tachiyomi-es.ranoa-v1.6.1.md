# Extension Validation Report

- Extension: tachiyomi-es.ranoa-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2991182735828713279
- Source name: Ranoa
- Source language: es
- Selected manga input: popular offset 0: Manga principal (`.../m-t`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | Manga principal (`.../m-t`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Manga principal (`.../m-t`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Manga principal (`.../m-t`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 142 | Capítulo 1: ¿Será otro mundo? (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 43 |  |  | <1s |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Manga principal, URL=`m-t` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 14/14 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 14/14 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pub-c8c80dc1e8e845bba115001b7e0eba5e.r2.dev/.../1-Manga_Volume_1_EN-adfqm6vz.webp` (image/webp (encoding: lossy), 339746 bytes, 1000x1430) |  |  |  |
| details identity | PASS | Details preserved selected URL `m-t` |  |  |  |
| details thumbnail URL | PASS | `https://pub-c8c80dc1e8e845bba115001b7e0eba5e.r2.dev/.../1-Manga_Volume_1_EN-adfqm6vz.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | La adaptación ilustrada de la novela, tomo a tomo. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 142 chapters |  |  |  |
| chapter dates | PASS | 142 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pub-c8c80dc1e8e845bba115001b7e0eba5e.r2.dev/.../001-pagina-01.jpg` (image/jpeg, 1237253 bytes, 1000x1400) |  |  |  |
