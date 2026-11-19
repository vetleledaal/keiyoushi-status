# Extension Validation Report

- Extension: tachiyomi-en.mahouirexnohentaikarte-v1.6.57
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 0
- Warnings: 1
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1698910827692369662
- Source name: Mahouirexnohentaikarte
- Source language: en
- Selected manga input: popular offset 0: Mahoui Rex no Hentai Karte (`.../mahoui-rex-no-hentai-karte`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | Mahoui Rex no Hentai Karte (`.../mahoui-rex-no-hentai-karte`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mahoui Rex no Hentai Karte (`.../mahoui-rex-no-hentai-karte`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mahoui Rex no Hentai Karte (`.../mahoui-rex-no-hentai-karte`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 40 | Chapter 1: Slime (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mahoui Rex no Hentai Karte, URL=`.../mahoui-rex-no-hentai-karte` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mahouirexnohentaikarte.com/.../cover.webp` (image/webp (encoding: lossy), 465018 bytes, 1803x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mahoui-rex-no-hentai-karte` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mahouirexnohentaikarte.com/.../cover-240.webp` (image/webp (encoding: lossy), 24236 bytes, 240x341) |  |  |  |
| details author | PASS | Motomi Daisuke |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Demons, Fantasy, Magic, Medical, Monsters |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rex is a magician who runs a clinic in a world where the demon lord has been destroyed, and peace has come. However, the only patients brought in are patients who are more hopeless than the rest of the world, such as those who play with slime and hit man-eaters!? Another world hentai medical comedy begins!!<br><br>Alternative titles: Magic Doctor's Perverted Medical Record, Magical Doctor Rex's Perverted Medical Record |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 40 chapters |  |  |  |
| chapter dates | PASS | 40 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mahouirexnohentaikarte.com/.../001.webp` (image/webp (encoding: lossy), 407372 bytes, 1350x1920) |  |  |  |
