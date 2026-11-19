# Extension Validation Report

- Extension: tachiyomi-en.thewanderinginn-v1.6.0
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
- Source ID: 6852255829650555639
- Source name: The Wandering Inn
- Source language: en
- Selected manga input: popular offset 0: The Wandering Inn (`.../table-of-contents`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 2 | The Wandering Inn (`.../table-of-contents`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | The Wandering Inn (`.../table-of-contents`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Wandering Inn (`.../table-of-contents`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 25 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
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
| popular listing | PASS | 2 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Wandering Inn, URL=`.../table-of-contents` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 4/4 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 4/4 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webcomic.wanderinginn.com/.../TWIComicPoster2024_wLogo_Websize.png` (image/png, 1592573 bytes, 900x1274) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../table-of-contents` |  |  |  |
| details thumbnail URL | PASS | `https://webcomic.wanderinginn.com/.../TWIComicPoster2024_wLogo_Websize.png` |  |  |  |
| details author | PASS | pirateaba |  |  |  |
| details artist | PASS | Dana "ArtsyNada" Johns |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | This story begins with Erin Solstice, a young woman who is mysteriously transported to an unknown world with unknown rules. With no idea where she is and nothing to help her, she stumbles upon an abandoned inn and, in a twist of fate, becomes an \[Innkeeper\]. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 25 chapters |  |  |  |
| chapter dates | PASS | 25 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://webcomic.wanderinginn.com/.../TWI_001_page_pg01.jpg` (image/webp (encoding: lossless), 1031648 bytes, 900x1390) |  |  |  |
