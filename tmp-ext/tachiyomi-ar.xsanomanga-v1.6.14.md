# Extension Validation Report

- Extension: tachiyomi-ar.xsanomanga-v1.6.14
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6170348197605244575
- Source name: XSano Manga
- Source language: ar
- Selected manga input: popular offset 0: BE BLUES (`.../be-blues.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | BE BLUES (`.../be-blues.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | BE BLUES (`.../be-blues.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | BE BLUES (`.../be-blues.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 217 | الفصل 1 (`.../1.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 61 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=BE BLUES, URL=`.../be-blues.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 9/9 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 9/9 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../VOL%2010.jpg` (image/jpeg, 154946 bytes, 600x942) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../be-blues.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../VOL%2010.jpg` (image/jpeg, 67373 bytes, 340x534) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Adventure, Drama, Martial Arts, Seinen, Sports |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | إن نشأت بلعب كرة القدم في اليابان، فسترغب بتمثيل المنتخب الوطني. وكحال الجميع، إيتشيجو ريو فتى يحلم بأن يصبح لاعبًا للمنتخب الوطني. وبصحبة صديقَا الطفولة التؤام يوكي، ويوتو، سيسعى أولاً لتحقيق بطولة اليابان تحت سن 12. الشّغف لرؤية مواجهة فردية! الضغط أمام المرمى! وبهجة إحراز هجمة نموذجية! هنا تجد كل ما يميز كرة القدم. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 217 chapters |  |  |  |
| chapter dates | PASS | 217 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 61 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../o001.webp` (image/jpeg, 90220 bytes, 1600x1143) |  |  |  |
