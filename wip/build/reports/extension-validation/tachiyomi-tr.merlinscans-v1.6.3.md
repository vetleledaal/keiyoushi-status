# Extension Validation Report

- Extension: tachiyomi-tr.merlinscans-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: initmanga
- Source ID: 4883620005315879682
- Source name: Merlin Scans
- Source language: tr
- Selected manga input: popular offset 0: Reenkarne Ölçünü (`.../reenkarne-olcunu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Reenkarne Ölçünü (`.../reenkarne-olcunu`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Göksel İblis Sessiz Bir Yaşam İstiyor (`.../goksel-iblis-sessiz-bir-yasam-istiyor`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Umut Şövalyesi (`.../umut-sovalyesi`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | İblis Avcısının Yönergesi (`.../iblis-avcisinin-yonergesi`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Reenkarne Ölçünü (`.../reenkarne-olcunu`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Reenkarne Ölçünü (`.../reenkarne-olcunu`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 194 | Bölüm 1 (`.../bolum-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 15 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Reenkarne Ölçünü, URL=`.../reenkarne-olcunu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://merlintoon.com/.../Reenkarne-Olcunu-oku-300x400.webp` (image/webp (encoding: lossless), 149070 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../reenkarne-olcunu` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://merlintoon.com/.../Reenkarne-Olcunu-oku-450x600.webp` (image/webp (encoding: lossless), 303950 bytes, 450x600) |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Aksiyon, Dram, Fantastik, Shounen, Bitirmeye 13 sa. 29 dk. |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Meşhur dövüş sanatları ustası Samion ailesinden gelen Daven, tek kollu bir askerdir. Sağ kolu olmadığı için uğradığı tüm hakaretlere rağmen Samion ailesinin ana soyunu yenmeyi başarır. Fakat ailesi tarafından ihanete uğrayıp sefalet içinde öldükten sonra reenkarne olur. “Sağ kolumu hissedebiliyorum.” Artık yeni bir ailesi ve doğuştan yetenekli bir vücudu vardır. Geçmişten gelen tecrübesi ve yarı tanrı olan Julian sayesinde her şey değişir ve Daven’ın yeni macerası başlar. Seri Adı: Reenkarne Ölçünü / The Art of Reincarnation Açıklama: İhanete uğrayan tek kollu dövüş sanatları ustası Daven, sağlıklı bir bedende yeniden doğar ve geçmiş tecrübeleriyle en güçlü olmak için yeni bir maceraya atılır. The Art of Reincarnation oku The Art of Reincarnation türkçe oku The Reincarnated War God oku Hwansaengmusin oku 환생무신 türkçe oku<br><br>Alternatif Başlık: Standard of Reincarnation |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 194 chapters |  |  |  |
| chapter dates | PASS | 194 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://merlintoon.com/.../0001.jpg` (image/jpeg, 191687 bytes, 1200x800) |  |  |  |
