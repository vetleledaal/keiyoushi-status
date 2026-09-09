# Extension Validation Report

- Extension: tachiyomi-zh.wnacg-v1.4.23
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 35
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
- Selected manga input: latest offset 0: [ぶちやまメロンピーチ (ぶちやまぶちお)] 長乳エルフは断れない [DL版] [春桑汉化组汉化] (`.../photos-index-aid-383728.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | [ドデカビタミン (あきすこ)] 顔と身体はイイ女 ギャンカス×金欠×巨乳の先輩に色々絞り取られる話｜美貌與身材兼備的極品女 我被嗜賭×窮困×巨乳的學姐在各方面搾取的故事 [中文] [無修正] (`.../photos-index-aid-383041.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | [KANIKORO] うちのバイトのクールでHカップのでか乳ちゃんは弱者男性ともーっとヤリたいんだって！ [中国翻訳] (`.../photos-index-aid-383001.html`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | [ぶちやまメロンピーチ (ぶちやまぶちお)] 長乳エルフは断れない [DL版] [春桑汉化组汉化] (`.../photos-index-aid-383728.html`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | (C108) [piccione!!] 悟りの教示者 (ゼンレスゾーンゼロ) [黎欧出资汉化] (`.../photos-index-aid-383690.html`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | [ぶちやまメロンピーチ (ぶちやまぶちお)] 長乳エルフは断れない [DL版] [春桑汉化组汉化] (`.../photos-index-aid-383728.html`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [ぶちやまメロンピーチ (ぶちやまぶちお)] 長乳エルフは断れない [DL版] [春桑汉化组汉化] (`.../photos-index-aid-383728.html`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Ch. 1 (`.../photos-index-aid-383728.html`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 46 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[ぶちやまメロンピーチ (ぶちやまぶちお)\] 長乳エルフは断れない \[DL版\] \[春桑汉化组汉化\], URL=`.../photos-index-aid-383728.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://t4.wnacgimg.date/.../17889566310253922.webp` (image/webp (container: extended), 19368 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../photos-index-aid-383728.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `http://t4.wnacgimg.date/.../17889566310253922.webp` (image/webp (container: extended), 19368 bytes, 300x400) |  |  |  |
| details author | PASS | .miku.*.*0.0 |  |  |  |
| details artist | PASS | .miku.*.*0.0 |  |  |  |
| details genres | PASS | 长乳, 精灵, ぶちやまメロンピーチ, ぶちやまぶちお, 阿嘿顏, 豐滿, 大乳暈, 大屁股, 巨乳, 性勒索, 精靈, 多毛, 乳頭內陷, 中出, 避孕套, 醉酒 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 簡介： |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://img5.wnimg1.ru/.../0001.webp` (image/webp (container: extended), 537986 bytes, 2560x3559) |  |  |  |
