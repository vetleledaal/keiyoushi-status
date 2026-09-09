# Extension Validation Report

- Extension: tachiyomi-en.lusttoon-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5466172882050312169
- Source name: LustToon
- Source language: en
- Selected manga input: popular offset 0: Wild Dogs Dream of Predation (`.../wild-dogs-dream-of-predation`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Wild Dogs Dream of Predation (`.../wild-dogs-dream-of-predation`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Untie Me Before You Get Hurt (`.../untie-me-before-you-get-hurt`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Survival Instinct (`.../survival-instinct`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Atonement, For Your Cruelty (`.../atonement-for-your-cruelty`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Wild Dogs Dream of Predation (`.../wild-dogs-dream-of-predation`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Wild Dogs Dream of Predation (`.../wild-dogs-dream-of-predation`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 36 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 0 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Wild Dogs Dream of Predation, URL=`.../wild-dogs-dream-of-predation` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.lustoon.com/.../6c0ed887-447e-4199-97e3-dbe3012d33e0.jpg` (image/jpeg, 321432 bytes, 960x1380) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../wild-dogs-dream-of-predation` |  |  |  |
| details thumbnail URL | PASS | `https://media.lustoon.com/.../6c0ed887-447e-4199-97e3-dbe3012d33e0.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Accion, Crimen, Romance, Smut |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mido is kidnapped to serve as a blood source for a young master with a rare constitution. She prepares herself for a miserable end, believing she’ll be abused to death—but the man she meets is beautiful, gentle, and seemingly harmless.<br><br>While staying by Baekgyeong’s side and waiting for a chance to escape, Mido finds her defenses gradually crumbling before a man who hides behind a kind façade.<br>Sensing danger in herself for allowing someone she should hate, she pushes him away.<br><br>A tense battle unfolds between one who tries to hold on and one who tries to escape. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 36 chapters |  |  |  |
| chapter dates | PASS | 36 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
