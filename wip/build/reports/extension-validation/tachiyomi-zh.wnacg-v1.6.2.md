# Extension Validation Report

- Extension: tachiyomi-zh.wnacg-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6551136894818591762
- Source name: 紳士漫畫
- Source language: zh
- Selected manga input: popular offset 0: (FF47) [サービスヘブン (ハヤシ)] 今日から雌猫を飼うことになりました件｜今天開始在家養貓咪 [中国語] [無修正] (`.../photos-index-aid-392520.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | (FF47) [サービスヘブン (ハヤシ)] 今日から雌猫を飼うことになりました件｜今天開始在家養貓咪 [中国語] [無修正] (`.../photos-index-aid-392520.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | 沈鸢篇 [SMHTN] (`.../photos-index-aid-394338.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | [WastePaperMarket (くずかご)] ヨバイママ [中国翻訳] (`.../photos-index-aid-395073.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | WEEKLY快楽天 2026 No.38 (`.../photos-index-aid-395044.html`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | (FF47) [サービスヘブン (ハヤシ)] 今日から雌猫を飼うことになりました件｜今天開始在家養貓咪 [中国語] [無修正] (`.../photos-index-aid-392520.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | (FF47) [サービスヘブン (ハヤシ)] 今日から雌猫を飼うことになりました件｜今天開始在家養貓咪 [中国語] [無修正] (`.../photos-index-aid-392520.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Ch. 1 (`.../photos-index-aid-392520.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 42 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=(FF47) \[サービスヘブン (ハヤシ)\] 今日から雌猫を飼うことになりました件｜今天開始在家養貓咪 \[中国語\] \[無修正\], URL=`.../photos-index-aid-392520.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://t4.wnimg2.cfd/.../17911274296047289.webp` (image/webp (encoding: lossy), 21122 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../photos-index-aid-392520.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `http://t4.wnimg2.cfd/.../17911274296047289.webp` (image/webp (encoding: lossy), 21122 bytes, 300x400) |  |  |  |
| details author | PASS | 飞鸟 |  |  |  |
| details artist | PASS | 飞鸟 |  |  |  |
| details genres | PASS | ハヤシ, サービスヘブン, 爆肛, 肛交, 巨乳, 口交, 貓女, 深喉, 後宮, 獸耳, 多口口交, 中出, 巨乳蘿莉, 性玩具, 長筒襪, 腹部變形, 尾塞, 女男女3P, 亂交, 無修正, 貓娘, 蘿莉, 情趣用品, 胃部突起, 3P, 群交 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 簡介： |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.wn06.cfd/.../albums-favorite_ranking-page-1-type-week.html` to `https://www.wn10.cfd/.../albums-favorite_ranking-page-1-type-week.html` (1 redirects); popular: `https://www.wn06.cfd/.../albums-index-page-1.html` to `https://www.wn10.cfd/.../albums-index-page-1.html` (1 redirects); popular: `https://www.wn06.cfd/.../albums-favorite_ranking-page-2-type-week.html` to `https://www.wn10.cfd/.../albums-favorite_ranking-page-2-type-week.html` (1 redirects); popular: `https://www.wn06.cfd/.../photos-index-aid-392520.html` to `https://www.wn10.cfd/.../photos-index-aid-392520.html` (1 redirects); popular: `https://www.wn06.cfd/.../index.php <redacted query values: s, q, and p>` to `https://www.wn10.cfd/.../index.php <redacted query values: s, q, and p>` (1 redirects); popular: `https://www.wn06.cfd/.../photos-index-aid-392520.html` to `https://www.wn10.cfd/.../photos-index-aid-392520.html` (1 redirects); popular: `https://www.wn06.cfd/.../albums-index-page-2.html` to `https://www.wn10.cfd/.../albums-index-page-2.html` (1 redirects); popular: `https://www.wn06.cfd/.../photos-gallery-aid-392520.html` to `https://www.wn10.cfd/.../photos-gallery-aid-392520.html` (1 redirects) |  |  |  |
| page load | PASS | `http://img5.wnimg2.cfd/.../0001.webp <redacted query values: verify>` (image/webp (encoding: lossy), 1550704 bytes, 2560x3544) |  |  |  |
