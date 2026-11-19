# Extension Validation Report

- Extension: tachiyomi-ja.pixivcomic-v1.6.8
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2937751339618832603
- Source name: Pixivコミック
- Source language: ja
- Selected manga input: popular offset 0: 兄様のライバルに目をつけられたようです (`.../13947`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 兄様のライバルに目をつけられたようです (`.../13947`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | ようこそ和装お嬢様高校へ (`.../13763`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | 兄様のライバルに目をつけられたようです (`.../13947`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 異世界失格 (`.../6465`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | 兄様のライバルに目をつけられたようです (`.../13947`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 兄様のライバルに目をつけられたようです (`.../13947`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | 第1話: (1) (`.../253882`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=兄様のライバルに目をつけられたようです, URL=`13947` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 123/123 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 123/123 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public-img-comic.pximg.net/.../13947.jpg <redacted query values: 20261118181405>` (image/png, 1041228 bytes, 640x860; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `13947` |  |  |  |
| details thumbnail URL | PASS | `https://public-img-comic.pximg.net/.../13947.jpg <redacted query values: 20261118181405>` |  |  |  |
| details author | PASS | 花菱しゅか,名紗すいか,RiG |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋愛, ファンタジー, コミカライズアリッサ, 男爵, 結婚相手, コンプレックス, 完全無欠, 目の敵, ライバル, 騎士, 近衛 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 「彼みたいな人が凡庸な私を口説く理由なんて ひとつしかない―― 兄様への恨みを私で晴らそうというやつだ」 近衛騎士隊長を務める完全無欠の兄を持つ貧乏男爵令嬢アリッサ。 結婚相手も見つからない、しまいには兄との違いに落胆されるような 日々を送っていた彼女はある日、兄の同僚を名乗る騎士セオルドに出会う。 華やかな王子様顔に紳士的で優しい彼に一瞬で心を開いたアリッサは、 その日のうちに食事に誘われ舞い上がっていた。 そう、すっかり忘れていたのだ。兄のことを目の敵にするライバルがいたことなど――。 ひとりの男にコンプレックスを抱えるふたりが出会う“運命の”溺愛ロマンス開幕！！<br><br>Magazine: エンジェライトコミックス |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img-comic.pximg.net/.../1.jpg <redacted query values: 20261109142720>` (image/jpeg, 360455 bytes, 722x1024) |  |  |  |
