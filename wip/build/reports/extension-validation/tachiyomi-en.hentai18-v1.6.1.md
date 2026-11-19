# Extension Validation Report

- Extension: tachiyomi-en.hentai18-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1054622014336587048
- Source name: Hentai18
- Source language: en
- Selected manga input: popular offset 0: Stop Smoking (`.../stop-smoking`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Fugou Ichizoku no Muko ~Tsuma Igai Zenin Ore no Onna~ Sono 4 (`.../fugou-ichizoku-no-muko-tsuma-igai-zenin-ore-no-onna-sono-4`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | In Her Dreams (`.../in-her-dreams`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Honsening (`.../the-honsening`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Stop Smoking Raw (`.../stop-smoking-raw`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 119 | Chapter 1 (`.../stop-smoking-chapter-1-ch70553`) |  | <1s |
| pages | `getPageList(chapter)` | success | 344 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Stop Smoking, URL=`.../stop-smoking` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.hentai18.net/.../stop-smoking.jpg.webp` (image/webp (encoding: lossy), 75904 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../stop-smoking` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://media.hentai18.net/.../stop-smoking.jpg` (image/jpeg, 36204 bytes, 300x430) |  |  |  |
| details author | PASS | Momobird |  |  |  |
| details artist | PASS | Momobird |  |  |  |
| details genres | PASS | Manhwa, Hentai, Comedy, Drama, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★✬☆ 3.6 (2091)<br><br>Even though I get teased for being short and bullied at work, my house is paradise!! ... I thought it was like that, but the neighbors are smoking like crazy!! I couldn't stand it anymore and went to look for them, but I met a fierce-looking, heavy-duty gangster, Na Se-young!<br><br>**Alternative Names:**<br>- 담배피지 마세요!<br>- Someone Stop Her!<br>- Deja de fumar |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 119 chapters |  |  |  |
| chapter dates | PASS | 119 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 344 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.hentai18.net/.../0.jpg` (image/jpeg, 52837 bytes, 720x500) |  |  |  |
