# Extension Validation Report

- Extension: tachiyomi-ja.ebookjapan-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 28
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 124967435702149192
- Source name: eBookJapan
- Source language: ja
- Selected manga input: latest offset 0: ヤングジャンプ (`.../449502`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | 女の園の星 (`.../595634`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | クラス召喚に巻き込まれた教師、外れスキルで機械少女を修理する (`.../689277`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | ヤングジャンプ (`.../449502`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | 捨てられた王女の秘密の寝室　【単話版】 (`.../866168`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 50 | キングダム (`.../132898`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ヤングジャンプ (`.../449502`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 12 | 🔒 ヤングジャンプ 2026 No.41 (`.../B00167053123`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=ヤングジャンプ, URL=`449502` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=女の園の星, URL=`595634` at page 1 offset 0 and page 2 offset 40, title=あなたのお城の小人さん　～御飯下さい、働きますっ～（コミック）, URL=`854921` at page 1 offsets 1, 15, 16, 18, 23 and page 2 offset 27, title=ドローイング　最強漫画家はお絵描きスキルで異世界無双する！, URL=`681532` at page 1 offset 3 and page 2 offsets 7, 10, 15, 17, 19, 28, 33, 44, 47, title=悪役令嬢たちは揺るがない, URL=`877211` at page 1 offsets 6, 30 and page 2 offset 2, title=暁の魔女レイシーは自由に生きたい（ガルドコミックス）, URL=`863121` at page 1 offset 10 and page 2 offset 41, title=ウィズレイン王国物語 　～竜が花嫁～（ガルドコミックス）, URL=`904490` at page 1 offset 12 and page 2 offset 13, title=傭兵団の料理番, URL=`844534` at page 1 offset 13 and page 2 offsets 8, 23, 25, title=貧乏騎士に嫁入りしたはずが!? 野人令嬢は皇太子妃になっても竜を狩りたい（コミック）, URL=`860843` at page 1 offset 20 and page 2 offset 1, title=没落伯爵令嬢は家族を養いたい@COMIC, URL=`809504` at page 1 offset 27 and page 2 offset 5, title=リピート・ヴァイス～悪役貴族は死にたくないので四天王になるのをやめました～, URL=`920320` at page 1 offset 33 and page 2 offset 9, title=私の心はおじさんである（コミック）, URL=`854738` at page 1 offset 36 and page 2 offsets 22, 29 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=捨てられた王女の秘密の寝室　【単話版】, URL=`866168` at page 1 offset 49 and page 2 offsets 0, 1 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 11 manga entries; Popular page 2 repeats 15 manga entries; Latest page 1 repeats 3 manga entries; Latest page 2 repeats 1 manga entry: title=捨てられた王女の秘密の寝室　【単話版】, URL=`866168` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 250/250 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 250/250 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cache2-ebookjapan.akamaized.net/.../X3100532888961.jpg <redacted query values: 1788943925000>` (image/jpeg, 617826 bytes, 850x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `449502` |  |  |  |
| details thumbnail URL | PASS | `https://cache2-ebookjapan.akamaized.net/.../X3100532888961.jpg <redacted query values: 1788943925000>` |  |  |  |
| details author | PASS | ヤングジャンプ編集部 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【本号のデジタル版には特別付録「『ダイヤモンドの功罪』指導陣フルネーム＆ダイヤモンドの思い出ステッカー」は収録されておりません。あらかじめご了承ください。】※デジタル版ヤングジャンプは、紙版の同号より未掲載のコンテンツがございます。試し読みファイルのデジタル版目次や注意書きをご確認の上ご購入ください。／「ヤングジャンプ 2026 No.41」、紙と同時に配信！／【表紙＆巻頭グラビア】姫野ひなの（#Mooove!）／【次世代ヒロイン発掘企画!! YJブルーム】橋本ゆめあ／【新連載＆巻頭カラー】『サラマンダ』（中山敦支）／【センターカラー】『BUNGO-unreal-』（二宮裕次）、『4軍くん（仮）』（原作：森高夕次　漫画：末広光）／【センターグラビア】沖玲萌（α＋）／【巻末グラビア】宮崎想乃（※「崎」は「たつさき」が正式表記）／ほか、18作品を掲載！<br><br>Publisher: 集英社 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 404 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
