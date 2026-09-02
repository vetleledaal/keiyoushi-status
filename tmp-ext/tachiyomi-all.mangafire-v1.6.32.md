# Extension Validation Report

- Extension: tachiyomi-all.mangafire-v1.6.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
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
- Selected manga input: popular offset 0: The Exiled Heavy Knight Knows How to Game the System (`.../4q91m-the-exiled-heavy-knight-knows-how-to-game-the-system`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | The Exiled Heavy Knight Knows How to Game the System (`.../4q91m-the-exiled-heavy-knight-knows-how-to-game-the-system`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | From Old Country Bumpkin to Master Swordsman (Webtoon Version) (`.../j25k2-from-old-country-bumpkin-to-master-swordsman-webtoon-version`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | Tetsu Sabi to 1000 Carat (`.../60n70-tetsu-sabi-to-1000-carat`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Bu Dang Tiangou Hou, Wo Cheng Le Yiwan Shen Hao (`.../729lj-bu-dang-tiangou-hou-wo-cheng-le-yiwan-shen-haoo`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 50 | The Exiled Heavy Knight Knows How to Game the System (`.../4q91m-the-exiled-heavy-knight-knows-how-to-game-the-system`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Exiled Heavy Knight Knows How to Game the System (`.../4q91m-the-exiled-heavy-knight-knows-how-to-game-the-system`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 348 | Ch. 0 (`.../7363477-chapter-0-en`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 36 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Exiled Heavy Knight Knows How to Game the System, URL=`.../4q91m-the-exiled-heavy-knight-knows-how-to-game-the-system` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 250/250 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 250/250 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.mfcdn.nl/.../3b198b2b62888420ec2fc73ad5deb8f6.jpg` (image/jpeg, 38060 bytes, 280x400; server Content-Type: image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../4q91m-the-exiled-heavy-knight-knows-how-to-game-the-system` |  |  |  |
| details thumbnail URL | PASS | `https://static.mfcdn.nl/.../3b198b2b62888420ec2fc73ad5deb8f6.jpg` |  |  |  |
| details author | PASS | Necoco |  |  |  |
| details artist | PASS | Brocco Lee |  |  |  |
| details genres | PASS | Manga, Action, Drama, Isekai, Adventure, Fantasy, Magic, Monsters, Reincarnation |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "You good-for-nothing bastard. You are the son of a Sword Saint, yet you dare pull such a defective Class?!" During the "Divine Blessing Ceremony" of the 15-year-old Elma who came from a lineage of Sword Saints, he had manifested a commonly deemed defective class known as the Heavy Knight. He had been deprived of his position as the next head of the Edvan Household and was then exiled. The Heavy Knight class had an unbalanced status and useless skills, to top it off, it was even said to be a class cowardly and indolent people have. But, Elma knew better—that this world was the world of the game he had used to play before—and that the Heavy Knight class was the strongest class to exist. Elma made full use of the knowledge he had in his previous life and began his efficient walkthrough of the world he was reincarnated into. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 348 chapters |  |  |  |
| chapter dates | PASS | 348 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://m3z.mfcdn1.xyz/.../p.jpg` (image/jpeg, 301236 bytes, 960x1378) |  |  |  |
