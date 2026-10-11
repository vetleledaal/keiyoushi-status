# Extension Validation Report

- Extension: tachiyomi-en.mangabuddy-v1.6.34
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangak
- Source ID: 5020395055978987501
- Source name: MangaK
- Source language: en
- Selected manga input: popular offset 0: Love Jinx (`.../love-jinx`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Love Jinx (`.../love-jinx`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Trash Of The Count’S Family (`.../trash-of-the-counts-family`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Yaku no Ouji, Saikyou no Genjitsu Eiyuu o Shitagaeru (`.../yaku-no-ouji-saikyou-no-genjitsu-eiyuu-o-shitagaeru`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Slap Shot Girls (`.../slap-shot-girls`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Love Jinx (`.../love-jinx`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Love Jinx (`.../love-jinx`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 135 | Vol.1 chapter 0 (`.../vol-1-chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 2 |  |  | <1s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Love Jinx, URL=`.../love-jinx` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rx.resmk.org/.../2daf99a2b366.webp` (image/webp (encoding: lossy), 91058 bytes, 600x1066) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../love-jinx` |  |  |  |
| details thumbnail URL | PASS | `https://rx.resmk.org/.../2daf99a2b366.webp` |  |  |  |
| details author | PASS | 건한, Geonhan, Geon-Han |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Boys Love, Romance, Mature, Manhwa, Yaoi, Full Color, Webtoons, Comedy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | "Because something bad always happens when I kiss…”   <br>  <br>Haekyung is handsome, has a great academic background and job, and is charismatic.   <br>Haekyung, who seems flawless, has a very big weakness: a strange jinx.   <br>And that is if he kisses anyone, shortly after, he will break up with his lover or get caught in a sticky situation!  <br>Because of this jinx, he ends another relationship. To make matters worse, his available pool of partners is overflowing with weird men… |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 33 name, chapter 59 name, chapter 61 name, chapter 62 name |  |  |  |
| chapters | PASS | 135 chapters |  |  |  |
| chapter dates | PASS | 135 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://rx.qvzrf.org/.../031183243a7f.webp` (image/webp (encoding: lossy), 52544 bytes, 700x560) |  |  |  |
