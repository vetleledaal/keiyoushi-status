# Extension Validation Report

- Extension: tachiyomi-all.saymanhwa-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.x
- Source ID: 160957764321519511
- Source name: SayManhwa
- Source language: en
- Selected manga input: popular offset 0: A Dangerous Deal and The Girl Next Door (`.../a-dangerous-deal-and-the-girl-next-door`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | A Dangerous Deal and The Girl Next Door (`.../a-dangerous-deal-and-the-girl-next-door`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Lust [Lezhin] (`.../lust-lezhin`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Pleasure Board Game: Asmodek (`.../pleasure-board-game-asmodek`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Trapped in a Dungeon with Monsters (`.../trapped-in-a-dungeon-with-monsters`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Dangerous Deal and The Girl Next Door (`.../a-dangerous-deal-and-the-girl-next-door`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Dangerous Deal and The Girl Next Door (`.../a-dangerous-deal-and-the-girl-next-door`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 69 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 34 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Dangerous Deal and The Girl Next Door, URL=`.../a-dangerous-deal-and-the-girl-next-door` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.saymanhwa.net/.../20260821051258-8a3f98a0521c-thumb-300x420.webp` (image/webp (encoding: lossy), 15738 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-dangerous-deal-and-the-girl-next-door` |  |  |  |
| details thumbnail URL | PASS | `https://img.saymanhwa.net/.../20260821051258-8a3f98a0521c-thumb-300x420.webp` |  |  |  |
| details author | PASS | Golgwi |  |  |  |
| details artist | PASS | Kim Byokgyu |  |  |  |
| details genres | PASS | Adult, Action, Drama, ecchi, Fantasy, Harem, Historical, Martial Arts, Mature, Mystery, Psychological, Romance, School Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “If you my take my wife’s clothes off, you’ll really fuck her…” The naked body of the woman next door was seen on CCTV by chance… Sooheon felt a sense of guilt till the woman’s husband proposed a dangerous deal…<br><br>**Alternative Names:**<br>- 위험한 거래 그리고 옆집 여자<br>- Negocios Peligrosos |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 69 chapters |  |  |  |
| chapter dates | PASS | 69 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.manhwa.vip/.../a_dangerous_deal_and_the_girl_next_door_1_tw_001_a.webp` (image/webp (encoding: lossy), 314576 bytes, 800x9000) |  |  |  |
