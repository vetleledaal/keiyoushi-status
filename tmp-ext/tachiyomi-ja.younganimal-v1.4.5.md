# Extension Validation Report

- Extension: tachiyomi-ja.younganimal-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3590997004623427971
- Source name: Young Animal
- Source language: ja
- Selected manga input: popular offset 0: ぼくの好きな人が好きな人 (`.../145fe0e303563`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | ぼくの好きな人が好きな人 (`.../145fe0e303563`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 14 | 異世界に行ったので手に職を持って生き延びます (`.../40ef5c8a435cf`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ぼくの好きな人が好きな人 (`.../145fe0e303563`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ぼくの好きな人が好きな人 (`.../145fe0e303563`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 119 | 第1話① (`.../91b76531ba9ac`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ぼくの好きな人が好きな人, URL=`.../145fe0e303563` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20230412174258985A90837C6AED7FA060A810012472618EB-lg.webp` (image/webp (encoding: lossy), 34770 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../145fe0e303563` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20230412174258985A90837C6AED7FA060A810012472618EB.png` (image/png, 1146682 bytes, 1280x672) |  |  |  |
| details author | PASS | 葵せきな, つづら涼 |  |  |  |
| details artist | PASS | 葵せきな, つづら涼 |  |  |  |
| details genres | PASS | ギャグ・コメディ, ラブコメ, 学園青春, ヤングアニマルZERO |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 高校２年の秋月奏良は、思いを寄せていた後輩、不破美夜に告白するも「好きな人がいる」との理由で撃沈。<br>美夜の好きな人とは、生徒の様々な依頼を受ける謎の部活、“治験部” 部長の涼風朝陽だった。<br>朝陽の勧誘で治験部に入部することになった奏良だが、そこで朝陽にも思い人がいることを知って…？<br>「生徒会の一存」「ゲーマーズ！」の葵せきな最新作は、切ない恋模様をハイテンションコメディで包んだ"にがあま"ラブコメ！<br>★葵せきな先生　X（Twitter）：@aoisekina<br>★つづら涼先生　X（Twitter）：@ryo_tsuzura |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 119 chapters |  |  |  |
| chapter dates | PASS | 119 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.younganimal.com/.../master-1721727125562-01.webp <redacted query values: Expires, Signature, and Key-Pair-Id> 0, 5, 4, 10, 7, 1, 11, 6, 9, 3, 2, 13, 8, 12, 14\]` (image/jpeg, 398271 bytes, 960x1378; server Content-Type: image/webp) |  |  |  |
