# Extension Validation Report

- Extension: tachiyomi-en.hentainexus-v1.6.20
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 7719798645438596394
- Source name: HentaiNexus
- Source language: en
- Selected manga input: popular offset 0: My Mom, My Love 1 (`.../12322`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | My Mom, My Love 1 (`.../12322`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | I Can't Get it Up Without Two Pairs of Big Breasts, So My Wife Brought Her Friend: Compilation (`.../20377`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Fulfilling Secretarial Dirty Duties 2 (`.../22231`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Rekindling an Old Flame (`.../22005`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | My Mom, My Love 10 (`.../18579`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Mom, My Love 1 (`.../12322`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../12322`) |  | <1s |
| pages | `getPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=My Mom, My Love 1, URL=`.../12322` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.hentainexus.com/.../%5BBoindo+%28Siberian+Hahasky%29%5D+My+Mom%2C+My+Love+1+-+001+%28x3200%29+%5BIrodori+Comics%5D.png.thumb.jpg` (image/jpeg, 69677 bytes, 480x672) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12322` |  |  |  |
| details thumbnail URL | PASS | `https://images.hentainexus.com/.../%5BBoindo+%28Siberian+Hahasky%29%5D+My+Mom%2C+My+Love+1+-+001+%28x3200%29+%5BIrodori+Comics%5D.png.thumb.jpg` |  |  |  |
| details author | PASS | Siberian Hahasky |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big areolae, booty, busty, cheating, chubby, condom, creampie, doujin, eyebrows, first time, hentai, housewife, huge boobs, incest, leg lock, mating press, milf, pubic hair, short hair, story arc, uncensored, x-ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Circle: Boindo<br>Parody: Original Work<br>Publisher: Irodori Comics<br>Pages: 51<br>Favorites: 1325<br><br>Yuta's been keeping a secret from his mother. He's in love with her—horny thoughts included. But after she discovers his secret, she still accepts him for how he is. A mother's love knows no bounds, but what lines will be crossed? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.hentainexus.com/.../%5BBoindo+%28Siberian+Hahasky%29%5D+My+Mom%2C+My+Love+1+-+001+%28x3200%29+%5BIrodori+Comics%5D.webp` (image/webp (encoding: lossy), 577248 bytes, 2266x3200) |  |  |  |
