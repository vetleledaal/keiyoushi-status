# Extension Validation Report

- Extension: tachiyomi-ja.pixivcomic-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2937751339618832603
- Source name: Pixivコミック
- Source language: ja
- Selected manga input: popular offset 0: 死に戻り聖女は毒家族と決別する〜未来を変えたら、狂暴王子様の溺愛が待ってました⁉︎〜 (`.../13636`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 死に戻り聖女は毒家族と決別する〜未来を変えたら、狂暴王子様の溺愛が待ってました⁉︎〜 (`.../13636`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | 秦せんせいと梶せんせい (`.../13276`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | 蝶と蘭～漆黒軍人と金色乙女の婚姻～ (`.../13635`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 冴えない無能令嬢のフリ、やめました (`.../12696`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 31 | 死に戻り聖女は毒家族と決別する〜未来を変えたら、狂暴王子様の溺愛が待ってました⁉︎〜 (`.../13636`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 死に戻り聖女は毒家族と決別する〜未来を変えたら、狂暴王子様の溺愛が待ってました⁉︎〜 (`.../13636`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | ＃1（1）: 聖力覚醒（1） (`.../246228`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=死に戻り聖女は毒家族と決別する〜未来を変えたら、狂暴王子様の溺愛が待ってました⁉︎〜, URL=`13636` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public-img-comic.pximg.net/.../13636.jpg <redacted query values: 20260902101442>` (image/jpeg, 591948 bytes, 640x860) |  |  |  |
| details identity | PASS | Details preserved selected URL `13636` |  |  |  |
| details thumbnail URL | PASS | `https://public-img-comic.pximg.net/.../13636.jpg <redacted query values: 20260902101442>` |  |  |  |
| details author | PASS | 原作：江東しろ,漫画：心崎リンウ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ファンタジー, 恋愛公爵家, 聖女, 日常的, 断頭, リア |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 聖女ルーナは、ラリエント公爵家の長女。不吉な白髪で生まれた彼女は、公爵家伝来の聖力にも乏しく不遇の身。妹のシシリアや冷酷な父親は、ルーナを日常的に虐待。挙句の果てに公爵家の汚職を擦り付け、彼女を断頭台へ送ってしまう。死んだはずのルーナだったが、五年前の過去へ転生！ ――しかも覚醒した真の聖力を手に入れて。二度目の人生を生き直すことを決意したルーナの前に現れたのは、王国最恐の王子・アレクシウスで!?<br><br>Magazine: Palcy×pixiv異世界 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img-comic.pximg.net/.../1.jpg <redacted query values: 20260826124642>` (image/jpeg, 197253 bytes, 720x1024) |  |  |  |
