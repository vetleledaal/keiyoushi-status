# Extension Validation Report

- Extension: tachiyomi-ja.mangabang-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6323380629311776595
- Source name: MangaBang Comics
- Source language: ja
- Selected manga input: popular offset 0: 異世界クラス召喚されたらＲ1○のスキルを獲得したので、○りたい放題させてもらいます！ (`.../c262a7daf6b6a`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 異世界クラス召喚されたらＲ1○のスキルを獲得したので、○りたい放題させてもらいます！ (`.../c262a7daf6b6a`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | ミリモス・サーガ—末弟王子の転生戦記 (`.../18904544ed988`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | 後宮の鬼 (`.../9cae02040d057`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 異世界クラス召喚されたらＲ1○のスキルを獲得したので、○りたい放題させてもらいます！ (`.../c262a7daf6b6a`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 異世界クラス召喚されたらＲ1○のスキルを獲得したので、○りたい放題させてもらいます！ (`.../c262a7daf6b6a`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 96 | 異世界クラス転移 (1) (`.../2fb114530f9d8`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=異世界クラス召喚されたらＲ1○のスキルを獲得したので、○りたい放題させてもらいます！, URL=`.../c262a7daf6b6a` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202604170941432204DB2CA4F3EBAF8521C2C30150C0EBF83-sm.webp` (image/webp (encoding: lossy), 15160 bytes, 320x168) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../c262a7daf6b6a` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202604170941432204DB2CA4F3EBAF8521C2C30150C0EBF83.png` (image/png, 4486202 bytes, 2560x1344) |  |  |  |
| details author | PASS | 仁堂ジョー, ひろのあきとみ |  |  |  |
| details artist | PASS | 仁堂ジョー, ひろのあきとみ |  |  |  |
| details genres | PASS | バトル・アクション, ファンタジー, 女の子が可愛い, 異世界・転生, 設定が面白い, ハーレム, 幼馴染 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 魔王の侵略に抵抗するため異世界に召喚された主人公が授かったスキル【世界の変容（R18）】。それは対象を『攻略』することでスキルをコピーし、起点となるポイントまで何度でも時を遡ることもできるSSRの超有能スキル！<br>「対象を『攻略』…？『R18』…? これってつまりギャルゲー!? しかもエロいやつ…！」<br>魔王に対抗するため、大義名分のもと主人公が次々と女の子を攻略していく王道ハーレムファンタジー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 96 chapters |  |  |  |
| chapter dates | PASS | 96 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://comicsviewer.manga-bang.com/.../master-1717480791374-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 6, 12, 2, 5, 0, 13, 10, 1, 14, 15, 3, 8, 7, 9, 4\]` (image/jpeg, 260246 bytes, 874x1231) |  |  |  |
