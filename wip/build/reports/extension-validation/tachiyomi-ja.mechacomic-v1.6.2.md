# Extension Validation Report

- Extension: tachiyomi-ja.mechacomic-v1.6.2
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
- Source ID: 4109851891728963895
- Source name: Mecha Comic
- Source language: ja
- Selected manga input: popular offset 0: 君たち愛が重すぎる。(話売り) (`.../260545`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | 君たち愛が重すぎる。(話売り) (`.../260545`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | シタ女、サレ妻と入れ替わる～クズ夫に代理で復讐しまーす～ (`.../216317`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | 私の隣のヤバい人～クレクレ女・騒音トラブル・モラ家族～ (`.../299881`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 三人で恋していいですか (`.../300400`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 50 | 君たち愛が重すぎる。(話売り) (`.../260545`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 君たち愛が重すぎる。(話売り) (`.../260545`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 37 | 君たち愛が重すぎる。(話売り) #1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=君たち愛が重すぎる。(話売り), URL=`260545` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 138/138 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 138/138 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c.mechacomic.jp/.../BT000222168300100101900209_001_00_xl.jpg` (image/jpeg, 19368 bytes, 180x258) |  |  |  |
| details identity | PASS | Details preserved selected URL `260545` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://c.mechacomic.jp/.../BT000222168300100101900209_001_00_xl.jpg <redacted query values: 9e02d7ded95c3a2338a48c04f57421deaea0c049568f0a52b49134dee046a6ed>` (image/jpeg, 19368 bytes, 180x258) |  |  |  |
| details author | PASS | 小島美帆子 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少女漫画, 恋愛, 独占·先行, ラブコメ, アラサー, 働く女子, 幼なじみ, 胸キュン, 広告で人気, 続きが気になる |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 結婚も考えていた彼氏が会社の後輩と浮気している現場を目撃してしまい、破局したばかりのOLの叶羽。「もう男はいらない」と決意し、元彼の家の近くに住んでいるのも嫌になり、引っ越しをすることになったけど―――!? 一筋縄じゃいかない、大人の恋模様。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 37 chapters |  |  |  |
| chapter dates | LINT | All 37 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=37 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://c.cnt.mechacomic.jp/.../cover.webp.enc` (image/webp (encoding: lossy), 80056 bytes, 836x1200; server Content-Type: binary/octet-stream) |  |  |  |
