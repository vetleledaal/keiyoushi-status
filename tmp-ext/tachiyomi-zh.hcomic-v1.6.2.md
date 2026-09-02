# Extension Validation Report

- Extension: tachiyomi-zh.hcomic-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 984224034780344743
- Source name: H-Comic
- Source language: zh
- Selected manga input: latest offset 0: [モグダン] タツマキっぽい妻 (ワンパンマン) [中国翻訳] (`.../1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | [ゆきうさぎ。] 化け猫セックスライフ (コミックアンリアル 2019年6月号 Vol.79) [中国翻訳] [DL版] (`.../1`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | [ゆきうさぎ。] 化け猫セックスライフ (コミックアンリアル 2019年6月号 Vol.79) [中国翻訳] [DL版] (`.../1`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | [モグダン] タツマキっぽい妻 (ワンパンマン) [中国翻訳] (`.../1`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | [Marcia (東りんご)] Later Talk Encore (天気の子)[中国翻訳] (`.../1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | [モグダン] タツマキっぽい妻 (ワンパンマン) [中国翻訳] (`.../1`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [モグダン] タツマキっぽい妻 (ワンパンマン) [中国翻訳] (`.../1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | [モグダン] タツマキっぽい妻 (ワンパンマン) [中国翻訳] (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 112 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[モグダン\] タツマキっぽい妻 (ワンパンマン) \[中国翻訳\], URL=`.../1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://h-comic.link/.../4154156` (image/webp (encoding: lossy), 37378 bytes, 500x709) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1` |  |  |  |
| details thumbnail URL | PASS | `https://h-comic.link/.../4154156` |  |  |  |
| details author | PASS | モグダン |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 巨乳, 純愛（女）, 黑絲 / 白襪, 眼鏡控, 啊嘿顏 / 高潮臉, 黑肉, 性玩具, NTR, 大雞巴, ディルフ, 接吻, 欺詐, 肌肉, bbm, 肥臀, 手淫, 出汗, 胃變形, hidden sex, 飲精, tall man |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **原著：** 一拳超人<br>**角色：** 戰慄的龍捲風<br>**页数：** 112 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 112 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://h-comic.link/.../1` (image/webp (encoding: lossy), 256146 bytes, 1280x1814) |  |  |  |
