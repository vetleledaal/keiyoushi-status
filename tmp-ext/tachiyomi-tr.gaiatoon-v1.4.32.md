# Extension Validation Report

- Extension: tachiyomi-tr.gaiatoon-v1.4.32
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7364322791901505063
- Source name: Gaiatoon
- Source language: tr
- Selected manga input: latest offset 0: Cafe Midnight (`.../cafe-midnight`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Ters Harem Oyununa Düştüm! (`.../ters-harem-oyununa-dustum`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 11 | Iris: The Lady and Her Smartphone (`.../iris-the-lady-and-her-smartphone`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Cafe Midnight (`.../cafe-midnight`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 11 | Erkek Başrollerin Düşmanı Oldum (`.../erkek-basrollerin-dusmani-oldum`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Cafe Midnight (`.../cafe-midnight`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cafe Midnight (`.../cafe-midnight`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 5 | Bölüm 1 (`.../cafe-midnight-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cafe Midnight, URL=`.../cafe-midnight` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gaiatoon.com/.../Late-Night-Cafe-215x300.jpeg` (image/jpeg, 15842 bytes, 215x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cafe-midnight` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://gaiatoon.com/.../Late-Night-Cafe.jpeg` (image/jpeg, 113021 bytes, 720x1006) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Sumin |  |  |  |
| details genres | PASS | Dram, Hayattan kesitler, Josei, Romantizm |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Cafe Midnight sıradan bir kafe değil. Gün batımından şafağa kadar açık, sahibi hiç yaşlanmıyor ve… burası bir zaman geçidi mi?! Farklı geçmişlere ve farklı dönemlere ait, anlatacak kendine özgü hikâyeleri olan ziyaretçiler buraya geliyor. Peki hepsinin ortak noktası ne? Bir şekilde yolları Cafe Midnight’a düşüyor ve burada geçmişte, günümüzde ve gelecekte yaşayanlarla karşılaşabiliyorlar. Kimse kafenin gerçek amacını tam olarak bilmiyor. Ancak bir şey kesin: Burası büyülü bir yer.<br><br>Alternative Names: Late Night Cafe, Cafe Midnight |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://gaiatoon.com/.../0-4.jpg` (image/jpeg, 1829715 bytes, 3292x1766) |  |  |  |
