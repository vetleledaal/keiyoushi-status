# Extension Validation Report

- Extension: tachiyomi-ja.sundaywebevery-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: オニあに！ (`.../12207421984374793742`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 294 | オニあに！ (`.../12207421984374793742`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 294 | Honey Creep (`.../12207421984447616877`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | オニあに！ (`.../12207421984374793742`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | オニあに！ (`.../12207421984374793742`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | 第1話 オニくる！ (`.../12207421984374812911`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 294 entries |  |  |  |
| latest listing | PASS | 294 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=オニあに！, URL=`12207421984374793742` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 589/589 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 589/589 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.www.sunday-webry.com/.../12207421984374793742-8c4ce16688f25d01b3e4d1087ffa8cbc <redacted query values: 1791884070>` (image/png, 815273 bytes, 1125x654) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984374793742` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.www.sunday-webry.com/.../12207421984374793742-8c4ce16688f25d01b3e4d1087ffa8cbc <redacted query values: 1791884070>` |  |  |  |
| details author | PASS | スズキハルカ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | スタジオめたも！は、人手不足で地獄の様なスケジュールに苦しむ小さな小さなアニメ制作会社。<br><br>遂に限界を迎えそうになったある日、スタジオめたも！に新しい社員が来ることに。<br>救世主の登場に、胸を膨らませていた、めたも！のメンバーたちだったが、新入社員はなんと「オニ」だった！？<br><br>地獄で生きてきた「オニ」は果たして、スタジオめたも！の救世主になってくれるのか…！？<br><br>新進気鋭のアニメーター・スズキハルカが贈る、ゆるかわ、そして時々鬼畜☆なアニメ制作物語、開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.www.sunday-webry.com/.../12207421984379396981-d4a1c5a9c2d1d8075ce2d809dc765d91` (image/jpeg, 749880 bytes, 1445x2048) |  |  |  |
