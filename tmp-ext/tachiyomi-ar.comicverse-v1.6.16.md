# Extension Validation Report

- Extension: tachiyomi-ar.comicverse-v1.6.16
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7487319247633385575
- Source name: Comic Verse
- Source language: ar
- Selected manga input: popular offset 0: INVINCIBLE (`.../invincible.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | INVINCIBLE (`.../invincible.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | ABSOLUTE WONDER WOMAN  (`.../absolute-wonder-woman.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | One World Under DOOM  (`.../one-world-under-doom.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | INVINCIBLE (`.../invincible.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | INVINCIBLE (`.../invincible.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 146 | العدد#1 (`.../1.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=INVINCIBLE, URL=`.../invincible.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../vol%2001.jpg` (image/jpeg, 186521 bytes, 1067x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../invincible.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../vol%2001.jpg` (image/jpeg, 92332 bytes, 600x900) |  |  |  |
| details author | PASS | Robert Kirkman |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | أكشن, غموض, فانتازيا, مغامرة, IMAGE |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | مارك غرايسون هو البطل الخارق المراهق الذي لا يُقهر. كان طالبًا عاديًا في المرحلة الثانوية، يعمل بدوام جزئي، ويعيش حياة طبيعية، باستثناء أن والده نولان هو البطل الخارق أومني-مان، أقوى بطل خارق على وجه الأرض. في سن السابعة عشرة، بدأ مارك يُظهر قوى خارقة، ورثها عن والده الذي ينتمي إلى عرق الفيلترومايت، الذين، بحسب نولان، رواد المجرة في مهمة لنشر الخير والتنوير. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 146 chapters |  |  |  |
| chapter dates | PASS | 146 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../%D9%85%D9%86%D9%8A%D8%B9%20-%20001.PDF-000.jpg` (image/jpeg, 215551 bytes, 1039x1600) |  |  |  |
