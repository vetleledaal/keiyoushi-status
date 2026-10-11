# Extension Validation Report

- Extension: tachiyomi-en.elftoon-v1.6.8
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
- Source theme: vinetheme
- Source ID: 7881856136524765210
- Source name: Elf Toon
- Source language: en
- Selected manga input: popular offset 0: Infinite Evolution From Zero (`.../elf-s-4749`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Infinite Evolution From Zero (`.../elf-s-4749`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Nine Star Jinx (`.../elf-s-9556`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | After Dying a Billion Times, I Copy Talents and Slaughter My Way Through the Ten Thousand Races (`.../elf-s-84713`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Extracted into the God of Necromancy (`.../elf-s-78773`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Infinite Evolution From Zero (`.../elf-s-4749`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Infinite Evolution From Zero (`.../elf-s-4749`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 129 | Chapter 1 (`.../elf-c-16175`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Infinite Evolution From Zero, URL=`elf-s-4749` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://elftoon.net/.../cover-ded0551d.webp` (image/webp (encoding: lossy), 455264 bytes, 1280x1875) |  |  |  |
| details identity | PASS | Details preserved selected URL `elf-s-4749` |  |  |  |
| details thumbnail URL | PASS | `https://elftoon.net/.../cover-ded0551d.webp` |  |  |  |
| details author | PASS | Elf Toon |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | MANHUA, CHINESE, Action, Adventure, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | From exhaustion and collapse, he shattered all limits.<br>With unparalleled insight, he reached the peak of wisdom and mastery.<br>Adopting multiple forms, he transcended evolution.<br>Reborn anew, he starts from zero, on a path of infinite evolution.<br><br>Rating: 7.0<br>Type: MANHUA<br>Origin: CHINESE<br><br>Alternative titles: <br>- 从零开始无限进化 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 129 chapters |  |  |  |
| chapter dates | PASS | 129 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://elftoon.net/.../p0001-a2e0471f.webp` (image/webp (encoding: lossy), 735806 bytes, 800x5892) |  |  |  |
