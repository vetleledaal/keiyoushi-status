# Extension Validation Report

- Extension: tachiyomi-ja.mangakoma-v1.6.5
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
- Source theme: liliana
- Source ID: 7992028141782192896
- Source name: Manga Koma
- Source language: ja
- Selected manga input: popular offset 0: キングダム (`.../kingudamu004`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | キングダム (`.../kingudamu004`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 4000年ぶりに帰還した大魔導士 (`.../4000nianburini-gui-haishita-da-mo-dao-shia002`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | ナノ魔神 (`.../nano-mo-shena002`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 鉄槌教師 (`.../zhi-chui-jiao-shia001`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | キングダム (`.../kingudamu004`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | キングダム (`.../kingudamu004`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 893 | 第1話 (`.../di1hua`) |  | <1s |
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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=キングダム, URL=`.../kingudamu004` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 99/99 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 99/99 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangakoma01.top/.../kingudamu002.jpg <redacted query values: 1707924652>` (image/jpeg, 99574 bytes, 360x513) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kingudamu004` |  |  |  |
| details thumbnail URL | PASS | `https://mangakoma01.top/.../kingudamu002.jpg <redacted query values: 1707924652>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 時は紀元前――。いまだ一度も統一されたことのない中国大陸は、500年の大戦争時代。苛烈な戦乱の世に生きる少年・信は、自らの腕で天下に名を成すことを目指す!!　2013年、第17回手塚治虫文化賞マンガ大賞受賞！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 893 chapters |  |  |  |
| chapter dates | PASS | 893 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.cdnkk.top/.../08-08-28-6515774075574930.webp` (image/webp (encoding: lossy), 322768 bytes, 800x1149; server Content-Type: image/jpeg) |  |  |  |
