# Extension Validation Report

- Extension: tachiyomi-ja.booklistastudio-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4993360009034397146
- Source name: Booklista Studio
- Source language: ja
- Selected manga input: popular offset 0: 新人魔法使いオルトリア (`.../9d136f1ded923`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | 新人魔法使いオルトリア (`.../9d136f1ded923`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | 悪妃エリーゼは死にました (`.../416d7e1ee5e93`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | 完結 (`.../6970e811ddf0b`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 新人魔法使いオルトリア (`.../9d136f1ded923`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 新人魔法使いオルトリア (`.../9d136f1ded923`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | #1 (`.../e30930317a60d`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=新人魔法使いオルトリア, URL=`.../9d136f1ded923` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../2025012813021594952CFF2E19F6BD003CC17F7422466053C-lg.webp` (image/webp (encoding: lossy), 31222 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../9d136f1ded923` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../2025012813021594952CFF2E19F6BD003CC17F7422466053C.png` (image/png, 3461048 bytes, 2560x1344) |  |  |  |
| details author | PASS | 日之影ソラ, るかな |  |  |  |
| details artist | PASS | 日之影ソラ, るかな |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "伯爵令嬢オルトリアは、婚約者から婚約破棄を告げられた。<br>さらに、妹からは裏切られ、家門からは除名されたが、こんな最悪な状況でも彼女は嘆かない。<br>こうなると予想し、一人で生きるための準備をしていた。<br>生活をするために門を叩いたのは魔法研究所。そこで、王国最強の英雄騎士フレンと出会う。<br>〝オルトリア　俺の下に来てくれないか？〟<br>好意的に接するフレン。しかし、彼がオルトリアに近づいたのには理由があった―――。<br>仕掛けられた出会い。境遇の異なる二人の宿命が交差する、ロマンファンタジー。" |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.studio.booklista.co.jp/.../master-1738037389572-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 9, 11, 3, 13, 12, 6, 15, 5, 4, 7, 1, 0, 10, 8, 14\]` (image/jpeg, 238524 bytes, 760x2560) |  |  |  |
