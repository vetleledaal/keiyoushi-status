# Extension Validation Report

- Extension: tachiyomi-ar.arabhentai-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6899943547168982381
- Source name: مانجا باب
- Source language: ar
- Selected manga input: popular offset 0: Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Smart App Life (`.../smart-app-life`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | صديقات أختي (`.../sdykat-akhty`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Demon I Raised Won’t Let the Saintess Escape (`.../the-demon-i-raised-wont-let-the-saintess-escape`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 98 | الفصل 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Regressed Warrior’s Female Dominance, URL=`.../regressed-warriors-female-dominance` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaonl.com/.../regressed-warriors-female-dominance.webp` (image/webp (encoding: lossy), 7646 bytes, 402x497) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../regressed-warriors-female-dominance` |  |  |  |
| details thumbnail URL | PASS | `https://mangaonl.com/.../regressed-warriors-female-dominance.webp` |  |  |  |
| details author | PASS | جارٍ التحديث |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | اكشن, حريم, خيال, دراما, مانجا - مانهوا, وحوش, 18+ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Regressed Warrior’s Female Dominance أونلاين، قراءة Regressed Warrior’s Female Dominance مجانًا، Regressed Warrior’s Female Dominance مانجا هنتاي، Regressed Warrior’s Female Dominance هنتاي مترجم |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 98 chapters |  |  |  |
| chapter dates | PASS | 98 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangaonl.com/.../regressed-warriors-female-dominance.webp` to `https://mangaonl.com/.../warning.webp` (1 redirects) |  |  |  |
| page load | FAIL | First page URL `https://arabmanga.hel1.your-objectstorage.com/.../page_0.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
