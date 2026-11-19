# Extension Validation Report

- Extension: tachiyomi-all.fastestmanga-v1.6.59
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
- Source implementation: keiyoushi.source.a
- Source theme: madara
- Source ID: 2159341238645919191
- Source name: Fastest Manga
- Source language: en
- Selected manga input: popular offset 0: Trash of the Count’s Family (`.../2722`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Trash of the Count’s Family (`.../2722`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Isekai Mahou wa Okureteru! (`.../419`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Ore no Ie ga Maryoku Spot datta Ken – Sundeiru dake de Sekai Saikyou (`.../383`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Koko wa Makasete Sakini Ike! wo shitai Shinitagari no Nozomanu Uchuu Gekokujou (`.../395`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Trash of the Count’s Family (`.../2722`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Trash of the Count’s Family (`.../2722`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 161 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Trash of the Count’s Family, URL=`2722` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn1.cdnformanga.xyz/.../cover.webp` (image/webp (encoding: lossy), 84588 bytes, 720x1029) |  |  |  |
| details identity | PASS | Details preserved selected URL `2722` |  |  |  |
| details thumbnail URL | PASS | `https://cdn1.cdnformanga.xyz/.../cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Manhwa, Seinen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kim Roksu has one life motto: “Let’s not get beat up.” But after dozing off somewhere midway through the novel “Birth of a Hero”, he wakes up as Cale Henituse – one of the minor villains in the novel who gets the beating of a lifetime from soon-to-be hero Choi Han. Only time will tell how much longer he has before that dreadful encounter. Can Kim Roksu change the course of this story so he can enjoy a long and lavish life free of the soon-to-be hero?<br><br>Alternative Names: Trash of the Count’s Family |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 161 chapters |  |  |  |
| chapter dates | PASS | 161 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn1.cdnformanga.xyz/.../419c8fe3e4b742ebb6220a019bbddcbe_1.webp` (image/webp (encoding: lossy), 16444 bytes, 720x384) |  |  |  |
