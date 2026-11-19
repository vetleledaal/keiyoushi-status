# Extension Validation Report

- Extension: tachiyomi-all.mangafire-v1.6.38
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
- Source implementation: keiyoushi.source.a
- Source ID: 6084907896154116083
- Source name: MangaFire
- Source language: en
- Selected manga input: popular offset 0: One Piece (`.../dkw-one-piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | One Piece (`.../dkw-one-piece`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | The Stellar Swordmaster (`.../w5y8k-the-stellar-swordmaster`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | The Unsettlable Relationship (`.../00513-the-unsettlable-relationship`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | My Virtual Immortal Path (`.../wqznk-my-virtual-immortal-path`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 50 | One Piece (`.../dkw-one-piece`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../dkw-one-piece`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2449 | Ch. 0 - Volume 112 (`.../9324579-chapter-0-en`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 182 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../dkw-one-piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=My Virtual Immortal Path, URL=`.../wqznk-my-virtual-immortal-path` at page 1 offset 49 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 250/250 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 250/250 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.mfcdn.nl/.../bcfcc8f19ec17a2929fa55d8945ea18b.jpg` (image/jpeg, 56977 bytes, 280x400; server Content-Type: image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../dkw-one-piece` |  |  |  |
| details thumbnail URL | PASS | `https://static.mfcdn.nl/.../bcfcc8f19ec17a2929fa55d8945ea18b.jpg` |  |  |  |
| details author | PASS | Oda Eiichirou (尾田栄一郎) |  |  |  |
| details artist | PASS | Oda Eiichirou (尾田栄一郎) |  |  |  |
| details genres | PASS | Manga, Action, Comedy, Drama, Sci-Fi, Adventure, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gol D. Roger, a man referred to as the "Pirate King," is set to be executed by the World Government. But just before his demise, he confirms the existence of a great treasure, One Piece, located somewhere within the vast ocean known as the Grand Line. Announcing that One Piece can be claimed by anyone worthy enough to reach it, the Pirate King is executed and the Great Age of Pirates begins.<br><br>Twenty-two years later, a young man by the name of Monkey D. Luffy is ready to embark on his own adventure, searching for One Piece and striving to become the new Pirate King. Armed with just a straw hat, a small boat, and an elastic body, he sets out on a fantastic journey to gather his own crew and a worthy ship that will take them across the Grand Line to claim the greatest status on the high seas.<br><br>\---<br><br>**Note:**<br>**Because a takedown notice was sent to MangaDex from the owners of this series, English fan translations of One Piece are unable to be posted at this time. The series can be read in its entirety at \[the official Shonen Jump website,\](https://www.viz.com/.../one-piece) with the first and latest three chapters available at any time and the rest accessible with a Shonen Jump membership (which costs about \$2 a month and can be accessed via a VPN if you are outside the US). The three most recent chapters can also be read on MangaPlus for free by clicking the chapter links below.**<br><br>\---<br>\- **The Best-Selling Manga in History**<br>\- **Won the 41st Japan Cartoonists Association Award Grand Prize alongside Neko Darake in 2012**<br>\- **Received the Kumamoto Prefecture Honorary Prize in 2018** |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 117 name |  |  |  |
| chapters | PASS | 2449 chapters |  |  |  |
| chapter dates | PASS | 2449 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 182 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://k99.mfcdn1.xyz/.../p.jpg` (image/jpeg, 1609876 bytes, 1400x2100) |  |  |  |
