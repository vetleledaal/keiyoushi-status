# Extension Validation Report

- Extension: tachiyomi-en.asmotoon-v1.6.30
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
- Source theme: keyoapp
- Source ID: 2076371496779298312
- Source name: Asmodeus Scans
- Source language: en
- Selected manga input: popular offset 0: The Lazy Aristocrat (`.../the-lazy-aristocrat`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Lazy Aristocrat (`.../the-lazy-aristocrat`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The One-Eyed, One-Armed, One-Legged Sorcerer Two Thousand Years Passed While I Was Holed Up in a Forest Cabin. Before I Knew It, I Was Being Called a Demon God, Even Though I Only Wanted to Explore Sorcery~ (`.../the-one-eyed-one-armed-one-legged-sorcerer-two-thousand-years-passed-while-i-was-holed-up-in-a-forest-cabin-before-i-knew-it-i-was-being-called-a-demon-god-even-though-i-only-wanted-to-explore-sorcery`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Let’s Make a Harem in a Zombie World! (`.../lets-make-a-harem-in-a-zombie-world`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Thereafter of an Exiled Magician: Somehow My Engagement Was Cancelled, and I Was Driven Out (`.../thereafter-of-an-exiled-magician-somehow-my-engagement-was-cancelled-and-i-was-driven-out`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 8 | The Lazy Aristocrat (`.../the-lazy-aristocrat`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Lazy Aristocrat (`.../the-lazy-aristocrat`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 16 | Chapter 1 (`.../the-lazy-aristocrat-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Lazy Aristocrat, URL=`.../the-lazy-aristocrat` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url>` (image/jpeg, 543072 bytes, 1800x2400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-lazy-aristocrat` |  |  |  |
| details thumbnail URL | PASS | `https://wsrv.nl <redacted query values: url>` |  |  |  |
| details author | PASS | Iko |  |  |  |
| details artist | PASS | Hirota |  |  |  |
| details genres | PASS | Fantasy, Harem, Reincarnation, Comedy, Action, Magic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Luke is the languid second son of a villainous duke.<br>By some unexpected instance he comes to know of his own fate and in an attempt to avoid his own fate he works hard at finding a peaceful family to marry into and researching magic.<br>All his hard work is to live a peaceful and slothful life... And yet he gets involved in one pain to deal with after the other!? The path of utmost sloth is a steep one.<br>A magical fantasy starring a languid prince that wants nothing more than the life of a slacker! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 16 chapters |  |  |  |
| chapter dates | PASS | 16 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../GmIT_kog4n1` (image/jpeg, 1025928 bytes, 900x2140; server Content-Type: text/plain) |  |  |  |
