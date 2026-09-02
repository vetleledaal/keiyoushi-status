# Extension Validation Report

- Extension: tachiyomi-tr.patimanga-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6167788720399583825
- Source name: Pati Manga
- Source language: tr
- Selected manga input: popular offset 0: Aşık Olduğum Adam Eski Nişanlımın Büyükbabası (`.../asik-oldugum-adam-eski-nisanlimin-buyukbabasi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Aşık Olduğum Adam Eski Nişanlımın Büyükbabası (`.../asik-oldugum-adam-eski-nisanlimin-buyukbabasi`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Erkek Başrollerle Uzak Bir Adada Mahsur Kaldım (`.../erkek-basrollerle-uzak-bir-adada-mahsur-kaldim`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Yanlışlıkla Erkek Ana Karakterin Küçük Kardeşini Ayarttım (`.../yanlislikla-erkek-ana-karakterin-kucuk-kardesini-ayarttim`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Trajedi Romanının Güçlü Kadın Kahramanı (`.../trajedi-romaninin-guclu-kadin-kahramani`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Aşık Olduğum Adam Eski Nişanlımın Büyükbabası (`.../asik-oldugum-adam-eski-nisanlimin-buyukbabasi`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Aşık Olduğum Adam Eski Nişanlımın Büyükbabası (`.../asik-oldugum-adam-eski-nisanlimin-buyukbabasi`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 69 | Bölüm 01 (`.../asik-oldugum-adam-eski-nisanlimin-buyukbabasi-bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 4 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Aşık Olduğum Adam Eski Nişanlımın Büyükbabası, URL=`.../asik-oldugum-adam-eski-nisanlimin-buyukbabasi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.patimanga.com/.../Baslksz15_20250325050631.png` (image/png, 3386664 bytes, 1448x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../asik-oldugum-adam-eski-nisanlimin-buyukbabasi` |  |  |  |
| details thumbnail URL | PASS | `https://www.patimanga.com/.../Baslksz15_20250325050631.png` |  |  |  |
| details author | PASS | hanza |  |  |  |
| details artist | PASS | hanza |  |  |  |
| details genres | PASS | Büyü, Drama, Fantastik, Hayattan kesitler, Komedi, Manhwa, Reenkarne, Romantik, Shoujo, Tarih, Webtoon, Yaş farkı |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Nişanlısı tarafından reddedildikten sonra, 20 yaşındaki Mary Menoushire şoktan bayıldı. Daha sonra başka bir dünyadan gelen 50 yaşında bir kadın tarafından ele geçirildi… (eski) nişanlısının büyükbabasının daha çekici olduğunu düşünüyor. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 69 chapters |  |  |  |
| chapter dates | PASS | 69 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.patimanga.com/.../AddText_12-31-06.27.01.jpg` (image/jpeg, 588101 bytes, 1440x1000) |  |  |  |
