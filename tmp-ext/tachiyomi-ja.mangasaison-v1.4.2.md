# Extension Validation Report

- Extension: tachiyomi-ja.mangasaison-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 0
- Warnings: 2
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7468001507218227155
- Source name: Manga Saison
- Source language: ja
- Selected manga input: latest offset 0: 青と陽炎　分冊版（１７） (`.../1471490`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | 悪役令嬢たちは揺るがない (`.../1789286`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | 青と陽炎　分冊版（１７） (`.../1471490`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | 大阪マダム、後宮妃になる！（１５） (`.../1092891`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 青と陽炎　分冊版 (`.../1471490`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 17 | 青と陽炎　分冊版（１） (`.../8ef5a74c-c6f1-4496-ab4a-51e767b289d9`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 54 |  |  | 1-10s |

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
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 160/160 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 160/160 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.mechacomi.jp/.../6d2b8b41-99e3-489f-b073-1de508a5ba64.jpg` (image/jpeg, 52346 bytes, 238x338) |  |  |  |
| details identity | UNUSUAL | Details changed selected title 青と陽炎　分冊版（１７） to 青と陽炎　分冊版 |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://image.mechacomi.jp/.../1471490.jpg <redacted query values: ver>` (image/jpeg, 46630 bytes, 238x338) |  |  |  |
| details author | PASS | ドンドン |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女性, BL |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 高校野球部のエースピッチャーである南真琴は、突然彼の前から姿を消した幼なじみ且つ中学時代にバッテリーを組んでいた和谷鷲介のことを忘れられずにいる。「野球さえ続けていれば、またいつか鷲介に会えるはず」、そんな独りよがりな希望を胸に抱き、野球部主将・白鳥北斗とバッテリーを組んで練習に打ち込む毎日だった。しかし高３の春、突然鷲介が真琴の前に姿を現し、「転校してきた」と告げる。 三者三様の想いを胸に、最後の夏が始まる――。<br><br>Alternative Title: アオトカゲロウブンサツバン<br><br>Publisher: 講談社<br><br>Magazine: ハニーミルク |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.distribution.mediadotech.com/.../BT000241795000100101900206_00120260902130124.uze <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 445742 bytes, 1125x1600; server Content-Type: binary/octet-stream) |  |  |  |
