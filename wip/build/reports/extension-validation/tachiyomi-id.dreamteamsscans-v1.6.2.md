# Extension Validation Report

- Extension: tachiyomi-id.dreamteamsscans-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: loneseal
- Source ID: 4473891485969679132
- Source name: DreamTeams Scans
- Source language: id
- Selected manga input: popular offset 0: You Are My World (`.../you-are-my-world`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | You Are My World (`.../you-are-my-world`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Protect Your Purity! (`.../protect-your-purity`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 35 | You Get Me Going (`.../you-get-me-going`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | You Are My World (`.../you-are-my-world`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | You Are My World (`.../you-are-my-world`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 28 | Chapter 1 (`.../chapter-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=You Are My World, URL=`.../you-are-my-world` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 76/76 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 76/76 manga have thumbnail URLs |  |  |  |
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
