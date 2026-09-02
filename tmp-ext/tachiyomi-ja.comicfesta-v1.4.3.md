# Extension Validation Report

- Extension: tachiyomi-ja.comicfesta-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8029218690220992872
- Source name: Comic Festa
- Source language: ja
- Selected manga input: popular offset 0: 女余りの世界で、S級魔法少女達に種をまく【フルカラー】 (`.../252130`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 女余りの世界で、S級魔法少女達に種をまく【フルカラー】 (`.../252130`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | 姫さま、最後の夜にくちづけを（単話版） (`.../252746`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | 女たちの事件簿Vol.63～嫌いな嫁vs邪魔な姑～ (`.../254645`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | でかつよ彼氏の本気性交 妄想以上の執着ピストンでイキ狂わされてます（単話版） (`.../253601`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 女余りの世界で、S級魔法少女達に種をまく【フルカラー】 (`.../252130`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 女余りの世界で、S級魔法少女達に種をまく【フルカラー】 (`.../252130`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | 女余りの世界で、S級魔法少女達に種をまく【フルカラー】1巻 (`.../trial_download`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=女余りの世界で、S級魔法少女達に種をまく【フルカラー】, URL=`252130` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 141/141 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 141/141 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comic-image.iowl.jp/.../V1248144_large.jpg` (image/jpeg, 92587 bytes, 254x359) |  |  |  |
| details identity | PASS | Details preserved selected URL `252130` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://comic-image.iowl.jp/.../252130_large.jpg` (image/jpeg, 93263 bytes, 249x360) |  |  |  |
| details author | PASS | koromura, いぶろー｡ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | カラー, ファンタジー, 先行配信, 特殊能力, 働く女子 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ブラック企業勤めで正月休みでも出勤することになった瀬田睦月は、通勤途中周囲に女性しかいないことに違和感を覚える。電車内では周囲の女性たちからジッと見つめられ、さらには女性から痴漢被害に遭ってしまう。助けてくれた女性警官に連れられ事情聴取を受けるが、なぜか極端に丁重な扱いを受ける。街中では男児の誕生が号外ニュースとして報じられており…!?まるで「男が少なすぎる世界」に転移したのか…と考えた矢先、突如として目の前に異形の怪物が現れて…!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://comic-viewer.iowl.jp/.../diazepam_hybrid.php <redacted query values: mode, file, reqtype, and param>` (image/jpeg, 318439 bytes, 850x1200) |  |  |  |
