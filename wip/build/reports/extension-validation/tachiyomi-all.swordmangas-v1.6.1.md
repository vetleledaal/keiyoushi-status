# Extension Validation Report

- Extension: tachiyomi-all.swordmangas-v1.6.1
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
- Source implementation: keiyoushi.source.b
- Source ID: 6517303589557585080
- Source name: SwordMangas
- Source language: en
- Selected manga input: latest offset 0: Fantasy Recruitment Squadron (`.../escuadron-de-alistamiento-de-fantasia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | La Academia está condenada (`.../academia-arruinada`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 8 | Centro de traumatismos graves: cirujano Baek Kang-hyeok (`.../centro-de-traumatismos`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 14 | Fantasy Recruitment Squadron (`.../escuadron-de-alistamiento-de-fantasia`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 14 | Underboxer (`.../underboxer`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Fantasy Recruitment Squadron (`.../escuadron-de-alistamiento-de-fantasia`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 46 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 57 |  |  | 1-10s |

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
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pub-3f2587b481f64c23ac2806855f6b79eb.r2.dev/.../cover-1768395259853.jpg` (image/jpeg, 65261 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `escuadron-de-alistamiento-de-fantasia` |  |  |  |
| details thumbnail URL | PASS | `https://pub-3f2587b481f64c23ac2806855f6b79eb.r2.dev/.../cover-1768395259853.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, fantasia, guerra, batalla |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The Jeokun Mountains, lying on the immediate border between the Demon Tribe and the Alien Federation, stand as the final strategic stronghold where training and real combat unfold side by side. The Federation persistently recruits and selects soldiers in pursuit of the ten Transcendents foretold in the Book of Prophecy, aiming to reclaim the lost lands. Yet, more daunting than the war against the Demon Tribe are the hardships and relentless discipline of military life. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | PASS | 46 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.swordmangas.com/.../000_000_adSwordmangaEN.png` (image/jpeg, 250699 bytes, 800x1200; server Content-Type: image/png) |  |  |  |
