# Extension Validation Report

- Extension: tachiyomi-tr.uzaymanga-v1.4.47
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: uzaymanga
- Source ID: 9155782272853059412
- Source name: Uzay Manga
- Source language: tr
- Selected manga input: latest offset 0: İskeletleri Canlandırabilirim (`.../iskeletleri-canlandirabilirim`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Efsanevi Büyü İmparatoru (`.../efsanevi-buyu-imparatoru`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Sokaklarda Hayatta Kalma Kılavuzu (`.../sokaklarda-hayatta-kalma-kilavuzu`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | İskeletleri Canlandırabilirim (`.../iskeletleri-canlandirabilirim`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Yetişim Yasaları: Qi=MC² (`.../yetisim-yasalari-qi-mc`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | İskeletleri Canlandırabilirim (`.../iskeletleri-canlandirabilirim`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | İskeletleri Canlandırabilirim (`.../iskeletleri-canlandirabilirim`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 27 | Bölüm 1 (`.../1-bolum-oku`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 143 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=İskeletleri Canlandırabilirim, URL=`.../iskeletleri-canlandirabilirim` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-u.efsaneler2.can.re/.../thumbnail.avif` (image/avif (format: avif), 14273 bytes, 194x272) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../iskeletleri-canlandirabilirim` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-u.efsaneler2.can.re/.../thumbnail.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantastik, Aksiyon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ölü çağıranlar, soyluların bile üstünde görülen, dünyanın en seçkin mesleklerinden biridir. Tüm dünyada sayıları sadece bini bile bulmaz! Ben ise elmas kaşıkla değil, ölü çağıran kaşığıyla doğmuşum!<br><br>… Ya da ben öyle sanıyordum.<br><br>“Ben sadece arızalı bir ölü çağıranım.” Kullandığım yetenek: \[Sıradan İskelet Çağır (E Seviyesi)\]<br><br>Normalde bir ölü çağıranın, güçlü yaratıklar — mesela r (lich), r (dullahan) ya da ölüm şövalyeleri — çağırabilmesi gerekir. Ama ben mi? Ben sadece basit bir iskelet çağırabiliyorum. Ta ki bir gün…<br><br>\[Gizli bir koşul yerine getirildi!\]<br>\[Koşul: 10.000 Kullanım Kuralı\]<br>\[Seviyen D’ye yükseldi!\]<br><br>Gizli bir şartı tamamladım ve artık iskeletlerimi güçlendirebiliyorum! E seviyesinden başlayıp S seviyesine kadar yükselebilirim!<br><br>Dünyanın tek lanetli ölü çağıranı Joo Donghoon’un hikâyesi başlıyor… Bir ‘sıralamacı’ olmaya doğru yıldırım gibi ilerleyen bir efsane! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | PASS | 27 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 143 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-u.efsaneler2.can.re/.../0.avif` (image/jpeg, 213653 bytes, 1920x1375; server Content-Type: image/avif) |  |  |  |
