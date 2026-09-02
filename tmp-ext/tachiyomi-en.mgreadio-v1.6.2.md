# Extension Validation Report

- Extension: tachiyomi-en.mgreadio-v1.6.2
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
- Source implementation: keiyoushi.source.Generated
- Source ID: 15083818169656208
- Source name: Mgread.io
- Source language: en
- Selected manga input: popular offset 0: You Like Someone With That Face? (`.../you-like-someone-with-that-face`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | You Like Someone With That Face? (`.../you-like-someone-with-that-face`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Magic Emperor (`.../magic-emperor`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Ultimate Wantless Godly Rich System (`.../the-ultimate-wantless-godly-rich-system`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Bridal Night (`.../bridal-night`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | You Like Someone With That Face? (`.../you-like-someone-with-that-face`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | You Like Someone With That Face? (`.../you-like-someone-with-that-face`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 52 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 114 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=You Like Someone With That Face?, URL=`.../you-like-someone-with-that-face` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 106/106 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 106/106 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mgread.io/.../i502531.webp` (image/webp (encoding: lossy), 29454 bytes, 279x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../you-like-someone-with-that-face` |  |  |  |
| details thumbnail URL | PASS | `https://mgread.io/.../i502531.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | If you’re born with an unattractive face, you need to know when to join in and when to step back, and clearly distinguish between what you can reach for and what you cannot. Noeul felt relieved that at least she was born with the sense to notice such things.<br><br>Chapters: 52<br>Alternative title: You expect anyone to like you with that face?, Fugly Casanova, Geu Eolgullo Nugul Joahandaguyo?, With That Face, You Say You Like Someone?, Кто вам нравится с таким лицом?, С твоим-то лицом, и есть кто нравится?, หน้าตาแบบนี้ใครจะไปชอบกัน?, 그 얼굴로 누굴 좋아한다구요?<br>Rating: 4.2/5 (28)<br>Views: 790.9 K<br>Last updated: 07:45 15/07/2026 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | PASS | 52 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 114 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mg.mgread.io/.../2.webp` (image/webp (encoding: lossy), 2740 bytes, 800x1500) |  |  |  |
