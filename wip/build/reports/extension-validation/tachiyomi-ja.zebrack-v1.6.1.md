# Extension Validation Report

- Extension: tachiyomi-ja.zebrack-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1426538841423697673
- Source name: Zebrack
- Source language: ja
- Selected manga input: latest offset 0: 未来で冷遇妃になるはずなのに、なんだか様子がおかしいのですが… (`.../67725`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 200 | 監禁王 (`.../107576`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 7 | 未来で冷遇妃になるはずなのに、なんだか様子がおかしいのですが… (`.../67725`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 未来で冷遇妃になるはずなのに、なんだか様子がおかしいのですが… (`.../67725`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 未来で冷遇妃になるはずなのに、なんだか様子がおかしいのですが… (`.../67725`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 71 | 🔒 (Preview) Volume - 1 (`.../202530`) |  | <1s |
| pages | `getPageList(chapter)` | success | 46 |  |  | <1s |

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
| popular listing | PASS | 200 entries |  |  |  |
| latest listing | PASS | 7 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=未来で冷遇妃になるはずなのに、なんだか様子がおかしいのですが…, URL=`67725` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 2 manga entries: title=週刊少年ジャンプ, URL=`1`, title=ヤングジャンプ, URL=`4` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 208/208 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 208/208 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://asset.zebrack-comic.com/.../3019342.jpg <redacted query values: drm_key and expires>` (image/jpeg, 61343 bytes, 422x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `67725` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 狭山ひびき, 貴里みち, 珠梨やすゆき |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女性, 恋愛, 異世界・勇者・転生, 水曜日はまったりダッシュエックスコミック |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 家族から疎まれて育ったグリドール国の第二王女ローズはある日、夢を見た。豪華客船プリンセス・レア号への乗船。そして、姉のレアの失踪をきっかけに自分が姉の身代わりとして、マルタン大国の王太子ラファエルに差し出され、冷遇妃になる夢だ。数日後、ローズは父の命令で仕方なく豪華客船プリンセス・レア号に乗る。夢で見た内容と同じことにおびえるローズ。しかし、なんとか不遇な未来を回避しようと行動していたら、夢とは異なり、ラファエルに気に入られて――!?　予知夢から始まる、じれ甘溺愛ラブストーリー、開幕!!<br><br>Publisher/Label: 集英社 マーガレットコミックスDIGITAL  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name |  |  |  |
| chapters | PASS | 71 chapters |  |  |  |
| chapter dates | LINT | 67 of 71 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=67 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://asset.zebrack-comic.com/.../92363902.jpg <redacted query values: drm_key and expires>` (image/jpeg, 408406 bytes, 1440x2048) |  |  |  |
