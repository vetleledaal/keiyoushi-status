# Extension Validation Report

- Extension: tachiyomi-en.coffeemangaunoriginal-v1.6.61
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: imperiomanhwa
- Source ID: 2571489285618757730
- Source name: Coffee Manga (Unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Remarried Empress (`.../remarried-empress`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Remarried Empress (`.../remarried-empress`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Survival Instincts (`.../9l4uh7he9gcxa2q`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Cosmos (`.../cosmos`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Asha of the Border (`.../77ccc4pdeidvanz`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Remarried Empress (`.../remarried-empress`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Remarried Empress (`.../remarried-empress`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 251 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Remarried Empress, URL=`.../remarried-empress` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Survival Instincts, URL=`.../9l4uh7he9gcxa2q` at page 1 offset 23 and page 2 offset 0 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://coffeemanga.net/.../bG9jYWw6Ly8vbGVnYWN5LWNvZmZlZW1hbmdhLWNvdmVycy8yMDI1LzEyLzFkMDZiZjM4NjM2MGFmYjEwOTJlNDQ2NWYyMGI0ODVmYWNkNDIzMGVfNzIwXzEwMzdfMjY5NzgxLTE5M3gyNzgtMS5qcGVn` (image/webp (container: extended), 22332 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../remarried-empress` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://coffeemanga.net/.../bG9jYWw6Ly8vbGVnYWN5LWNvZmZlZW1hbmdhLWNvdmVycy8yMDI1LzEyLzFkMDZiZjM4NjM2MGFmYjEwOTJlNDQ2NWYyMGI0ODVmYWNkNDIzMGVfNzIwXzEwMzdfMjY5NzgxLTE5M3gyNzgtMS5qcGVn` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Webtoon, Full color, Romance, Shoujo, Drama, Royalty, revenge, royalty-nobility, strong-female-lead |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The perfect Empress, intelligent and courageous, devoted everything to her throne and her empire. But betrayal cuts deeper than a sword. When her husband brings home a mistress and demands a divorce, the world expects her to fall. Instead, she delivers a crushing blow: 'I accept this divorce... and I request approval for my remarriage.' A new alliance, a new empire, and a new destiny. Witness the ultimate reclamation of power. Read Chapter 1 now!<br><br>Alternative names: L'impératrice remariée La Emperatriz De Volvio A Casar Remarried Empress The Remarried Empress The Second Marriage การแต่งงานครั้งใหม่ของจักรพรรดินี 再婚承認を要求します 再婚皇后 재혼 황후 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 251 chapters |  |  |  |
| chapter dates | PASS | 251 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://coffeemanga.net/.../bG9jYWw6Ly8vbGVnYWN5LWNvZmZlZW1hbmdhL21hbmdhXzY5MzJlZmY3NTdjY2MvY2hhcHRlci0xLzAwMS5qcGc` (image/webp (container: extended), 1048950 bytes, 720x7989) |  |  |  |
