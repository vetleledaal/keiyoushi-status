# Extension Validation Report

- Extension: tachiyomi-en.kensscan-v1.6.59
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
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 8764527828239838961
- Source name: Kensscan
- Source language: en
- Selected manga input: popular offset 0: Maou No Musume Wa Ikigitanai (`.../maou-no-musume-wa-ikigitanai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Maou No Musume Wa Ikigitanai (`.../maou-no-musume-wa-ikigitanai`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Raising Hell (`.../raising-hell`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Yata Miran To Seishun Ni Joutou (`.../yata-miran-to-seishun-ni-joutou`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Hanzou to Juusan-nin no Kunoichi-tachi (`.../hanzou-to-juusan-nin-no-kunoichi-tachi`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Maou No Musume Wa Ikigitanai (`.../maou-no-musume-wa-ikigitanai`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Maou No Musume Wa Ikigitanai (`.../maou-no-musume-wa-ikigitanai`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Maou No Musume Wa Ikigitanai, URL=`.../maou-no-musume-wa-ikigitanai` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kensscan.com/.../maou-no-musume-wa-ikigitanai-cover.jpg` (image/jpeg, 215381 bytes, 846x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../maou-no-musume-wa-ikigitanai` |  |  |  |
| details thumbnail URL | PASS | `https://kensscan.com/.../maou-no-musume-wa-ikigitanai-cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Belphegor, daughter of the Demon King, is a total pushover of a demon whose only desire is "to just lounge around doing nothing." Unluckily for her, she is brutally slaughtered by a hero who barged in to slay the Demon King… or so it seemed, until she inexplicably comes back to life!? Hell! Blood! Death! The dark comedic death-road of sorrow begins for the world’s most lazy demon!!<br><br>Series info: MangaDex<br><br>Alternative Names: 魔王の娘は生き汚い |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pub-e07f2012160844128b7abfc18e1dbf1e.r2.dev/.../Page1.webp` (image/webp (encoding: lossy), 456476 bytes, 1393x2000) |  |  |  |
