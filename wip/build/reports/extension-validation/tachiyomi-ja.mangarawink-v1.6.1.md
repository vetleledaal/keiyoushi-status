# Extension Validation Report

- Extension: tachiyomi-ja.mangarawink-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 3854652698619054740
- Source name: Mangaraw.ink
- Source language: ja
- Selected manga input: popular offset 0: キングダム (`.../kingudamu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | キングダム (`.../kingudamu`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | 魔術師クノンは見えている (`.../mo-shu-shi-kunonhajian-eteiru`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | ラットコレクティブ (`.../ratsutokorekuteibu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | 僕の殺人計画 (`.../pu-nosha-ren-ji-hua`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | キングダム (`.../kingudamu`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | キングダム (`.../kingudamu`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 894 | 第1話 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=キングダム, URL=`.../kingudamu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 84/84 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 84/84 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://admin.gomuraw.site/.../cover.jpg` (image/jpeg, 106366 bytes, 320x455) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kingudamu` |  |  |  |
| details thumbnail URL | PASS | `https://admin.gomuraw.site/.../cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | アクション, 青年, ドラマ, 歴史的, 成熟した |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 時は紀元前――。いまだ一度も統一されたことのない中国大陸は、500年の大戦争時代。苛烈な戦乱の世に生きる少年・信は、自らの腕で天下に名を成すことを目指す!!2013年、第17回手塚治虫文化賞マンガ大賞受賞！<br><br>**Alternative Names:**<br>- Kingdom |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 894 chapters |  |  |  |
| chapter dates | PASS | 894 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://iphotomg.com/.../page_0.jpg` (image/jpeg, 243189 bytes, 835x1200) |  |  |  |
