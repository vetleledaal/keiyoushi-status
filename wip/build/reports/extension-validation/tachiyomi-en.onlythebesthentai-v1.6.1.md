# Extension Validation Report

- Extension: tachiyomi-en.onlythebesthentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5862792365006156918
- Source name: Only The Best Hentai
- Source language: en
- Selected manga input: popular offset 0: And today too I am toyed with by my BF’s friends 3 (`.../and-today-too-i-am-toyed-with-by-my-bfs-friends-3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | And today too I am toyed with by my BF’s friends 3 (`.../and-today-too-i-am-toyed-with-by-my-bfs-friends-3`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Breeding License: The “Picking Up Girls on the Beach and Having Wild Sex” Edition (`.../breeding-license-the-picking-up-girls-on-the-beach-and-having-wild-sex-edition`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 11 | And today too I am toyed with by my BF’s friends 3 (`.../and-today-too-i-am-toyed-with-by-my-bfs-friends-3`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | And today too I am toyed with by my BF’s friends 3 (`.../and-today-too-i-am-toyed-with-by-my-bfs-friends-3`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../and-today-too-i-am-toyed-with-by-my-bfs-friends-3`) |  | <1s |
| pages | `getPageList(chapter)` | success | 81 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=And today too I am toyed with by my BF’s friends 3, URL=`.../and-today-too-i-am-toyed-with-by-my-bfs-friends-3` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://onlythebesthentai.com/.../1-10-768x1080.webp` (image/webp (encoding: lossy), 104768 bytes, 768x1080) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../and-today-too-i-am-toyed-with-by-my-bfs-friends-3` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://onlythebesthentai.com/.../1-10.webp` (image/webp (encoding: lossy), 155300 bytes, 1079x1518) |  |  |  |
| details author | PASS | Erun |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big tits, creampie, double penetration, fingering, NTR, pussy licking, slut |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Parody: Original<br><br>And today too I am toyed with by my BF’s friends 3 \[Soshite Kyou mo Moteasobareru 3\], How slut can you be for having you douji called: And today too I am toyed with by my BF’s friends 3 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 81 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://onlythebesthentai.com/.../1-10.webp` (image/webp (encoding: lossy), 155300 bytes, 1079x1518) |  |  |  |
