# Extension Validation Report

- Extension: tachiyomi-tr.shijiescans-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 876756264275379458
- Source name: Shijie Scans
- Source language: tr
- Selected manga input: popular offset 0: Nano Machine (`.../nano-machine`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Nano Machine (`.../nano-machine`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Aşağı Dünyanın Efendisi (`.../asagi-dunyanin-efendisi`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Home at the Horizon (`.../home-at-the-horizon`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Hua Dağı Mezhebinin Dönüşü (`.../return-of-the-mount-hua-sect`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Gel Beni Al! (`.../gel-beni-al`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Nano Machine (`.../nano-machine`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 194 | Bölüm 1 - Giriş (`.../nano-machine-bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Nano Machine, URL=`.../nano-machine` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://shijiescans.com/.../thumbnail_IMAG21_75c6a3cc-c4d1-4b51-a945-029aff772a63_kopya-231x300.png` (image/png, 164327 bytes, 231x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../nano-machine` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://shijiescans.com/.../thumbnail_IMAG21_75c6a3cc-c4d1-4b51-a945-029aff772a63_kopya.png` (image/png, 533036 bytes, 480x623) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Bölüm 167 - Beş Büyük Savaş Sanatçısının Selefi (2) |  |  |  |
| details genres | PASS | Aksiyon, Bilim kurgu, Dövüş sanatları, Fantezi, Harem, Macera, Murim, Shounen, Tarihi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Hor görülüp hayatı tehlikeye atılan, Şeytani Tarikatında bir öksüz olan Cheon Yeo-Woon; aniden gelecekten gelen, onun vücuduna nano makine yerleştiren torununun ziyaretiyle şaşkınlığa uğrar. Nano makine aktif olduktan sonra hayatı büyük ölçüde değişen Cheon Yeo-Woon’un Şeytani Tarikatının içinden geçip en iyi dövüş sanatçısı olma hikayesi başlamış oldu.<br><br>Alternative Names: Nano Makine |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 194 chapters |  |  |  |
| chapter dates | PASS | 194 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://shijiescans.com/.../01-827.jpg` (image/jpeg, 311010 bytes, 800x5020) |  |  |  |
