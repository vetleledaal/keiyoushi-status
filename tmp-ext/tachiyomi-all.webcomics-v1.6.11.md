# Extension Validation Report

- Extension: tachiyomi-all.webcomics-v1.6.11
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5830834696627804450
- Source name: Webcomics
- Source language: en
- Selected manga input: popular offset 0: Surviving as a Tyrant's Daughter (`.../662619e28c252b1834212277`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Surviving as a Tyrant's Daughter (`.../662619e28c252b1834212277`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | The Unlimited Necromancer (`.../6a5d834d62661d10e3607b22`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | When A Necromancer Maxes Strength (`.../6a5752dc62661d5cba6bf1eb`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | My Insatiable Duke in a Three-Year Marriage (`.../6a44b35b62661d270d25a855`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Surviving as a Tyrant's Daughter (`.../662619e28c252b1834212277`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Surviving as a Tyrant's Daughter (`.../662619e28c252b1834212277`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 232 | Ch. 1 (`.../2dc52c12320ab09b31938cef`) |  | <1s |
| pages | `getPageList(chapter)` | success | 70 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Surviving as a Tyrant's Daughter, URL=`662619e28c252b1834212277` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 92/92 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 92/92 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imgg-h.mangaina.com/.../h <redacted query values: ht and tw>` (image/webp (encoding: lossy), 34516 bytes, 400x533; server Content-Type: image/webp,image/gif,image/png,image/jpeg,image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `662619e28c252b1834212277` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://imgg.mangaina.com/.../04315a10026ca655027be01555266217.webp` (image/webp (encoding: lossy), 36584 bytes, 540x720; server Content-Type: image/png) |  |  |  |
| details author | PASS | Wulichouchou/China Literature+LibertyHome |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Eastern Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yeyul woke up in the body of the unfavored seventh daughter of the tyrant emperor. In order to survive, she tried every means to escape from him, but destiny made her the apple of his eye. How would she win the battle of imperial power? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 232 chapters |  |  |  |
| chapter dates | PASS | 232 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 70 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imgg.mangaina.com/.../ZEUxMThHczVhdXArb2RpOUk1ejYxZz09_e692e41a8a68c58c59d6695cb3fe95fc_cpImg.webp` (image/webp (encoding: lossy), 10892 bytes, 800x900; server Content-Type: image/png) |  |  |  |
