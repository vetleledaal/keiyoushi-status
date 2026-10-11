# Extension Validation Report

- Extension: tachiyomi-ja.rawotaku-v1.6.5
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
- Source theme: mangareader
- Source ID: 7370546749583817262
- Source name: Raw Otaku
- Source language: ja
- Selected manga input: popular offset 0: カラダにイイ男 (`.../%E3%82%AB%E3%83%A9%E3%83%80%E3%81%AB%E3%82%A4%E3%82%A4%E7%94%B7-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 35 | カラダにイイ男 (`.../%E3%82%AB%E3%83%A9%E3%83%80%E3%81%AB%E3%82%A4%E3%82%A4%E7%94%B7-raw`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 35 | 鬼畜英雄 (`.../%E9%AC%BC%E7%95%9C%E8%8B%B1%E9%9B%84-raw`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 35 | いきもにあっく! (`.../%E3%81%84%E3%81%8D%E3%82%82%E3%81%AB%E3%81%82%E3%81%A3%E3%81%8F-raw`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 35 | 完璧すぎて可愛げがないと婚約破棄された聖女は隣国に売られる (`.../%E5%AE%8C%E7%92%A7%E3%81%99%E3%81%8E%E3%81%A6%E5%8F%AF%E6%84%9B%E3%81%92%E3%81%8C%E3%81%AA%E3%81%84%E3%81%A8%E5%A9%9A%E7%B4%84%E7%A0%B4%E6%A3%84%E3%81%95%E3%82%8C%E3%81%9F%E8%81%96%E5%A5%B3%E3%81%AF%E9%9A%A3%E5%9B%BD%E3%81%AB%E5%A3%B2%E3%82%89%E3%82%8C%E3%82%8B-raw`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | カラダにイイ男 (`.../%E3%82%AB%E3%83%A9%E3%83%80%E3%81%AB%E3%82%A4%E3%82%A4%E7%94%B7-raw`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | カラダにイイ男 (`.../%E3%82%AB%E3%83%A9%E3%83%80%E3%81%AB%E3%82%A4%E3%82%A4%E7%94%B7-raw`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 74 | 第1話: カラダにイイ男 (Raw – Free) 【第1話】 (`.../chapter-1-raw`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

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
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=カラダにイイ男, URL=`.../%E3%82%AB%E3%83%A9%E3%83%80%E3%81%AB%E3%82%A4%E3%82%A4%E7%94%B7-raw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mgoimg.view47.com/.../7043f59e49f5a604ae38c1c3c1f792dd.jpeg` (image/jpeg, 22272 bytes, 300x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E3%82%AB%E3%83%A9%E3%83%80%E3%81%AB%E3%82%A4%E3%82%A4%E7%94%B7-raw` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://mgoimg.view47.com/.../7043f59e49f5a604ae38c1c3c1f792dd.jpeg` was not downloaded |  |  |  |
| details author | PASS | WS, YUKIO |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ラブストーリー, 広告掲載中, お色気, フルカラー |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | カラダにイイ男 raw,カラダにイイ男 zip,カラダにイイ男 manga この男に触ると、絶対にキモチ良くなる。そっと触れただけでも。それ以上だと、更に。パッとしなかった平凡な男が、ある日偶然の事故により、世界中の男がウラヤマシがる「カラダ」を手に入れてしまった…―。<br><br>Alternative Title: (カラダにイイ男 Raw) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 74 chapters |  |  |  |
| chapter dates | LINT | All 74 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=74 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://sv1.freeimgmg.online/.../1.webp` (image/webp (encoding: lossy), 43180 bytes, 720x2462) |  |  |  |
