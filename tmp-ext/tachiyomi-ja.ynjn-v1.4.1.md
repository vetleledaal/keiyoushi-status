# Extension Validation Report

- Extension: tachiyomi-ja.ynjn-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 3
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3322701627784242064
- Source name: Young Jump+
- Source language: ja
- Selected manga input: popular offset 0: 太陽の王国っ！ (`.../36608`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 太陽の王国っ！ (`.../36608`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 9 | 太陽の王国っ！ (`.../36608`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 太陽の王国っ！ (`.../36608`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 太陽の王国っ！ (`.../36608`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 5 | 第1局 ようこそ！将棋の王国へ！ (`.../312979`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 9 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=太陽の王国っ！, URL=`36608` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public.ynjn.jp/.../thumbnail_taiyo.png` (image/png, 110155 bytes, 501x501) |  |  |  |
| details identity | PASS | Details preserved selected URL `36608` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://public.ynjn.jp/.../08X10000000073497000_cover_0.jpg` (image/jpeg, 1037074 bytes, 1440x2048; server Content-Type: application/octet-stream) |  |  |  |
| details author | PASS | \[山本隆之, 伏見航介\] |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ドラマ, 青春 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 超負けず嫌いの娘が「将棋」に出会ったらーー!?
<br>
<br>妻を亡くし、一人で娘を育てる幸太郎の最近の悩み。
<br>それは、保育園児の娘・陽音が「超負けず嫌い」なこと！
<br>友達との喧嘩は日常茶飯事、習い事も長続きせず、トラブル続きの毎日……。
<br>そんなある日、陽音が出会ったのは亡き妻そっくりの女性が営む将棋教室「将棋の王国」で…?
<br>
<br>泣き虫父×負けず嫌い娘が歩む！
<br>ハートフル将棋教室ライフ、開幕!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | LINT | All 5 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://public.ynjn.jp/.../20260727185247_003.webp` (image/jpeg, 451192 bytes, 840x1200; server Content-Type: application/octet-stream) |  |  |  |
