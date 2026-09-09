# Extension Validation Report

- Extension: tachiyomi-zh.comicabc-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8110122805257580230
- Source name: 無限動漫
- Source language: zh
- Selected manga input: popular offset 0: 狂賭之淵 (`.../10818.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 48 | 狂賭之淵 (`.../10818.html`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 41 | 威鳴神斗 (`.../25451.html`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 48 | 魔教戰線飛龍十三隊 (`.../28329.html`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 48 | 飼育寶石 (`.../30108.html`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 5 | 狂賭之淵 (`.../10818.html`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 狂賭之淵 (`.../10818.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 135 | 1話 (`https://articles.onemoreplace.tw/.../new-10818.html <redacted query values: ch>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 83 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=狂賭之淵, URL=`.../10818.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 190/190 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 190/190 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.8comic.com/.../10818.jpg` (image/jpeg, 119968 bytes, 240x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../10818.html` |  |  |  |
| details thumbnail URL | PASS | `https://www.8comic.com/.../10818.jpg` |  |  |  |
| details author | PASS | 尚村透,河村ほむら |  |  |  |
| details artist | PASS | 尚村透,河村ほむら |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 　　私立百花王學園,一所以培養學生戰術策略,讀心術及關機時刻掌握勝負能力-即賭博能力為重的學校.而在這階級森嚴的學校,出現了轉學第一天就讓班里強者大敗的學生! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 135 chapters |  |  |  |
| chapter dates | LINT | All 135 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=135 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 135 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 83 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img7.8comic.com/.../001_maR.jpg` (image/jpeg, 178568 bytes, 900x1319) |  |  |  |
