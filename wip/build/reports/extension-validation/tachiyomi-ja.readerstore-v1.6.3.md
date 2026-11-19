# Extension Validation Report

- Extension: tachiyomi-ja.readerstore-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 424606783143704524
- Source name: Reader Store
- Source language: ja
- Selected manga input: popular offset 0: キングダム (`.../00148802`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | キングダム (`.../00148802`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | ストライク・ザ・ブラッド (`.../10075688`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | 水曜日の猫使い (`.../10962338`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | こうやって、読まれる文章にする (`.../11606095`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 50 | キングダム (`.../00148802`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | キングダム (`.../00148802`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 81 | 🔒 (Preview) キングダム 1 (`.../BT000014880200100101`) |  | <1s |
| pages | `getPageList(chapter)` | success | 60 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=キングダム, URL=`00148802` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 250/250 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 250/250 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ebookstore.sony.jp/.../LT000255243004759716_XLARGE.jpg` (image/jpeg, 59560 bytes, 402x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `00148802` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ebookstore.sony.jp/.../BT000014880200100101_XLARGE.jpg` (image/jpeg, 56328 bytes, 400x500) |  |  |  |
| details author | PASS | 原泰久 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | コミック, 男性コミック, 青年コミック |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 時は紀元前――。いまだ一度も統一されたことのない中国大陸は、500年の大戦争時代。苛烈な戦乱の世に生きる少年・信は、自らの腕で天下に名を成すことを目指す!!　2013年、第17回手塚治虫文化賞マンガ大賞受賞！<br><br>Magazine: 週刊ヤングジャンプ<br><br>Label: ヤングジャンプコミックスDIGITAL<br><br>Publisher: 集英社 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 81 chapters |  |  |  |
| chapter dates | PASS | 81 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.ebookstore.sony.jp/.../image_url <redacted query values: indices, code, and accept>` (image/webp (encoding: lossy), 1972 bytes, 896x1280) |  |  |  |
