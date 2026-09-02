# Extension Validation Report

- Extension: tachiyomi-ja.ichicomi-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2248461957459826404
- Source name: Ichicomi
- Source language: ja
- Selected manga input: popular offset 0: 怪異の掃除人・曽根崎慎司の事件ファイル (`.../2551460909457698946`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 771 | 怪異の掃除人・曽根崎慎司の事件ファイル (`.../2551460909457698946`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 怪異の掃除人・曽根崎慎司の事件ファイル (`.../2551460909457698946`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 怪異の掃除人・曽根崎慎司の事件ファイル (`.../2551460909457698946`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 10 | case.01 (`.../2551460909457698946`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 40 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 771 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=怪異の掃除人・曽根崎慎司の事件ファイル, URL=`.../2551460909457698946` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 772/772 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 772/772 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.ichicomi.com%2Fpublic%2Fseries-sub-thumbnail-vertical-with-logo%2F2551460909457693288-066377d04ddf8bb9814e013ce78b7cef%3F1755761184` (image/jpeg, 72734 bytes, 480x700) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2551460909457698946` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.ichicomi.com%2Fpublic%2Fseries-thumbnail%2F2551460909457693288-775fa21c51ae8df2c18346502a6ca5e4%3F1755761176` (image/jpeg, 108379 bytes, 480x700) |  |  |  |
| details author | PASS | 八橋はち.../%E9%95%B7%E5%9F%9C%E6%81%B5 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 名状しがたいオカルト事件　這い寄る■■はすぐそこにある　怪しげな男、曽根崎 慎司は、警察では手に余る名状しがたい怪事件を請け負う「怪異の掃除人」そんな彼のもとでアルバイトをする竹田 景清も、不可解な事件に巻き込まれていく　信じていた世界が覆るような、冒涜的な狂気に触れた先には何がある――　這い寄る怪異にあらがうコズミックホラーサスペンス、開幕　©八橋はち／一迅社／長埜恵／宝島社 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-img.ichicomi.com/.../2551460909509519233-c2f522938b032ea20f53d9270d3b465a` (image/jpeg, 814754 bytes, 2185x3037) |  |  |  |
