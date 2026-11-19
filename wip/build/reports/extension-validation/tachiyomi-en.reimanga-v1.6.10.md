# Extension Validation Report

- Extension: tachiyomi-en.reimanga-v1.6.10
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 25
- Lint: 0
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5627909338430537186
- Source name: ReiManga
- Source language: en
- Selected manga input: popular offset 0: The Exiled Reincarnated Heavy Knight Is Unrivaled In Game Knowledge (`.../the-exiled-reincarnated-heavy-knight-is-unrivaled-in-game-knowledge-75981`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | The Exiled Reincarnated Heavy Knight Is Unrivaled In Game Knowledge (`.../the-exiled-reincarnated-heavy-knight-is-unrivaled-in-game-knowledge-75981`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Jinx (`.../jinx-82002`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Totsunagi Kaoru Kimi no Kou (Yaoi) (`.../totsunagi-kaoru-kimi-no-kou-yaoi-10001681`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Abandoned Prince's Ghost Bride (`.../the-abandoned-princes-ghost-bride-106237`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Exiled Reincarnated Heavy Knight Is Unrivaled In Game Knowledge (`.../the-exiled-reincarnated-heavy-knight-is-unrivaled-in-game-knowledge-75981`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Exiled Reincarnated Heavy Knight Is Unrivaled In Game Knowledge (`.../the-exiled-reincarnated-heavy-knight-is-unrivaled-in-game-knowledge-75981`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Exiled Reincarnated Heavy Knight Is Unrivaled In Game Knowledge, URL=`the-exiled-reincarnated-heavy-knight-is-unrivaled-in-game-knowledge-75981` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Cherry Blossoms After Winter, URL=`cherry-blossoms-after-winter-bv8bz0eg-50147` at page 1 offset 14 and page 2 offset 11, title=Shutline, URL=`shutline-b-69533` at page 1 offset 21 and page 2 offset 8, title=Roses and Champagne, URL=`roses-and-champagne-71208` at page 1 offset 27 and page 2 offset 1 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 173/173 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 173/173 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reimanga.net/.../thumbnail.png` (image/jpeg, 203571 bytes, 320x455; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-exiled-reincarnated-heavy-knight-is-unrivaled-in-game-knowledge-75981` |  |  |  |
| details thumbnail URL | PASS | `https://reimanga.net/.../thumbnail.png` |  |  |  |
| details author | PASS | 猫子 \[nekoko\] |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Isekai |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 8.91<br><br>Fifteen-year-old Elma, scion of Sword Saints, is cast out after manifesting the "defective" Heavy Knight class during his Divine Blessing Ceremony. This class, deemed useless and for the indolent, leads to his exile from the Edvan Household. However, Elma knows this world is a game he once mastered, and the Heavy Knight is, in fact, the strongest class. Utilizing his past life's knowledge, he embarks on an efficient journey. The manga's art style is detailed, showcasing grand settings like the "House Howlrodde Great Conquest Send-Off Ceremony" with ornate carriages and uniformed retinues. Elma, depicted with striking blonde hair and a confident demeanor, along with his diverse party of companions including a short-haired woman and an individual with a distinctive pointed hat, are shown participating in this large-scale conquest. The tone blends serious fantasy action with moments of lighthearted banter among the adventurers.<br><br>**Alternative Titles:**<br>- The Exiled Reincarnated Heavy Knight Is Unrivaled In Game Knowledge<br>- Tsuihou Sareta Tenshou Juu Kishi wa game Chishiki de Musou Suru |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
