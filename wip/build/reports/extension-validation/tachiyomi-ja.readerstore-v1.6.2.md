# Extension Validation Report

- Extension: tachiyomi-ja.readerstore-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: 転生したらスライムだった件 (`.../10201663`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 転生したらスライムだった件 (`.../10201663`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | ご隠居魔王さまの返り咲き ～突如若返った先々代魔王さまはちょっぴりHな謎武術で女尊男卑の世界を平定する～ (`.../11020654`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | 錬金術師の辺境再生スローライフ～S級パーティーで孤立した少女をかばったら追放されたので、一緒に幸せに暮らします～【単行本版】 (`.../10982758`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | 【無料】俺様社長の不器用な溺愛～20歳差だって純愛は可能か？～ (`.../11556329`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 50 | 転生したらスライムだった件 (`.../10201663`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 転生したらスライムだった件 (`.../10201663`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 33 | 🔒 (Preview) 転生したらスライムだった件（１） (`.../LT000047889000514156`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=転生したらスライムだった件, URL=`10201663` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 250/250 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 250/250 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ebookstore.sony.jp/.../BT000034249403303301_XLARGE.jpg` (image/jpeg, 54719 bytes, 352x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `10201663` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ebookstore.sony.jp/.../LT000047889000514156_XLARGE.jpg` (image/jpeg, 35493 bytes, 351x500) |  |  |  |
| details author | PASS | 川上泰樹, 伏瀬, みっつばー |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | コミック, 男性コミック, 少年コミック |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | WEBで記録的なPVを集めた異世界転生モノの名作を、原作者完全監修でコミカライズ！ 巻末には原作者書き下ろしの短編小説を収録した、ファン必携の単行本いよいよ発売！＊「転スラ」スピンオフ５作品の第１話をまとめた試し読みパック付き！<br><br>Magazine: 月刊少年シリウス<br><br>Publisher: 講談社 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 33 chapters |  |  |  |
| chapter dates | PASS | 33 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.ebookstore.sony.jp/.../image_url <redacted query values: indices, code, and accept>` (image/webp (encoding: lossy), 217236 bytes, 900x1280) |  |  |  |
