# Extension Validation Report

- Extension: tachiyomi-ja.zebrack-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1426538841423697673
- Source name: Zebrack
- Source language: ja
- Selected manga input: latest offset 0: 岩元先輩ノ推薦 (`.../6287`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 200 | キングダム (`.../146`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 11 | 岩元先輩ノ推薦 (`.../6287`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 岩元先輩ノ推薦 (`.../6287`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 岩元先輩ノ推薦 (`.../6287`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 146 | 🔒 (Preview) Volume - 【ゼブラック限定デジタル特典付き】 1 (`.../32549`) |  | <1s |
| pages | `getPageList(chapter)` | success | 63 |  |  | <1s |

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
| popular listing | PASS | 200 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=岩元先輩ノ推薦, URL=`6287` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 2 manga entries: title=週刊少年ジャンプ, URL=`1`, title=魔人探偵脳噛ネウロ モノクロ版, URL=`3` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 212/212 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 212/212 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://asset.zebrack-comic.com/.../618390.jpg <redacted query values: drm_key and expires>` (image/jpeg, 53749 bytes, 422x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `6287` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 椎橋寛 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 青年, バトル・アクション, アニメ化, ウルトラジャンプ, 歴史・時代物, 曜日連載 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 一九一〇年代。陸軍直属・栖鳳中学に通う岩元胡堂は、軍の訓令により、全国各地の超常現象を調査していた。“黒い雪”が降ると噂される村で、出会った特殊な力を持つ少年…。能力を病気だと思いこむ少年に、使い途を示した岩元は自分との共通点を告げ、彼に学園の推薦状を差し出す――。訪れた任務先で、岩元を待ち受ける様々な怪奇（であい）。彼らの時代を解き明かす、浪漫奇譚開幕!!<br><br>Publisher/Label: 集英社 ヤングジャンプコミックスDIGITAL  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 146 chapters |  |  |  |
| chapter dates | LINT | 131 of 146 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=131 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 63 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://asset.zebrack-comic.com/.../25897978.jpg <redacted query values: drm_key and expires>` (image/jpeg, 171135 bytes, 844x1200) |  |  |  |
