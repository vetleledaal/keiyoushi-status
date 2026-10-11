# Extension Validation Report

- Extension: tachiyomi-ja.sugocomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 24
- Lint: 3
- Warnings: 3
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4036523004624942398
- Source name: Sugo Comics
- Source language: ja
- Selected manga input: popular offset 0: おためしCOMICユニコーン (`.../1017646`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 51 | おためしCOMICユニコーン (`.../1017646`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | 完璧な花婿―真実の愛を捧げますか？【タテヨミ】 (`.../1128584`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | 特別全裸保安課(単話) (`.../1156034`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | おためしCOMICユニコーン (`.../1114602`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | おためしCOMICユニコーン (`.../1017646`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | おためしCOMICユニコーン (`.../1017646`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView and purchase this product to read. | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView and purchase this product to read. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 51 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=おためしCOMICユニコーン, URL=`1114602` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 152/152 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 152/152 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://nadeshiko-shoten.jp/.../r-18.png` -> 6 manga URLs (examples: `1154464`, `1156076`, `1156071`) |  |  |  |
| thumbnail | PASS | `https://nadeshiko-shoten.jp/.../27753-129951959-001-001.jpg` (image/jpeg, 10973 bytes, 180x256) |  |  |  |
| details identity | PASS | Details preserved selected URL `1017646` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://nadeshiko-shoten.jp/.../27753-129951959-001-001.png` (image/png, 81439 bytes, 180x256) |  |  |  |
| details author | PASS | 野山歩.../COMIC%E3%83%A6%E3%83%8B%E3%82%B3%E3%83%BC%E3%83%B3%E7%B7%A8%E9%9B%86%E9%83%A8 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少年・青年, 青年コミック |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 異世界系ライトノベルのコミカライズを中心としたレーベル【COMICユニコーン】から、連載作品をピックアップしました。500ページ以上を収録し、13タイトルの第1話が無料で読めます！　 収録作品●『勇者の母ですが、魔王軍の幹部になりました。』野山歩×ツヅル●『勇者の当て馬でしかない悪役貴族に転生した俺』こはるんるん×星川ちどり●『いつかお嬢様になりたい系ダンジョン配信者が本物のお嬢様になるまで』鬼影スパナ×ぱぴぽぱん！●『異世界特捜スカリオン』ドリル汁●『勇者が召喚できません！』藤井ゆずる×春雨ぽんた●『転生声優は異世界すべてを魅了する』榊一郎×じまうそ●『黒猫ニャンゴの冒険リブート　レア属性を引き当てたので、気ままな冒険者を目指します』篠浦知螺×MiyaMa×四志丸●『召喚勇者、魔王になる〜魔王（オレ）は勇者（オレ）に倒されるために魔王軍を作ります〜』森脇かみん×山口陽史●『魅力値マイナスの勇者が美少女モンスターにはモテモテだった件』尾野けぬじ×うめ蔵●『悪役令嬢大戦 〜底辺貴族の俺は貞操観念逆転世界で下剋上する〜』十凪高志×慶優●『天才派遣所の秀才異端児〜天才の能力を全て取り込む、秀才の成り上がり〜』壱弐参×はやさかめばゑ●『異世界⇔地球間で個人貿易してみた』肥前文俊×海老猫道楽●『異世界新選組』青木健生×井之口陽一 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | LINT | All 2 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=2 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this product to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://nadeshiko-shoten.jp/.../list.php <redacted query values: mode and group_id>` to `https://nadeshiko-shoten.jp/.../list.php <redacted query values: back_ref, mode, group_id, and transactionid>` (2 redirects); popular: `https://nadeshiko-shoten.jp/.../reading.php <redacted query values: product_id>` to `https://bs.comicdc.jp/.../index.php <redacted query values: cgi, url, file, read, param, colophon, colophon_size, and v_change>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
