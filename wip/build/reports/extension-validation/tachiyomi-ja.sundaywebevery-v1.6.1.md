# Extension Validation Report

- Extension: tachiyomi-ja.sundaywebevery-v1.6.1
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
- Source ID: 8083066303045184316
- Source name: Sunday Web Every
- Source language: ja
- Selected manga input: popular offset 0: 初恋あるごりずむ (`.../12207421984125843553`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 290 | 初恋あるごりずむ (`.../12207421984125843553`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 290 | のざらしちゃん (`.../12207421984004727511`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 初恋あるごりずむ (`.../12207421984125843553`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 初恋あるごりずむ (`.../12207421984125843553`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | 第1話 雨宮さんは話さない (`.../12207421984125927743`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| popular listing | PASS | 290 entries |  |  |  |
| latest listing | PASS | 290 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=初恋あるごりずむ, URL=`12207421984125843553` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 581/581 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 581/581 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.www.sunday-webry.com/.../12207421984125843553-e2056d029b6217ecd61c405b6685b6f1 <redacted query values: 1787197012>` (image/png, 665866 bytes, 1125x654) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984125843553` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.www.sunday-webry.com/.../12207421984125843553-e2056d029b6217ecd61c405b6685b6f1 <redacted query values: 1787197012>` |  |  |  |
| details author | PASS | 城奈 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 生粋の研究好きが集う理系進学校・晶陽科学技術高等学校。得意科目が文系の夏目行人は、場違い感に戸惑いながらも高校生活をスタートさせる。<br>そこで出会ったのは、ロボットを介してしか話さない少し変わった天才美少女・雨宮凜と、明るく奔放に見えて実はまじめな理系ギャル・九条りお。<br>「やりたいこと」を見つけるため、凜の研究を手伝うことを決意した行人は、廃部だったデジタル研究部の復活させる。なぜかりおも入部することになり……。<br><br>理系だらけの学校で始まる、ひとつの目標とふたつの恋。 理屈じゃ解けない青春ラブコメディ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.www.sunday-webry.com/.../12207421984129893307-0dd7002a230d0ec7ef8df3e89b7a1b1f` (image/jpeg, 761667 bytes, 1445x2048) |  |  |  |
