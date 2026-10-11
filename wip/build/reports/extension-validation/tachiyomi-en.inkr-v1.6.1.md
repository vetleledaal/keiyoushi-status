# Extension Validation Report

- Extension: tachiyomi-en.inkr-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6949560025265725268
- Source name: INKR
- Source language: en
- Selected manga input: popular offset 0: Begin with Qinghuan (`.../ik-title-1758`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Begin with Qinghuan (`.../ik-title-1758`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | success | 20 | My Cat Loki (`.../ik-title-12`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Elemental Kings (`.../ik-title-362`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | success | 20 | Yanagihara Is a Sex Addict. (`.../ik-title-2466`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Begin with Qinghuan (`.../ik-title-1758`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Begin with Qinghuan (`.../ik-title-1758`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 13 | Chapter 1 (`.../ik-chapter-106166`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Begin with Qinghuan, URL=`ik-title-1758` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.inkr.com/.../900.jpg` (image/jpeg, 70611 bytes, 519x780) |  |  |  |
| details identity | PASS | Details preserved selected URL `ik-title-1758` |  |  |  |
| details thumbnail URL | PASS | `https://i1.inkr.com/.../900.jpg` |  |  |  |
| details author | PASS | Snap Studio |  |  |  |
| details artist | PASS | Snap Studio |  |  |  |
| details genres | PASS | Manhua, Romance, Drama, Historical, Reincarnation, Political, Teen Girls |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Qinghuan, the prime minister's daughter, and the Warlord Prince Yue meet once again after the war<br>They yearn to return to each other's arms, but their enemies prevent them from doing so<br>A love story of drama and political intrigue as two lovers fight their way to change their fates |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 13 chapters |  |  |  |
| chapter dates | PASS | 13 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.inkr.com/.../w1600.ikc` (image/webp (container: extended), 297262 bytes, 1500x3567; server Content-Type: application/octet-stream) |  |  |  |
