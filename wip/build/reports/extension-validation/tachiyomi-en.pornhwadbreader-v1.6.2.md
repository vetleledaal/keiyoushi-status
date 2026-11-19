# Extension Validation Report

- Extension: tachiyomi-en.pornhwadbreader-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2192193647376309998
- Source name: PornhwaDB Reader
- Source language: en
- Selected manga input: popular offset 0: Moby Dick (`.../13`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Moby Dick (`.../13`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Father-In-Law Fucks Everyone (`.../241`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Love Thy Enemy (Doyosae) (`.../5051`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Groupie Sweetie (`.../4288`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Moby Dick (`.../13`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Moby Dick (`.../13`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 113 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | <1s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Moby Dick, URL=`13` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.pornhwareader.com/.../7b3dd2babf6a493bb89b2196b61f0d314f8d6b024c7050b29a519a8b474f0232.webp` (image/webp (encoding: lossy), 63072 bytes, 600x830) |  |  |  |
| details identity | PASS | Details preserved selected URL `13` |  |  |  |
| details thumbnail URL | PASS | `https://media.pornhwareader.com/.../7b3dd2babf6a493bb89b2196b61f0d314f8d6b024c7050b29a519a8b474f0232.webp` |  |  |  |
| details author | PASS | Yansae |  |  |  |
| details artist | PASS | Yansae |  |  |  |
| details genres | PASS | Action, Harem, Revenge, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | One day, a mysterious name card lands on HOON-SANG's hand. The name card presents to him a new life in a new city, the haven of adultery, along with a significant sum of money in return for his physique. "You are a 'gift' to the VIPs. Make them unable to forget you, even if they try."<br><br>Alternative titles: 모비딕, モビーディック ～VIPに捧ぐ大きな〇〇～, 慾海交鋒 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 113 chapters |  |  |  |
| chapter dates | PASS | 113 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://pornhwareader.com/.../13` to `https://pornhwareader.com/.../moby-dick` (1 redirects); popular: `https://pornhwareader.com/.../13` to `https://pornhwareader.com/.../moby-dick` (1 redirects) |  |  |  |
| page load | PASS | `https://media.pornhwareader.com/.../1-1f1bdae5f363ed2e446c5554cc86fded95348a558d3eae3b0f1737899d82c7d3.webp` (image/webp (encoding: lossy), 1017314 bytes, 720x12244) |  |  |  |
