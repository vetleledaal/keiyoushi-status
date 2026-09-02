# Extension Validation Report

- Extension: tachiyomi-ja.yanmaga-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2126618372106431410
- Source name: ヤンマガ（マンガ）
- Source language: ja
- Selected manga input: latest offset 0: ギフテッド (`.../%E3%82%AE%E3%83%95%E3%83%86%E3%83%83%E3%83%89`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 上野くんは開発済み (`.../%E4%B8%8A%E9%87%8E%E3%81%8F%E3%82%93%E3%81%AF%E9%96%8B%E7%99%BA%E6%B8%88%E3%81%BF`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 108P!~1年後に絶対108Pする話~ (`.../108P1%E5%B9%B4%E5%BE%8C%E3%81%AB%E7%B5%B6%E5%AF%BE108P%E3%81%99%E3%82%8B%E8%A9%B1`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | ギフテッド (`.../%E3%82%AE%E3%83%95%E3%83%86%E3%83%83%E3%83%89`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | 異世界出稼ぎ～年収一兆円を持ち帰る簡単なお仕事 (`.../%E7%95%B0%E4%B8%96%E7%95%8C%E5%87%BA%E7%A8%BC%E3%81%8E%E5%B9%B4%E5%8F%8E%E4%B8%80%E5%85%86%E5%86%86%E3%82%92%E6%8C%81%E3%81%A1%E5%B8%B0%E3%82%8B%E7%B0%A1%E5%8D%98%E3%81%AA%E3%81%8A%E4%BB%95%E4%BA%8B`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ギフテッド (`.../%E3%82%AE%E3%83%95%E3%83%86%E3%83%83%E3%83%89`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 177 | #52　きょうだい(4) (`.../c12766ed6cd4ddec89b67f7f13aa2d12`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: このストーリーを読むには WebView でログイン | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: このストーリーを読むには WebView でログイン | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://eh96lnrmau.user-space.cdn.idcfcloud.net/.../1481.jpg <redacted query values: auto and width>` (image/jpeg, 23526 bytes, 400x210) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E3%82%AE%E3%83%95%E3%83%86%E3%83%83%E3%83%89` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://eh96lnrmau.user-space.cdn.idcfcloud.net/.../1481.jpg <redacted query values: auto and width>` (image/jpeg, 60083 bytes, 750x394) |  |  |  |
| details author | PASS | 天樹征丸, 雨宮理真 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | #ヒューマンドラマ, #裏社会, #ミステリー・サスペンス, #友情, #刑事 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 『金田一少年の事件簿』天樹征丸新作！　天才警察官と自負する天草は、難解な事件の犯人を事もなげに当てられる高校生・四鬼に出会う。彼には、ある不思議な能力が備わっていて……⁉　頭脳×第六感、二つの才能（ギフト）を巡る王道バディ・ミステリー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 177 chapters |  |  |  |
| chapter dates | PASS | 177 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | このストーリーを読むには WebView でログイン |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
