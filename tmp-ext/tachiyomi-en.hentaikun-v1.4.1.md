# Extension Validation Report

- Extension: tachiyomi-en.hentaikun-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2420370334023011697
- Source name: HentaiKun
- Source language: en
- Selected manga input: latest offset 0: If You Like Me, Then Get It, As Much As You Want (`.../if-you-like-me-then-get-it-as-much-as-you-want-17979`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 50 | While Mommy Is Sleeping (`.../while-mommy-is-sleeping-1749`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 50 | The Conclusion of NTR (`.../the-conclusion-of-ntr-9117`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 50 | If You Like Me, Then Get It, As Much As You Want (`.../if-you-like-me-then-get-it-as-much-as-you-want-17979`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 50 | Fundamentals of Demonology (`.../fundamentals-of-demonology-15144`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | If You Like Me, Then Get It, As Much As You Want (`.../if-you-like-me-then-get-it-as-much-as-you-want-17979`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | If You Like Me, Then Get It, As Much As You Want (`.../if-you-like-me-then-get-it-as-much-as-you-want-17979`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 30 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=If You Like Me, Then Get It, As Much As You Want, URL=`.../if-you-like-me-then-get-it-as-much-as-you-want-17979` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s1.hendata.com/.../if you like me then get it as much as you want ch 1/if you like me then get it as much as you want ch 1_thumb.jpg` (image/jpeg, 34969 bytes, 182x260) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../if-you-like-me-then-get-it-as-much-as-you-want-17979` |  |  |  |
| details thumbnail URL | PASS | `https://s1.hendata.com/.../if you like me then get it as much as you want ch 1/if you like me then get it as much as you want ch 1_thumb.jpg` |  |  |  |
| details author | PASS | Kousuke |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai Manga, Apparel Bukkake, Big Areolae, Big Breasts, Clothed Paizuri, Cosplaying, Emotionless Sex, Femdom, Gyaru, Kissing, Nakadashi, Paizuri, Schoolgirl Uniform, Stockings, X Ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s1.hendata.com/.../1.jpg` (image/jpeg, 438833 bytes, 1057x1500) |  |  |  |
