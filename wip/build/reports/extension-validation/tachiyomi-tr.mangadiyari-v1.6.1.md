# Extension Validation Report

- Extension: tachiyomi-tr.mangadiyari-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1376929341843631623
- Source name: Manga Diyarı
- Source language: tr
- Selected manga input: popular offset 0: Ben Ölümsüzüm (`.../ben-olumsuzum`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Ben Ölümsüzüm (`.../ben-olumsuzum`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 6 | Kötü Adamı Kaçıran 5 Yaşındaki Casus (`.../kt-adam-karan-5-yandaki-casus`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Bir Tiranın Kızı Olarak Hayatta Kalmak (`.../bir-tirann-kz-olarak-hayatta-kalmak`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 3 | Yetiştiricinin Dönüşü: Seksen Bin Yıllık Öngörü (`.../yetistiricinin-donusu-seksen-bin-yillik-ongoru`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ben Ölümsüzüm (`.../ben-olumsuzum`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ben Ölümsüzüm (`.../ben-olumsuzum`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 793 | Bölüm 1 (`.../107`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ben Ölümsüzüm, URL=`ben-olumsuzum` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 58/58 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 58/58 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangadiyari.com/.../i302868-1.jpg` (image/jpeg, 10720 bytes, 160x213) |  |  |  |
| details identity | PASS | Details preserved selected URL `ben-olumsuzum` |  |  |  |
| details thumbnail URL | PASS | `https://mangadiyari.com/.../i302868-1.jpg` |  |  |  |
| details author | PASS | June Snow Studio |  |  |  |
| details artist | PASS | June Snow Studio |  |  |  |
| details genres | PASS | Manhua, Aksiyon, Fantezi, Harem, Dövüş Sanatları, Shounen, Doğaüstü |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Önceki hayatında ölümsüzlük dünyasının eşsiz bir dehasıydı; ancak üç göksel varlık tarafından katledildi. Göklerin Kitabı sayesinde tesadüfen yirmili yaşlarına geri döndü. Tek isteği yeniden ölümsüzlüğe ulaşıp ölümsüzler alemine dönmekti; ama bu süreçte Dünya’nın en güçlü adamına dönüştü!<br><br>Bir el hareketiyle bulutları dağıtan, bir diğeriyle yağmurlar yağdıran, kendisine karşı gelen herkese meydan okuyan biri o! O, Yüce Saygın! Üç bin dünyanın hükümdarı! Thanos’tan on bin kat daha güçlü bir adam! O, Taixuan Taizun! Büyük Ölümsüz!“<br><br>Alternatif isimler: Gue Dewa Terkuat!,I'm Daxianzun,I'm the Great Immortal,Ngạo Thị Thiên Địa,The Almighty Cultivator,Wo Shi Daxian Zun,Wǒ Shì Dàxiān Zūn,Đấng Tu Luyện Toàn Năng,我是大仙尊,現世に帰還した最強神仙,현세로 귀환한 최강 신선 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 793 chapters |  |  |  |
| chapter dates | PASS | 793 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.saridiyar.monster/.../001.jpg` (image/jpeg, 169513 bytes, 1000x1329) |  |  |  |
