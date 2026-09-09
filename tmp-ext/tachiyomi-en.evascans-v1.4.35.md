# Extension Validation Report

- Extension: tachiyomi-en.evascans-v1.4.35
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
- Source theme: mangathemesia
- Source ID: 1911019612901009263
- Source name: Eva Scans
- Source language: en
- Selected manga input: popular offset 0: You Like Someone With That Face? (`.../you-like-someone-with-that-face`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | You Like Someone With That Face? (`.../you-like-someone-with-that-face`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 40 | I Don’t Believe in Dating Apps! (`.../i-dont-believe-in-dating-apps`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | The Former Ace Producer Aims for 10 Million Followers in Her Second Life (`.../the-former-ace-producer-aims-for-10-million-followers-in-her-second-life`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | Kanpeki Reijo Kurarisha No Kagayaki Wa Gyakkyo Nanka Ja Kumoranai Konyaku Haki Sarete Mo Jiriki De Shiawase Otsukameba Yoi Node Wa? (`.../kanpeki-reijo-kurarisha-no-kagayaki-wa-gyakkyo-nanka-ja-kumoranai-konyaku-haki-sarete-mo-jiriki-de-shiawase-otsukameba-yoi-node-wa`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | You Like Someone With That Face? (`.../you-like-someone-with-that-face`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | You Like Someone With That Face? (`.../you-like-someone-with-that-face`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 52 | Chapter 1 (`.../you-like-someone-with-that-face-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | <1s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=You Like Someone With That Face?, URL=`.../you-like-someone-with-that-face` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../2025-09-24-06-24-41-1758695081405.png` (image/png, 266743 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../you-like-someone-with-that-face` |  |  |  |
| details thumbnail URL | PASS | `https://i1.wp.com/.../2025-09-24-06-24-41-1758695081405.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Harem, Romance, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Rating: 9.00/10<br><br>Views: 175,268<br><br>Synopsis: If you were born with an ugly face, you know where to fall and where to fall, You must distinguish between what can be overlooked and what is not. Noeul thought that he was fortunate that he was born with such an eye.<br><br>Alternative Names:<br>- Fugly Casanova<br>- 그 얼굴로 누굴 좋아한다구요? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | PASS | 52 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://evascans.org/.../series <redacted query values: title, page, and order>` to `https://evascans.net/.../series <redacted query values: title, page, and order>` (1 redirects); popular_next: `https://evascans.org/.../series <redacted query values: title, page, and order>` to `https://evascans.net/.../series <redacted query values: title, page, and order>` (1 redirects); latest: `https://evascans.org/.../series <redacted query values: title, page, and order>` to `https://evascans.net/.../series <redacted query values: title, page, and order>` (1 redirects); latest_next: `https://evascans.org/.../series <redacted query values: title, page, and order>` to `https://evascans.net/.../series <redacted query values: title, page, and order>` (1 redirects); search: `https://evascans.org/.../series <redacted query values: title, page, author, yearx, status, type, and order>` to `https://evascans.net/.../series <redacted query values: title, page, author, yearx, status, type, and order>` (1 redirects); details: `https://evascans.org/.../you-like-someone-with-that-face` to `https://evascans.net/.../you-like-someone-with-that-face` (1 redirects); chapters: `https://evascans.org/.../you-like-someone-with-that-face` to `https://evascans.net/.../you-like-someone-with-that-face` (1 redirects); pages: `https://evascans.org/.../you-like-someone-with-that-face-chapter-1` to `https://evascans.net/.../you-like-someone-with-that-face-chapter-1` (1 redirects) |  |  |  |
| page load | PASS | `https://evascans.net/.../01.webp` (image/webp (encoding: lossy), 512832 bytes, 800x8990) |  |  |  |
