# Extension Validation Report

- Extension: tachiyomi-en.readvagabondmanga-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 0
- Warnings: 0
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5300358436613908601
- Source name: Read Vagabond Manga
- Source language: en
- Selected manga input: popular offset 0: Vagabond (`<redacted URL #1: manga resource; relative; no scheme>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1 | Vagabond (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Vagabond (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Vagabond (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 322 | Vol. 1 Ch. 1 - Shinmen Takezo (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | <1s |

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
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Vagabond, URL=`<redacted URL #1: resource; relative; no scheme>` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pub.moleve.net/.../volume-37.jpg` (image/jpeg, 422946 bytes, 883x1280) |  |  |  |
| details identity | PASS | Details preserved selected URL `<redacted URL #1: resource; relative; no scheme>` |  |  |  |
| details thumbnail URL | PASS | `https://pub.moleve.net/.../volume-37.jpg` |  |  |  |
| details author | PASS | Takehiko Inoue |  |  |  |
| details artist | PASS | Takehiko Inoue |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | Striving for enlightenment by way of the sword, Miyamoto Musashi is prepared to cut down anyone who stands in his way. Vagabond is an action-packed portrayal of the life and times of the quintessential warrior-philosopher—the most celebrated samurai of all time! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 322 chapters |  |  |  |
| chapter dates | PASS | 322 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://pub.moleve.net/.../page-1.png` (image/jpeg, 3864907 bytes, 2450x3700; server Content-Type: image/png) |  |  |  |
