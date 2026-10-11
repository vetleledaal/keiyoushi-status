# Extension Validation Report

- Extension: tachiyomi-tr.sereinscan-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1993924607457500259
- Source name: Serein Scan
- Source language: tr
- Selected manga input: popular offset 0: Caninin Tek Sonu Ölüm (`.../caninin-tek-sonu-olum`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Caninin Tek Sonu Ölüm (`.../caninin-tek-sonu-olum`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Otome Oyunundaki Yüceler Bana Takıntılı (`.../otome-oyunundaki-yuceler-bana-takintili`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Sınıf Arkadaşı (`.../sinif-arkadasi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Ben Kızın Mıyım? (`.../ben-kizin-miyim`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Caninin Tek Sonu Ölüm (`.../caninin-tek-sonu-olum`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Caninin Tek Sonu Ölüm (`.../caninin-tek-sonu-olum`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 216 | Chapter 0 - Promo (`.../caninin-tek-sonu-olum-bolum-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Caninin Tek Sonu Ölüm, URL=`.../caninin-tek-sonu-olum` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sereinscan.com/.../cani-1-210x300.jpg` (image/jpeg, 26518 bytes, 210x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../caninin-tek-sonu-olum` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sereinscan.com/.../cani-1.jpg` (image/jpeg, 183545 bytes, 720x1030) |  |  |  |
| details author | PASS | Gwon Gyeoeul |  |  |  |
| details artist | PASS | SUOL |  |  |  |
| details genres | PASS | Adaptasyon, Dram, Drama, Fantasy, Fantezi, Final, Isekai, Josei, Reenkarnasyon, Romance, Romantizm, Shoujo, Sihir, Video oyunları, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Penelope Eckart; Dük Eckart‘ın evlatlık kızı ve harem partner simülatörünün kötü karakteri olarak reenkarne oldum. Sorun şu ki, oyuna en zor seviyede girdi ve ne yaparsa yapsın, her seferinde ölümle burun buruna geliyor! Dük Eckart‘ın gerçek kızı ortaya çıkmadan önce, erkek ana karakterlerden birini seçmeli ve hayatta kalmak için mutlu bir sona ulaşmalıdır. Ama bu iki kardeş onunla her zaman, en ufak bir şeyde bile kavgaya tutuşuyor. Bununla birlikte rotaları ölüme yol açan çılgın bir veliaht prens, dişi kurşunla büyülenmiş bir sihirbaz ve sadık bir köle şövalyesi bile var! Ama nasıl oluyorsa, ne zaman çizgiyi aşsa ana karakterler ile olan aşk ölçeri yükseklik gösteriyor! İşte bu çılgın bir harem simülasyonunun içinde tıkalı kalmış Penelope‘un hikayesi. https://sereinscan.com/.../death-tanitim-1.webm<br><br>Alternative Names: <br>- Death Is the Only Ending for the Villain<br>- Death Is the Only Ending for the Villainess<br>- DITOEFTV<br>- El único final de la villana es la muerte<br>- Kamatayan Lang ang Nararapat Para sa Kontrabida<br>- Kematian adalah Akhir Sang Antagonis<br>- Kötünün Tek Sonu Ölümdür<br>- |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 216 chapters |  |  |  |
| chapter dates | PASS | 216 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://sereinscan.com/.../01.jpg` (image/jpeg, 3429262 bytes, 760x9775) |  |  |  |
