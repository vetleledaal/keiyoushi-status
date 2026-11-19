# Extension Validation Report

- Extension: tachiyomi-tr.mangaship-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 1
- Skipped: 1
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7110025728969951060
- Source name: Manga Bahçesi
- Source language: tr
- Selected manga input: popular offset 0: Boruto: İki Mavi Girdap (`.../boruto-naruto-next-generations`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Boruto: İki Mavi Girdap (`.../boruto-naruto-next-generations`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | I Lost the Leash of the Yandere Male Lead (`.../i-lost-the-leash-of-the-yandere-male-lead`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | Zindanın Karşısındaki SSS- Seviye Kafe (`.../zindanin-karsisindaki-sss-seviye-kafe`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Ooh La La (`.../ooh-la-la`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | Ayakashi Üçgeni (`.../ayakashi-triangle`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Boruto: İki Mavi Girdap (`.../boruto-naruto-next-generations`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 119 | 1. Bölüm Uzumaki Boruto (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 6 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 70/70 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | LINT | 0/70 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | PASS | Details preserved selected URL `.../boruto-naruto-next-generations` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Masashi Kishimoto |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Doğaüstü Güçler, Aksiyon, Fantastik, Animeli Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Babasının ilgisini çekebilmek için sınavda hile yapıp yakalanan Boruto, sınav esnasında gelen davetsiz misafirlerin babasını kaçırmasıyla kurtarma takımına katılır ve içinde yeni bir güç doğar... (Naruto mangasını bitirdikten sonra bu mangaya başlayın.) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 119 chapters |  |  |  |
| chapter dates | PASS | 119 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangabahcesi.com/.../Search <redacted query values: tur, kelime, mangaTuru, durum, and page>` to `https://mangabahcesi.com/.../boruto-naruto-next-generations` (1 redirects) |  |  |  |
| page load | FAIL | First page URL `https://mangabahcesi.com/.../decrypt <redacted query values: id>` could not be downloaded: java.net.UnknownHostException: mangabahcesi.commangaship: Name or service not known | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
