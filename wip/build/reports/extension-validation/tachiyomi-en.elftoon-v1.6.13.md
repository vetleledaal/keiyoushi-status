# Extension Validation Report

- Extension: tachiyomi-en.elftoon-v1.6.13
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
- Source theme: vinetheme
- Source ID: 7881856136524765210
- Source name: Elf Toon
- Source language: en
- Selected manga input: popular offset 0: Infinite Evolution From Zero (`.../elf-s-4749`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Infinite Evolution From Zero (`.../elf-s-4749`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Nine Star Jinx (`.../elf-s-9556`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Game Invasion: Awakening a God-Tier Talent at the Start! (`.../cmvttzhru0324bcs8yhj3k8y8`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | I May Be a Beginner, but I’m Actually a Level 99 Overpowered Player (`.../elf-s-63773`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Infinite Evolution From Zero (`.../elf-s-4749`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Infinite Evolution From Zero (`.../elf-s-4749`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 142 | Chapter 1 (`.../elf-c-16175`) |  | <1s |
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
| details description | PASS | From exhaustion and collapse, he shattered all limits.<br>With unparalleled insight, he reached the peak of wisdom and mastery.<br>Adopting multiple forms, he transcended evolution.<br>Reborn anew, he starts from zero, on a path of infinite evolution.<br><br>Rating: 6.7<br>Type: MANHUA<br>Origin: CHINESE<br><br>**Alternative titles:**<br>- 从零开始无限进化 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 142 chapters |  |  |  |
| chapter dates | PASS | 142 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://elftoon.net/.../infinite-evolution-from-zero <redacted query values: sort>` to `https://elftoon.net/.../infinite-evolution-from-zero <redacted query values: sort and _rsc>` (1 redirects); popular: `https://elftoon.net/.../infinite-evolution-from-zero <redacted query values: sort>` to `https://elftoon.net/.../infinite-evolution-from-zero <redacted query values: sort and _rsc>` (1 redirects); popular: `https://elftoon.net/.../infinite-evolution-from-zero <redacted query values: sort and page>` to `https://elftoon.net/.../infinite-evolution-from-zero <redacted query values: sort, page, and _rsc>` (1 redirects); popular: `https://elftoon.net/.../1` to `https://elftoon.net/.../1 <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://elftoon.net/.../p0001-a2e0471f.webp` (image/webp (encoding: lossy), 735806 bytes, 800x5892) |  |  |  |
