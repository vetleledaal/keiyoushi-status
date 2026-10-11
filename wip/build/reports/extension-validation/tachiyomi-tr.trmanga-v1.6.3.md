# Extension Validation Report

- Extension: tachiyomi-tr.trmanga-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7237724101525767746
- Source name: TrManga
- Source language: tr
- Selected manga input: popular offset 0: Stepmother's Friends TR (`.../stepmothers-friends-tr`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Stepmother's Friends TR (`.../stepmothers-friends-tr`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Try Begging Me (`.../try-begging-me`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | No Place for the Fake Princess (`.../no-place-for-the-fake-princess`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Us, After (`.../us-after`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Stepmother's Friends TR (`.../stepmothers-friends-tr`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stepmother's Friends TR (`.../stepmothers-friends-tr`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 147 | #1 .Bölüm (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Bu bölüm üyelere özeldir. Okumak için WebView üzerinden giriş yapın | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Bu bölüm üyelere özeldir. Okumak için WebView üzerinden giriş yapın | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Stepmother's Friends TR, URL=`.../stepmothers-friends-tr` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://trmanga.com/.../book.jpg` -> 26 manga URLs (examples: `.../stepmothers-friends-tr`, `.../the-villainess-reverses-the-hourglass-tr`, `.../dusesin-50-cay-tarifi`) |  |  |  |
| thumbnail | PASS | `https://trmanga.com/.../book.jpg` (image/jpeg, 71866 bytes, 1308x1698) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../stepmothers-friends-tr` |  |  |  |
| details thumbnail URL | PASS | `https://trmanga.com/.../book.jpg` |  |  |  |
| details author | PASS | - |  |  |  |
| details artist | PASS | - |  |  |  |
| details genres | PASS | Dram, Komedi, Romantik, Harem, Yetişkin |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Seowoo, insan ilişkilerinde çekimser kalmış ve 26 yaşına kadar hiç yakın bir ilişki yaşamamış genç bir adamdır. Babasının kendisinden yalnızca birkaç yaş büyük olan Chaeyoon ile evlenmesiyle hayatı beklenmedik bir döneme girer. Bir gün internette gezinirken tesadüfen izlediği gizli bir video, üvey annesi Chaeyoon ve onun yakın arkadaş çevresine dair saklanan gerçekleri gün yüzüne çıkarır. Bu sarsıcı keşif, Seowoo’yu üvey annesi ve onun çekici arkadaşlarıyla giderek derinleşen karmaşık bir etkileşimin içine sürükler. Sırrı öğrendikten sonra Seowoo, bir yandan bu durumun getirdiği gerilimi yönetmeye çalışırken diğer yandan çevresindeki genç kadınların artan ilgisiyle yüzleşmek zorunda kalır. Günümüz şehir hayatında geçen hikâyede güç dengeleri, gizli tutulan arzular ve karakterler arası psikolojik çekim ön plana çıkar. Seowoo çekingen yapısını aşarak bu ilişki ağında kendi dengesini bulmaya çalışırken, üvey annesinin arkadaşlarının farklı kişilikleri ve hayatlarındaki düğümler ana karakterin karşısına sürekli yeni engeller çıkarır. Çizer Red-A'nın net çizim tarzı ve karakter ifadelerindeki detaycılık, serinin anlatım tonunu başarıyla tamamlar. Olayların gelişimi dengeli bir tempoda ilerlerken, karakterlerin zamanla geçirdiği değişimler anlatıya derinlik katar. Benzer türdeki yetişkin ve harem temalı webtoon yapımlarından hoşlanan okurlar için öne çıkan seri; dram, romantizm ve komedi ögelerini bir arada sunarak karakter odaklı ilişki dinamiklerini seven kitleye hitap eder. Stepmother's Friends TR, genç bir adamın üvey annesi ve onun arkadaş çevresiyle kurduğu karmaşık ilişkileri dram, komedi, romantizm ve harem odağında sunar. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 147 chapters |  |  |  |
| chapter dates | PASS | 147 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Bu bölüm üyelere özeldir. Okumak için WebView üzerinden giriş yapın |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
