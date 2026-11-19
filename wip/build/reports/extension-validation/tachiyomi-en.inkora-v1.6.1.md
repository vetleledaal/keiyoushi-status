# Extension Validation Report

- Extension: tachiyomi-en.inkora-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3924688286823005722
- Source name: Inkora
- Source language: en
- Selected manga input: popular offset 0: Chainsaw Man (`.../al-105778`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Chainsaw Man (`.../al-105778`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Black Clover (`.../al-86123`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Yokohama Kaidashi Kikou (`.../al-30004`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Rookies (`.../al-30915`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 13 | Chainsaw Man (`.../al-105778`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chainsaw Man (`.../al-105778`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1426 | Chapter 1 - Dog & Chainsaw (`.../md-a59b7d15-50f0-4534-b7e1-e8f1e0db8695`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chainsaw Man, URL=`al-105778` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 109/109 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 109/109 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.anilist.co/.../bx105778-euxXZEIfDY2u.png` (image/png, 609084 bytes, 460x722) |  |  |  |
| details identity | PASS | Details preserved selected URL `al-105778` |  |  |  |
| details thumbnail URL | PASS | `https://s4.anilist.co/.../bx105778-euxXZEIfDY2u.png` |  |  |  |
| details author | PASS | Tatsuki Fujimoto |  |  |  |
| details artist | PASS | Tatsuki Fujimoto |  |  |  |
| details genres | PASS | Manga, Action, Comedy, Drama, Horror, Supernatural, Mature, Mystery, Psychological, Shounen, Tragedy, Award winning, Fantasy, Gore, Urban Fantasy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★☆ 8.45 (49871)<br>2018<br><br>Denji was a small-time devil hunter just trying to survive in a harsh world. After being killed on a job, he is revived by his pet devil-dog Pochita and becomes something new and dangerous—Chainsaw Man! \*Source: VIZ Media\*<br><br>**Alternative Names:**<br>- チェンソーマン<br>- CSM<br>- رجل المنشار<br>- Человек-бензопила<br>- 체인소 맨<br>- 鏈鋸人<br>- 电锯人<br>- มนุษย์เลื่อยยนต์<br>- Testere Adam<br>- Chain Saw Man<br>- 체인쏘맨<br>- CHAINSAW MAN<br>- Chainsaw Man: Public Safety Saga<br>- Людина-бензопила<br>- Шынжырлы ара адам<br>- مرد اره ای<br>- चेन्सो म्यान<br>- មនុស្សរណា<br>- チェンソーマン 第二部<br>- 電鋸人 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1426 chapters |  |  |  |
| chapter dates | LINT | 571 of 1426 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=571 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
