# Extension Validation Report

- Extension: tachiyomi-ja.comicfesta-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8029218690220992872
- Source name: Comic Festa
- Source language: ja
- Selected manga input: popular offset 0: 女余りの世界で、S級魔法少女達に種をまく【フルカラー】 (`.../252130`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 女余りの世界で、S級魔法少女達に種をまく【フルカラー】 (`.../252130`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | うるわしの宵の月 (`.../137352`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | 人妻風俗はじめました (`.../256584`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | エンジェル・ソウル －脱落アイドルのリスタート－【マイクロ】 (`.../256741`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 女余りの世界で、S級魔法少女達に種をまく【フルカラー】 (`.../252130`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 女余りの世界で、S級魔法少女達に種をまく【フルカラー】 (`.../252130`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | 🔒 女余りの世界で、S級魔法少女達に種をまく【フルカラー】1巻 (`.../download`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.NullPointerException | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
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
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | pages operation did not complete successfully |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://comic.iowl.jp/.../monthly_general <redacted query values: page>` to `https://comic.iowl.jp/.../monthly_general <redacted query values: page and _rsc>` (1 redirects); popular: `https://comic.iowl.jp/.../monthly_general <redacted query values: page>` to `https://comic.iowl.jp/.../monthly_general <redacted query values: page and _rsc>` (1 redirects); popular: `https://comic.iowl.jp/.../download` to `https://comic.iowl.jp/.../entry <redacted query values: dst>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
