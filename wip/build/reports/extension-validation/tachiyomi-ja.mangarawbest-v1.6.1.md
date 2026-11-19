# Extension Validation Report

- Extension: tachiyomi-ja.mangarawbest-v1.6.1
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
- Source ID: 5626323664838879030
- Source name: Mangaraw.best
- Source language: ja
- Selected manga input: popular offset 0: キングダム (`.../kingudamu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | キングダム (`.../kingudamu`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | 転生したら第七王子だったので、気ままに魔術を極めます (`.../zhuan-sheng-shitaradi-qi-wang-zi-tatsutanote-qi-mamanimo-shu-woji-memasu`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | 宮廷魔導師見習いを辞めて、魔法アイテム職人になります (`.../gong-ting-mo-dao-shi-jian-xi-iwoci-mete-mo-fa-aitemuzhi-ren-ninarimasu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | にせもの家族 (`.../nisemonojia-zu`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | キングダム (`.../kingudamu`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | キングダム (`.../kingudamu`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 895 | 第1話 (`.../di-1hua`) |  | <1s |
| pages | `getPageList(chapter)` | timeout | 0 |  | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | 10s+ |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | TIMEOUT | kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=キングダム, URL=`.../kingudamu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 116/116 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 116/116 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaraw.best/.../229327f3-4bed-45ef-bf3b-25a7da15db63.JPEG` (image/jpeg, 106366 bytes, 320x455) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kingudamu` |  |  |  |
| details thumbnail URL | PASS | `https://mangaraw.best/.../229327f3-4bed-45ef-bf3b-25a7da15db63.JPEG` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 時は紀元前――。いまだ一度も統一されたことのない中国大陸は、500年の大戦争時代。苛烈な戦乱の世に生きる少年・信は、自らの腕で天下に名を成すことを目指す!!2013年、第17回手塚治虫文化賞マンガ大賞受賞！<br><br>**Alternative Names:**<br>- Kingdom |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 895 chapters |  |  |  |
| chapter dates | PASS | 895 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Timed out waiting for 30000 ms |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
