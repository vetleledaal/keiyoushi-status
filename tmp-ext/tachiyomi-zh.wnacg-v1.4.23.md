# Extension Validation Report

- Extension: tachiyomi-zh.wnacg-v1.4.23
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6551136894818591762
- Source name: 紳士漫畫
- Source language: zh
- Selected manga input: popular offset 0: [甘噛本舗 (まんの)] 二次元オタクの俺が転校してきた巨乳アイドルに堕とされるまで [白杨汉化组] [DL版] (`.../photos-index-aid-381235.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | [甘噛本舗 (まんの)] 二次元オタクの俺が転校してきた巨乳アイドルに堕とされるまで [白杨汉化组] [DL版] (`.../photos-index-aid-381235.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | [wakamaker (ワカメさん)] あなたの種回収します5｜您的種子（精液）將由我回收5 [中国翻訳] [DL版] (`.../photos-index-aid-381433.html`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | [さくらんぼ農園 (童夢)] 皇帝の指南役 弐 -ゆるふわ宮女の甘やかし子作り搾精- [中国翻訳] (`.../photos-index-aid-381907.html`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | [Sistny&Anasis] NPCゲームをプレイする夫婦 病院編 完全版 (`.../photos-index-aid-381876.html`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | [甘噛本舗 (まんの)] 二次元オタクの俺が転校してきた巨乳アイドルに堕とされるまで [白杨汉化组] [DL版] (`.../photos-index-aid-381235.html`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [甘噛本舗 (まんの)] 二次元オタクの俺が転校してきた巨乳アイドルに堕とされるまで [白杨汉化组] [DL版] (`.../photos-index-aid-381235.html`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Ch. 1 (`.../photos-index-aid-381235.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 60 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[甘噛本舗 (まんの)\] 二次元オタクの俺が転校してきた巨乳アイドルに堕とされるまで \[白杨汉化组\] \[DL版\], URL=`.../photos-index-aid-381235.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://t4.wnacgimg.date/.../17880861840568702.webp` (image/webp (encoding: lossy), 24730 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../photos-index-aid-381235.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `http://t4.wnacgimg.date/.../17880861840568702.webp` (image/webp (encoding: lossy), 24730 bytes, 300x400) |  |  |  |
| details author | PASS | 飞鸟 |  |  |  |
| details artist | PASS | 飞鸟 |  |  |  |
| details genres | PASS | まんの, 阿嘿顏, 大乳暈, 大屁股, 巨乳, 口交, 舔陰, 坐臉, 辣妹, 接吻, 中出, 美甲, 制服, 雙馬尾, 長髮, 甘噛本舗 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 簡介： |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://img5.wnimg1.ru/.../0001.webp` (image/webp (encoding: lossy), 561686 bytes, 2508x3541) |  |  |  |
