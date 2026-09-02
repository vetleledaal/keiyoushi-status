# Extension Validation Report

- Extension: tachiyomi-es.zonatmoto-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1900395790630760038
- Source name: Zonatmo.to (unoriginal)
- Source language: es
- Selected manga input: popular offset 0: Circles (`.../circles`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | Circles (`.../circles`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | 1.1 CIRCLES (`.../1-1-circles`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Circles (`.../circles`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 222 | #1.00 - Capítulo 1.00 (`.../capitulo-1-00`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Circles, URL=`circles` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 52/52 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 52/52 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zonatmo.to/.../67fbf8861f681.webp` (image/webp (encoding: lossy), 47400 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `circles` |  |  |  |
| details thumbnail URL | PASS | `https://zonatmo.to/.../67fbf8861f681.webp` |  |  |  |
| details author | PASS | shrinell |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedia, Ecchi, Harem, Romance |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | “¡Eres mi tipo!” Jeon Jae-woo se une a P&amp;M, un club de cine y teatro después de giros y vueltas. Pero que? ¡ Las bellezas del club atacan activamente a Jeon Jae-woo! Realmente Jaewoo podrá sobrevivir a la ofensiva de las chicas y ganarse su propio amor? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 222 chapters |  |  |  |
| chapter dates | PASS | 222 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.zonatmo.to/.../0fa99430.webp` (image/webp (encoding: lossy), 113090 bytes, 720x1280) |  |  |  |
