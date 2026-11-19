# Extension Validation Report

- Extension: tachiyomi-en.aquamanga-v1.6.76
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 626267698662819838
- Source name: Aqua Manga
- Source language: en
- Selected manga input: popular offset 0: Magic Emperor (`.../magic-emperor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Magic Emperor (`.../magic-emperor`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Martial Peak (`.../martial-peak`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Return of the Scorned Genius (`.../the-return-of-the-scorned-genius`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Lost City of Alien Beasts (`.../the-lost-city-of-alien-beasts`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 14 | Magic Emperor (`.../magic-emperor`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Magic Emperor (`.../magic-emperor`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 942 | Chapter 0 (`.../ch-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Magic Emperor, URL=`.../magic-emperor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 110/110 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 110/110 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://aquareader.org/.../magic-emperor-hd-1-340x480.jpg` (image/jpeg, 41206 bytes, 340x480) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../magic-emperor` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://aquareader.org/.../magic-emperor-hd-1.jpg` (image/jpeg, 863960 bytes, 765x1236) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Manhua, Romance, Shounen, Supernatural |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Because he had the heritage of the ancient Demonic Emperor, Demonic Emperor Zhuo Yifan met the misfortune of being betrayed and killed by his trusted disciple. After being reborn, his cultivation went back to zero and he was trapped by a heart demon, given no choice but to become the housekeeper of the Luo Family's lone eldest miss. From being a Magic Emperor to being an insignificant housekeeper, how would he get along with his "heart demon eldest miss" and what power would he gain in order to lead himself and the declining family to rise back to the peak of the continent! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 942 chapters |  |  |  |
| chapter dates | PASS | 942 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://aquareader.org/.../01.webp` (image/webp (encoding: lossy), 95730 bytes, 940x1929) |  |  |  |
