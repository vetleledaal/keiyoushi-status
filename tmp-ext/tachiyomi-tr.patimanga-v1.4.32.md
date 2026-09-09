# Extension Validation Report

- Extension: tachiyomi-tr.patimanga-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 6167788720399583825
- Source name: Pati Manga
- Source language: tr
- Selected manga input: latest offset 0: Kurtarıcına Karşılık Vermelisin (`.../kurtaricina-karsilik-vermelisin`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Aşık Olduğum Adam Eski Nişanlımın Büyükbabası (`.../asik-oldugum-adam-eski-nisanlimin-buyukbabasi`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Erkek Başrollerle Uzak Bir Adada Mahsur Kaldım (`.../erkek-basrollerle-uzak-bir-adada-mahsur-kaldim`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Kurtarıcına Karşılık Vermelisin (`.../kurtaricina-karsilik-vermelisin`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Erkek başrol mü? İstemez! (`.../erkek-basrol-mu-istemez`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Kurtarıcına Karşılık Vermelisin (`.../kurtaricina-karsilik-vermelisin`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kurtarıcına Karşılık Vermelisin (`.../kurtaricina-karsilik-vermelisin`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 70 | Bölüm 01 (`.../kurtaricina-karsilik-vermelisin-bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kurtarıcına Karşılık Vermelisin, URL=`.../kurtaricina-karsilik-vermelisin` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.patimanga.com/.../ChatGPT_Image_1_Tem_2026_16_53_56.png` (image/png, 3102597 bytes, 1016x1548) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kurtaricina-karsilik-vermelisin` |  |  |  |
| details thumbnail URL | PASS | `https://www.patimanga.com/.../ChatGPT_Image_1_Tem_2026_16_53_56.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Büyü, Drama, Fantastik, Hayattan kesitler, Novel, Romantik, Shoujo, Tarih |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Haksız yere sürgüne gönderilen prensesi görünce küçük kız kardeşini hatırladı. Ona acıdı ve ona baktı… “Sayenizde sürgünde hiç yalnız kalmadım.” Prensesin ağabeyi isyan edip imparator oldu! Doğal olarak prensesin sürgünü sona erdi. “Geçen sefer hayatımı kurtardın, bu yüzden sen benim hayat kurtarıcımsın. Benimle İmparatorluk Sarayı’na gel.” Sonunda prensesle birlikte İmparatorluk Sarayı’na gitti ve imparatorla tanıştı… “…Jerald mı?” Durun bakalım, eski sevgilisi neden buradaydı? 💬 Bölüm Tepkileri 🔥 shipledim gittiii 0 shipledim gittiii Yeni bölüm lütfennn 0 Yeni bölüm lütfennn Şuan yer yarılsa da içine girsem 0 Şuan yer yarılsa da içine girsem Iyy bu ne!!! 0 Iyy bu ne!!! Muhehehehehe 0 Muhehehehehe Dokunmayın ağlayacağım 0 Dokunmayın ağlayacağım Ne diyoooo bu 0 Ne diyoooo bu İşte feraset işte mükemmelik 0 İşte feraset işte mükemmelik Yok canim ne duygulanması 0 Yok canim ne duygulanması |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 70 chapters |  |  |  |
| chapter dates | PASS | 70 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.patimanga.com/.../1372be5f21b153fa0f1ece0823dc079c-144x150.jpg` (image/jpeg, 8425 bytes, 144x150) |  |  |  |
