# Extension Validation Report

- Extension: tachiyomi-id.mynimeku-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6284366006264742121
- Source name: MyNimeku
- Source language: id
- Selected manga input: popular offset 0: Iribitari Gal ni Ma〇ko Tsukawasete Morau Hanashi (`.../iribitari-gal-ni-ma%E3%80%87ko-tsukawasete-morau-hanashi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Iribitari Gal ni Ma〇ko Tsukawasete Morau Hanashi (`.../iribitari-gal-ni-ma%E3%80%87ko-tsukawasete-morau-hanashi`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Dark Summoner to Dekiteiru (`.../dark-summoner-to-dekiteiru`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Trash of the Count’s Family (`.../trash-of-the-counts-family`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Yuusha ni Zenbu Ubawareta Ore wa Yuusha no Hahaoya to Party wo Kumimashita! (`.../yuusha-ni-zenbu-ubawareta-ore-wa-yuusha-no-hahaoya-to-party-wo-kumimashita`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Iribitari Gal ni Ma〇ko Tsukawasete Morau Hanashi (`.../iribitari-gal-ni-ma%E3%80%87ko-tsukawasete-morau-hanashi`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Iribitari Gal ni Ma〇ko Tsukawasete Morau Hanashi (`.../iribitari-gal-ni-ma%E3%80%87ko-tsukawasete-morau-hanashi`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Iribitari Gal ni Ma〇ko Tsukawasete Morau Hanashi Chapter 01 (`.../iribitari-gal-ni-ma%E3%80%87ko-tsukawasete-morau-hanashi-chapter-01-bahasa-indonesia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Iribitari Gal ni Ma〇ko Tsukawasete Morau Hanashi, URL=`.../iribitari-gal-ni-ma%E3%80%87ko-tsukawasete-morau-hanashi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.mynimeku.com/.../276534I.avif` (image/avif (format: avif), 10746 bytes, 225x318) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../iribitari-gal-ni-ma%E3%80%87ko-tsukawasete-morau-hanashi` |  |  |  |
| details thumbnail URL | PASS | `https://www.mynimeku.com/.../276534I.avif` |  |  |  |
| details author | PASS | Manno |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai, DOUJINSHI |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kuroda mampir ke rumah teman sekelasnya yang kutu buku setiap kali ia ingin membaca komiknya, tetapi tidak tanpa imbalan. Saat ia bersantai di kamarnya, si kutu buku diizinkan menggunakan tubuhnya.<br><br>(Sumber: Irodori Comics)<br><br>**Alternative Names:**<br>- 入り浸りギャルにま〇こ使わせて貰う話<br>- Drop-in Gyaru Lets Me Use Her Pussy<br>- The Gyaru I Hang Out with Lets Me Use Her Pussy |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://image.mydriveku.my.id/.../fB09HCsBEQI9BGAKIz0XRCEGPzsAEAU4KD4EKjFCfjoy` (image/webp (container: extended), 166332 bytes, 993x1400) |  |  |  |
