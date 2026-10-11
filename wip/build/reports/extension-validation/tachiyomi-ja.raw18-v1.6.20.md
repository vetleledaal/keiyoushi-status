# Extension Validation Report

- Extension: tachiyomi-ja.raw18-v1.6.20
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: wpcomics
- Source ID: 2238636513447052332
- Source name: Raw18
- Source language: ja
- Selected manga input: popular offset 0: 囚人リク (`.../qiu-ren-riku`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | 囚人リク (`.../qiu-ren-riku`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | ドローイング 最強漫画家はお絵かきスキルで異世界無双する！ (`.../doroingu-zui-qiang-man-hua-jia-haohui-kakisukirudeyi-shi-jie-wu-shuang-suru`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | 捕食者系魔法少女 (`.../bu-shi-zhe-xi-mo-fa-shao-nu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | 魔王軍四天王がかわいすぎて倒せない (`.../mo-wang-jun-si-tian-wang-gakawaisugitedao-senai`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 囚人リク (`.../qiu-ren-riku`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 囚人リク (`.../qiu-ren-riku`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 338 | 第1話 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | <1s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=囚人リク, URL=`.../qiu-ren-riku` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://admin.mangarawad.wiki/.../cover.jpg` (image/jpeg, 80054 bytes, 320x494) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../qiu-ren-riku` |  |  |  |
| details thumbnail URL | PASS | `https://admin.mangarawad.wiki/.../cover.jpg` |  |  |  |
| details author | PASS | 更新中 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | アクション, ドラマ化, アクション・アドベンチャー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 説明 Shujin Riku Raw free 隕石直撃による首都壊滅から10年。近未来都市“東京”のスラム街で貧しくともたくましく生きる栗田陸・13歳が、ある犯罪に巻き込まれ、最果ての監獄へ…!!無実の罪で懲役30年を科せられた少年の破獄バトル!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 338 chapters |  |  |  |
| chapter dates | PASS | 338 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://raw18.icu/.../hot` to `https://raw18.bar/.../hot` (2 redirects); popular: `https://raw18.icu` to `https://raw18.bar` (2 redirects); popular: `https://raw18.icu/.../hot <redacted query values: page>` to `https://raw18.bar/.../hot <redacted query values: page>` (2 redirects); popular: `https://raw18.icu/.../qiu-ren-riku` to `https://raw18.bar/.../qiu-ren-riku` (2 redirects); popular: `https://raw18.icu/.../manga <redacted query values: keyword and page>` to `https://raw18.bar/.../manga <redacted query values: keyword and page>` (2 redirects); popular: `https://raw18.icu/.../chapter-1` to `https://raw18.bar/.../chapter-1` (2 redirects); popular: `https://raw18.icu <redacted query values: page>` to `https://raw18.bar <redacted query values: page>` (2 redirects) |  |  |  |
| page load | PASS | `https://iphotomg.com/.../page_0.jpg` (image/jpeg, 324386 bytes, 981x1600) |  |  |  |
