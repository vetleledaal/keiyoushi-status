# Extension Validation Report

- Extension: tachiyomi-ja.ganganonline-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 2
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1467355738916791140
- Source name: Gangan Online
- Source language: ja
- Selected manga input: popular offset 0: 家から逃げ出したい私が、うっかり憧れの大魔法使い様を買ってしまったら (`.../1321`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 287 | 家から逃げ出したい私が、うっかり憧れの大魔法使い様を買ってしまったら (`.../1321`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 家から逃げ出したい私が、うっかり憧れの大魔法使い様を買ってしまったら (`.../1321`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 家から逃げ出したい私が、うっかり憧れの大魔法使い様を買ってしまったら (`.../1321`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | 第1話-1 - 出会いと呼ぶにはお粗末な (`.../52966`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

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
| popular listing | PASS | 287 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=家から逃げ出したい私が、うっかり憧れの大魔法使い様を買ってしまったら, URL=`.../1321` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 288/288 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 288/288 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.ganganonline.com/.../400014.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 21268 bytes, 540x338) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1321` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.ganganonline.com/.../400011.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 89472 bytes, 1080x675) |  |  |  |
| details author | PASS | 原作／琴子　原作イラスト／TCB　漫画／鷹来タラ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 妹の身代わりに変態侯爵に嫁がされることを知ったジゼルは、家から逃げ出す計画のため、男手を買おうと奴隷市場を訪れる。しかし、うっかり買ったのは、不遜な美少年・エルヴィスだった…!<br>「自分の呪いを解いてほしい」という彼の願いにジゼルは協力することに。すると、だんだん彼の身と心に不思議な変化が表れ始める…。<br>(あれ、エル、急に身長伸びてない? 心なしか距離も近すぎるような…?)<br>大人気異世界恋愛小説をコミック化!<br>これは、いずれ「最愛」に至るふたりの、恋のお話。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | LINT | 3 of 5 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.ganganonline.com/.../1112455.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 71968 bytes, 960x1365) |  |  |  |
