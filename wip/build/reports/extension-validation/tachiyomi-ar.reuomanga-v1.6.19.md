# Extension Validation Report

- Extension: tachiyomi-ar.reuomanga-v1.6.19
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 1743225368606160379
- Source name: REUO MANGA
- Source language: ar
- Selected manga input: popular offset 0: Charlotte Has Five Disciples (`.../charlotte-has-five-disciples.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Charlotte Has Five Disciples (`.../charlotte-has-five-disciples.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 13 | A Story of an Unlikely Love (`.../a-story-of-unlikely-love.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Charlotte Has Five Disciples (`.../charlotte-has-five-disciples.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Charlotte Has Five Disciples (`.../charlotte-has-five-disciples.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 91 | Charlotte Has Five Disciples  Chapter 01 (`.../charlotte-has-five-disciples-chapter-01.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Charlotte Has Five Disciples, URL=`.../charlotte-has-five-disciples.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 34/34 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 34/34 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://imgg.io/.../fb021f338fe9474874dabee0ea343152.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../charlotte-has-five-disciples.html` |  |  |  |
| details thumbnail URL | PASS | `https://imgg.io/.../fb021f338fe9474874dabee0ea343152.webp` |  |  |  |
| details author | PASS | Yong Yong |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Magic |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | شارلوت إليانور هي ساحرة لأنقاذ العالم استخدامت سحرها للموت بدلا من ذلك ، عكس عمر جسدها من شخص كبير في السن للطفل وتبدأ حياة ثانية باسم أريا ليسين. والتي كان لها حياة مرضية في حياتها الأولى ، باستثناء أسف واحد صغير. لذلك في هذه الحياة الجديدة ، أريا مصممة على إيجاد والعيش لهذا الشيء الوحيد والذي لم يكن لديها وهو ... الحب<br><br>**سنة الإصدار:** 2019 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 90 name, chapter 91 name |  |  |  |
| chapters | PASS | 91 chapters |  |  |  |
| chapter dates | PASS | 91 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://imgg.io/.../9b3ed9c9bf0728f50d624d662fe8f6c3.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
