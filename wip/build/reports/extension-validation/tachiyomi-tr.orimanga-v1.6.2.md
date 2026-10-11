# Extension Validation Report

- Extension: tachiyomi-tr.orimanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: initmanga
- Source ID: 4629101508845138320
- Source name: Ori Manga
- Source language: tr
- Selected manga input: popular offset 0: The Extra’s Academy Survival Guide (`.../the-extras-academy-survival-guide`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Extra’s Academy Survival Guide (`.../the-extras-academy-survival-guide`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The Extra’s Academy Survival Guide (`.../the-extras-academy-survival-guide`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 9 | The Extra’s Academy Survival Guide (`.../the-extras-academy-survival-guide`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Extra’s Academy Survival Guide (`.../the-extras-academy-survival-guide`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 18 | Bölüm 108 (`.../bolum-108`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Extra’s Academy Survival Guide, URL=`.../the-extras-academy-survival-guide` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://orimanga.net/.../1786486851670-1454af44-cb83-49d9-a63d-d6826d7f0ed9-300x400.webp` (image/webp (encoding: lossy), 31264 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-extras-academy-survival-guide` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://orimanga.net/.../1786486851670-1454af44-cb83-49d9-a63d-d6826d7f0ed9-450x600.webp` (image/webp (encoding: lossy), 53724 bytes, 450x600) |  |  |  |
| details author | PASS | Corita |  |  |  |
| details artist | PASS | Corita |  |  |  |
| details genres | PASS | Aksiyon, Büyü, Doğaüstü, Dram, Okul Hayatı, Psikolojik, Romantizm, Bitmesine 2 saat 15 dakika kaldı |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The Extra's Academy Survival Guide The Extra's Academy Survival Guide Konusu Hikaye, Oynadığı bir fantezi oyununun evreninde, kibri ve kötülükleri yüzünden zengin ailesi tarafından evlatlıktan reddedilen figuran Ed Rothstaylor'ın bedenine reenkarne olan ana karakterimizin etrafında şekillenmektedir. Ancak reenkarne olduğu kişi, oyunun başında kibri ve kötülükleri yüzünden zengin ailesi tarafından evlatlıktan reddedilen, prestijli Silvania Akademisi'nden kovulmanın eşiğine gelen başarısız ve küstah aristokrat Ed Rothstaylor'dır. Hicbir finansal desteği, kalacak yeri veya yüksek büyü gücü olmayan Ed, akademinin arkasındaki tehlikeli ormanda kendi imkanlarıyla barınak kurarak hayatta kalmaya çalışır. Oyunun ana senaryosunu müdahale etmeden dışarıdan izlemek ve mezun olana kadar sağ kalmak isteyen Ed, zekası, ahşap oymacılığı, avcılık yetenekleri ve temel büyü teorisi bilgisiyle kendi yolunu çizmek zorundadır. Karakterler ve Evren Dinamikleri Silvania Akademisi evreninde büyü disiplinleri, element teorileri ve soylu ailelerin rekabeti ön plandadır. Ed Rothstaylor, hileli güçler (op abilities) yerine tamamen kendi emeği, pratik zekası ve üretim (crafting) yetenekleriyle aşama aşama gelişen benzersiz bir ana karakterdir. Ormandaki mütevazı yaşamı ve pratik çözümleri, çevresindeki güçlü dahi öğrencilerin dikkatini çekmeye başlar. Oyunun ana kahramanları, akademi profesörleri ve gölgelerde gizlenen karanlık tehditler hikayeye büyük bir derinlik katmaktadır. Ed'in senaryoyu bozmadan hayatta kalma çabasına rağmen gelişen olaylar, okuyucuya hem eğlenceli hem de heyecan dolu bir akademi macerası sunmaktadır. Sitemizde The Extra's Academy Survival Guide Türkçe çevirisi en yüksek kalitede hazırlanmakta ve okuyucularımıza sunulmaktadır. Serinin detaylarını üzerinden inceleyebilir, sitemizdeki diğer 'e de göz atabilirsiniz.<br><br>Alternatif Başlık: Akademide Hayatta Kalma Yolları, 아카데미에서 살아남기 , Surviving the Academy , How to Survive at the Academy , Surviving at the Academy , Academy Extra's Survival Guide , Surviving as an Extra in the Academy |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 18 chapters |  |  |  |
| chapter dates | LINT | All 18 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=18 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://orimanga.net/.../2` to `https://orimanga.net/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://orimanga.net/.../0001.jpg` (image/jpeg, 6451518 bytes, 900x31341) |  |  |  |
