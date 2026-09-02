# Extension Validation Report

- Extension: tachiyomi-tr.mangaship-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
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
- Selected manga input: popular offset 0: Boruto: İki Mavi Girdap (`.../boruto-naruto-next-generations`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | Boruto: İki Mavi Girdap (`.../boruto-naruto-next-generations`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 16 | I Lost the Leash of the Yandere Male Lead (`.../i-lost-the-leash-of-the-yandere-male-lead`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 16 | Zindanın Karşısındaki SSS- Seviye Kafe (`.../zindanin-karsisindaki-sss-seviye-kafe`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | Ooh La La (`.../ooh-la-la`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Boruto: İki Mavi Girdap (`.../boruto-naruto-next-generations`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 116 | Boruto: İki Mavi Girdap 1. Bölüm Uzumaki Boruto (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: Bölümleri okumak için WebView üzerinden giriş yapmalısınız. | 1-10s |

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
| thumbnail | PASS | `https://mangabahcesi.com/.../decrypt <redacted query values: id>` (image/gif (format: 89a), 526403 bytes, 600x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../boruto-naruto-next-generations` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangabahcesi.com/.../decrypt <redacted query values: id>` (image/gif (format: 89a), 526403 bytes, 600x800) |  |  |  |
| details author | PASS | Masashi Kishimoto |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Doğaüstü Güçler, Aksiyon, Fantastik, Animeli Manga |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Babasının ilgisini çekebilmek için sınavda hile yapıp yakalanan Boruto, sınav esnasında gelen davetsiz misafirlerin babasını kaçırmasıyla kurtarma takımına katılır ve içinde yeni bir güç doğar... (Naruto mangasını bitirdikten sonra bu mangaya başlayın.) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 116 chapters |  |  |  |
| chapter dates | PASS | 116 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Bölümleri okumak için WebView üzerinden giriş yapmalısınız. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
