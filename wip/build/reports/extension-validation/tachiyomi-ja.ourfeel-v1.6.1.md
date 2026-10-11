# Extension Validation Report

- Extension: tachiyomi-ja.ourfeel-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: たぶんここから始まる恋 (`.../2550912965383551848`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 41 | たぶんここから始まる恋 (`.../2550912965383551848`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 41 | 魔王様、結婚です！ (`.../12207421983410343818`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | たぶんここから始まる恋 (`.../2550912965383551848`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | たぶんここから始まる恋 (`.../2550912965383551848`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 22 | 第1話 (`.../2550912965383552567`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 41 entries |  |  |  |
| latest listing | PASS | 41 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=たぶんここから始まる恋, URL=`2550912965383551848` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.ourfeel.jp/.../2550912965383551848-6845131bfe8af97cc41a2699ecbc3da8 <redacted query values: 1775634141>` (image/jpeg, 951063 bytes, 1232x1232) |  |  |  |
| details identity | PASS | Details preserved selected URL `2550912965383551848` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.ourfeel.jp/.../2550912965383551848-6845131bfe8af97cc41a2699ecbc3da8 <redacted query values: 1775634141>` |  |  |  |
| details author | PASS | ねむようこ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 【毎月第3木曜更新！最新2話無料!!】「不倫する奴マジで理解不能」本気でそう思っている塾講師の三塩遼介。ある夜、遼介は消え入りそうに一人泣いていた女性を居酒屋で助けた。後日、塾で再会した彼女は、生徒の保護者だった――。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | PASS | 22 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.ourfeel.jp/.../2550912965863140240-de8d5b9fa0fb82e2ffd117bef95eeb0e` (image/jpeg, 474744 bytes, 1699x2400) |  |  |  |
