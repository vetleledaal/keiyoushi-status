# Extension Validation Report

- Extension: tachiyomi-en.toonily-v1.6.78
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5190569675461947007
- Source name: Toonily
- Source language: en
- Selected manga input: popular offset 0: The Beginning After the End (`.../5521`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | The Beginning After the End (`.../5521`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | FFF-Class Trash hero (`.../11081`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | The Beginning After the End (`.../5521`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | That Couple Has A Secret (`.../49724`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Beginning After the End (`.../5521`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Beginning After the End (`.../5521`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 276 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 44 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Beginning After the End, URL=`5521` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.tnlycdn.com/.../The-Beginning-After-the-End-manhwa-350x476.jpg` (image/jpeg, 110143 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `5521` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://static.tnlycdn.com/.../The-Beginning-After-the-End-manhwa-224x320.jpg` (image/jpeg, 110143 bytes, 400x600) |  |  |  |
| details author | PASS | TurtleMe |  |  |  |
| details artist | PASS | Duta Permana |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Isekai, School Life, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | King Grey has unrivaled strength, wealth, and prestige in a world governed by martial ability. However, solitude lingers closely behind those with great power. Beneath the glamorous exterior of a powerful king lurks the shell of man, devoid of purpose and will. Reincarnated into a new world filled with magic and monsters, the king has a second chance to relive his life. Correcting the mistakes of his past will not be his only challenge, however. Underneath the peace and prosperity of the new world is an undercurrent threatening to destroy everything he has worked for, questioning his role and reason for being born again.<br><br>The Beginning After the End (also known as 끝이 아닌 시작, TBATE) is an ongoing Korean isekai manhwa , written by TurtleMe and illustrated by Duta Permana, published by Tapas.<br><br>It is also commonly searched as “The Beginning After the End manga”, even though it follows the Korean manhwa/webtoon format. Readers who want to read The Beginning After the End online in English can explore this series for its engaging plot, character-driven storytelling, and distinctive artwork.<br><br>Whether you search for The Beginning After the End manhwa or The Beginning After the End manga, it offers a strong reading experience within the isekai genre.<br><br>Alternative Names: 끝이 아닌 시작, TBATE |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 276 chapters |  |  |  |
| chapter dates | PASS | 276 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 44 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://data.tnlycdn.com/.../001.jpg` (image/webp (encoding: lossy), 23640 bytes, 700x1890) |  |  |  |
