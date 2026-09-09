# Extension Validation Report

- Extension: tachiyomi-tr.paradoxscans-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 3
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: initmanga
- Source ID: 3730980240510982131
- Source name: Paradox Scans
- Source language: tr
- Selected manga input: popular offset 0: Dahi Sıradan Bir Hayat İstiyor (`.../dahi-siradan-bir-hayat-istiyor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Dahi Sıradan Bir Hayat İstiyor (`.../dahi-siradan-bir-hayat-istiyor`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Tiran Kız Nero’nun İsyanı (`.../tiran-kiz-neronun-isyani`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Hua Dağı Mezhebinin Dönüşü (`.../hua-dagi-mezhebinin-donusu`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Büyücü Ailesinin En Küçüğü (`.../buyucu-ailesinin-en-kucugu`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 10 | Dahi Sıradan Bir Hayat İstiyor (`.../dahi-siradan-bir-hayat-istiyor`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Dahi Sıradan Bir Hayat İstiyor (`.../dahi-siradan-bir-hayat-istiyor`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 73 | Bölüm 1 (`.../bolum-1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dahi Sıradan Bir Hayat İstiyor, URL=`.../dahi-siradan-bir-hayat-istiyor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 106/106 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 106/106 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://paradoxscans.com/.../gorsel_2026-09-09_183046429-300x400.png` (image/png, 258649 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../dahi-siradan-bir-hayat-istiyor` |  |  |  |
| details thumbnail URL | FAIL | Thumbnail URL `data:image/gif;base64,R0lGODdhAQABAPAAAMPDwwAAACwAAAAAAQABAAACAkQBADs=` is not an absolute HTTP(S) URL (data scheme) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | drama, Fantazi, Geri Dönüş, 4h 52m to finish |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Her şeye sahip olduğu halde hiçbir şeyi olmayan bir adam. Başarılı şirket yöneticisi Jinhyeok Son’un gerçekten istediği tek şey, sevdiği ailesiyle birlikte sıradan bir hayat sürmekti; bu arzu, çocukken anne babasının trajik ölümünden kaynaklanıyordu. Bir kaza sonucu kendini dokuz yaşındaki bedeninde bulduktan sonra her şey değişir — anne babasının hâlâ hayatta olduğu bir zamana, geri dönmeyi özlediği tam da o hayata! Jinhyeok geçmişi değiştirebilecek ve sonunda sıradan bir hayat sürme hayalini gerçekleştirebilecek mi?<br><br>Alternatif Başlık: Dahi Sıradan Bir Hayat İstiyor • The Genius Wants an Ordinary Life • The Genius Decided to Live an Ordinary Life • Cheonjae neun Pyeongbeomhage Salgiro Haetdeo • 천재는 평범하게 살기로 했더 • 二度目の天才は平和に暮らすことにした！ • 天才决定过平凡生活 • เบื่อละ ชีวิตอัจฉริยะ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 73 chapters |  |  |  |
| chapter dates | PASS | 73 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://c1.skycdn.online/.../0001.jpg` (image/jpeg, 1310450 bytes, 760x14000) |  |  |  |
