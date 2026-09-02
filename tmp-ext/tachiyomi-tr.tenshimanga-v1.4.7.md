# Extension Validation Report

- Extension: tachiyomi-tr.tenshimanga-v1.4.7
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
- Source ID: 5906663076478194825
- Source name: Tenshi Manga
- Source language: tr
- Selected manga input: popular offset 0: Seviye Atlaya Atlaya Dövüş İlahı (`.../seviye-atlaya-atlaya-dovus-ilahi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Seviye Atlaya Atlaya Dövüş İlahı (`.../seviye-atlaya-atlaya-dovus-ilahi`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Batmış Akademinin Yeni Eğitmeni (`.../batmis-akademinin-yeni-egitmeni`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Tarihin En Büyük Hekimi Yeniden Doğdu (`.../tarihin-en-buyuk-hekimi-yeniden-dogdu`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Boyun Eğmeyen Gezgin Yolcu (`.../boyun-egmeyen-gezgin-yolcu`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Seviye Atlaya Atlaya Dövüş İlahı (`.../seviye-atlaya-atlaya-dovus-ilahi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Seviye Atlaya Atlaya Dövüş İlahı (`.../seviye-atlaya-atlaya-dovus-ilahi`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 53 | Bölüm 1 (`.../1-bolum-oku`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 100 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Seviye Atlaya Atlaya Dövüş İlahı, URL=`.../seviye-atlaya-atlaya-dovus-ilahi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
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
| page load | PASS | `https://cdn-t.efsaneler2.can.re/.../0.avif` (image/jpeg, 84769 bytes, 1024x1536; server Content-Type: image/avif) |  |  |  |
