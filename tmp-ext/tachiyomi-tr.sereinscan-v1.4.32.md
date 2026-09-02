# Extension Validation Report

- Extension: tachiyomi-tr.sereinscan-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1993924607457500259
- Source name: Serein Scan
- Source language: tr
- Selected manga input: popular offset 0: Caninin Tek Sonu Ölüm (`.../caninin-tek-sonu-olum`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Caninin Tek Sonu Ölüm (`.../caninin-tek-sonu-olum`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Otome Oyunundaki Yüceler Bana Takıntılı (`.../otome-oyunundaki-yuceler-bana-takintili`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Murim’in Bedbaht Torunu (`.../murimin-bedbaht-torunu`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Tiran İmparatoriçe (`.../tiran-imparatorice`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Caninin Tek Sonu Ölüm (`.../caninin-tek-sonu-olum`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Caninin Tek Sonu Ölüm (`.../caninin-tek-sonu-olum`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 213 | Chapter 0 - Promo (`.../caninin-tek-sonu-olum-bolum-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| details genres | PASS | Adaptasyon, Dram, Drama, Fantasy, Fantezi, Isekai, Josei, Reenkarnasyon, Romance, Romantizm, Shoujo, Sihir, Video oyunları, Manhwa |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | Penelope Eckart; Dük Eckart‘ın evlatlık kızı ve harem partner simülatörünün kötü karakteri olarak reenkarne oldum. Sorun şu ki, oyuna en zor seviyede girdi ve ne yaparsa yapsın, her seferinde ölümle burun buruna geliyor! Dük Eckart‘ın gerçek kızı ortaya çıkmadan önce, erkek ana karakterlerden birini seçmeli ve hayatta kalmak için mutlu bir sona ulaşmalıdır. Ama bu iki kardeş onunla her zaman, en ufak bir şeyde bile kavgaya tutuşuyor. Bununla birlikte rotaları ölüme yol açan çılgın bir veliaht prens, dişi kurşunla büyülenmiş bir sihirbaz ve sadık bir köle şövalyesi bile var! Ama nasıl oluyorsa, ne zaman çizgiyi aşsa ana karakterler ile olan aşk ölçeri yükseklik gösteriyor! İşte bu çılgın bir harem simülasyonunun içinde tıkalı kalmış Penelope‘un hikayesi. https://sereinscan.com/.../death-tanitim-1.webm<br><br>Alternative Names: Death Is the Only Ending for the Villain, Death Is the Only Ending for the Villainess, DITOEFTV, El único final de la villana es la muerte, Kamatayan Lang ang Nararapat Para sa Kontrabida, Kematian adalah Akhir Sang Antagonis, Kötünün Tek Sonu Ölümdür, |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 213 chapters |  |  |  |
| chapter dates | PASS | 213 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://sereinscan.com/.../01.jpg` (image/jpeg, 3429262 bytes, 760x9775) |  |  |  |
