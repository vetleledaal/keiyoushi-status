# Extension Validation Report

- Extension: tachiyomi-ja.mangafive-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 0
- Warnings: 1
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
- Selected manga input: popular offset 0: ほのスト！ ～豪炎寺のひとりごと～ (`.../00220001`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | ほのスト！ ～豪炎寺のひとりごと～ (`.../00220001`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | レベルファイブ大喜利 (`.../00430001`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | ごえたむのまったりニノクロ生活（完結） (`.../00400001`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ほのスト！ ～豪炎寺のひとりごと～ (`.../00220001`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ほのスト！ ～豪炎寺のひとりごと～ (`.../00220001`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 169 | 第1話 タピオカと豪炎寺 (`.../00220001`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView and purchase this product to read. | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ほのスト！ ～豪炎寺のひとりごと～, URL=`00220001` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.manga-5.com/.../00220001_kv_th.jpg` (image/jpeg, 125748 bytes, 200x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `00220001` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.manga-5.com/.../00220001_kv.jpg` (image/jpeg, 517427 bytes, 900x400) |  |  |  |
| details author | PASS | あさだみほ, レベルファイブ（原作・監修） |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ＜毎週日曜更新！＞ 『イナズマイレブン』の公式スピンオフ作品がキックオフ！ 「炎のエースストライカー」と呼ばれる豪炎寺修也の何気ない日常を描く、心の中エンターテインメント！いつもクールな豪炎寺が考えていることとは――！？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 169 chapters |  |  |  |
| chapter dates | PASS | 169 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this product to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
