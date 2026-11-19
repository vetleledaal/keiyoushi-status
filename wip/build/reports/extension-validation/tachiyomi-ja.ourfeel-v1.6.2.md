# Extension Validation Report

- Extension: tachiyomi-ja.ourfeel-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 783189652313877732
- Source name: Our Feel
- Source language: ja
- Selected manga input: popular offset 0: 【黒歴史＿消す方法〔検索〕】 (`.../12207421984508996607`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 44 | 【黒歴史＿消す方法〔検索〕】 (`.../12207421984508996607`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 44 | 【黒歴史＿消す方法〔検索〕】 (`.../12207421984508996607`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 【黒歴史＿消す方法〔検索〕】 (`.../12207421984508996607`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 【黒歴史＿消す方法〔検索〕】 (`.../12207421984508996607`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 第1話 (`.../12207421984508998565`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| popular listing | PASS | 44 entries |  |  |  |
| latest listing | PASS | 44 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=【黒歴史＿消す方法〔検索〕】, URL=`12207421984508996607` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.ourfeel.jp/.../12207421984508996607-466a76962d23160366842acc2d46ebdf <redacted query values: 1794380059>` (image/jpeg, 1111968 bytes, 1232x1232) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984508996607` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.ourfeel.jp/.../12207421984508996607-466a76962d23160366842acc2d46ebdf <redacted query values: 1794380059>` |  |  |  |
| details author | PASS | 文京子 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 【毎月第3木曜更新！】「とある理由」から婚活に失敗し続ける主人公・和心。幾度目かの失恋でヤケ酒をした夜、酔った勢いで『黒歴史消します代行』に８万円の課金をしてしまう。翌日、我に返った和心は消費者センターで同じ被害にあった3人の男女と知り合うが…。4人の黒歴史と恋心が複雑に絡み合う！？黒歴史ラブコメディ、開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.ourfeel.jp/.../12207421984531075347-008dc9029cd604360f437433c658ec3b` (image/jpeg, 801194 bytes, 1699x2400) |  |  |  |
