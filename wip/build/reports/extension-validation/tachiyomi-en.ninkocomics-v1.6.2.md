# Extension Validation Report

- Extension: tachiyomi-en.ninkocomics-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6441436063565688111
- Source name: Ninko Comics
- Source language: en
- Selected manga input: popular offset 0: Hero Killer (`.../hero-killer`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Hero Killer (`.../hero-killer`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Kindergarten for Divine Beasts (`.../kindergarten-for-divine-beasts`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Hero Killer (`.../hero-killer`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hero Killer (`.../hero-killer`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 281 | Chapter 1 (`.../hero-killer-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hero Killer, URL=`.../hero-killer` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ninkocomics.com/.../63598a700cc84139a1b64b3d4a6192cf.webp` (image/webp (encoding: lossy), 36834 bytes, 280x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hero-killer` |  |  |  |
| details thumbnail URL | PASS | `https://ninkocomics.com/.../63598a700cc84139a1b64b3d4a6192cf.webp` |  |  |  |
| details author | PASS | Kkulbeol, 꿀벌 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Crime, Drama, Mature, Mystery, Sci-Fi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | New chapter every Thursday<br><br>The world is in constant turmoil, with constant wars breaking out between Heroes and Villains. Gifted with supernatural abilities, one lone girl sets out on a bloody path for revenge against the injustices of the world she lives in. With the constant clashes between titans, no one is safe. If no one is willing to protect the innocent, who are the real heroes, and who are the real villains? What truly separates one from the other?<br><br>**Alternative Names:**<br>- 히어로 킬러<br>- Heldentöter<br>- La tueuse d'héros<br>- La asesina de héroes<br>- Zabójca bohaterów<br>- Вбивця героїв<br>- Убийца героев<br>- 英雄殺手<br>- Tueur des héros |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 281 chapters |  |  |  |
| chapter dates | PASS | 281 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
