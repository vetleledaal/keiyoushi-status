# Extension Validation Report

- Extension: tachiyomi-ja.firecross-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6276622162610581454
- Source name: FireCross
- Source language: ja
- Selected manga input: popular offset 0: でっかいギャルとちっちゃいギャルが失恋した俺の新居に入り浸っている (`.../634`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | でっかいギャルとちっちゃいギャルが失恋した俺の新居に入り浸っている (`.../634`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 精霊幻想記 ～こんな世界で出会えた君に～ (`.../600`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | でっかいギャルとちっちゃいギャルが失恋した俺の新居に入り浸っている (`.../634`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | でっかいギャルとちっちゃいギャルが失恋した俺の新居に入り浸っている (`.../634`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 第1話 (`.../21040`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=でっかいギャルとちっちゃいギャルが失恋した俺の新居に入り浸っている, URL=`.../634` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://firecross.jp/.../1d535611-9fdb-4239-9c41-dce7079b178a.jpg` (image/jpeg, 111857 bytes, 756x756) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../634` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://firecross.jp/.../e254cfbc-cfff-4f90-bbbd-d91a4a09afee.jpg` (image/jpeg, 101187 bytes, 980x490) |  |  |  |
| details author | PASS | 漫画 森乃こあら, 原作 衣太, キャラクター原案 おりょう |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 学園, ラブコメ, ハーレム, 現代 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 「どうしてこんなことに――！？」 ベッドの中で美少女ギャルふたりに挟まれていた男子高校生・周（めぐる）。 初恋の相手に振られ、傷心の中で一人暮らしを始めた彼の新居に、ギャルコンビ・守里（しゅり）と怜仁（れに）が押し寄せてきた！ 包容力抜群な長身美少女・守里＆ツン強めな小柄美少女・怜仁。 ２人のギャルから距離感ゼロなお世話＆おねだりに、周はどうする！？ 凸凹美少女ギャルふたりとのドキドキ＆美味しい同棲ラブコメ、開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://firecross.jp/.../diazepam_hybrid.php <redacted query values: mode, reqtype, vm, file, and param>` (image/jpeg, 347381 bytes, 1000x1421) |  |  |  |
