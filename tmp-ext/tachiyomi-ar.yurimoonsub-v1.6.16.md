# Extension Validation Report

- Extension: tachiyomi-ar.yurimoonsub-v1.6.16
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7833471811016150678
- Source name: Yuri Moon Sub
- Source language: ar
- Selected manga input: popular offset 0: Bad Thinking Diary مانهوا مترجمة (`.../bad-thinking-diary_23.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | Bad Thinking Diary مانهوا مترجمة (`.../bad-thinking-diary_23.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | MURMUR مترجمة (`.../murmur.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 8 | borrowing textbooks (`.../borrowing-textbooks.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bad Thinking Diary مانهوا مترجمة (`.../bad-thinking-diary_23.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 61 | الفصل 1 (`.../1_21.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 120 |  |  | 1-10s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 33/33 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 33/33 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../01.jpg` (image/jpeg, 203061 bytes, 1100x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bad-thinking-diary_23.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../01.jpg` (image/jpeg, 94966 bytes, 600x873) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | بالغ, حياة مدرسية, دراما, رومانسي, شريحة من الحياة, يوري |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | يونا و مينجي الذي دائماً مع بعضهما البعض من سن 17 حتى 21 عاماً، كل منهما افضل صديق للآخر في يوم واحد فقط اختلفت علاقتهم بجدارة، فقط بدأ حلم مينجي المثير والجامح بشأن يونا فتبدأ علاقتهما بالتغير بشكل تدريجي<br><br>أسماء أخرى: Bad Thinking Diary مترجمة , يوميات التفكير السيء مترجمة |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 61 chapters |  |  |  |
| chapter dates | PASS | 61 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 120 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../chap_1_page-0001.jpg` (image/webp (container: extended), 4800 bytes, 721x1600) |  |  |  |
