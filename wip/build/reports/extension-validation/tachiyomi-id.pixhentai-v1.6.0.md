# Extension Validation Report

- Extension: tachiyomi-id.pixhentai-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: Yokkyuu Fuman na Inaka no Oyako wa Hassan-Saki ga Nai (`.../yokkyuu-fuman-na-inaka-no-oyako-wa-hassan-saki-ga-nai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Yokkyuu Fuman na Inaka no Oyako wa Hassan-Saki ga Nai (`.../yokkyuu-fuman-na-inaka-no-oyako-wa-hassan-saki-ga-nai`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 8 | Oshi Gal to Tansaibou [Full Color Version] (`.../oshi-gal-to-tansaibou-full-color-version`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Yokkyuu Fuman na Inaka no Oyako wa Hassan-Saki ga Nai (`.../yokkyuu-fuman-na-inaka-no-oyako-wa-hassan-saki-ga-nai`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yokkyuu Fuman na Inaka no Oyako wa Hassan-Saki ga Nai (`.../yokkyuu-fuman-na-inaka-no-oyako-wa-hassan-saki-ga-nai`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../yokkyuu-fuman-na-inaka-no-oyako-wa-hassan-saki-ga-nai`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yokkyuu Fuman na Inaka no Oyako wa Hassan-Saki ga Nai, URL=`.../yokkyuu-fuman-na-inaka-no-oyako-wa-hassan-saki-ga-nai` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 17/17 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 17/17 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pixhentai.com/.../Yokkyuu-Fuman-na-Inaka-no-Oyako-wa-Hassan-Saki-ga-Nai-01-200x285.jpg` (image/jpeg, 16802 bytes, 200x285) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yokkyuu-fuman-na-inaka-no-oyako-wa-hassan-saki-ga-nai` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://pixhentai.com/.../Yokkyuu-Fuman-na-Inaka-no-Oyako-wa-Hassan-Saki-ga-Nai-01.jpg` (image/jpeg, 360190 bytes, 1450x2048) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big Boobs, Blowjob, Cousin, Doggy, Doujinshi, Fingering, Housewife, Masturbation, Milf, Ngentot Tante, Sedarah, Sub Indo, Toket Besar, Uncensored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Baca komik hentai manga sex doujinshi xxx bokep berjudul Yokkyuu Fuman na Inaka no Oyako wa Hassan-Saki ga Nai. Makoto menginap di rumah bibinya yang tinggal di pedesaan agar bisa fokus belajar dengan tenang. Namun di daerah tersebut jarang sekali ada pria muda, sehingga bibi Michiko beserta putrinya yang bernama Sanae tidak memiliki tempat untuk menyalurkan hasrat seksual mereka yang sebenarnya sangat besar. Kelanjutan ceritanya di manga hentai xxx komik dewasa bokep doujin sex berikut ini. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.openhentai.net/.../Yokkyuu-Fuman-na-Inaka-no-Oyako-wa-Hassan-Saki-ga-Nai-%20(2).webp` (image/webp (container: extended), 242468 bytes, 1450x2048) |  |  |  |
