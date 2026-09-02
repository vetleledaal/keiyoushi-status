# Extension Validation Report

- Extension: tachiyomi-ja.comicnettai-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1398057210066455013
- Source name: Comic Nettai
- Source language: ja
- Selected manga input: popular offset 0: そばギャルとおじさん (`.../773`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | そばギャルとおじさん (`.../773`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | 岩毱山大観光ホテル (`.../775`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | そばギャルとおじさん (`.../773`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | そばギャルとおじさん (`.../773`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 8 | 第1話 丼の中のマッチング (`.../viewer.html <redacted query values: cid>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 29 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=そばギャルとおじさん, URL=`.../773` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comicnettai.com/.../%E6%9B%B8%E5%BD%B1%E3%83%8F%E3%82%99%E3%83%8A%E3%83%BC_3%E5%B7%BB%E7%99%BA%E5%A3%B2%E5%89%8D.jpg` (image/jpeg, 195371 bytes, 432x604) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../773` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.comicnettai.com/.../%E3%83%92%E3%82%99%E3%83%83%E3%82%AF%E3%82%99%E3%83%8F%E3%82%99%E3%83%8A%E3%83%BC_%E5%8D%98%E8%A1%8C%E6%9C%AC%E7%99%BA%E5%A3%B2%E5%BE%8C-2.jpg` (image/jpeg, 541515 bytes, 1880x752) |  |  |  |
| details author | PASS | 稲葉そーへー, 本橋隆司 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 【単行本④巻 10月16日発売予定！】 中年サラリーマンの秋丸泰造。 ゴリッゴリの金髪ギャルのじゅりな。 立ち食いそば屋で天ぷらをシェアしたことをきっかけに 「ソフレ（そばフレンド）」になったふたりは、 いっしょにそば屋巡りをすることに…!! 日本人のソウルフード「立ち食いそば」をおいしく食べ尽くす、極上のそばコメディ！　〈毎月第2・4金曜日更新〉 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.comicnettai.com/.../10d227425000b86c87.jpeg` (image/jpeg, 465248 bytes, 1350x1920) |  |  |  |
