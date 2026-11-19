# Extension Validation Report

- Extension: tachiyomi-ja.bookwalkerjp-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 2
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7753308828123873766
- Source name: BookWalker Japan
- Source language: ja
- Selected manga input: popular offset 0: バトゥーキ（ヤングジャンプコミックスDIGITAL） (`.../188359`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | バトゥーキ（ヤングジャンプコミックスDIGITAL） (`.../188359`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | 魔入りました！入間くん（少年チャンピオン・コミックス） (`.../115382`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 60 | 明治かりそめ夫婦は両片恋 1巻 (`.../dedea61387-35a3-4d47-bcd4-aad8960fce0e`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | 上伊那ぼたん、酔へる姿は百合の花（ヤングチャンピオン・コミックス） (`.../233503`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | バトゥーキ（ヤングジャンプコミックスDIGITAL） (`.../188359`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | バトゥーキ（ヤングジャンプコミックスDIGITAL） (`.../188359`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 18 | 🔒 (Preview) バトゥーキ 1 (`.../575e116e-63e7-4510-96c5-bd5b0a827ed0`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: No preview available, or you need to purchase this volume. | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: No preview available, or you need to purchase this volume. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=バトゥーキ（ヤングジャンプコミックスDIGITAL）, URL=`188359` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 242/242 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 242/242 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c.bookwalker.jp/.../coverImage_3237207.jpg` (image/jpeg, 565341 bytes, 964x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `188359` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://member.bookwalker.jp/.../coverImage_3237207.jpg` (image/jpeg, 565341 bytes, 964x1200) |  |  |  |
| details author | PASS | 迫稔雄 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | ごく普通の家庭に育ちながら、言い知れぬ孤独と束縛感を抱える女子中学生・三條一里（さんじょういちり）。学校帰りのコンビニで強盗に襲われかけた刹那、彼女に摩訶不思議な体験が訪れる――。それは、彼女の出逢いと解放の物語が、幕を開けた瞬間だった。音楽、格闘、ダンス、哲学、宗教…人間の営みのすべてを体現する舞闘技「カポエイラ」に、“漫画の求道者”迫稔雄が漫画表現の粋を集めて挑む、異類の青春バイオレンス大河、開幕。<br><br>Alternative Title: バトゥーキ<br><br>Publisher: 集英社<br><br>Label: ヤングジャンプコミックスDIGITAL<br><br>（C）迫稔雄.../%E9%9B%86%E8%8B%B1%E7%A4%BE |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | LINT | All 18 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=18 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No preview available, or you need to purchase this volume. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://bookwalker.jp/.../188359` to `https://bookwalker.jp/.../list` (1 redirects); popular: `https://bookwalker.jp/.../188359` to `https://bookwalker.jp/.../list` (1 redirects); popular: `https://bookwalker.jp/.../de575e116e-63e7-4510-96c5-bd5b0a827ed0 <redacted query values: sample>` to `https://viewer-trial.bookwalker.jp/.../viewer.html <redacted query values: cid and cty>` (2 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
