# Extension Validation Report

- Extension: tachiyomi-tr.korelimanga-v1.6.10
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: initmanga
- Source ID: 1381583102051609700
- Source name: Koreli Manga
- Source language: tr
- Selected manga input: popular offset 0: Kan Bağıyla Borçlu (`.../kan-bagiyla-borclu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Kan Bağıyla Borçlu (`.../kan-bagiyla-borclu`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Henüz Yaşanmayanlar Üzerine (`.../henuz-yasanmayanlar-uzerine`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Takıntılı Başrolün Eski Eşi Oldum (`.../takintili-basrolun-eski-esi-oldum`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Dünyayı Kurtarmak İçin Bir Çekiç Seçtim (`.../dunyayi-kurtarmak-icin-bir-cekic-sectim`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kan Bağıyla Borçlu (`.../kan-bagiyla-borclu`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kan Bağıyla Borçlu (`.../kan-bagiyla-borclu`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 29 | Bölüm 1 (`.../bolum-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 50 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kan Bağıyla Borçlu, URL=`.../kan-bagiyla-borclu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ragnarscans2.com/.../sms-cover-327019.webp` (image/webp (encoding: lossy), 166520 bytes, 1696x2458) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kan-bagiyla-borclu` |  |  |  |
| details thumbnail URL | PASS | `https://ragnarscans2.com/.../sms-cover-327019.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Çete, Dövüş, İntikam, karanlık, kötü karakter, mafya, Öğretmen, olgun i̇çerik, Şiddet, Suçlu Gençler, Trajedi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kim Sang-An, soğukkanlı bir tefecidir. Öğretmen olan kız kardeşi, öğrencilerinin bitmek bilmeyen zorbalıkları yüzünden canına kıydığında, onun hayatının bedelini tahsil etmek için tam da o öğrencilerin sınıf öğretmeni olur. Cehenneme inmek anlamına gelse bile borçlarını tahsil edecek acımasız bir tefeci ve şeytan gibi öğrencilerden oluşan bir sınıf... Acımasız, çarpık bir öğretmen-öğrenci ilişkisi. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 29 chapters |  |  |  |
| chapter dates | PASS | 29 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ragnarscans2.com/.../0001.webp` (image/webp (encoding: lossy), 493542 bytes, 800x10736) |  |  |  |
