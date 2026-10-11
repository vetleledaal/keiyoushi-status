# Extension Validation Report

- Extension: tachiyomi-tr.mangaship-v1.4.4
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7110025728969951060
- Source name: Manga Bahçesi
- Source language: tr
- Selected manga input: latest offset 0: Zindanın Karşısındaki SSS- Seviye Kafe (`.../zindanin-karsisindaki-sss-seviye-kafe`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | Boruto: İki Mavi Girdap (`.../boruto-naruto-next-generations`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 16 | I Lost the Leash of the Yandere Male Lead (`.../i-lost-the-leash-of-the-yandere-male-lead`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 16 | Zindanın Karşısındaki SSS- Seviye Kafe (`.../zindanin-karsisindaki-sss-seviye-kafe`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | Ooh La La (`.../ooh-la-la`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Zindanın Karşısındaki SSS- Seviye Kafe (`.../zindanin-karsisindaki-sss-seviye-kafe`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 30 | Zindanın Karşısındaki SSS- Sev - 1.Bölüm Hayata Yeniden Merha... (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Bölümleri okumak için WebView üzerinden giriş yapmalısınız. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Bölümleri okumak için WebView üzerinden giriş yapmalısınız. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 64/64 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 64/64 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangabahcesi.com/.../decrypt <redacted query values: id>` (image/jpeg, 372021 bytes, 600x858) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../zindanin-karsisindaki-sss-seviye-kafe` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangabahcesi.com/.../decrypt <redacted query values: id>` (image/jpeg, 372021 bytes, 600x858) |  |  |  |
| details author | PASS | Lee Woo-hee |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantastik |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Kelimenin tam anlamıyla ölümüne çalışan bir beyaz yakalı "Zindan Kırılımı"na yakalanır ve kendini 3 yıl öncesinde bulur! "Elveda, kurumsal kölelik! Bu sefer "Bir Kere Geliyorum Bu Hayata" felsefesine göre yaşayacağım! Az çalış, çok yat!" Huzurlu bir hayat ümidiyle rahmetli anneannesinin eski dükkanında bir kafe açar... Ta ki... \[Sınıf Açığa Çıktı: Kafe Sahibi (F-Seviye)\] \[Beceri Elde Edildi: "Avcumdaki Kafe (Svy. 1)"\] \[Görev Başladı: 100 bardak kahve karışımı yap (0/100)\] \[Eşya: Kahve Karışımı - Yenilenme hızını %100 artırır.\] "Maaş kölesi olmaktan vazgeçmiştim... Kahvenin kölesi olmak için mi vazgeçtim?!" Bekle- Neden sistem bana "Yaklaşmakta olan ölümden kaçın" uyarısı veriyor? Aşırı güçlü kahve karışımları sunmak ve kötü sondan kaçınmak arasında, hayalindeki "iyileştirici hayat" "öldürücü(huzurlu) hayata" dönecek mi?! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Bölümleri okumak için WebView üzerinden giriş yapmalısınız. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
