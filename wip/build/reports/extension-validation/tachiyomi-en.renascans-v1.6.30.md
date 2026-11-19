# Extension Validation Report

- Extension: tachiyomi-en.renascans-v1.6.30
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
- Source ID: 3447464472094373275
- Source name: Renascans
- Source language: en
- Selected manga input: popular offset 0: Steal from the Devil's Pocket (`.../steal-from-the-devils-pocket-s9ihabns`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Steal from the Devil's Pocket (`.../steal-from-the-devils-pocket-s9ihabns`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | The Beast's Footprints (`.../the-beasts-footprints-4v75hssr`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Heian-Era Villainess Becomes Abe no Seimei’s Disciple to Survive (`.../the-heian-era-villainess-becomes-abe-no-seimei-s-disciple-to-survive`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | I'm Pathetic, But I Still Want Romance (`.../im-pathetic-but-i-still-want-romance-4r0j0dhj`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Steal from the Devil's Pocket (`.../steal-from-the-devils-pocket-s9ihabns`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Steal from the Devil's Pocket (`.../steal-from-the-devils-pocket-s9ihabns`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 41 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Steal from the Devil's Pocket, URL=`steal-from-the-devils-pocket-s9ihabns` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.renascans.net/.../1790285985765911827_aef3a838f5b33683.webp` (image/webp (encoding: lossy), 100400 bytes, 384x549) |  |  |  |
| details identity | PASS | Details preserved selected URL `steal-from-the-devils-pocket-s9ihabns` |  |  |  |
| details thumbnail URL | PASS | `https://storage.renascans.net/.../1790285985765911827_aef3a838f5b33683.webp` |  |  |  |
| details author | PASS | Eunmilhi, yan |  |  |  |
| details artist | PASS | 333 |  |  |  |
| details genres | PASS | Manhwa, Adventure, Comedy, Drama, Fantasy, Shojo, action |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | **Released:** 2024<br><br>Sunju Geum, who died of choking while eating pineapple pizza, is reincarnated as an angel in the dimension of Shirley Fleichen.<br>She is the only healer there, but the best healer is to destroy all dangers before their allies get hurt! How to live as an angel that has a worse personality than devils…<br><br>**Alternative Names:**<br>- 악마의 주머니를 털어라 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 41 chapters |  |  |  |
| chapter dates | PASS | 41 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://renascans.net/.../b7f4d01d48b88172f2d1441b2bcb8070.webp <redacted query values: exp and sig>` (image/webp (encoding: lossy), 1295030 bytes, 801x8780) |  |  |  |
