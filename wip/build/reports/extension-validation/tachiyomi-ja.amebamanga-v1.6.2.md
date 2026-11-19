# Extension Validation Report

- Extension: tachiyomi-ja.amebamanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2623577517578458051
- Source name: Ameba Manga
- Source language: ja
- Selected manga input: popular offset 0: キングダム (`.../6176`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | キングダム (`.../6176`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | シャングリラ・フロンティア (`.../171903`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | 大正學生愛妻家 (`.../839035`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | 99回断罪されたループ令嬢ですが今世は「超絶愛されモード」ですって!? (`.../750662`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 50 | キングダム (`.../6176`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | キングダム (`.../6176`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 82 | 🔒 キングダム 1 (`.../40734`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 500 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=キングダム, URL=`6176` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 250/250 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 250/250 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://stat.dokusho-ojikan.jp/.../c7535b01-0af6-4449-bc0a-f969e80e3a6d.jpg` (image/jpeg, 813083 bytes, 964x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `6176` |  |  |  |
| details thumbnail URL | PASS | `https://stat.dokusho-ojikan.jp/.../c7535b01-0af6-4449-bc0a-f969e80e3a6d.jpg` |  |  |  |
| details author | PASS | 原泰久 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 総合, 歴史, アニメ化, 実写化, 映画化, 歴史, 剣術バトル, 軍事戦争, TSUTAYA大賞, 手に汗握る, バイオレンス, 成長 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 時は紀元前――。いまだ一度も統一されたことのない中国大陸は、500年の大戦争時代。苛烈な戦乱の世に生きる少年・信は、自らの腕で天下に名を成すことを目指す!!　2013年、第17回手塚治虫文化賞マンガ大賞受賞！<br><br>Publisher: 集英社 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 82 chapters |  |  |  |
| chapter dates | PASS | 82 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 500 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
