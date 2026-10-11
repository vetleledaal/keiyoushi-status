# Extension Validation Report

- Extension: tachiyomi-ja.mangafive-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 0
- Warnings: 2
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8712903623054427832
- Source name: Manga-5
- Source language: ja
- Selected manga input: popular offset 0: エンマの休日 (`.../00100001`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | エンマの休日 (`.../00100001`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | ほのスト！ ～豪炎寺のひとりごと～ (`.../00220001`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | ごえたむのまったりニノクロ生活（完結） (`.../00400001`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | エンマの休日 (`.../00100001`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | エンマの休日 (`.../00100001`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 200 | 第1話 サクホク『コロッケ』 (`.../00100001`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView and purchase this product to read. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView and purchase this product to read. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=エンマの休日, URL=`00100001` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.manga-5.com/.../00100001_kv_th.jpg` (image/jpeg, 96617 bytes, 200x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `00100001` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.manga-5.com/.../00100001_kv.jpg` (image/jpeg, 350942 bytes, 900x400) |  |  |  |
| details author | PASS | 須藤ゆみこ, レベルファイブ（原作・監修） |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ＜毎週土曜更新！＞ エンマ大王と、側近のぬらりひょんが「食べ歩き」！？ 先代閻魔大王の残した一冊のノートを手掛かりに、人間界の様々なグルメに舌鼓！レベルファイブ完全監修の『妖怪ウォッチ』公式スピンオフ作品が登場！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 200 chapters |  |  |  |
| chapter dates | PASS | 200 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this product to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://manga-5.com/.../00100001` to `https://manga-5.com/.../ads_before_launching_viewer.html <redacted query values: id>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
