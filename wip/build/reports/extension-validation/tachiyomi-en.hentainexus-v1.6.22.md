# Extension Validation Report

- Extension: tachiyomi-en.hentainexus-v1.6.22
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
- Source ID: 7719798645438596394
- Source name: HentaiNexus
- Source language: en
- Selected manga input: popular offset 0: Stay Connect (`.../10731`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Stay Connect (`.../10731`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Fuck Buddies With His Girlfriend's Sister (`.../20350`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Wanderlust 11 (`.../22431`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Honomi Break! Ep. 115 (`.../22390`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Stay Connect (`.../10731`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Stay Connect (`.../10731`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../10731`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Stay Connect, URL=`.../10731` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Fuck Buddies With His Girlfriend's Sister, URL=`.../20350` at page 1 offset 1 and page 2 offset 0, title=Gaming Harem 1, URL=`.../9783` at page 1 offset 7 and page 2 offset 5 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.hentainexus.com/.../001.png.thumb.jpg` (image/jpeg, 78865 bytes, 480x672) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../10731` |  |  |  |
| details thumbnail URL | PASS | `https://images.hentainexus.com/.../001.png.thumb.jpg` |  |  |  |
| details author | PASS | Tatsu Tairagi |  |  |  |
| details artist | PASS | Tatsu Tairagi |  |  |  |
| details genres | PASS | bathroom, creampie, eyebrows, heart pupils, hentai, light hair, masturbation, office lady, petite, short hair, uncensored, unlimited, vanilla, voyeurism, x-ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Magazine: Comic Shitsurakuten 2021-06<br>Parody: Original Work<br>Publisher: FAKKU<br>Pages: 20<br>Favorites: 135<br><br>A sudden perverted proclamation. ❤ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.hentainexus.com/.../001.webp` (image/webp (encoding: lossy), 748842 bytes, 1360x1920) |  |  |  |
