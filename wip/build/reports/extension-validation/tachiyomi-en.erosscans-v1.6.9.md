# Extension Validation Report

- Extension: tachiyomi-en.erosscans-v1.6.9
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: mangathemesia
- Source ID: 1124131000360667434
- Source name: Scythe Scans
- Source language: en
- Selected manga input: popular offset 0: Hero Killer (`.../hero-killer`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Hero Killer (`.../hero-killer`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | unOrdinary (`.../unordinary`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Jungle Juice (`.../jungle-juice`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Hero Killer (`.../hero-killer`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hero Killer (`.../hero-killer`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 292 | Chapter 1 (`.../hero-killer-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
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
| details description | PASS | The world is in constant turmoil, with constant wars breaking out between Heroes and Villains. Gifted with supernatural abilities, one lone girl sets out on a bloody path for revenge against the injustices of the world she lives in. With the constant clashes between titans, no one is safe. If no one is willing to protect the innocent, who are the real heroes, and who are the real villains? What truly separates one from the other?<br><br>Alternative Names: <br>- Hero Killer<br>- 히어로 킬러<br>- La asesina de héroes<br>- Zabójca bohaterów<br>- La tueuse d'héros<br>- Heldentöter<br>- Tueur des héros<br>- Вбивця героїв<br>- Убийца героев<br>- 英雄殺手<br>- Hero Killer (Beolkkul)<br>- ヒーローキラー |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 292 chapters |  |  |  |
| chapter dates | PASS | 292 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://scythescans.com/.../01-76.webp` (image/webp (encoding: lossy), 955074 bytes, 800x9465) |  |  |  |
