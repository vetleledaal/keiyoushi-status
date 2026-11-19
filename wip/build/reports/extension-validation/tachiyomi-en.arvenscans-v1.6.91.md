# Extension Validation Report

- Extension: tachiyomi-en.arvenscans-v1.6.91
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2559570015828016575
- Source name: Vortex Scans
- Source language: en
- Selected manga input: popular offset 0: Reality Quest (`.../reality-quest-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Reality Quest (`.../reality-quest-2`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Solo Resurrection (`.../solo-resurrection-ul0unjsy`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | The Former Supreme (`.../the-former-supreme`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Shadow Slave (`.../shadow-slave`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Reality Quest (`.../reality-quest-2`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Reality Quest (`.../reality-quest-2`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 242 | Chapter 1 (`.../chapter-1-cqixkoid`) |  | <1s |
| pages | `getPageList(chapter)` | success | 233 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reality Quest, URL=`reality-quest-2#94` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.vortexscans.org/.../d0db38a8-db11-4912-b79b-eda441c5c411.png` (image/png, 2589321 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `reality-quest-2#94` |  |  |  |
| details thumbnail URL | PASS | `https://storage.vortexscans.org/.../d0db38a8-db11-4912-b79b-eda441c5c411.png` |  |  |  |
| details author | PASS | Lee Joo-woon |  |  |  |
| details artist | PASS | Taeseong |  |  |  |
| details genres | PASS | Manhwa, Shounen, Comedy, Adventure, Webtoon, +100 Chapter, Legendary  |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Due to the school bully's threat to get him game items, Ha Do-wan, the unlucky game shuttle, died after playing games all night long for a week. The moment he died, he got respawned to the classroom one week before he died... Everything is the same as that day. The only thing that has changed is the floating in front of him! What? Use the skills of the games I've played so far to beat the bully?!?!<br><br>Alternative Names: 한국어 (韓國語), 조선말 (朝鮮語) |  |  |  |
| metadata trimming | LINT | Untrimmed fields: genre |  |  |  |
| chapters | PASS | 242 chapters |  |  |  |
| chapter dates | PASS | 242 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 233 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.vortexscans.org/.../image_863_9e13be05.webp` (image/webp (encoding: lossy), 28034 bytes, 690x863) |  |  |  |
