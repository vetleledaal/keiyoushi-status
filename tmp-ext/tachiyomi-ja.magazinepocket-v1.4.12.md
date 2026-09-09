# Extension Validation Report

- Extension: tachiyomi-ja.magazinepocket-v1.4.12
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
- Source ID: 583369548372015159
- Source name: Magazine Pocket
- Source language: ja
- Selected manga input: latest offset 0: スノウ (`.../03319`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | シャングリラ・フロンティア～クソゲーハンター、神ゲーに挑まんとす～ (`.../01191`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 25 | アオバノバスケ (`.../01958`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | スノウ (`.../03319`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 45 | 怨霊日和 (`.../03338`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | スノウ (`.../03319`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | スノウ (`.../03319`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 19 | 【第1話】麻酔医ジョン・スノウ (`.../443224`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=スノウ, URL=`.../03319` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 147/147 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 147/147 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mgpk-cdn.magazinepocket.com/.../title_grid_wide_20260731125204748e3ae397e37e6d7b1033ce735e738a.png` (image/png, 49249 bytes, 480x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../03319` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mgpk-cdn.magazinepocket.com/.../banner_202607311252049fef7f2cd9d7ffe3b332e4623ff38147.png` (image/png, 75479 bytes, 640x368) |  |  |  |
| details author | PASS | 吉田優希 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ホラー・ミステリー・サスペンス |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 「常識そのものが誤りだとしたらーー。」170年前のロンドンを襲った未知の疫病。人々は「見えない敵」の正体を、「におい」に求めた。その真の感染源を究明するために、麻酔医ジョン・スノウはロンドンの街を実験場に、ある仮説の証明に挑む。疫学歴史サスペンス！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | PASS | 19 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mgpk-cdn.magazinepocket.com/.../dd8a438349113a4344ee42c61c7128aba272f024fa82e57cc81f5890289c9b15.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 352570 bytes, 1125x1600) |  |  |  |
