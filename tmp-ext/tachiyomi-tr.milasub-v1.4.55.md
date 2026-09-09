# Extension Validation Report

- Extension: tachiyomi-tr.milasub-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 0
- Warnings: 3
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 5672794736121634742
- Source name: MilaSub
- Source language: tr
- Selected manga input: popular offset 0: Sıradan Bir İsekai Romanı Sanmıştım (`.../siradan-bir-isekai-romani-sanmistim`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Sıradan Bir İsekai Romanı Sanmıştım (`.../siradan-bir-isekai-romani-sanmistim`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Çile Çiçeği’nden Kaçacağım (`.../i-will-escape-from-the-flower-of-ordeals`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Zaman Şifacısı Ceres (`.../zaman-sifacisi-ceres`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Düşmüş İmparatoriçe Maria (`.../deposed-empress-maria`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Sıradan Bir İsekai Romanı Sanmıştım (`.../siradan-bir-isekai-romani-sanmistim`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Sıradan Bir İsekai Romanı Sanmıştım (`.../siradan-bir-isekai-romani-sanmistim`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 115 | 1 (`https://millascan.com/.../1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Inicie sesión en WebView para ver este capítulo | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Inicie sesión en WebView para ver este capítulo | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sıradan Bir İsekai Romanı Sanmıştım, URL=`.../siradan-bir-isekai-romani-sanmistim` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://millascan.com/.../kapk.jpg` -> all 34 manga URLs (examples: `.../siradan-bir-isekai-romani-sanmistim`, `.../merry-psycho`, `.../childhood-friend-complex`) |  |  |  |
| thumbnail | PASS | `https://millascan.com/.../kapk.jpg` (image/jpeg, 1487707 bytes, 1785x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../siradan-bir-isekai-romani-sanmistim` |  |  |  |
| details thumbnail URL | PASS | `https://millascan.com/.../kapk.jpg` |  |  |  |
| details author | PASS | DOYOSAY |  |  |  |
| details artist | PASS | DOYOSAY |  |  |  |
| details genres | PASS | Dram, Fantastik, Romantik, Shoujo |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Kocasının ellerinde can veren kötü kadın olarak yeniden doğdum, ama bu klişe konuya oldukça hakimim! Kötü kadın olmamın cezası olarak haksız yere ölmemin oldukça adil olduğunu düşünmüştüm ta ki ana hikayeden sapamadığımı fark edene kadar. Madem her türlü öleceğim. o zaman yakışıklı kocamdan bir öpücük çalayım! “Lütfen beni Ridelhoffun sinsi çiçeği adına layık olduğunu gösterir biçimde tatmin et kim bilir yapabilirsen bundan bir fayda saglayabilirsin” …Neden ana hikaye değişmeye başladı? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 115 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Inicie sesión en WebView para ver este capítulo |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | details: `https://www.millascan.com/.../siradan-bir-isekai-romani-sanmistim` to `https://millascan.com/.../siradan-bir-isekai-romani-sanmistim` (1 redirects); chapters: `https://www.millascan.com/.../siradan-bir-isekai-romani-sanmistim` to `https://millascan.com/.../siradan-bir-isekai-romani-sanmistim` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
