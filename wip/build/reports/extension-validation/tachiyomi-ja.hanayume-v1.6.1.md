# Extension Validation Report

- Extension: tachiyomi-ja.hanayume-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 6820605856874807465
- Source name: Hana To Yume+
- Source language: ja
- Selected manga input: popular offset 0: Ｓ・Ａ(スペシャル・エー) (`.../1f9f5b0d4cd52`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | Ｓ・Ａ(スペシャル・エー) (`.../1f9f5b0d4cd52`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | おそらくカノジョは俺の兄貴を狙ってる (`.../7918b4de0a0ac`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | LoveD50／よみきり (`.../ce171c0188296`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ｓ・Ａ(スペシャル・エー) (`.../1f9f5b0d4cd52`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ｓ・Ａ(スペシャル・エー) (`.../1f9f5b0d4cd52`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 296 | 第1話 (`.../8c6f15923caa0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ｓ・Ａ(スペシャル・エー), URL=`1f9f5b0d4cd52` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20261002130511398EDBDA1160124ABE6B50FDBE0DD512292-lg.webp` (image/webp (encoding: lossy), 45500 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `1f9f5b0d4cd52` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20261002130511398EDBDA1160124ABE6B50FDBE0DD512292.png` (image/png, 4333706 bytes, 2560x1344) |  |  |  |
| details author | PASS | 南マキ |  |  |  |
| details artist | PASS | 南マキ |  |  |  |
| details genres | PASS | 恋愛・ラブコメ, アニメ化, 花とゆめ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 華園光(はなぞの ひかり)が通う超金持ちエリート校には、S・A(スペシャル・エー)組と呼ばれる成績トップ7名のみの特別クラスがある。光は子供の頃にプロレス勝負で敗れた滝島彗に勝つためだけにSAへ通う努力の女!! 打倒滝島に燃える光の極楽エリート学園ライフ☆ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 296 chapters |  |  |  |
| chapter dates | PASS | 296 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.hanayume.com/.../master-1787913906967-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 13, 6, 0, 12, 10, 5, 15, 7, 4, 8, 1, 9, 2, 14, 11\]` (image/jpeg, 363499 bytes, 960x1540) |  |  |  |
