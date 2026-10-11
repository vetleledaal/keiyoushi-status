# Extension Validation Report

- Extension: tachiyomi-tr.tenshimanga-v1.6.8
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
- Source theme: uzaymanga
- Source ID: 5906663076478194825
- Source name: Tenshi Manga
- Source language: tr
- Selected manga input: popular offset 0: Seviye Atlaya Atlaya Dövüş İlahı (`.../seviye-atlaya-atlaya-dovus-ilahi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Seviye Atlaya Atlaya Dövüş İlahı (`.../seviye-atlaya-atlaya-dovus-ilahi`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Senaryoyu Yutan Oyuncu (`.../senaryoyu-yutan-oyuncu`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Göksel Şeytan Size Masaj Yapacak (`.../goksel-seytan-size-masaj-yapacak`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Yetenek Koleksiyoncusu (`.../yetenek-koleksiyoncusu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Seviye Atlaya Atlaya Dövüş İlahı (`.../seviye-atlaya-atlaya-dovus-ilahi`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Seviye Atlaya Atlaya Dövüş İlahı (`.../seviye-atlaya-atlaya-dovus-ilahi`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 53 | Bölüm 1 (`.../1-bolum-oku`) |  | <1s |
| pages | `getPageList(chapter)` | success | 100 |  |  | 1-10s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Seviye Atlaya Atlaya Dövüş İlahı, URL=`.../seviye-atlaya-atlaya-dovus-ilahi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-t.efsaneler2.can.re/.../thumbnail.avif` (image/webp (encoding: lossy), 10972 bytes, 190x272; server Content-Type: image/avif) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../seviye-atlaya-atlaya-dovus-ilahi` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-t.efsaneler2.can.re/.../thumbnail.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Dram, Fantastik, Aksiyon, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kıtadaki en güçlü dövüş sanatçısı ve tüm dövüş dünyasını birleştiren yüce Dövüş İmparatoru: Suhyeok. Her şeye ulaşmış olsa da, içinde ailesine duyduğu özlemden doğan bir boşluk vardı… Sonunda büyünün gücüyle boyutlar arası bir yolculuğa çıktı. Ancak gözlerini açtığında karşısında bambaşka bir manzara vardı:<br><br>“Beş yıldır hastanede komadaymışım!?”<br><br>Ve bu ekran da neyin nesi? Gözlerinin önünde bir sistem penceresi yüzüyordu!<br>“Kara Dağ Keşişi, seni geveze pislik! Beni kendi dünyama gönderecektin! Bu neyin kafası!?”<br><br>O komada yatarken, ailesi hastane masraflarını ödemek için büyük sıkıntılar çekmişti…<br><br>“Ailem için para kazanmam gerek—hem de çok hızlı ve bolca.”<br><br>Hwan Kıtası'nın en güçlü Dövüş Tanrısı Suhyeok, artık uyanmıştır. Şimdi ise modern dünyada level atlayarak hayatta kalmak ve ailesine destek olmak için yepyeni bir yolculuğa başlar. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 53 chapters |  |  |  |
| chapter dates | PASS | 53 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 100 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-t.efsaneler2.can.re/.../0.avif` (image/jpeg, 84769 bytes, 1024x1536; server Content-Type: image/avif) |  |  |  |
