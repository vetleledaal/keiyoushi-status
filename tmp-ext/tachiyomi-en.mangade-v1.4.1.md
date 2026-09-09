# Extension Validation Report

- Extension: tachiyomi-en.mangade-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3447999145778061665
- Source name: MangaDE
- Source language: en
- Selected manga input: popular offset 0: Maou to Ryuuou ni Sodaterareta Shounen wa Gakuen Seikatsu wo Musou suru You desu (`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu <redacted query values: mid>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Maou to Ryuuou ni Sodaterareta Shounen wa Gakuen Seikatsu wo Musou suru You desu (`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu <redacted query values: mid>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | I become the youngest disciple of the martial arts leader (`.../i-become-the-youngest-disciple-of-the-martial-arts-leader <redacted query values: mid>`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Exclusive Stewardess of Mr. CEO (`.../exclusive-stewardess-of-mr-ceo <redacted query values: mid>`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Domestic na Kanojo (`.../domestic-na-kanojo <redacted query values: mid>`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Maou to Ryuuou ni Sodaterareta Shounen wa Gakuen Seikatsu wo Musou suru You desu (`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu <redacted query values: mid>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Maou to Ryuuou ni Sodaterareta Shounen wa Gakuen Seikatsu wo Musou suru You desu (`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu <redacted query values: mid>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 44 | Chapter 1 (`.../chapter-1 <redacted query values: cid and mid>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Maou to Ryuuou ni Sodaterareta Shounen wa Gakuen Seikatsu wo Musou suru You desu, URL=`.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu <redacted query values: mid>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s3-load.ttr.group/.../1756160043475_image.jpg` (image/png, 353316 bytes, 386x556; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../maou-to-ryuuou-ni-sodaterareta-shounen-wa-gakuen-seikatsu-wo-musou-suru-you-desu <redacted query values: mid>` |  |  |  |
| details thumbnail URL | PASS | `https://s3-load.ttr.group/.../1756160043475_image.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Mature, Action, Ecchi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 44 chapters |  |  |  |
| chapter dates | PASS | 44 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s3-load.ttr.group/.../1756160065522_238_image.jpg` (image/jpeg, 131084 bytes, 900x2064) |  |  |  |
