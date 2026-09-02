# Extension Validation Report

- Extension: tachiyomi-id.pixhentai-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7447468764477211885
- Source name: Pix Hentai
- Source language: id
- Selected manga input: popular offset 0: Ane no tomodachi ni fude-oroshi shite morau hanashi (`.../ane-no-tomodachi-ni-fude-oroshi-shite-morau-hanashi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Ane no tomodachi ni fude-oroshi shite morau hanashi (`.../ane-no-tomodachi-ni-fude-oroshi-shite-morau-hanashi`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 8 | Go Shishoku Ikagadesuka? (`.../go-shishoku-ikagadesuka`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ane no tomodachi ni fude-oroshi shite morau hanashi (`.../ane-no-tomodachi-ni-fude-oroshi-shite-morau-hanashi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ane no tomodachi ni fude-oroshi shite morau hanashi (`.../ane-no-tomodachi-ni-fude-oroshi-shite-morau-hanashi`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../ane-no-tomodachi-ni-fude-oroshi-shite-morau-hanashi`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ane no tomodachi ni fude-oroshi shite morau hanashi, URL=`.../ane-no-tomodachi-ni-fude-oroshi-shite-morau-hanashi` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 17/17 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 17/17 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pixhentai.com/.../Ane-no-tomodachi-ni-fude-oroshi-shite-morau-hanashi-cover-200x285.jpg` (image/jpeg, 15681 bytes, 200x285) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ane-no-tomodachi-ni-fude-oroshi-shite-morau-hanashi` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://pixhentai.com/.../Ane-no-tomodachi-ni-fude-oroshi-shite-morau-hanashi-cover.jpg` (image/jpeg, 254763 bytes, 850x1200) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big Boobs, Blowjob, Paizuri, Sub Indo, Toket Besar, Uncensored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Baca komik hentai manga sex doujinshi xxx bokep berjudul Ane no tomodachi ni fude-oroshi shite morau hanashi. karakter utama tertarik kepada Asuka, teman kakak perempuannya yang main ke rumah. Asuka berwajah cantik dan dadanya sangat berisi. Dalam fantasinya, ia membayangkan Asuka yang pemalu menginap di rumahnya lalu tanpa sengaja berpapasan dengan Asuka yang baru saja selesai mandi dalam keadaan telanjang bulat. Akankah fantasinya itu menjadi kenyataan? Simak ceritanya di manga hentai xxx komik dewasa bokep doujin sex di bawah ini. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.openhentai.net/.../Ane-no-tomodachi-ni-fude-oroshi-shite-morau-hanashi-%20(1).webp` (image/webp (container: extended), 424804 bytes, 1360x1920) |  |  |  |
