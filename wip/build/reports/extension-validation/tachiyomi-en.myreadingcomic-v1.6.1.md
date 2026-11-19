# Extension Validation Report

- Extension: tachiyomi-en.myreadingcomic-v1.6.1
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
- Source implementation: keiyoushi.source.Generated
- Source theme: yiimanga
- Source ID: 2242106898634732967
- Source name: MyReadingComic
- Source language: en
- Selected manga input: popular offset 0: Teach Me First! (Uncensored) (`.../teach-me-first-uncensored`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Teach Me First! (Uncensored) (`.../teach-me-first-uncensored`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | One-Day BDSM Workshop (Uncensored) (`.../one-day-bdsm-workshop-uncensored`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | An Idol Manager's Diary (`.../an-idol-managers-diary`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Price of Yes (`.../the-price-of-yes`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Put It Inside Me (Uncensored) (`.../put-it-inside-me-uncensored`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Teach Me First! (Uncensored) (`.../teach-me-first-uncensored`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 21 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Teach Me First! (Uncensored), URL=`.../teach-me-first-uncensored` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://myreadingcomic.com/.../teach-me-first-uncensored-cover.jpg` (image/jpeg, 24029 bytes, 274x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../teach-me-first-uncensored` |  |  |  |
| details thumbnail URL | PASS | `https://myreadingcomic.com/.../teach-me-first-uncensored-cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Mischievous Moon, Pantsumania |  |  |  |
| details genres | PASS | Adult, Comedy, Drama, Harem, Mature, Romance, Seinen, Slice of Life, Uncensored |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Nothing can break the bond between step-siblings. But what happens when one of them decides to get married?<br><br>Read all chapters of Adult Manhwa Teach Me First! (Uncensored) in English online at MyReadingComic.com. The series is regularly updated, so don't miss the latest releases. Explore more Webtoon 18+ collections anytime in the All-Comics List section at MyReadingComic.<br><br>Discover over 1,000+ free Manhwa 18+ online at MyReadingComic.com. Enjoy full-color and popular series with every chapter available to read for free. New Mature Manhwa are updated hourly, so follow MyReadingComic to get the fastest updates on the latest releases. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn02.myreadingcomic.com/.../1-605.jpg` (image/jpeg, 378822 bytes, 720x5262) |  |  |  |
