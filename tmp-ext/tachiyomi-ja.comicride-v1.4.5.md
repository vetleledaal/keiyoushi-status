# Extension Validation Report

- Extension: tachiyomi-ja.comicride-v1.4.5
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
- Source ID: 6786869574657969795
- Source name: Comic Ride
- Source language: ja
- Selected manga input: popular offset 0: 婚約破棄ですか？はい喜んで。だって僕は姉の代わりですから！ (`.../097120d9ced8c`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 婚約破棄ですか？はい喜んで。だって僕は姉の代わりですから！ (`.../097120d9ced8c`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 9 | 暴食のベルセルク～俺だけレベルという概念を突破する～ (`.../f77308354d149`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 婚約破棄ですか？はい喜んで。だって僕は姉の代わりですから！ (`.../097120d9ced8c`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 婚約破棄ですか？はい喜んで。だって僕は姉の代わりですから！ (`.../097120d9ced8c`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 23 | 第1話 (`.../369ac5b7ed470`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 34 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 9 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=婚約破棄ですか？はい喜んで。だって僕は姉の代わりですから！, URL=`.../097120d9ced8c` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20251202213721719CDF12E92F7AA02157B0A2D216C0044F2-lg.webp` (image/webp (encoding: lossy), 38070 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../097120d9ced8c` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20251202213721719CDF12E92F7AA02157B0A2D216C0044F2.png` (image/png, 3331447 bytes, 2560x1344) |  |  |  |
| details author | PASS | 林倉吉, ル―シャオ |  |  |  |
| details artist | PASS | 林倉吉, ル―シャオ |  |  |  |
| details genres | PASS | コミックライドアイビー, ラブコメ, 令嬢 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | タランティオン侯爵令嬢メラニーは、婚約者のドミニクから突き付けられた婚約破棄を涼しい顔で受け入れた。<br>なぜなら、彼女はメラニーに扮していた双子の弟メルヴィン・ローゼス・タランティオンだったのだから。<br>無事、婚約を破棄して実家に戻ったメルヴィンだったが、祖父の企みにより再びメラニーの身代わりに！<br>次なる婚約者は、ハドリアーナ王国の第一王子リュカ・ハドリアーナ。<br>少し軟派な彼だが、なにやら秘密がありそうで――。<br>訳あり王子×訳あり令嬢、秘密が繋ぐ協同婚約ラブコメディ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | PASS | 23 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 34 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.comicride.jp/.../master-1765525653846-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 10, 1, 11, 2, 12, 8, 4, 3, 5, 15, 6, 7, 13, 14, 9\]` (image/jpeg, 499312 bytes, 1440x2048) |  |  |  |
