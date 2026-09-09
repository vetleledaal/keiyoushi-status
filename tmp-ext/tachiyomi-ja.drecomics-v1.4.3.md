# Extension Validation Report

- Extension: tachiyomi-ja.drecomics-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8766832343449907432
- Source name: DreComi+
- Source language: ja
- Selected manga input: latest offset 0: 汝、暗君を愛せよ (`.../CD00045`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | ブレイド＆バスタード (`.../CD00007`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | 99回断罪されたループ令嬢ですが今世は「超絶愛されモード」ですって!? (`.../CD00001`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | 汝、暗君を愛せよ (`.../CD00045`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | 可愛い死顔に魅せられて (`.../CD20011`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 汝、暗君を愛せよ (`.../CD00045`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 汝、暗君を愛せよ (`.../CD00045`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | 先行試し読み (`.../CD00045-999-000.1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 6 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=汝、暗君を愛せよ, URL=`CD00045` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://cdn.drecomi-plus.jp/.../89fa9ef3d142f8b2.webp` could not be downloaded: java.io.IOException: This service can only be used from Japan. | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `CD00045` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://cdn.drecomi-plus.jp/.../a45790353768bae7.webp` could not be downloaded: java.io.IOException: This service can only be used from Japan. | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | 桂明日香, 本条謙太郎, toi8 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ファンタジー, 王侯・貴族, 戦争, お仕事, 日常, コミカライズ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | お飾り社長の人生に嫌気がさして命を絶った「ぼく」が転生した先は、<br>破滅寸前の国家だった――。<br><br>政治的影響力を持つ妃候補の令嬢たちや<br>自分より明らかに有能な重鎮たちに取り巻かれ、<br>無力な異世界人にできることはあまりに少なく、<br>なんとか“うまくやらなければ”生き残れない。<br><br>それでもなお、「ぼく」は王座に在り続ける。<br>かつて“投げ捨てた”役割を、今度こそ全うするために。<br><br>『このライトノベルがすごい！ 2026』新作単行本・ノベルズ部門1位<br>待望のコミカライズ!!!<br><br>第2・第4金曜日<br><br>更新予定: 2026年10月23日(金) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://cdn.drecomi-plus.jp/.../a0de3df441c51305_0001.webp.enc` could not be downloaded: java.io.IOException: This service can only be used from Japan. | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
