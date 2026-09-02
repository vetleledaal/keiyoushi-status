# Extension Validation Report

- Extension: tachiyomi-tr.ragnarscans-v1.4.51
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1571842183434448758
- Source name: Ragnar Scans
- Source language: tr
- Selected manga input: latest offset 0: Cehennem Girişi Aksiyon · Fantastik · Manhwa Cehennem Girişi   (`.../cehennem-girisi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Sonsuz Döngüde Hapsolan Aksiyon · Doğaüstü · Dram Sonsuz Döngüde Hapsolan (`.../sonsuz-dongude-hapsolan`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Paralı Askerin Soylular Arasında Yeniden Doğuşu Aksiyon · Fantastik · Macera Paralı Askerin Soylular Arasında Yeniden Doğuşu (`.../parali-askerin-soylular-arasinda-yeniden-dogusu`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Cehennem Girişi Aksiyon · Fantastik · Manhwa Cehennem Girişi   (`.../cehennem-girisi`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Romantik Fantezimden Defol! Fantastik · Romantik · Shoujo Romantik Fantezimden Defol!   (`.../romantik-fantezimden-defol`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 10 | Cehennem Girişi (`.../cehennem-girisi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cehennem Girişi (`.../cehennem-girisi`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 8 | Bölüm 1 (`.../bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cehennem Girişi, URL=`.../cehennem-girisi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 106/106 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 106/106 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://ragnarscans.net/.../thumbnail.svg` -> 2 manga URLs (examples: `.../koreli-scans-turkce-kore-webtoon-ve-manhwa-kaynaklari`, `.../mangaoku-tr-turkce-manga-ve-manhwa-okuma-rehberi`) |  |  |  |
| thumbnail | PASS | `https://ragnarscans.net/.../ChatGPT-Image-1-Eyl-2026-21_47_42-300x400-1.webp` (image/webp (encoding: lossy), 33586 bytes, 300x400) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Cehennem Girişi Aksiyon · Fantastik · Manhwa Cehennem Girişi   to Cehennem Girişi |  |  |  |
| details thumbnail URL | PASS | `https://ragnarscans.net/.../ChatGPT-Image-1-Eyl-2026-21_47_42-300x400-1.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Aksiyon, Fantastik, Manhwa, Psikolojik, Bitmesine 32 dakika kaldı |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Han Aram’ın çocukluğunda tek sığınağı olan oyun: Last Eden.Kendisine tıpatıp benzeyen bir NPC olan Eve ile birlikte sıralamanın zirvesine tırmandı. Ancak oyun kapatıldığında her şeyini kaybetti.Sonra, tam da gerçeklik ile oyun arasındaki sınırın ortadan kalkmasını dilediği sırada, Eve karşısına çıkıp bir teklifte bulundu:“İki dünyayı birleştirelim… ve birlikte yönetelim.”“Neden… kendimle güçlerimi birleştireyim ki? Zaten en güçlüsüyüm.”Oyunun dünya bir numarası Han Aram, gerçek dünyayı paramparça etmeye başlar.<br><br>Alternatif Başlık: Hellogin, Hell Login, Nightmare login, 헬 로그인 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ragnarscans.net/.../0001.webp` (image/webp (encoding: lossy), 115256 bytes, 1536x1024) |  |  |  |
