# Extension Validation Report

- Extension: tachiyomi-ja.soraraw-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8499664924001897518
- Source name: SoraRaw
- Source language: ja
- Selected manga input: popular offset 0: キングダム (`.../kingu-damu-294`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 200 | キングダム (`.../kingu-damu-294`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | 北部戦士の愛しい花嫁 (`.../hokubu-senshi-no-itoshii-hanayome-53199`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 48 | 回帰したので推し大公と偽装婚約します (`.../kaiki-shi-ta-node-oshi-taikou-to-gisou-konyaku-shi-masu-72893`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | キングダム (`.../kingu-damu-294`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | キングダム (`.../kingu-damu-294`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 895 | 第1話 (`.../ch-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| popular listing | PASS | 200 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=キングダム, URL=`kingu-damu-294` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 300/300 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 300/300 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.mangaraw.lat/.../294_1751176967169.webp` (image/webp (encoding: lossless), 161234 bytes, 270x370) |  |  |  |
| details identity | PASS | Details preserved selected URL `kingu-damu-294` |  |  |  |
| details thumbnail URL | PASS | `https://i.mangaraw.lat/.../294_1751176967169.webp` |  |  |  |
| details author | PASS | 原泰久 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | アクション, 歴史, ドラマ, 青年, 成熟, 日本漫画 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | KINGDOM - RAW<br><br>時は紀元前――。いまだ一度も統一されたことのない中国大陸は、500年の大戦争時代。苛烈な戦乱の世に生きる少年・信は、自らの腕で天下に名を成すことを目指す!!　2013年、第17回手塚治虫文化賞マンガ大賞受賞！<br><br>別名: 王者天下, KINGDOM - RAW, 『キングダム』／原泰久 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 895 chapters |  |  |  |
| chapter dates | PASS | 895 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://lh4.rawcontent.top/.../001_11968011.webp` (image/webp (encoding: lossy), 244028 bytes, 835x1200) |  |  |  |
