# Extension Validation Report

- Extension: tachiyomi-en.erosscans-v1.4.40
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1124131000360667434
- Source name: Scythe Scans
- Source language: en
- Selected manga input: popular offset 0: Hero Killer (`.../hero-killer`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Hero Killer (`.../hero-killer`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | The Divine-Eyed Grimoire Mage: Jewel Saga (`.../the-divine-eyed-grimoire-mage-jewel-saga`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Legend of Star General (`.../legend-of-star-general`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Hero Killer (`.../hero-killer`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Hero Killer (`.../hero-killer`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 287 | Chapter 1 (`.../hero-killer-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hero Killer, URL=`.../hero-killer` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=The Divine-Eyed Grimoire Mage: Jewel Saga, URL=`.../the-divine-eyed-grimoire-mage-jewel-saga` at page 1 offset 19 and page 2 offset 0 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Dungeon Games: The Ex-Corporate Slave Dominates with the Ultimate Job, “Trickster”, URL=`.../dungeon-games-the-ex-corporate-slave-dominates-with-the-ultimate-job-trickster` at page 1 offset 3 and page 2 offset 7, title=The Yellow-Haired Villain in Soaring Phoenix’s Novels Also Desires Happiness, URL=`.../the-yellow-haired-villain-in-soaring-phoenixs-novels-also-desires-happiness` at page 1 offset 4 and page 2 offset 2, title=The Glutton, URL=`.../the-glutton` at page 1 offset 5 and page 2 offset 1, title=Magic Emperor, URL=`.../magic-emperor` at page 1 offset 6 and page 2 offset 0, title=unOrdinary, URL=`.../unordinary` at page 1 offset 9 and page 2 offset 3, title=The Archmage’s Restaurant, URL=`.../the-archmages-restaurant` at page 1 offset 12 and page 2 offset 8, title=I Became a Mage in a Medieval Fantasy World, URL=`.../i-became-a-mage-in-a-medieval-fantasy-world` at page 1 offset 13 and page 2 offset 4, title=World’s Strongest Troll, URL=`.../worlds-strongest-troll` at page 1 offset 15 and page 2 offset 9, title=The Dark Swordsman Returns, URL=`.../the-dark-swordsman-returns` at page 1 offset 18 and page 2 offset 10 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../brBJaW.jpg` (image/jpeg, 430063 bytes, 690x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hero-killer` |  |  |  |
| details thumbnail URL | PASS | `https://i1.wp.com/.../brBJaW.jpg` |  |  |  |
| details author | PASS | Beolkkul |  |  |  |
| details artist | PASS | Beolkkul |  |  |  |
| details genres | PASS | Action, Comedy, Crime, Drama, Martial arts, Mystery, Superhero, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The world is in constant turmoil, with constant wars breaking out between Heroes and Villains. Gifted with supernatural abilities, one lone girl sets out on a bloody path for revenge against the injustices of the world she lives in. With the constant clashes between titans, no one is safe. If no one is willing to protect the innocent, who are the real heroes, and who are the real villains? What truly separates one from the other?<br><br>Alternative Names:<br>- Hero Killer<br>- 히어로 킬러<br>- La asesina de héroes<br>- Zabójca bohaterów<br>- La tueuse d'héros<br>- Heldentöter<br>- Tueur des héros<br>- Вбивця героїв<br>- Убийца героев<br>- 英雄殺手<br>- Hero Killer (Beolkkul)<br>- ヒーローキラー |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 287 chapters |  |  |  |
| chapter dates | PASS | 287 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://scythescans.com/.../01-76.webp` (image/webp (encoding: lossy), 955074 bytes, 800x9465) |  |  |  |
