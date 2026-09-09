# Extension Validation Report

- Extension: tachiyomi-ja.comirela-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 58641447023846824
- Source name: Comirela
- Source language: ja
- Selected manga input: popular offset 0: 愛されない地味才女なので、気ままな辺境暮らしを楽しみます～離婚予定の契約妻のはずが、旦那様の様子がおかしい～ (`.../aae11dd9ab43b`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 愛されない地味才女なので、気ままな辺境暮らしを楽しみます～離婚予定の契約妻のはずが、旦那様の様子がおかしい～ (`.../aae11dd9ab43b`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 14 | 転生悪役幼女は最恐パパの愛娘になりました (`.../fbc8c40967e8c`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 愛されない地味才女なので、気ままな辺境暮らしを楽しみます～離婚予定の契約妻のはずが、旦那様の様子がおかしい～ (`.../aae11dd9ab43b`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 愛されない地味才女なので、気ままな辺境暮らしを楽しみます～離婚予定の契約妻のはずが、旦那様の様子がおかしい～ (`.../aae11dd9ab43b`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 1 (`.../a4023b901360c`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=愛されない地味才女なので、気ままな辺境暮らしを楽しみます～離婚予定の契約妻のはずが、旦那様の様子がおかしい～, URL=`.../aae11dd9ab43b` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202608031045216158FB4414049280843F188705DA8921ED2-lg.webp` (image/webp (encoding: lossy), 51242 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../aae11dd9ab43b` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202608031045216158FB4414049280843F188705DA8921ED2.png` (image/png, 4817093 bytes, 2560x1344) |  |  |  |
| details author | PASS | 三鼓とわ, 瀬尾優梨 |  |  |  |
| details artist | PASS | 三鼓とわ, 瀬尾優梨 |  |  |  |
| details genres | PASS | Berry's Fantasy, ファンタジー, 女性マンガ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 病弱な妹の世話をしながら、実家の経営も支える男爵令嬢・マティルダは、自分勝手な両親に搾取され忙しい毎日を送っているうちに、気が付けば結婚が難しい年齢に差し掛かっていた。そんなある日、妹に連れ添って参加した夜会で、欠員が出た朗読劇に飛び入り参加することに！ 読書好きが功を奏して何とか乗り切ったマティルダだったけれど、それを見ていた若き辺境伯・カーティスに演技力を買われ契約結婚を申し込まれてしまい…!? <br>「もし私が契約妻として想定以上の働きを見せれば、追加報酬もいただけますか？」<br>利害一致の契約結婚…のはずが、旦那様の様子がおかしい!? <br>働き者の地味才女×恋に無頓着な若き辺境伯の焦れ甘ラブファンタジー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.comirela.com/.../master-1788336151500-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 2, 14, 7, 9, 1, 10, 12, 4, 5, 3, 15, 0, 11, 8, 13\]` (image/jpeg, 434906 bytes, 1055x1500) |  |  |  |
