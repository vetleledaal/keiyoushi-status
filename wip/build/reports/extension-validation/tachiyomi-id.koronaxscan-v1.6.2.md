# Extension Validation Report

- Extension: tachiyomi-id.koronaxscan-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 6708509143976405352
- Source name: KoronaxScan
- Source language: id
- Selected manga input: popular offset 0: The Fable (`.../the-fable`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | The Fable (`.../the-fable`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | The Fable (`.../the-fable`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Fable (`.../the-fable`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Fable (`.../the-fable`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 85 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Fable, URL=`the-fable` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kintil.anichi.my.id/.../manual-14acd4b5-33ad-492a-a485-72fa2bcb73d1-1795027758411.jpeg` (image/jpeg, 1249285 bytes, 3023x4299) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-fable` |  |  |  |
| details thumbnail URL | PASS | `https://kintil.anichi.my.id/.../manual-14acd4b5-33ad-492a-a485-72fa2bcb73d1-1795027758411.jpeg` |  |  |  |
| details author | PASS | Minami Katsuhisa |  |  |  |
| details artist | PASS | Minami Katsuhisa |  |  |  |
| details genres | PASS | Manga, Drama, Romance, Comedy, Slice of Life, Action, Mafia, Thriller, Crime |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Seorang jenius pembunuh yang terkenal bersembunyi di suatu tempat di Tokyo. Diajari sejak kecil untuk mematuhi perintah atasannya, ia diperintahkan untuk tinggal di Osaka sebagai orang biasa selama satu tahun agar atasannya tidak terlalu menonjol.<br><br>Alternative title:<br>- ザ・ファブル |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 85 chapters |  |  |  |
| chapter dates | PASS | 85 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://kintil.anichi.my.id/.../ch-77e12-p1-1783877391439-0000.jpg` (image/jpeg, 379532 bytes, 1536x1024) |  |  |  |
