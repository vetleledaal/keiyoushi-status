# Extension Validation Report

- Extension: tachiyomi-ja.mangazegra-v1.4.5
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
- Source ID: 1066937743995646358
- Source name: Manga Zegra
- Source language: ja
- Selected manga input: popular offset 0: 追放された転生貴族、外れスキルで内政無双～気ままに領地運営するはずが、スキル『ガチャ』のお陰で最強領地を作り上げてしまった～ (`.../1b79d2289462b`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 追放された転生貴族、外れスキルで内政無双～気ままに領地運営するはずが、スキル『ガチャ』のお陰で最強領地を作り上げてしまった～ (`.../1b79d2289462b`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 落ちこぼれ魔剣使いの英雄譚～魔術が使えず無能の烙印を押されましたが、【魔術破壊】で世界最強へ成り上がる～ (`.../d7a436c5df4d4`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | ナナイロ雷術師の英雄譚-すべてを失った俺、雷魔術を極めて最強へと至る- (`.../42b75ba0c236d`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 追放された転生貴族、外れスキルで内政無双～気ままに領地運営するはずが、スキル『ガチャ』のお陰で最強領地を作り上げてしまった～ (`.../1b79d2289462b`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 追放された転生貴族、外れスキルで内政無双～気ままに領地運営するはずが、スキル『ガチャ』のお陰で最強領地を作り上げてしまった～ (`.../1b79d2289462b`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 136 | 1 (`.../3c2eb08c11514`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 44 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=追放された転生貴族、外れスキルで内政無双～気ままに領地運営するはずが、スキル『ガチャ』のお陰で最強領地を作り上げてしまった～, URL=`.../1b79d2289462b` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202505301355081357FE3A738749F047199BF2CB6CDBBD72C-lg.webp` (image/webp (encoding: lossy), 48918 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1b79d2289462b` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202505301355081357FE3A738749F047199BF2CB6CDBBD72C.png` (image/png, 4431338 bytes, 2560x1344) |  |  |  |
| details author | PASS | 雪月佳, 白石新, 転 |  |  |  |
| details artist | PASS | 雪月佳, 白石新, 転 |  |  |  |
| details genres | PASS | 異世界・転生 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【領民0の辺境へ追放されたはずが…スキル覚醒で最強領地に!?】ブラック企業に勤めていたヒロは、ある日不慮の事故をきっかけに異世界に転生してしまう。名門貴族の少年として大事に育てられていたが、成人の儀で授かったのは正体不明の""ハズレ""スキルで…!?　家族から失望され、ヒロは手のひら返しで領民０の辺境領地に追放されることに。しかしその道中、謎に包まれたヒロのスキル…『ガチャ』が発動！レジェンドレア・神龍の卵を引き当てたことで事態は一変する。<br>「このスキルは僕が持つ唯一の可能性だから――」<br>規格外の『ガチャ』スキルを持ち、底知れぬお人好しのヒロのもとには、伝説の神龍をはじめ、古代龍や猫耳戦士など最強の領民たちが続々と集結！しかも『ガチャ』スキルの効果で、仲間たちは一国の軍事力に匹敵するとんでもない強さを発揮して――!?　<br> 「グラストNOVEL」シリーズ大人気作待望のコミカライズ！無自覚＆お人好し領主による領地運営ファンタジー開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 136 chapters |  |  |  |
| chapter dates | PASS | 136 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 44 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.manga-zegra.com/.../master-1747977364403-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 12, 4, 2, 3, 5, 6, 14, 11, 13, 8, 1, 0, 10, 9, 15\]` (image/jpeg, 337093 bytes, 1055x1500) |  |  |  |
