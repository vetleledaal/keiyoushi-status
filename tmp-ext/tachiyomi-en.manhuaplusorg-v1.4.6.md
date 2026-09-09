# Extension Validation Report

- Extension: tachiyomi-en.manhuaplusorg-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: liliana
- Source ID: 5075089422240578347
- Source name: ManhuaPlus (Unoriginal)
- Source language: en
- Selected manga input: latest offset 0: Versatile Sword Cultivator (`.../full-time-swordsman`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 42 | Magic Emperor (`.../demon-magic-emperor`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 42 | Chronicles of the Demon Faction (`.../chronicles-of-the-demon-factionqwe002`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Versatile Sword Cultivator (`.../full-time-swordsman`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Starting As The God Of Wealth, Taming Billions Of Divine Pets! (`.../starting-as-the-god-of-wealth-taming-billions-of-divine-pets`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Versatile Sword Cultivator (`.../full-time-swordsman`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Versatile Sword Cultivator (`.../full-time-swordsman`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 121 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 2 |  |  | 1-10s |

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
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Versatile Sword Cultivator, URL=`.../full-time-swordsman` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 133/133 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 133/133 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhuaplus.org/.../full-time-swordsman.jpg` (image/jpeg, 69339 bytes, 360x477) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../full-time-swordsman` |  |  |  |
| details thumbnail URL | PASS | `https://manhuaplus.org/.../full-time-swordsman.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | When video games and real life began to merge, Lin Jichen—the best player in the Dao Realm and the top practitioner of "Eight Worlds"—died as a result of the betrayal of his girlfriend and brother. He fiercely refused rules in his new life and embraced the sword, cutting out the future and rewriting his fate with it! It also allows him to ride the game before it is integrated into reality! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 121 chapters |  |  |  |
| chapter dates | PASS | 121 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.manhuaplus.cc/.../0000.webp` (image/webp (encoding: lossy), 152798 bytes, 714x1737) |  |  |  |
