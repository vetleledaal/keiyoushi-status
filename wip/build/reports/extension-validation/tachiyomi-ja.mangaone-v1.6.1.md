# Extension Validation Report

- Extension: tachiyomi-ja.mangaone-v1.6.1
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
- Source ID: 7948822981386785924
- Source name: Manga One
- Source language: ja
- Selected manga input: popular offset 0: ブルーウルスス (`.../26821`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 313 | ブルーウルスス (`.../26821`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | ブルーウルスス (`.../26821`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ブルーウルスス (`.../26821`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ブルーウルスス (`.../26821`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 45 | 第1話 - 獄門女子高等学校 (`.../286378`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | <1s |

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
| popular listing | PASS | 313 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ブルーウルスス, URL=`26821` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 334/334 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 334/334 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://app.manga-one.com/.../6424.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 28232 bytes, 640x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `26821` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | サンドロビッチ・ヤバ子,土井那羽 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 喧嘩上等ッ！ 不良女子たちが集まる―獄門女子高校。 そんな荒れた不良校に入学してきたのは、身長180cm超えのデカい女子・天木星奈（あまきせいな）。 彼女はその規格外の体格から繰り出すプロレス技で、不良たちを次々とねじ伏せていく！ しかもその喧嘩の様子を、動画サイトにアップし続けていて……？ 不良たちに喧嘩を売りながら、彼女が追い求める“ある目的”とはーー！？ 『ケンガン』シリーズ、『一勝千金』『ダンベル何キロ持てる？』などを手がけたヒットメーカー・サンドロビッチ・ヤバ子原作。 作画は、実力派の超新星・土井那羽！ 不良×プロレス×SNSで織りなす、異色のヤンキー・エンタメ、堂々開幕ッッ！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 45 chapters |  |  |  |
| chapter dates | PASS | 45 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://app.manga-one.com/.../1.webp.enc <redacted query values: hash and expires>` (image/webp (encoding: lossy), 116150 bytes, 720x1020; server Content-Type: application/octet-stream) |  |  |  |
