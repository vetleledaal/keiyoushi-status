# Extension Validation Report

- Extension: tachiyomi-ja.rawotaku-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source theme: mangareader
- Source ID: 7370546749583817262
- Source name: Raw Otaku
- Source language: ja
- Selected manga input: popular offset 0: カラダにイイ男 (`.../%E3%82%AB%E3%83%A9%E3%83%80%E3%81%AB%E3%82%A4%E3%82%A4%E7%94%B7-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 35 | カラダにイイ男 (`.../%E3%82%AB%E3%83%A9%E3%83%80%E3%81%AB%E3%82%A4%E3%82%A4%E7%94%B7-raw`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 35 | 彼岸島 48日後… (`.../%E5%BD%BC%E5%B2%B8%E5%B3%B6-48%E6%97%A5%E5%BE%8C%E2%80%A6-raw`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 35 | せっかく農家に転生したので勇者は目指しません (`.../%E3%81%9B%E3%81%A3%E3%81%8B%E3%81%8F%E8%BE%B2%E5%AE%B6%E3%81%AB%E8%BB%A2%E7%94%9F%E3%81%97%E3%81%9F%E3%81%AE%E3%81%A7%E5%8B%87%E8%80%85%E3%81%AF%E7%9B%AE%E6%8C%87%E3%81%97%E3%81%BE%E3%81%9B%E3%82%93-raw`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 35 | 今夜は夜雀の屋台で (`.../%E4%BB%8A%E5%A4%9C%E3%81%AF%E5%A4%9C%E9%9B%80%E3%81%AE%E5%B1%8B%E5%8F%B0%E3%81%A7-raw`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | カラダにイイ男 (`.../%E3%82%AB%E3%83%A9%E3%83%80%E3%81%AB%E3%82%A4%E3%82%A4%E7%94%B7-raw`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | カラダにイイ男 (`.../%E3%82%AB%E3%83%A9%E3%83%80%E3%81%AB%E3%82%A4%E3%82%A4%E7%94%B7-raw`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 74 | 第1話: カラダにイイ男 (Raw – Free) 【第1話】 (`.../chapter-1-raw`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 38 |  |  | 1-10s |

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
| thumbnail | PASS | `https://mgoimg.view47.com/.../7043f59e49f5a604ae38c1c3c1f792dd.jpeg` (image/jpeg, 13801 bytes, 220x311) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E3%82%AB%E3%83%A9%E3%83%80%E3%81%AB%E3%82%A4%E3%82%A4%E7%94%B7-raw` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mgoimg.view47.com/.../7043f59e49f5a604ae38c1c3c1f792dd.jpeg` (image/jpeg, 22272 bytes, 300x425) |  |  |  |
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
