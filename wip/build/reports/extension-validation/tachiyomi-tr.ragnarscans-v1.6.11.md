# Extension Validation Report

- Extension: tachiyomi-tr.ragnarscans-v1.6.11
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: initmanga
- Source ID: 1571842183434448758
- Source name: Ragnar Scans
- Source language: tr
- Selected manga input: popular offset 0: Logging 10,000 Years into the Future (`.../logging-10000-years-into-the-future`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Logging 10,000 Years into the Future (`.../logging-10000-years-into-the-future`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Yumruk Kralı’nın Fethi (`.../reincarnation-of-the-fist-king`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Şeytani Çağ (`.../seytani-cag-2`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Paragöz Şövalye (`.../paragoz-sovalye`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | Logging 10,000 Years into the Future (`.../logging-10000-years-into-the-future`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Logging 10,000 Years into the Future (`.../logging-10000-years-into-the-future`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 314 | 🔒 Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Logging 10,000 Years into the Future, URL=`.../logging-10000-years-into-the-future` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 106/106 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 106/106 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ragnarscans2.com/.../gelecege-giris-kapak-300x400.webp` (image/webp (encoding: lossy), 101856 bytes, 775x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../logging-10000-years-into-the-future` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://ragnarscans2.com/.../gelecege-giris-kapak-775x1024.webp` was not downloaded |  |  |  |
| details author | PASS | ragnarscans |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aksiyon, Büyü, Çin, Dövüş Sanatları |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dövüş sanatları çağındaki devrimin şafağında, korkutucu canavarlar birer birer insanlığın savaşçılarını öldürerek dünyayı işgal etmeye başlar. bir gün Lu Sheng kendini temel fiziksel eğitim tekniklerinin değiştirilip daha etkili binlercesine dönüstürüldüğü on binlerce yıl sonrasını hayal ederken bulur. nefes alma teknikleri, vücut güçlendirme yolları, dövüş sanatları yazıtları, ve daha fazlası… ama gelecek dünyada insanlığın tükenmiş olmasıyla birlikte, bir zamanların büyük dövüş sanatlarının mirasını devam ettirecek kimse kalmaz. Lu Sheng dışında hiç kimse!<br><br>Alternatif Başlık: Logging 10,000 Years into the Future / Geleceğe Giriş |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 314 chapters |  |  |  |
| chapter dates | PASS | 314 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
