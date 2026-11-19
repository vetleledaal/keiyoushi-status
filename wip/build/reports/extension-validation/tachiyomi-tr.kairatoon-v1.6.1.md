# Extension Validation Report

- Extension: tachiyomi-tr.kairatoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 3
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3759878972130438558
- Source name: Kairatoon
- Source language: tr
- Selected manga input: popular offset 0: Kocam Bir Kutsal Şövalye (`.../kocam-bir-kutsal-sovalye`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Kocam Bir Kutsal Şövalye (`.../kocam-bir-kutsal-sovalye`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Sarılalım (`.../sarilalim`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 23 | Markiz Maron (`.../markiz-maron`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 23 | Park Su-jin ve  Baek Seo-jeong (`.../park-su-jin-ve-baek-seo-jeong`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kocam Bir Kutsal Şövalye (`.../kocam-bir-kutsal-sovalye`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kocam Bir Kutsal Şövalye (`.../kocam-bir-kutsal-sovalye`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 40 | Bölüm 1 (`.../bolum-1`) |  | <1s |
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
| latest listing | PASS | 23 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kocam Bir Kutsal Şövalye, URL=`.../kocam-bir-kutsal-sovalye` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 95/95 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 95/95 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kairatoon.net/.../ce4a08cb-640b-43ee-9122-d8d6e07954d0.webp` (image/webp (encoding: lossy), 175142 bytes, 800x1063) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kocam-bir-kutsal-sovalye` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://kairatoon.net` did not contain a decodable image (377658 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Fantastik, Romantik, Dram, Shoujo, +18 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 4.8 (112)<br><br>Bu gece yine, onun tarafından arındırılmayı arzuluyordu. Mutsuz bir hayattı. Arındırma gücüne sahip olmasına rağmen İrene en düşük rütbede görülmüş, kısa hayatı boyunca kimseden ne sevgi ne de kabul görmüştü. Son anlarında bile yapayalnız ölmüştü ama tuhaf bir şekilde kendini geçmişe dönmüş halde buldu. Hem de sıradan bir geçmişe değil; mahvettiği adamla, yani kocası Michael ile tanışmadan hemen öncesine. 'Bu hayatta düzeltmem gereken ilk hata bu. Yani... Michael'a hiç bulaşmamak.' Ancak Michael bir tuhaftı. 'Benim... Sana ihtiyacım var. Lütfen beni arındır.' Arındırılmayı ilk o istemişti. Bir kutsal şövalye, bu kutsal adam, her gece kapıma geliyordu. 'İrene, Eşim, Karım. Bu gece senin beni arındırmanı istiyorum. Uzun uzun ve yavaşça...' O önceki hayatında bana parmağının ucuyla bile dokunmayan kutsal şövalye, değil miydi?<br><br>**Alternative Names:**<br>- My Husband Was Definitely a Paladin<br>- My Husband Is a Holy Knight |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 40 chapters |  |  |  |
| chapter dates | PASS | 40 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
