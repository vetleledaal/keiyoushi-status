# Extension Validation Report

- Extension: tachiyomi-en.manhuaplustop-v1.6.1
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
- Source ID: 8481144117764948107
- Source name: ManhuaPlus.top
- Source language: en
- Selected manga input: popular offset 0: Magic Emperor (`.../demon-magic-emperor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Magic Emperor (`.../demon-magic-emperor`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | The Legendary Mechanic (`.../the-legendary-mechanic`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Soul Land V (`.../soul-land-v`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Academy’s Weapon Replicator (`.../the-academy-s-weapon-replicator`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Magic Emperor (`.../demon-magic-emperor`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Magic Emperor (`.../demon-magic-emperor`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 938 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 214 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Magic Emperor, URL=`.../demon-magic-emperor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhuaplus.top/.../demon-magic-emperor.jpg <redacted query values: 1697626580>` (image/jpeg, 76796 bytes, 360x490) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../demon-magic-emperor` |  |  |  |
| details thumbnail URL | PASS | `https://manhuaplus.top/.../demon-magic-emperor.jpg <redacted query values: 1697626580>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Because he had the heritage of the ancient Magic Emperor, Magic Emperor Zhuo Yifan met the misfortune of being betrayed and killed by his trusted disciple. After being reborn, his cultivation went back to zero and he was trapped by a heart demon, given no choice but to become the housekeeper of the Luo Family’s lone eldest miss. From being a Magic Emperor to being an insignificant housekeeper, how would he get along with his “heart demon eldest miss” and what power would he gain in order to lead himself and the declining family to rise back to the peak of the continent!<br><br>**Alternative Names:**<br>- The Servant Is the Demon King?!<br>- The Devil Butler<br>- Demon Emperor Butler<br>- Demon Emperor Great Butler<br>- Demon Emperor Housekeeper<br>- Devil Butler<br>- Housekeeper is the Magic Emperor<br>- Mo Huang Da Guan Jia<br>- Demonic Emperor<br>- The Steward Demonic Emperor<br>- The Steward Demonic King<br>- Как демон-император стал дворецким<br>- 魔皇大管家<br>- Best Devil Housekeeper<br>- Demon King Steward<br>- Đại Quản Gia Là Ma Hoàng<br>- Emperador Mágico |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 938 chapters |  |  |  |
| chapter dates | PASS | 938 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 214 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.manhuaplus.org/.../02-00-24-1-d1e8655062605b2bdf47f767118cc02b.jpg` (image/jpeg, 91570 bytes, 750x586) |  |  |  |
