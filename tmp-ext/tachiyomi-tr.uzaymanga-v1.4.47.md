# Extension Validation Report

- Extension: tachiyomi-tr.uzaymanga-v1.4.47
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9155782272853059412
- Source name: Uzay Manga
- Source language: tr
- Selected manga input: popular offset 0: Efsanevi Büyü İmparatoru (`.../efsanevi-buyu-imparatoru`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Efsanevi Büyü İmparatoru (`.../efsanevi-buyu-imparatoru`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Sokaklarda Hayatta Kalma Kılavuzu (`.../sokaklarda-hayatta-kalma-kilavuzu`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | İskeletleri Canlandırabilirim (`.../iskeletleri-canlandirabilirim`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Yetişim Yasaları: Qi=MC² (`.../yetisim-yasalari-qi-mc`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Efsanevi Büyü İmparatoru (`.../efsanevi-buyu-imparatoru`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Efsanevi Büyü İmparatoru (`.../efsanevi-buyu-imparatoru`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 916 | Bölüm 2 (`.../2-bolum-oku`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Efsanevi Büyü İmparatoru, URL=`.../efsanevi-buyu-imparatoru` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-u.efsaneler2.can.re/.../thumbnail.avif` (image/avif (format: avif), 13754 bytes, 181x272) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../efsanevi-buyu-imparatoru` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-u.efsaneler2.can.re/.../thumbnail.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Büyü, Dövüş, Fantastik, Harem, Aksiyon, Şeytani, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Zhuo Yifan bir büyü imparatoruydu, bir iblis imparatoru olduğu da söylenilebilirdi çünkü Dokuz Sır Kitabı adında eski bir imparator kitabına sahipti, tüm uzmanlar tarafından hedef alındı ve hatta öğrencileri tarafından bile ihanete uğradı ve öldürüldü. Sonra ruhu Zhuo Fan adında bir aile hizmetkârı çocuğun içine girdi ve hayata geri döndü. Bazı şeytani büyüler onu geride tuttuğu için, çocuğun anılarını birleştirmek zorundaydı ve hizmet ettiği aileyi ve hanımını görmezden gelemezdi. Bu alçalan aileyi bu kıtanın zirvesine nasıl geri döndürebilir?<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 84 name |  |  |  |
| chapters | PASS | 916 chapters |  |  |  |
| chapter dates | PASS | 916 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-u.efsaneler2.can.re/.../1.avif` (image/jpeg, 45866 bytes, 750x718; server Content-Type: image/avif) |  |  |  |
