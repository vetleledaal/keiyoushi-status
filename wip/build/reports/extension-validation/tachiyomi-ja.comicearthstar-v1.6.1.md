# Extension Validation Report

- Extension: tachiyomi-ja.comicearthstar-v1.6.1
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
- Source ID: 3574188328700228273
- Source name: Comic Earth Star
- Source language: ja
- Selected manga input: popular offset 0: 幽閉された王女ですが、生きのびるために努力していたら強くなりすぎてました～レベリング好きゲーマーの異世界無双～ (`.../12207421984241510720`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 259 | 幽閉された王女ですが、生きのびるために努力していたら強くなりすぎてました～レベリング好きゲーマーの異世界無双～ (`.../12207421984241510720`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 259 | 偽典・演義～社畜、三國志の世で成り上がる～ (`.../12207421984250943216`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 幽閉された王女ですが、生きのびるために努力していたら強くなりすぎてました～レベリング好きゲーマーの異世界無双～ (`.../12207421984241510720`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 幽閉された王女ですが、生きのびるために努力していたら強くなりすぎてました～レベリング好きゲーマーの異世界無双～ (`.../12207421984241510720`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 第1話 (`.../12207421984241515846`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| popular listing | PASS | 259 entries |  |  |  |
| latest listing | PASS | 259 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=幽閉された王女ですが、生きのびるために努力していたら強くなりすぎてました～レベリング好きゲーマーの異世界無双～, URL=`12207421984241510720` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 519/519 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 519/519 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-earthstar.com/.../12207421984241510720-cefac0b3929ddf3be913e6e1fdde9bf6 <redacted query values: 1790836881>` (image/jpeg, 31322 bytes, 311x176) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984241510720` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-earthstar.com/.../12207421984241510720-cefac0b3929ddf3be913e6e1fdde9bf6 <redacted query values: 1790836881>` |  |  |  |
| details author | PASS | 漫画：MEGUMI/原作：とーわ.../%E3%82%AD%E3%83%A3%E3%83%A9%E3%82%AF%E3%82%BF%E3%83%BC%E5%8E%9F%E6%A1%88%EF%BC%9A%E3%82%8A%E3%81%A3%E3%81%8F%E3%81%99 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 前世でやりこんだこのゲームの世界、幼い王女の体で自由に無双します！王族のみ人生に1度だけ召喚の儀式で神器が得られるフォルラント王国。10歳の王女アシュリナは自分の神器召喚儀式の直前に、前世の記憶を思い出した。自分はこの世界をゲームとして知ってるし、とてもやりこんでいたのだ。「ガチャ単発で当たりを引けって無茶すぎない…？」。そして、アシュリナが召喚したのはレアリティ★１の木刀。誰もが落胆する中、アシュリナは辺境の古城に幽閉されてしまう。まるでそんな王族など最初からいなかったかのように……。しかし、彼女だけは前世の知識で知っていた。この木刀、熟練度をあげていくと化けるという事を……！自分を捨てた王家に復讐するべく、わずか10歳の少女は前世の知識と努力と根性で伝説の剣士に変身し仲間と共に無双する！爽快剣劇ファンタジー、開幕！！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comic-earthstar.com/.../12207421984313262012-60f0f585bb3f9b4b7339acefec112b7b` (image/jpeg, 603113 bytes, 1351x1920) |  |  |  |
