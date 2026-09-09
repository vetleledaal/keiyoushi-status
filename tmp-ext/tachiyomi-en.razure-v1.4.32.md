# Extension Validation Report

- Extension: tachiyomi-en.razure-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3017959474962204247
- Source name: Razure
- Source language: en
- Selected manga input: latest offset 0: MILKY☆SUBWAY: THE GALACTIC LIMITED EXPRESS (`.../milky%E2%98%86subway-the-galactic-limited-express`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 0 |  |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 2 | Mame and the Little One ~ The Witch Apprentice Girl Walks Along with a Potted Plant in Hand ~ (`.../mame-and-the-little-one-the-witch-apprentice-girl-walks-along-with-a-potted-plant-in-hand`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 2 | MILKY☆SUBWAY: THE GALACTIC LIMITED EXPRESS (`.../milky%E2%98%86subway-the-galactic-limited-express`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | MILKY☆SUBWAY: THE GALACTIC LIMITED EXPRESS (`.../milky%E2%98%86subway-the-galactic-limited-express`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | MILKY☆SUBWAY: THE GALACTIC LIMITED EXPRESS (`.../milky%E2%98%86subway-the-galactic-limited-express`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 15 | Chapter 1 - Arrest (`.../milky%E2%98%86subway-the-galactic-limited-express-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 2 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=MILKY☆SUBWAY: THE GALACTIC LIMITED EXPRESS, URL=`.../milky%E2%98%86subway-the-galactic-limited-express` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | FAIL | Page 2 is empty despite page 1 advertising a next page | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 5/5 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 5/5 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../MILKY%E2%98%86SUBWAY-THE-GALACTIC-LIMITED-EXPRESS.png <redacted query values: resize>` (image/png, 234267 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../milky%E2%98%86subway-the-galactic-limited-express` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../MILKY%E2%98%86SUBWAY-THE-GALACTIC-LIMITED-EXPRESS.png` (image/png, 675895 bytes, 529x750) |  |  |  |
| details author | PASS | Yohei Kameyama |  |  |  |
| details artist | PASS | Don Kouya |  |  |  |
| details genres | PASS | Action, Comedy, Drama, Mystery, Sci-fi, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Arrested for reckless space driving, superhuman Chiharu and cyborg Makina are sentenced to clean the Milky☆Subway—an old interplanetary train. Easy enough, right? Wrong. When the train suddenly takes off, they are thrown into a high-speed space-train spectacle packed with chaos, no plans, and zero strategy. Just pure momentum!<br><br>Alternative Names: 銀河特急 ミルキー☆サブウェイ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i2.wp.com/.../01-1.jpg` (image/webp (encoding: lossy), 381040 bytes, 1407x2000) |  |  |  |
