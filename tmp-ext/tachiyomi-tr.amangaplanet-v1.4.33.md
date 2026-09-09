# Extension Validation Report

- Extension: tachiyomi-tr.amangaplanet-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 5164979204020878495
- Source name: Amanga Planet
- Source language: tr
- Selected manga input: popular offset 0: Şeytani Çağ (`.../seytani-cag`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Şeytani Çağ (`.../seytani-cag`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Yoksul Bir Bölgenin Sahibi Oluverdim (`.../yoksul-bir-bolgenin-sahibi-oluverdim`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Şeytani Çağ (`.../seytani-cag`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Şeytani Çağ (`.../seytani-cag`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 101 | Bölüm 1 (`.../seytani-cag-bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Şeytani Çağ, URL=`.../seytani-cag` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.amangaplanet.com.tr/.../Seytani-cag-1.jpg` (image/jpeg, 631343 bytes, 800x1037) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../seytani-cag` |  |  |  |
| details thumbnail URL | PASS | `https://www.amangaplanet.com.tr/.../Seytani-cag-1.jpg` |  |  |  |
| details author | PASS | codezero |  |  |  |
| details artist | PASS | FORCE STUDIO |  |  |  |
| details genres | PASS | Aksiyon, Dövüş sanatları, Dram, Fantastik, Shounen, Tarihi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Şeytani Çağ, doğru yol muriminin en güçlü suikastçısının düşman tarafın genç efendisi olarak yeniden doğmasını anlatan murim aksiyon webtoon. Cheon Hajin, Uicheon İttifakı’nın gizli silahıydı. Ayrıca kimsenin adını bilmediği bir suikastçıydı. Tek istediği özgürlüktü. Bu yüzden kaçmayı göze aldı. Ancak hedefine bir adım kala canından oldu. Sonra bir ses duydu: “Kutsal Tarikat yenilmezdir, on bin şeytan boyun eğer. Üçüncü Genç Efendi’nin şifa bulmasını kutlarız!” Gözlerini açtığında murimin baş düşmanı olan Şeytani Tarikat’ın Üçüncü Genç Efendisi olmuştu. Yani bir ömür avladığı tarafın içindeydi. Üstelik bu kez avlanan değil, avlayan taraftaydı. Şeytani murimi fethetme hikâyesi böyle başlıyor. Şeytani Çağ manga hakkında Seri, klasik murim dünyasını reenkarnasyon temasıyla birleştiriyor. Ayrıca güçlenme, entrika ve tarikat çatışmaları öne çıkıyor. Diğer isimleri: Chronicles of the Demon Faction · Crónicas de la facción Demoniaca · 魔道轉生記 · 마도전생기 Tüm bölümleri Türkçe olarak sitemizde okuyabilirsiniz.<br><br>Alternative Names: Chronicles of the Demon Faction, Crónicas de la facción Demoniaca, Crónicas de la facción del demonio, ตำนานการเกิดใหม่ในลัทธิมาร, 魔道轉生記, 魔道转生记, 마도전생기 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 101 chapters |  |  |  |
| chapter dates | PASS | 101 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://amangaplanet.link/.../Seytani-cag-bolum-1.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
