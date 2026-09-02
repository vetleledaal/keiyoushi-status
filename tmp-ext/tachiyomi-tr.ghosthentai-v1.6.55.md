# Extension Validation Report

- Extension: tachiyomi-tr.ghosthentai-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8123244641427878412
- Source name: GhosToon
- Source language: tr
- Selected manga input: popular offset 0: The Kid Is Obsessed With Me (`.../184`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Kid Is Obsessed With Me (`.../184`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The End of the World (`.../176`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Holding You Captive (`.../1141`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Predatory Marriage (`.../170`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Kid Is Obsessed With Me (`.../184`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Kid Is Obsessed With Me (`.../184`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Kid Is Obsessed With Me, URL=`184` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ghostoon.com/.../The-Kid-Is-Obsessed-With-Me-lzhin-manhwa-free-224x320-1-175x238.jpg` (image/jpeg, 10942 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `184` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ghostoon.com/.../The-Kid-Is-Obsessed-With-Me-lzhin-manhwa-free-224x320-1.jpg` (image/jpeg, 19277 bytes, 224x320) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Büyükler için, Drama, Final, Josei, Ofis, Smut, FİNAL |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Y Grubunun en küçük kızı olan Im Bona, görünüşe, figüre ve zenginliğe sahip. Bütün paketi aldı. Ancak 14 yıldır aşkının peşinde koşuyor. Büyüdüğünde evleneceklerine dair verdiği söz nedeniyle her gün çilekli süt içerek formunu özenle korumuştur. Artık tek taraflı aşka son verme zamanı geldi çattı. Ama bu adam… 14 yıl geçmesine rağmen hâlâ bana çocukmuşum gibi davranıyor… “Bana çocukmuşum gibi davranmaya devam mı edeceksin?! Hiç C-cup göğüslü bir çocuk gördünüz mü? Bona’nın ilk aşkı Eunho’ya karşı 19 puanlık takıntısı, çalışkanlığın, samimiyetin ve tutumluluğun modeli olmaya başlıyor. “B-Bona… benimle yapmak istediğin şey bu muydu…?!”<br><br>Alternative Names: Çocuk Bana Takıntılı |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | LINT | All 50 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=50 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s3.melek.lol/.../00.jpg` (image/jpeg, 619842 bytes, 1300x1000) |  |  |  |
