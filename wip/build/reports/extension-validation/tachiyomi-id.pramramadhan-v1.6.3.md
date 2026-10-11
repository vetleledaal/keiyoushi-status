# Extension Validation Report

- Extension: tachiyomi-id.pramramadhan-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 637793516114361627
- Source name: Pramramadhan
- Source language: id
- Selected manga input: popular offset 0: Momogusa-san ga Monogusa Sugiru!! (`.../momogusa-san`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | Momogusa-san ga Monogusa Sugiru!! (`.../momogusa-san`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 17 | Osananajimi omiru me ga kawatte shimatta (`.../osananajimi-omiru-me-ga-kawatte-shimatta`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Momogusa-san ga Monogusa Sugiru!! (`.../momogusa-san`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Momogusa-san ga Monogusa Sugiru!! (`.../momogusa-san`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 24 | Chapter 11 - Malas Ganti Baju (`.../11.00`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Momogusa-san ga Monogusa Sugiru!!, URL=`.../momogusa-san` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://01.pramramadhan.my.id/.../cover_1778628736.png` (image/png, 2011923 bytes, 1350x1920) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../momogusa-san` |  |  |  |
| details thumbnail URL | PASS | `https://01.pramramadhan.my.id/.../cover_1778628736.png` |  |  |  |
| details author | PASS | Anmi Tsuki |  |  |  |
| details artist | PASS | Anmi Tsuki |  |  |  |
| details genres | PASS | Comedy, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Souji Hataki, seorang siswa SMA biasa, akhirnya bekerja paruh waktu sebagai asisten rumah tangga di rumah Momogusa, gadis tercantik di sekolah!! Momogusa-san adalah gadis yang sempurna, unggul dalam pelajaran maupun olahraga, tapi begitu di rumah, dia jadi super malas?! Entah kenapa, dia mulai menyukai Hataki dan menjadi begitu nyaman hingga membiarkan dirinya dimanja olehnya?! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | PASS | 24 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://01.pramramadhan.my.id/.../001.webp <redacted query values: v>` (image/webp (encoding: lossy), 241716 bytes, 1920x1440) |  |  |  |
