# Extension Validation Report

- Extension: tachiyomi-en.toonilyme-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1581110056159285576
- Source name: Toonily.me
- Source language: en
- Selected manga input: latest offset 0: Tousan wa [Kensei], Kaasan wa [Kenshin], Boku wa (`.../tousan-wa-kensei-kaasan-wa-kenshin-boku-wa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 0 |  |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Tousan wa [Kensei], Kaasan wa [Kenshin], Boku wa (`.../tousan-wa-kensei-kaasan-wa-kenshin-boku-wa`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | XX Dungeon Raw (`.../xx-dungeon-raw`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tousan wa [Kensei], Kaasan wa [Kenshin], Boku wa (`.../tousan-wa-kensei-kaasan-wa-kenshin-boku-wa`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tousan wa [Kensei], Kaasan wa [Kenshin], Boku wa (`.../tousan-wa-kensei-kaasan-wa-kenshin-boku-wa`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 14 | Chapter 1.1 (`.../chapter-1-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tousan wa \[Kensei\], Kaasan wa \[Kenshin\], Boku wa, URL=`.../tousan-wa-kensei-kaasan-wa-kenshin-boku-wa` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rx.toontop.io/.../493aaec27c65.webp` (image/webp (encoding: lossy), 104614 bytes, 460x650) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tousan-wa-kensei-kaasan-wa-kenshin-boku-wa` |  |  |  |
| details thumbnail URL | PASS | `https://rx.toontop.io/.../493aaec27c65.webp` |  |  |  |
| details author | PASS | Tokiwa Yosyo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Fantasy, Harem, Romance, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | In this world you’re granted a "Job" from the heavens upon turning 14.<br>It’s a crucial element that determines a person’s talent, their role in the world, and their life and destiny.<br>Born to a father who is the \[Sword Saint\] and a mother who is the \[Sword God\], the "Job" Regulus was granted is—\[P*nis-Sword Dueling Master\]!!<br>A swordsman’s tale unlike anything you’ve ever seen begins!!<br><br>**Link:** Original Web Novel - \[Kakuyomu\](https://kakuyomu.jp/.../16817330663767563867) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://rx.toontop.io/.../bbd5b0408b95.webp` (image/webp (encoding: lossy), 308730 bytes, 1125x1600) |  |  |  |
