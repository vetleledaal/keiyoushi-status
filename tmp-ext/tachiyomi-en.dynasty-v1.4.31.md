# Extension Validation Report

- Extension: tachiyomi-en.dynasty-v1.4.31
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 28
- Lint: 1
- Warnings: 2
- Skipped: 6
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 669095474988166464
- Source name: Dynasty Scans
- Source language: en
- Selected manga input: popular offset 0: TakiRaana (`.../takiraana`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 21 | TakiRaana (`.../takiraana`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | BanG Dream! (`.../bang_dream`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Takiraana (`.../takiraana`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | TakiRaana (`.../takiraana`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | Chapter 1: Cat (`.../takiraana_ch01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 4 |  |  | 1-10s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Takiraana, URL=`.../takiraana` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=There's No Way I Can Have A Lover! *Or Maybe There Is?, URL=`.../theres_no_way_i_can_have_a_lover_or_maybe_there_is` at page 1 offset 1 and page 2 offset 7, title=Oneshots, URL=`.../oneshots` at page 1 offset 6 and page 2 offset 11, title=Original, URL=`.../original` at page 1 offset 8 and page 2 offset 12, title=Pixiv, URL=`.../pixiv` at page 1 offset 9 and page 2 offset 1, title=BanG Dream!, URL=`.../bang_dream` at page 1 offset 15 and page 2 offset 0, title=Sakura's World, URL=`.../sakuras_world` at page 1 offset 19 and page 2 offset 14 |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 52/52 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 37/52 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `.../takiraana` |  |  |  |
| details thumbnail URL | PASS | `https://dynasty-scans.com/.../f9e6da6a-b884-4c86-bb3b-9312f57576b3.png` |  |  |  |
| details author | PASS | ofufu67163 |  |  |  |
| details artist | PASS | ofufu67163 |  |  |  |
| details genres | PASS | Yuri |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Type: Series<br><br>Pairing:<br>• Raana x Taki |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dynasty-scans.com/.../1%20fix.webp` (image/webp (encoding: lossy), 681912 bytes, 2150x3028) |  |  |  |
