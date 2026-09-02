# Extension Validation Report

- Extension: tachiyomi-ja.ebookjapan-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 124967435702149192
- Source name: eBookJapan
- Source language: ja
- Selected manga input: popular offset 0: 軍人婿さんと大根嫁さん (`.../812300`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 軍人婿さんと大根嫁さん (`.../812300`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | 追放悪役令嬢の旦那様 (`.../622632`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | ヤングジャンプ (`.../449502`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | Weekly Capsule ENTAME (`.../992307`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 軍人婿さんと大根嫁さん (`.../812300`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 軍人婿さんと大根嫁さん (`.../812300`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 10 | 軍人婿さんと大根嫁さん　１巻 (`.../B00164871771`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 127 |  |  | 1-10s |

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
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=軍人婿さんと大根嫁さん, URL=`812300` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=軍人婿さんと大根嫁さん, URL=`812300` at page 1 offsets 0, 29, 31, 44, 45, 47, 48 and page 2 offset 8, title=ブチ切れ令嬢は報復を誓いました。, URL=`745095` at page 1 offset 1 and page 2 offset 44, title=没落伯爵令嬢は家族を養いたい@COMIC, URL=`809504` at page 1 offset 2 and page 2 offset 49, title=契約婚した相手が鬼宰相でしたが、この度宰相室専任補佐官に任命された地味文官（変装中）は私です。, URL=`897693` at page 1 offsets 6, 9, 10 and page 2 offset 41, title=悪役令嬢になんかなりません。私は『普通』の公爵令嬢です！　～New Route！～, URL=`894039` at page 1 offset 11 and page 2 offset 35, title=私を好きすぎる勇者様を利用して、今世こそ長生きするつもりだったのに（多分、また失敗した）【単行本】, URL=`709762` at page 1 offset 16 and page 2 offset 31, title=捕虜英雄～捨て駒にされた剣奴は敵国で成り上がる～, URL=`937915` at page 1 offset 24 and page 2 offset 13, title=S級ギルドを離脱した刀鍛冶の自由な辺境スローライフ～ブラックギルドから解放されて気ままに鍛冶してたら、伝説の魔刀が生まれていました～, URL=`916478` at page 1 offset 25 and page 2 offset 4, title=断罪された負け組令嬢ですが、時間を戻せるようになったので今度こそ幸せになります, URL=`873746` at page 1 offset 34 and page 2 offset 28, title=地味薬師令嬢はもう契約更新いたしません。　ざまぁ？　没落？　私には関係ないことです, URL=`938158` at page 1 offset 41 and page 2 offset 7 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 16 manga entries; Popular page 2 repeats 1 manga entry: title=婚約破棄された無表情令嬢が幸せになるまで～勤務先の天然たらし騎士団長様がとろっとろに甘やかして溺愛してくるのですが！？～, URL=`885815`; Latest page 1 repeats 6 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cache2-ebookjapan.akamaized.net/.../Z2100527877061.jpg <redacted query values: 1788165599000>` (image/jpeg, 358122 bytes, 842x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `812300` |  |  |  |
| details thumbnail URL | PASS | `https://cache2-ebookjapan.akamaized.net/.../Z2100527877061.jpg <redacted query values: 1788165599000>` |  |  |  |
| details author | PASS | コマkoma |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋愛, ラブコメ, 日常, 時代物, 夫婦 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【電子特典5Pコミック付】ある日、農家の娘・花の自宅を訪ねてきた軍服姿の青年・誉。彼は今日が祝言の日だと聞いてやって来たという…。SNS・同人誌でも話題沸騰、そちらに未収録のお話も多数掲載＆全ページカラー掲載！<br><br>Publisher: 芳文社 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 127 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://prod-contents-br-page.akamaized.net/.../e6305f26b817af2d699109d4bdec6f74aa59a210837e85b9fbe500be05cfb2de.webp` (image/webp (encoding: lossy), 1227944 bytes, 1350x1920) |  |  |  |
