# Extension Validation Report

- Extension: tachiyomi-ja.gorakuweb-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8261703368756535165
- Source name: Goraku Web
- Source language: ja
- Selected manga input: latest offset 0: 俺たちってどうヤッてたっけ!? (`.../5216055947637884768`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | そして、ミナになった。 (`.../3253626055689860570`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 7 | 俺たちってどうヤッてたっけ!? (`.../5216055947637884768`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 俺たちってどうヤッてたっけ!? (`.../5216055947637884768`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 俺たちってどうヤッてたっけ!? (`.../5216055947637884768`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 46 | 第1話 ゲシュタルト崩壊 (`.../3155475192974520302`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 7 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=俺たちってどうヤッてたっけ!?, URL=`5216055947637884768` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 18/18 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 18/18 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gorakuweb-asset.akamaized.net/.../6250652133709278432.webp` (image/webp (container: extended), 26522 bytes, 460x282) |  |  |  |
| details identity | PASS | Details preserved selected URL `5216055947637884768` |  |  |  |
| details thumbnail URL | PASS | `https://gorakuweb-asset.akamaized.net/.../6250652133709278432.webp` |  |  |  |
| details author | PASS | 早坂啓吾 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ヤらなきゃいけないんだけどヤる方法がわからない。 長年付き合って結婚を考えた二人がぶつかる『セックスレス』の壁。 大也と里乃は付き合って７年、同棲して５年の仲良しカップル。 毎日笑いが絶えないし、価値観も同じで相性は最高。すでに家族のような存在になっている。お互いにそろそろ結婚を考えてるタイミング。 でも実は、２年もレス状態のまま…。 仕事が忙しかったり、タイミングを逃しまくった結果、そういう雰囲気にならなくて…。 「俺たちってどうヤッてたっけ？」 果たして２人は、ヤるのかヤらないのか、レスのまま結婚するのか、しないのか？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | PASS | 46 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gorakuweb-content.akamaized.net/.../1 <redacted query values: __token__>` (image/webp (encoding: lossy), 97202 bytes, 844x1200; server Content-Type: application/octet-stream) |  |  |  |
