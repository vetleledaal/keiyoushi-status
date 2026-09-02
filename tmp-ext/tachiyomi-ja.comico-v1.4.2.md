# Extension Validation Report

- Extension: tachiyomi-ja.comico-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4991718230921189832
- Source name: コミコ
- Source language: ja
- Selected manga input: popular offset 0: クズには薬より復讐を (`.../11647`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | クズには薬より復讐を (`.../11647`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 25 | カモフラージュ夫婦 (`.../8910`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 25 | クズには薬より復讐を (`.../11647`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 25 | 夫の不倫相手が私だった (`.../13659`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | クズには薬より復讐を (`.../11647`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | クズには薬より復讐を (`.../11647`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 68 | 第1話 死んでもらったらどうかな？ (`.../product`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 69 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=クズには薬より復讐を, URL=`.../11647` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.comico.io/.../optimize` (image/jpeg, 88401 bytes, 512x728) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../11647` |  |  |  |
| details thumbnail URL | PASS | `https://images.comico.io/.../optimize` |  |  |  |
| details author | PASS | 雪村こはる, ましき |  |  |  |
| details artist | PASS | 竹野筍, ましき |  |  |  |
| details genres | PASS | ドラマ, ミステリー, Original, Exclusive |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | クズに効く"薬"は無い――治療法は"復讐"だけ。<br><br>看護師・黒川千鶴（くろかわ ちづる）は、医師・小野ミノル（おの みのる）との子どもができたことを機に、地元で高名な病院を経営する小野家に嫁ぐ。<br>幸せな新生活を送れると思っていた矢先、千鶴の子が死産してしまい、状況は一変。<br>義父母と夫は千鶴に冷たく当たるようになり、家事を押し付けられ、セクハラを受け、挙句の果てには夫から「再婚するから離婚しろ」と告げられてしまう。<br>しかもその再婚相手は、高校時代に千鶴を虐めていた因縁の女・永田萌奈（ながた もな）だった。<br><br>さらに千鶴は、死産の原因が小野家と萌奈の用意した堕胎薬だったという真実を知る。<br>愛する子どもの命を奪われた千鶴は、絶望を怒りに変えて復讐を誓う――。<br><br>「私を陥れたあなた達に地獄を見せてあげるわ――…！」<br><br>『完璧ワイフによる完璧な復讐計画』の原作者・雪村こはると、『どうか私より不幸でいて下さい』のましき×竹野筍の作画タッグで贈る、全方位リベンジストーリー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 68 chapters |  |  |  |
| chapter dates | PASS | 68 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 69 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://images.comico.io/.../optimize <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/jpeg, 256297 bytes, 800x2000) |  |  |  |
