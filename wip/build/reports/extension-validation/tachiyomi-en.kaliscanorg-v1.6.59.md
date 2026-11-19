# Extension Validation Report

- Extension: tachiyomi-en.kaliscanorg-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5815628626283130746
- Source name: KaliScan.org (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: JINX [UNCENSORED VERSION R19+] (`.../4824`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | JINX [UNCENSORED VERSION R19+] (`.../4824`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Fucked by My Best Friend (`.../4900`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | JINX [UNCENSORED VERSION R19+] (`.../4824`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Romantic Egoist (`.../4870`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | JINX [UNCENSORED VERSION R19+] (`.../4824`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | JINX [UNCENSORED VERSION R19+] (`.../4824`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 32 | Chapter 59.6 - zinchan (`.../chapter-59-6-zinchan`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=JINX \[UNCENSORED VERSION R19+\], URL=`4824` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 100/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kaliscan.org/.../jinx-uncensored-version-r19_b582119f5d9a1403a7dc40a787780713dd88ef88_720_960_591676-e1669654303816-193x278-1-175x238.jpg` (image/jpeg, 11029 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `4824` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://kaliscan.org/.../jinx-uncensored-version-r19_b582119f5d9a1403a7dc40a787780713dd88ef88_720_960_591676-e1669654303816-193x278-1.jpg` (image/jpeg, 16165 bytes, 193x278) |  |  |  |
| details author | PASS | Mingwa |  |  |  |
| details artist | PASS | Mingwa |  |  |  |
| details genres | PASS | aqua manga, coffee manga, demon manga, Drama, duck manga, hari manga, manga buddies, manga fire, manga katana, Manhwa, manhwa raw, Mature, Medical, my reader manga, Romance, Shounen Ai, Slice of Life, Smut, Sports, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read online JINX \[UNCENSORED VERSION R19+\] manhwa, manhua, anime, wiki, webtoon, raw, English translated, scan for free on Jinx-manhwa. This manga always be updated on Kaliscan, please visit to read latest chapter.<br><br>Physical therapist Kim Dan has been down on his luck for as long as he can remember. Between an ailing grandmother, menacing loansharks, and an old boss making it almost impossible for him to find work, Dan is truly running out of options. Naturally, it feels like a dream come true when he’s finally hired to treat top-paid MMA fighter Joo Jaekyung, especially when the man then calls him out for treatment the night before a match with an oh-so-tantalizing offer of five thousand dollars. He claims to have a “jinx” in need of a particular type of “treatment,” but it’s one that Dan isn’t quite prepared to offer… You see, Jaekyung may be a beast in the ring, but he’s even rougher in the bedroom, and Dan’s not sure he can survive Jaekyung at his most primal. Nevertheless, the promise of much-needed cash has Dan agreeing to this ill-fated deal… Could a night together be the thing to help Jaekyung break this jinx once and for all?<br><br>Source: Fandom<br><br>Alternative Names: 징크스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | PASS | 32 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://image2.pawmanga.com/.../001.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
