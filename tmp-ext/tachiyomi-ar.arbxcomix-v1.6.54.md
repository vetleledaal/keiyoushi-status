# Extension Validation Report

- Extension: tachiyomi-ar.arbxcomix-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6405758918736185117
- Source name: ArbxComix
- Source language: ar
- Selected manga input: popular offset 0: صف سري (`.../1110`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | صف سري (`.../1110`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | إغتصاب ربات المنزل اليابانيات (`.../793`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | دروس المزرعة (`.../2501`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | داندا أنال (`.../2439`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | صف سري (`.../1110`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | صف سري (`.../1110`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 307 | صف سري الجزء 1 (`.../00862`) |  | <1s |
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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=صف سري, URL=`1110` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arbxcomix.com/.../Secret-Class-175x238.jpg` (image/jpeg, 10002 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1110` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://arbxcomix.com/.../Secret-Class.jpg` (image/jpeg, 12332 bytes, 193x278) |  |  |  |
| details author | PASS | Toptoon Co |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | مانهوا, الأخت, الأم, زوجة خائنة, محارم, ميلفات |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ‘داي هو’ ، الذي أصبح يتيمًا في سن 13 عامًا ، تبناه صديق والده. ومع ذلك ، لم يكن ‘داي هو’ يعرف شيئًا عن العلاقة بين الرجل والمرأة في مرحلة البلوغ. قررت العمة والأخوات منح داي هو صفًا سريًا … |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 307 chapters |  |  |  |
| chapter dates | LINT | All 307 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=307 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 44 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://arbxcomix.com/.../img0001.jpg` (image/jpeg, 42854 bytes, 366x1537) |  |  |  |
