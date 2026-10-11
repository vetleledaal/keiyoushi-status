# Extension Validation Report

- Extension: tachiyomi-all.hentailoop-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3077154580363219152
- Source name: HentaiLoop
- Source language: all
- Selected manga input: popular offset 0: I Was Cucked By My Girlfriend’s Dog! (`.../i-was-cucked-by-my-girlfriends-dog-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | I Was Cucked By My Girlfriend’s Dog! (`.../i-was-cucked-by-my-girlfriends-dog-2`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | A Moth To Flame (`.../a-moth-to-flame`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Kusuguri No Kuni No Bunny-chan (`.../kusuguri-no-kuni-no-bunny-chan`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | The Story Of Doing Bad Things To Citlali (`.../the-story-of-doing-bad-things-to-citlali`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Was Cucked By My Girlfriend’s Dog! (`.../i-was-cucked-by-my-girlfriends-dog-2`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../i-was-cucked-by-my-girlfriends-dog-2`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i4.hentailoop.com/.../i-was-cucked-by-my-girlfriends-dog-page-1-1-400x600.jpg` (image/jpeg, 58269 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `i-was-cucked-by-my-girlfriends-dog-2` |  |  |  |
| details thumbnail URL | PASS | `https://i4.hentailoop.com/.../i-was-cucked-by-my-girlfriends-dog-page-1-1-400x600.jpg` |  |  |  |
| details author | PASS | Luxsumildo |  |  |  |
| details artist | PASS | Luxsumildo |  |  |  |
| details genres | PASS | Doujinshi, English, Ahegao, Beauty Mark, Big Breasts, Blowjob, Nakadashi, Netorare, Sole Female, Uncensored, X-Ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Name: 여친 개한테 Ntr 당하는 만화<br>Pages: 24<br>Views: 731K<br>Updated: 3 years ago<br>Dislikes: 990<br>Likes: 368<br>Artists: Luxsumildo<br>Genres: Doujinshi<br>Languages: English<br>Parodies: Original<br>Release: 2023<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i4.hentailoop.com/.../i-was-cucked-by-my-girlfriends-dog-page-1-1.jpg` (image/jpeg, 925271 bytes, 1280x1817) |  |  |  |
