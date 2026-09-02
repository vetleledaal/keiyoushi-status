# Extension Validation Report

- Extension: tachiyomi-tr.merlinscans-v1.4.37
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 23
- Lint: 1
- Warnings: 2
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4883620005315879682
- Source name: Merlin Scans
- Source language: tr
- Selected manga input: popular offset 0:  Reenkarne Ölçünü (`.../reenkarne-olcunu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 |  Reenkarne Ölçünü (`.../reenkarne-olcunu`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 |  Oyuncunun Son Şansı (`.../oyuncunun-son-sansi`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 |  İlahi Şeytan’ın Yükselişi    (`.../ilahi-seytanin-yukselisi`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 |  İnfaz Memuru    (`.../infaz-memuru`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Reenkarne Ölçünü (`.../reenkarne-olcunu`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Reenkarne Ölçünü (`.../reenkarne-olcunu`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | <1s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reenkarne Ölçünü, URL=`.../reenkarne-olcunu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://merlintoon.com/.../Reenkarne-Olcunu-300x400.webp` (image/webp (container: extended), 33778 bytes, 300x400) |  |  |  |
| details identity | UNUSUAL | Details changed selected title  Reenkarne Ölçünü to Reenkarne Ölçünü |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://merlintoon.com/.../Reenkarne-Olcunu-450x600.webp` (image/webp (container: extended), 59834 bytes, 450x600) |  |  |  |
| details author | PASS | Aroth Cheva |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Aksiyon, Dram, Fantastik, Shounen, Bitirmeye 14 sa. 47 dk. |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Meşhur dövüş sanatları ustası Samion ailesinden gelen Daven, tek kollu bir askerdir. Sağ kolu olmadığı için uğradığı tüm hakaretlere rağmen Samion ailesinin ana soyunu yenmeyi başarır. Fakat ailesi tarafından ihanete uğrayıp sefalet içinde öldükten sonra reenkarne olur. “Sağ kolumu hissedebiliyorum.” Artık yeni bir ailesi ve doğuştan yetenekli bir vücudu vardır. Geçmişten gelen tecrübesi ve yarı tanrı olan Julian sayesinde her şey değişir ve Daven’ın yeni macerası başlar. Seri Adı: Reenkarne Ölçünü / The Art of Reincarnation Açıklama: İhanete uğrayan tek kollu dövüş sanatları ustası Daven, sağlıklı bir bedende yeniden doğar ve geçmiş tecrübeleriyle en güçlü olmak için yeni bir maceraya atılır. The Art of Reincarnation oku The Art of Reincarnation türkçe oku The Reincarnated War God oku Hwansaengmusin oku 환생무신 türkçe oku<br><br>Alternatif Başlık: Standard of Reincarnation |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
