# Extension Validation Report

- Extension: tachiyomi-ja.cmoa-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 28
- Lint: 1
- Warnings: 1
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1222039348961733003
- Source name: C'moA
- Source language: ja
- Selected manga input: popular offset 0: 【単話】婚約者の王子に毒を盛られたので愛が冷めました (`.../370648`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 200 | 【単話】婚約者の王子に毒を盛られたので愛が冷めました (`.../370648`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 90 | お見合い相手はもじゃもじゃニート (`.../321436`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 90 | 【電子版】ドラゴンエイジ (`.../223973`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 【単話】婚約者の王子に毒を盛られたので愛が冷めました (`.../370648`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 【単話】婚約者の王子に毒を盛られたので愛が冷めました (`.../370648`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 5 | NEW【第1話】 (`.../sample <redacted query values: title_id and content_id>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView and purchase this product to read. | 1-10s |

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
| popular listing | PASS | 200 entries |  |  |  |
| latest listing | PASS | 90 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=【単話】婚約者の王子に毒を盛られたので愛が冷めました, URL=`370648` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 381/381 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 381/381 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cmoa.akamaized.net/.../100003706480005.jpg` (image/jpeg, 24073 bytes, 180x256) |  |  |  |
| details identity | PASS | Details preserved selected URL `370648` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cmoa.akamaized.net/.../100003706480001.jpg` (image/jpeg, 24011 bytes, 180x256) |  |  |  |
| details author | PASS | 保志レンジ, あさづきゆう |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 少女マンガ, 恋愛, 広告掲載中, 先行作品, 恋愛, 広告掲載中, 先行作品 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 第二王子の成人と共に王太子が決まる大事な時期に、婚約者である第一王子から「少しの間、自由が欲しい」と言われて困惑した。あと二ヶ月しかないのに、ルエラが教育や社交などを放棄してしまえば、王太子には第二王子が選ばれることになる。そう説明しようとしたが、口の中が痺れてきた。何かがおかしいと思ったが、目の前が突然真っ暗になった。目を開ければ、そこは自分の部屋だった。どうやら王家の秘毒を飲まされたようだ。婚約者に毒を盛られたことで気持ちが一気に冷めた。しかも毒の副作用なのか、体に痺れが残っていた。毒の後遺症が残り、婚約は白紙に戻された。療養のため領地に戻ることに。その途中に行き倒れている魔術師を拾った。この魔術師は侯爵家に雇われていて、ルエラは彼の治療を受けることになった。一方で、罪悪感なく自由を満喫した第一王子とその側近たちには厳しい現実が待ち構えていた。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | LINT | All 5 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this product to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
