# Extension Validation Report

- Extension: tachiyomi-ja.kimicomi-v1.4.6
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
- Source ID: 645302785022492537
- Source name: KimiComi
- Source language: ja
- Selected manga input: latest offset 0: 仲間を強くするため支援に徹していた中年冒険者、追放され自分だけの最強ギルドを作る　～【シェアリング】スキルでステータスは思いのまま！　恩恵に気づいたってもう遅い！～ (`.../2be0f53a95922`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 爆弾魔な傭兵、同時召喚された最強チート共を片っ端から消し飛ばす (`.../1ad6d00e44d7d`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 15 | 仲間を強くするため支援に徹していた中年冒険者、追放され自分だけの最強ギルドを作る　～【シェアリング】スキルでステータスは思いのまま！　恩恵に気づいたってもう遅い！～ (`.../2be0f53a95922`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 仲間を強くするため支援に徹していた中年冒険者、追放され自分だけの最強ギルドを作る　～【シェアリング】スキルでステータスは思いのまま！　恩恵に気づいたってもう遅い！～ (`.../2be0f53a95922`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 仲間を強くするため支援に徹していた中年冒険者、追放され自分だけの最強ギルドを作る　～【シェアリング】スキルでステータスは思いのまま！　恩恵に気づいたってもう遅い！～ (`.../2be0f53a95922`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | 第1話 (`.../1cdec931714ce`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 47 |  |  | 1-10s |

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
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=仲間を強くするため支援に徹していた中年冒険者、追放され自分だけの最強ギルドを作る　～【シェアリング】スキルでステータスは思いのまま！　恩恵に気づいたってもう遅い！～, URL=`.../2be0f53a95922` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20250722133824729369B0CB79BE492FCEC3AF3FF57A82088-sm.webp` (image/webp (encoding: lossy), 16704 bytes, 320x168) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2be0f53a95922` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20250722133824729369B0CB79BE492FCEC3AF3FF57A82088.png` (image/png, 5270545 bytes, 2560x1344) |  |  |  |
| details author | PASS | 深谷飛鳥, 日之影ソラ |  |  |  |
| details artist | PASS | 深谷飛鳥, 日之影ソラ |  |  |  |
| details genres | PASS | コミックヴァルキリー, バトル・アクション, ファンタジー・SF, 異世界・転生 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | とあるギルドのサポート役で加入していた中年冒険者のライカ。<br>しかし、ギルドの若手メンバーたちから、<br>おっさんのサポートなんてもう必要ないと、<br>一方的にギルドから追放されてしまう。<br><br>彼らが急激に強くなったのは<br>ライカのスキル【シェアリング】による経験値分配で<br>レベルアップをしていたため。<br><br>説得も虚しく、暴言まで吐かれたライカは諦めてその場を去る。<br>これまで彼らに貸していた経験値を回収して──。<br><br>そして、ギルドを追放されたライカは思わぬ再会を果たし<br>新たな冒険へ出る！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.kimicomi.com/.../master-1753160000367-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 3, 4, 1, 12, 6, 13, 11, 7, 8, 10, 5, 9, 15, 14, 2\]` (image/jpeg, 969054 bytes, 1350x1920) |  |  |  |
