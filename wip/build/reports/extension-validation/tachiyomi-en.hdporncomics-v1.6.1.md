# Extension Validation Report

- Extension: tachiyomi-en.hdporncomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6702817541121796440
- Source name: HD Porn Comics
- Source language: en
- Selected manga input: popular offset 0: Lewdies 13 – Locker Room Quicky (`.../lewdies-13-locker-room-quicky-lewdua-sex-comic`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 21 | Lewdies 13 – Locker Room Quicky (`.../lewdies-13-locker-room-quicky-lewdua-sex-comic`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 21 | ZZZ Summer (`.../zzz-summer-alexanderdinh-sex-comic`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 21 | Sensitive (ongoing) (`.../sensitive-ongoing-video-games-sex-comic`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 21 | ALPHA Ch 8 (ongoing) (`.../alpha-ch-8-ongoing-furries-humor-sex-comic`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lewdies 13 – Locker Room Quicky (`.../lewdies-13-locker-room-quicky-lewdua-sex-comic`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../lewdies-13-locker-room-quicky-lewdua-sex-comic`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 84/84 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 84/84 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://im.hdporncomics.com/.../lewdies-13-locker-room-quicky-001.jpg` (image/jpeg, 53554 bytes, 350x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lewdies-13-locker-room-quicky-lewdua-sex-comic` |  |  |  |
| details thumbnail URL | PASS | `https://im.hdporncomics.com/.../lewdies-13-locker-room-quicky-001.jpg` |  |  |  |
| details author | PASS | Lewdua |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Anal, Futanari & Shemale & Dickgirl, Futanari X Futanari |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://im.hdporncomics.com/.../lewdies-13-locker-room-quicky-001.jpg` (image/jpeg, 402304 bytes, 1620x1080) |  |  |  |
