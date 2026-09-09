# Extension Validation Report

- Extension: tachiyomi-en.doujins-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3733450486998805728
- Source name: Doujins
- Source language: en
- Selected manga input: popular offset 0: I WILL make a single mother my wife 1 (`.../onizuka-chris-i-will-make-a-single-mother-my-wife-1-103253`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 71 | I WILL make a single mother my wife 1 (`.../onizuka-chris-i-will-make-a-single-mother-my-wife-1-103253`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 25 | Frieren and the All-Around Investigation Quests (`.../sei-no-mamono-frieren-and-the-all-around-investigation-quests-103364`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 9 | My Childhood Friend I Just Reunited With Became A Plump Gyaru (`.../puranpuman-my-childhood-friend-i-just-reunited-with-became-a-plump-gyaru-103211`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | I WILL make a single mother my wife 2 (`.../i-will-make-a-single-mother-my-wife-2-103319`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | I WILL make a single mother my wife 1 (`.../onizuka-chris-i-will-make-a-single-mother-my-wife-1-103253`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../onizuka-chris-i-will-make-a-single-mother-my-wife-1-103253`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 77 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 71 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 1: title=I WILL make a single mother my wife 1, URL=`.../i-will-make-a-single-mother-my-wife-1-103253` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 107/107 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 107/107 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.doujins.com/.../f2-5e8x2dax.jpg <redacted query values: st and e> 2x` (image/jpeg, 61609 bytes, 364x520) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../onizuka-chris-i-will-make-a-single-mother-my-wife-1-103253` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Onizuka Chris |  |  |  |
| details artist | PASS | Onizuka Chris |  |  |  |
| details genres | PASS | MILF, big breasts, business suit, nakadashi |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 77 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.doujins.com/.../n-5e8x2dax.jpg <redacted query values: st and e>` (image/jpeg, 292155 bytes, 1254x1771) |  |  |  |
