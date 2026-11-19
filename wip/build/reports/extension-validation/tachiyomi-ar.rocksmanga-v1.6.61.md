# Extension Validation Report

- Extension: tachiyomi-ar.rocksmanga-v1.6.61
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3301038340499911137
- Source name: Rocks Manga
- Source language: ar
- Selected manga input: popular offset 0: Juujika no Rokunin (`.../juujika-no-rokunin`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Juujika no Rokunin (`.../juujika-no-rokunin`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Boyish Kanojo ga Kawaisugiru (`.../boyish-kanojo-ga-kawaisugiru`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Welcome to the Rose Mansion (`.../welcome-to-the-rose-mansion`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Mushoku Tensei: Isekai Ittara Honki Dasu (`.../mushoku-tensei-jobless-reincarnation`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Juujika no Rokunin (`.../juujika-no-rokunin`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Juujika no Rokunin (`.../juujika-no-rokunin`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 201 | الفصل 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 73 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Juujika no Rokunin, URL=`.../juujika-no-rokunin` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.rocksmanga.com/.../cover.jpg <redacted query values: ver>` (image/jpeg, 1156395 bytes, 1080x1539) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../juujika-no-rokunin` |  |  |  |
| details thumbnail URL | PASS | `https://api.rocksmanga.com/.../cover.jpg <redacted query values: ver>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | دراما, نفسي, إثارة, مأساوي |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | كان شون أوروما، وهو تلميذ في الصف السادس، يتعرض لتعذيب وتنمر وحشي من خمسة من زملائه الذين أطلقوا عليه اسم «العينة التجريبية A». كانت عائلته ملاذه الوحيد، إلى أن يتسبب المتنمرون في مقتلها ويسلبونه كل ما يملكه. عندها تولد داخله رغبة مظلمة في الانتقام. يتولى جده، الذي خدم سابقًا في وحدة سرية خلال الحرب العالمية الثانية، تدريبه حتى يعيد تشكيله جسديًا ونفسيًا. وبعد أربع سنوات يعود شون لمواجهة أعدائه واحدًا تلو الآخر، مصممًا على ألا يسمح لأحد بالوقوف بينه وبين انتقامه.<br><br>أسماء أخرى:<br>La cruz de seis personas, Six People on Crosses, Распятие Шести, 十字架のろくにん, Cross of Six Men, क्रसमा छ जना मान्छे, X6 - Crucisix, ستة اشخاص على الصلبان |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 201 chapters |  |  |  |
| chapter dates | PASS | 201 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 73 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.rocksmanga.com/.../1.jpg <redacted query values: ver>` (image/jpeg, 493530 bytes, 785x1079) |  |  |  |
