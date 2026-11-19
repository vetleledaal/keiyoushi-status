# Extension Validation Report

- Extension: tachiyomi-id.pixhentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: oceanwp
- Source ID: 7447468764477211885
- Source name: Pix Hentai
- Source language: id
- Selected manga input: popular offset 0: Iiwa, Watashi no Karada Suki ni Shite – Kyouraku biyori (`.../iiwa-watashi-no-karada-suki-ni-shite-kyouraku-biyori`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Iiwa, Watashi no Karada Suki ni Shite – Kyouraku biyori (`.../iiwa-watashi-no-karada-suki-ni-shite-kyouraku-biyori`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 8 | Watashi, Nusundemasen! Beer Garden no Uriko Baito ni Kita Dake Nanoni… (`.../watashi-nusundemasen-beer-garden-no-uriko-baito-ni-kita-dake-nanoni`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Iiwa, Watashi no Karada Suki ni Shite – Kyouraku biyori (`.../iiwa-watashi-no-karada-suki-ni-shite-kyouraku-biyori`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Iiwa, Watashi no Karada Suki ni Shite – Kyouraku biyori (`.../iiwa-watashi-no-karada-suki-ni-shite-kyouraku-biyori`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../iiwa-watashi-no-karada-suki-ni-shite-kyouraku-biyori`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Iiwa, Watashi no Karada Suki ni Shite – Kyouraku biyori, URL=`.../iiwa-watashi-no-karada-suki-ni-shite-kyouraku-biyori` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 17/17 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 17/17 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pixhentai.com/.../Iiwa-Watashi-no-Karada-Suki-ni-Shite-Kyouraku-biyori-cover-200x285.jpg` (image/jpeg, 13935 bytes, 200x285) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../iiwa-watashi-no-karada-suki-ni-shite-kyouraku-biyori` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://pixhentai.com/.../Iiwa-Watashi-no-Karada-Suki-ni-Shite-Kyouraku-biyori-cover.jpg` (image/jpeg, 127737 bytes, 748x1022) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big Boobs, Big butt, Blowjob, Cheating, Doggy, Housewife, Large Breasts, Milf, Missionary, Ngentot Tante, Selingkuh, Sub Indo, Toket Besar |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Baca komik hentai manga sex doujinshi xxx bokep berjudul Iiwa, Watashi no Karada Suki ni Shite – Kyouraku biyori. Selama libur musim panas Kouki jadi sering main ke rumah Hayato, tetapi bukan untuk bermain bersama temannya tersebut melainkan bermain bersama tante Kasumi. Bagi ibu rumah tangga yang sedang bosan seperti tante Kasumi, tidak ada hiburan yang lebih mantap daripada penis mudanya Kouki. Cerita selengkapnya di manga hentai xxx komik dewasa bokep doujin sex di bawah ini. Chapter : Iiwa, Watashi no Karada Suki ni Shite – Anata no tame nara nando demo \[zenpen\] Iiwa, Watashi no Karada Suki ni Shite – Anata no tame nara nando demo \[kouhen\] Iiwa, Watashi no Karada Suki ni Shite – Kyouraku biyori |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.openhentai.net/.../Iiwa-Watashi-no-Karada-Suki-ni-Shite-Kyouraku-biyori-%20(1).webp` (image/webp (container: extended), 573072 bytes, 1057x1500) |  |  |  |
