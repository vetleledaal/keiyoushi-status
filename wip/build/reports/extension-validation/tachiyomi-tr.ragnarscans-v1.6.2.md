# Extension Validation Report

- Extension: tachiyomi-tr.ragnarscans-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

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
| popular | `getPopularManga(1)` | success | 48 | Logging 10,000 Years into the Future (`.../logging-10000-years-into-the-future`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 48 | Yumruk Kralı’nın Fethi (`.../reincarnation-of-the-fist-king`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | Mutlak Kılıç Hissi (`.../mutlak-kilic-hissi`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Kıyametin İzleri (`.../kiyametin-izleri`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | Logging 10,000 Years into the Future (`.../logging-10000-years-into-the-future`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Logging 10,000 Years into the Future (`.../logging-10000-years-into-the-future`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 314 | 🔒 Bölüm 1 (`.../bolum-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Kilitli bölüm, okumak için siteye giriş yapmanız gerekiyor | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Kilitli bölüm, okumak için siteye giriş yapmanız gerekiyor | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Logging 10,000 Years into the Future, URL=`.../logging-10000-years-into-the-future` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 24 manga entries; Popular page 2 repeats 24 manga entries; Latest page 1 repeats 24 manga entries; Latest page 2 repeats 24 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 202/202 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 202/202 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ragnarscans.net/.../gelecege-giris-kapak-300x400.webp` (image/webp (encoding: lossy), 29232 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../logging-10000-years-into-the-future` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ragnarscans.net/.../gelecege-giris-kapak-450x600.webp` (image/webp (encoding: lossy), 51370 bytes, 450x600) |  |  |  |
| details author | PASS | ragnarscans |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Aksiyon, Büyü, Çin, Dövüş Sanatları, Bitmesine 20 saat 56 dakika kaldı |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dövüş sanatları çağındaki devrimin şafağında, korkutucu canavarlar birer birer insanlığın savaşçılarını öldürerek dünyayı işgal etmeye başlar. bir gün Lu Sheng kendini temel fiziksel eğitim tekniklerinin değiştirilip daha etkili binlercesine dönüstürüldüğü on binlerce yıl sonrasını hayal ederken bulur. nefes alma teknikleri, vücut güçlendirme yolları, dövüş sanatları yazıtları, ve daha fazlası… ama gelecek dünyada insanlığın tükenmiş olmasıyla birlikte, bir zamanların büyük dövüş sanatlarının mirasını devam ettirecek kimse kalmaz. Lu Sheng dışında hiç kimse!<br><br>Alternatif Başlık: Logging 10,000 Years into the Future / Geleceğe Giriş |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 314 chapters |  |  |  |
| chapter dates | PASS | 314 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Kilitli bölüm, okumak için siteye giriş yapmanız gerekiyor |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://ragnarscans.net/.../2` to `https://ragnarscans.net/.../2` (1 redirects); popular: `https://ragnarscans.net/.../3` to `https://ragnarscans.net/.../3` (1 redirects); popular: `https://ragnarscans.net/.../4` to `https://ragnarscans.net/.../4` (1 redirects); popular: `https://ragnarscans.net/.../5` to `https://ragnarscans.net/.../5` (1 redirects); popular: `https://ragnarscans.net/.../6` to `https://ragnarscans.net/.../6` (1 redirects); popular: `https://ragnarscans.net/.../7` to `https://ragnarscans.net/.../7` (1 redirects); popular: `https://ragnarscans.net/.../8` to `https://ragnarscans.net/.../8` (1 redirects); popular: `https://ragnarscans.net/.../9` to `https://ragnarscans.net/.../9` (1 redirects); popular: `https://ragnarscans.net/.../10` to `https://ragnarscans.net/.../10` (1 redirects); popular: `https://ragnarscans.net/.../11` to `https://ragnarscans.net/.../11` (1 redirects); popular: `https://ragnarscans.net/.../12` to `https://ragnarscans.net/.../12` (1 redirects); popular: `https://ragnarscans.net/.../13` to `https://ragnarscans.net/.../13` (1 redirects); popular: `https://ragnarscans.net/.../14` to `https://ragnarscans.net/.../14` (1 redirects); popular: `https://ragnarscans.net/.../15` to `https://ragnarscans.net/.../15` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
