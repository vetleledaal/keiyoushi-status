# Extension Validation Report

- Extension: tachiyomi-ja.comicryu-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 1496675570830588004
- Source name: Comic Ryu
- Source language: ja
- Selected manga input: popular offset 0: とうがらしドラゴンのシン 飼育員レージの観察日記 (`.../125f266207721`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | とうがらしドラゴンのシン 飼育員レージの観察日記 (`.../125f266207721`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | たぬきはたぬき (`.../5b6a997274f7e`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | ヒトミ先生の保健室 (`.../e92448d696cc0`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | とうがらしドラゴンのシン 飼育員レージの観察日記 (`.../125f266207721`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | とうがらしドラゴンのシン 飼育員レージの観察日記 (`.../125f266207721`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | 第1話 (`.../15b4bb6e23094`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=とうがらしドラゴンのシン 飼育員レージの観察日記, URL=`125f266207721` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../2026090719165215670C173CBB57DC84A8E5D833A069E60E0-lg.webp` (image/webp (encoding: lossy), 48222 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `125f266207721` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../2026090719165215670C173CBB57DC84A8E5D833A069E60E0.png` (image/png, 4011062 bytes, 2560x1344) |  |  |  |
| details author | PASS | 3:59 |  |  |  |
| details artist | PASS | 3:59 |  |  |  |
| details genres | PASS | ファンタジー, 人間ドラマ, 青年マンガ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ――ドラゴンは、空想の生き物のはずだった。<br>ユニコーンやスライム、カッパまで飼育する“空想生物専門動物園”。そんな世界で発見されたのは、ドラゴンと人間の特徴をあわせ持つ、たった一体しかいないのではと言われている半竜のシンだった。唐辛子のような角を持ち、見た目は幼く見えるが実年齢は100歳以上とも言われている。<br>性別は気分次第。嬉しいと卵まで産んでしまうという、規格外の存在。その飼育担当に任命されたのは、ゴーヤに似た髪型の新人飼育員・レージ。子どもの頃からドラゴンに憧れてきた彼にとって夢の配属――のはずが、現実は甘くなかった!? 引っかかれる、噛みつかれる、服を破られるの三連コンボ。気難しい半竜に振り回される日々に疲れ、ついに担当変更を考え始める。しかしその言葉を聞いた瞬間、無表情だったシンがまさかの大暴れ!? 実は、孤独に生きてきたシンは、レージにだけは特別な感情を抱いていて……。言葉を話せない半竜と、不器用な新人飼育員。すれ違いと勘違い、そして卵騒動（!?）を交えながら、ふたりは少しずつ距離を縮めていく。笑えて、ちょっと切なくて、ちゃんと愛おしい。半竜の不思議な生態とともに描かれる、コミカルで心あたたまる異世界飼育コメディ！<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.comic-ryu.jp/.../master-1789541595285-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 8, 9, 0, 14, 13, 6, 7, 3, 15, 2, 5, 1, 12, 10, 11\]` (image/jpeg, 379622 bytes, 844x1200) |  |  |  |
