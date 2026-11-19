# Extension Validation Report

- Extension: tachiyomi-en.manhwazone-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 618830122769950563
- Source name: ManhwaZone
- Source language: en
- Selected manga input: popular offset 0: VR HERO (`.../vr-hero-on752`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | VR HERO (`.../vr-hero-on752`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Date or Die (`.../date-or-die-k3d9g`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Villain to Kill (`.../villain-to-kill-og8p1`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | I Became the Stepmother of a Terminally Ill Child (`.../i-became-the-stepmother-of-a-terminally-ill-child-wl3w1`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 23 | Hero of All Trades (`.../hero-of-all-trades-kjwn2`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | VR HERO (`.../vr-hero-on752`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 62 | Chapter 1 (`.../1wr4x7`) |  | <1s |
| pages | `getPageList(chapter)` | success | 66 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 10: title=VR HERO, URL=`.../vr-hero-on752` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 119/119 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 119/119 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://media.manhwazone.com/.../i-married-the-male-leads-dad.webp` -> 2 manga URLs (examples: `.../i-married-the-male-leads-dad-rdl10`, `.../i-married-the-male-leads-dad-z8894`) |  |  |  |
| thumbnail | PASS | `https://media.manhwazone.com/.../vr-hero.webp` (image/webp (encoding: lossy), 10884 bytes, 245x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../vr-hero-on752` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://media.manhwazone.com/.../vr-hero.webp` (image/webp (encoding: lossy), 16280 bytes, 315x450) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Join millions reading VR HERO — a Action, Adventure, Fantasy manga by filled with emotion, action, and imagination. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 62 chapters |  |  |  |
| chapter dates | PASS | 62 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 66 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://c2.manhwatop.com/.../c_0_1.jpg` (image/jpeg, 166997 bytes, 718x2039) |  |  |  |
