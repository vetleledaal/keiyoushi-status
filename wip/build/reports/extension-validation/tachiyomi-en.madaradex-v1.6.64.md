# Extension Validation Report

- Extension: tachiyomi-en.madaradex-v1.6.64
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
- Source theme: madara
- Source ID: 2136088453725931591
- Source name: MadaraDex
- Source language: en
- Selected manga input: latest offset 0: An Idol Manager’s Diary (`.../3338`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Secret Class (Uncensored) (`.../767`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Magic Emperor (`.../574`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | An Idol Manager’s Diary (`.../3338`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Count Kalley’s Whipping Maid (Uncensored) (`.../3139`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | An Idol Manager’s Diary (`.../3338`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://madaradex.org/.../3338.webp` (image/webp (encoding: lossless), 347330 bytes, 500x700) |  |  |  |
| details identity | PASS | Details preserved selected URL `3338` |  |  |  |
| details thumbnail URL | PASS | `https://madaradex.org/.../3338.webp` |  |  |  |
| details author | PASS | Honey Fruit |  |  |  |
| details artist | PASS | I Dul |  |  |  |
| details genres | PASS | Drama, Mature, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Sepia” a once promising rookie idol group, is now on the verge of disbanding. Their only choice left… providing sexual favors. As their powerless manager, I took care of them like family, yet I was forced to send them into that dark room myself.<br><br>“Ah… ngh…! Producer… I feel strange… I’m starting to feel strange…!”<br><br>Alternative Names: El Diario del Mánager de Idols, El Diario de un Manager de Idols, Idol Manager's Journal, I Became the Manager of a Sponsored Idol, 아이돌 매니저의 일지, The Idol Manager's Diary, Idol Manager-ui Ilji |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.madaradex.org/.../0.webp` (image/webp (encoding: lossy), 378946 bytes, 720x4548) |  |  |  |
