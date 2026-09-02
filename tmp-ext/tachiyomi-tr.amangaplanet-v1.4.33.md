# Extension Validation Report

- Extension: tachiyomi-tr.amangaplanet-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5164979204020878495
- Source name: Amanga Planet
- Source language: tr
- Selected manga input: latest offset 0: Yoksul Bir Bölgenin Sahibi Oluverdim (`.../yoksul-bir-bolgenin-sahibi-oluverdim`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Şeytani Çağ (`.../seytani-cag`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Yoksul Bir Bölgenin Sahibi Oluverdim (`.../yoksul-bir-bolgenin-sahibi-oluverdim`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Yoksul Bir Bölgenin Sahibi Oluverdim (`.../yoksul-bir-bolgenin-sahibi-oluverdim`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Yoksul Bir Bölgenin Sahibi Oluverdim (`.../yoksul-bir-bolgenin-sahibi-oluverdim`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | Bölüm 1 (`.../yoksul-bir-bolgenin-sahibi-oluverdim-bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yoksul Bir Bölgenin Sahibi Oluverdim, URL=`.../yoksul-bir-bolgenin-sahibi-oluverdim` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.amangaplanet.com.tr/.../yoksul-bir-bolgenin-sahibi-oluverdim.webp` (image/webp (container: extended), 426644 bytes, 950x1426) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yoksul-bir-bolgenin-sahibi-oluverdim` |  |  |  |
| details thumbnail URL | PASS | `https://www.amangaplanet.com.tr/.../yoksul-bir-bolgenin-sahibi-oluverdim.webp` |  |  |  |
| details author | PASS | Bucket, Hwanbeom |  |  |  |
| details artist | PASS | D |  |  |  |
| details genres | PASS | Fantastik, İsekai, Komedi, Macera, Manhwa, Romantizm |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yoksul Bir Bölgenin Sahibi Oluverdim, borç batağındaki bir gencin başka bir dünyada iflas etmiş bir bölgeyi ayağa kaldırmak zorunda kalmasını anlatan romantik fantezi webtoon. Donghee üç ayrı yarı zamanlı işte çalışıyor. Ayrıca tefecilere olan borcu her gün büyüyor. Bu yüzden tek istediği şey birkaç saat uyumaktı. Ancak küflü bodrum dairesinde gözlerini kapattığında bir daha oraya dönemedi. Uyandığında bambaşka bir dünyadaydı — üstelik Grace Bölgesi’nin sahibi olarak. Ding! Havada mavi bir durum ekranı belirdi. \[Yoksul bölgeyi canlandır! Görevi kabul ediyor musun?\] \[Lütfen kullanmak istediğiniz ismi girin.\] “Bu beni çıldırtıyor!” \[Kullanıcı adınız: ‘Bu beni çıldırtıyor’\] Sistem sanki onunla dalga geçiyor. Dahası verdiği görev hiç de kolay değil. Donghee’nin bölge halkının kalbini kazanması gerekiyor. Hedef yakınlık puanı sadece 1, yani kulağa basit geliyor. Fakat mevcut puan eksi 189.500. Kurak topraklar, aç köylüler, bomboş bir hazine. Bir ömür borçla boğuşan Donghee şimdi de koca bir bölgeyi iflastan kurtaracak. Üstelik bu bir rüya bile değil. Neden hep ben? Yoksul Bir Bölgenin Sahibi Oluverdim hakkında Seri, Bagaji’nin aynı adlı web romanından uyarlanıyor. Kore’de romantik fantezi kategorisinde çıkıyor. Ayrıca sistem ekranı mekaniğini, bölge yönetimini ve komediyi bir arada kullanıyor. Diğer isimleri: I Became the Owner of a Poor Estate, I Became the Lord of a Poor Estate, ,Became the Owner of a Poor Estate, 가난한 영지의 주인이 되어 버렸다 I Became the Owner of a Poor Estate Tüm bölümleri Türkçe olarak sitemizde okuyabilirsiniz.<br><br>Alternative Names: I Became the Owner of a Poor Estate, Yoksul Bir Bölgenin Leydisi Oldum, I Became the Lord of a Poor Estate, Became the Owner of a Poor Estate, 가난한 영지의 주인이 되어 버렸다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://amangaplanet.link/.../yoksul-bir-bolgenin-sahibi-oluverdim-bolum-1.avif` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
