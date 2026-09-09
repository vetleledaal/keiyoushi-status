# Extension Validation Report

- Extension: tachiyomi-ja.nicomanga-v1.6.15
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 5680590515266301834
- Source name: Nicomanga
- Source language: ja
- Selected manga input: popular offset 0: SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW (`.../1424bfba.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW (`.../1424bfba.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | OCHIKOBORE DATTA ANI GA JITSUHA SAIKYOU: SHIJOU SAIKYOU NO YUUSHA WA TENSEI-SHI, GAKUEN DE MUJIKAKU NI MUSOU SURU (`.../af35c56c.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | SALAMANDA (`.../20644f60.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | DUNGEON NI DEAI WO MOTOMERU NO WA MACHIGATTEIRU DAROU KA II (`.../3b81e839.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW (`.../1424bfba.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW (`.../1424bfba.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 278 | Chapter 1 (`.../chapter-c1i3476.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 63 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=SHANGRILA FRONTIER ~ SHITTY GAMES HUNTER CHALLENGES GODLY GAME ~ - RAW, URL=`.../1424bfba.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.ihlv1.xyz/.../5faa1046d57cb_5faa10473ef09.jpg <redacted query values: imgmax>` (image/jpeg, 209231 bytes, 320x454) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1424bfba.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://s4.ihlv1.xyz/.../5faa1046d57cb_5faa10473ef09.jpg` (image/jpeg, 209231 bytes, 320x454) |  |  |  |
| details author | PASS | Kata Rina |  |  |  |
| details artist | PASS | Kata Rina |  |  |  |
| details genres | PASS | Updating |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | シャングリラ・フロンティア〜クソゲーハンター、神ゲーに挑まんとす〜, Shangurira furontia 〜 kusogēhantā,-shin gē ni idoman to su 〜 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 278 chapters |  |  |  |
| chapter dates | PASS | 278 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 63 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s2.ihlv1.xyz/.../f85831c0925b9f9b8fd3b1527e3ddd65015.jpg` (image/jpeg, 541468 bytes, 1115x1600) |  |  |  |
