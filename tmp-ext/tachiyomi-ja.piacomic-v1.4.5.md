# Extension Validation Report

- Extension: tachiyomi-ja.piacomic-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2932724617903419016
- Source name: PiaComic
- Source language: ja
- Selected manga input: popular offset 0: 私のお尻のメッセー痔 (`.../e8d5d0d785ed3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 13 | 私のお尻のメッセー痔 (`.../e8d5d0d785ed3`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 13 | イケオジ王弟殿下との白い結婚～君を愛するつもりはないと言った旦那様が過保護に溺愛してきます～ (`.../17bc083b6615d`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 私のお尻のメッセー痔 (`.../e8d5d0d785ed3`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 私のお尻のメッセー痔 (`.../e8d5d0d785ed3`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 10 | 第1章　Di革命 外Di核　の変 （１） (`.../2f0e868e189ad`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=私のお尻のメッセー痔, URL=`.../e8d5d0d785ed3` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 27/27 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 27/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../2026051515254096484CF77C9BEC6842C9D5E4BC6F6F60DE1-lg.webp` (image/webp (encoding: lossy), 26616 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../e8d5d0d785ed3` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../2026051515254096484CF77C9BEC6842C9D5E4BC6F6F60DE1.png` (image/png, 2103150 bytes, 2560x1344) |  |  |  |
| details author | PASS | ヴェルヘルムⅢ世 |  |  |  |
| details artist | PASS | ヴェルヘルムⅢ世 |  |  |  |
| details genres | PASS | 一般マンガ, 人間ドラマ, エッセイ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Diに革命を！Diにもっと市民権を！！（ ※Di＝痔 ）<br>SNS発！　痔主によるコミックエッセイ、笑撃の書籍化！<br><br>日本人の3人に1人は痔を患っているといいます。著者（30代女性）も痔主のひとり。<br>ある日、気づいたときには時すでに遅し。瀕死寸前の状態になるほどの痛みになり、鏡に映して目にしたのは<br>プチトマト大となったそれであった……。<br><br>それから四年の月日が流れ、また感じるお尻の違和感。飛び出したそれは日に日に中へと戻らなくなり、<br>ついに病院へ行き、手術をすることに。ここからさらに長くつらい日々が始まるのであった。<br><br>著者の闘病物語のほか、痔にまつわるQ＆Aや中国で痔になった友人の物語の書き下ろしを加えた、読み応えのある200ページ。<br>痛～いけど、笑えちゃう痔の世界を覗いてみませんか。痛みの逃避から生まれた痔にまつわる短歌も必読です！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.piacomic.jp/.../master-1777610528661-01_q95.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 7, 11, 9, 6, 1, 2, 0, 4, 5, 3, 14, 8, 13, 12, 10\]` (image/jpeg, 213659 bytes, 1353x1920) |  |  |  |
