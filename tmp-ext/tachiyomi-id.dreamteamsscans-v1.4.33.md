# Extension Validation Report

- Extension: tachiyomi-id.dreamteamsscans-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4473891485969679132
- Source name: DreamTeams Scans
- Source language: id
- Selected manga input: popular offset 0: You Are My World (`.../you-are-my-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | You Are My World (`.../you-are-my-world`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Passion : Raga (`.../passion-raga`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Moonlighting (`.../moonlighting`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The Night Sun (`.../the-night-sun`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | You Are My World (`.../you-are-my-world`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | You Are My World (`.../you-are-my-world`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 28 | Chapter 1 (`.../chapter-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=You Are My World, URL=`.../you-are-my-world` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=The Night Sun, URL=`.../the-night-sun` at page 1 offset 11 and page 2 offset 0, title=Butler (Nabit), URL=`.../butler-nabit` at page 1 offset 12 and page 2 offset 1, title=Ice On Me, URL=`.../ice-on-me` at page 1 offset 13 and page 2 offset 2, title=Honey Trouble, URL=`.../honey-trouble` at page 1 offset 14 and page 2 offset 3, title=The Fox's Love Refresher, URL=`.../the-foxs-love-refresher` at page 1 offset 15 and page 2 offset 4, title=I Became a First-Class Guide Thanks to My Childhood Friends, URL=`.../i-became-a-first-class-guide-thanks-to-my-childhood-friends` at page 1 offset 17 and page 2 offset 5, title=perfectly popular! heat cycle package, URL=`.../perfectly-popular-heat-cycle-package` at page 1 offset 19 and page 2 offset 6 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.dreamteams.space/.../1771560328039-you-are-my-world.webp` (image/webp (encoding: lossy), 61868 bytes, 420x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../you-are-my-world` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.dreamteams.space/.../1771560328039-you-are-my-world.webp` |  |  |  |
| details author | PASS | Bboong |  |  |  |
| details artist | PASS | Bboong |  |  |  |
| details genres | PASS | Drama, Smut, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[Translated by Alexa\]<br><br>Sahabat masa kecil Juhyeok dan Su-ah pernah berjanji untuk selalu bersama selamanya. Namun, ketika gender sekunder mereka muncul secara terbalik, dunia mereka pun perlahan menjauh.<br><br>Bertahun-tahun kemudian, impian Juhyeok untuk meraih emas Olimpiade berada di ujung tanduk, dan Su-ah mungkin satu-satunya orang yang bisa membantunya mencapainya. Yang kemudian terjalin adalah kisah tentang takdir, harga diri, dan cinta yang menolak untuk menyerah. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.dreamteams.space/.../001.jpg` (image/jpeg, 856030 bytes, 800x8000) |  |  |  |
