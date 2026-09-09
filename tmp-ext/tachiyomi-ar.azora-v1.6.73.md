# Extension Validation Report

- Extension: tachiyomi-ar.azora-v1.6.73
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: iken
- Source ID: 2482399499047903203
- Source name: Azora
- Source language: ar
- Selected manga input: popular offset 0: Nano machine (`.../nano-machine-s`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Nano machine (`.../nano-machine-s`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 17 | Revenge of the Iron-Blooded Sword Hound (`.../revenge-of-the-iron-blooded-sword-hound`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 13 | My Little Groom Changed After I Died (`.../my-little-groom-changed-after-i-died`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Leaving for My Younger Husband’s Future: A Divorce Decision (`.../leaving-for-my-younger-husband's-future:-a-divorce-decision`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nano machine (`.../nano-machine-s`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nano machine (`.../nano-machine-s`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 331 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 3 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nano machine, URL=`nano-machine-s#425` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.azorafly.com/.../nano-1.jpg` (image/jpeg, 1043533 bytes, 1000x1431) |  |  |  |
| details identity | PASS | Details preserved selected URL `nano-machine-s#425` |  |  |  |
| details thumbnail URL | PASS | `https://storage.azorafly.com/.../nano-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, خارق للطبيعة, مانهوا, غموض, اسبوعي, مميز, مغامرات, إثارة, أكشن |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | تتغير حياة "تشون يون وون" بعد أن يتم غرس آلة نانو في جسده، من قبل سليل خرج من المستقبل. عندها تبدأ قصة صعوده التي لا يمكن وقفها! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 4 name, chapter 6 name, chapter 8 name, chapter 12 name, chapter 26 name, chapter 189 name |  |  |  |
| chapters | PASS | 331 chapters |  |  |  |
| chapter dates | PASS | 331 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.azorafly.com/.../1.jpg` (image/jpeg, 6670510 bytes, 690x37160) |  |  |  |
