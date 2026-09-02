# Extension Validation Report

- Extension: tachiyomi-en.anisascans-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8904806262353429205
- Source name: Anisa Scans
- Source language: en
- Selected manga input: popular offset 0: Death Is The Only Ending For The Villainess (`.../664`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Death Is The Only Ending For The Villainess (`.../664`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | I Became The Youngest Sister-in-law Of The Male Leads In A Tragic Reverse Harem (`.../4743`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Ultimate Wantless Godly Rich System (`.../2642`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | I Reincarnated as the Princess of a Country That Is Going to Destroyed by Male Protagonist (`.../14813`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Death Is The Only Ending For The Villainess (`.../664`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Death Is The Only Ending For The Villainess (`.../664`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 215 | Chapter 0.1 (`.../chapter-0-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Death Is The Only Ending For The Villainess, URL=`664` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 103/103 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 103/103 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://anisascans.in/.../IMG_6633-350x476.jpeg` (image/jpeg, 78689 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `664` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://anisascans.in/.../IMG_6633-193x278.jpeg` (image/jpeg, 39275 bytes, 193x278) |  |  |  |
| details author | PASS | Gwon Gyeoeul, SUOL |  |  |  |
| details artist | PASS | SUOL |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Fantasy, Game, Historical, Isekai, Manhwa, Reincarnation, Romance, Royal family, Shoujo, Time Travel, Tragedy, Villainess, A morte é o único final para a vilã, Chết là cái kết thúc cho nhân vật phản diện, Death Is the Only Ending for the Villain, Death Is the Only Ending for the Villainess, DITOEFTV, El único final de la villana es la muerte, Kamatayan Lang ang Nararapat Para sa Kontrabida, Kematian adalah Akhir Sang Antagonis, Kết cục nhân vật phản diện chỉ có thể là cái chết, Kết thúc của nhân vật phản diện là cái chết, Kötülerin Kaderi Yok Olmaktır, O único destino dos vilões é a morte, Penelope – Das Böse ist dem Tod geweiht, Penelope mau bahagia, Phản phái nhân vật chỉ hữu tử vong kết cục, Seule la mort attend la méchante, Seule la mort attend la vilaine, The Villain's Ending Is Death, Единственный исход злодейки - смерть, Единственный конец злодейки - смерть, Єдиний фінал лиходіїв – смерть, Конец злодейки - смерть, Смерть - единственный конец для злодейки, Хорон санаатны төгсгөл бол зөвхөн үхэл, تنها سرانجام شرور، مرگ است, เกมรักอันตรายของนางร้าย, เป็นตัวร้ายก็ต้องตายเท่านั้น, 反派角色只有死亡結局, 恋爱手游的男主都很危险, 恶役只有死亡结局, 悪役のエンディングは死のみ. |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Penelope Eckart reincarnated as the adopted daughter of Duke Eckart and the villainess of a reverse harem dating sim. The problem is, she entered the game at its hardest difficulty, and no matter what she does, death awaits her at every ending! Before the “real daughter” of Duke Eckart appears, she must choose one of the male leads and reach a happy ending in order to survive. But the two brothers always pick a fight with her over every little thing, as well as a crazy crown prince, whose routes all lead to death. There’s even a magician who’s in love with the female lead, and a loyal knight slave! But somehow, the favorability meters of the male leads increase the more she crosses the line with them! Chết là cái kết thúc cho nhân vật phản diện / Death Is The Only Ending For The Villain / Death Is the Only Ending for the Villainess / Kematian adalah Akhir Sang Antagonis / Kết thúc của nhân vật phản diện là cái chết / Villains are Destined to Die / 恶役只有死亡结局 .../%EC%95%85%EC%97%AD%EC%9D%98 엔딩은 죽뿐음/ Villains Are Destined to Die<br><br>Alternative Names: Villains Are Destined to Die Volume Version Chết là cái kết thúc cho nhân vật phản diện / Death Is The Only Ending For The Villain / Death Is the Only Ending for the Villainess / Kematian adalah Akhir Sang Antagonis / Kết thúc của nhân vật phản diện là cái chết / Villains are Destined to Die / 恶役只有死亡结局 / 악역의 엔딩은 죽음뿐 / Villains Are Destined to Die |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 215 chapters |  |  |  |
| chapter dates | LINT | 207 of 215 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=207 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://like.mgread.io/.../2.jpg.webp` (image/webp (container: extended), 2392262 bytes, 940x792) |  |  |  |
