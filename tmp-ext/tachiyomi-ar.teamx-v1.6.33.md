# Extension Validation Report

- Extension: tachiyomi-ar.teamx-v1.6.33
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4110737012647435874
- Source name: Team X
- Source language: ar
- Selected manga input: popular offset 0: fast break (`.../fast-break`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | fast break (`.../fast-break`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Feng Shen Ji (`.../feng-shen-ji`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | The Tang Clan Chronicles (`.../the-tang-clan-chronicles`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | The S-Classes That I Raised (`.../SIR`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | fast break (`.../fast-break`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | fast break (`.../fast-break`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | الفصل 1‏ (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=fast break, URL=`.../fast-break` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://olympustaff.com/.../b77435ac1393101e44a498feb8ab33f0.png` (image/png, 2624957 bytes, 1054x1492) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fast-break` |  |  |  |
| details thumbnail URL | PASS | `https://olympustaff.com/.../b77435ac1393101e44a498feb8ab33f0.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | شونين, حياة مدرسية, رياضي |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | لقد سقط فريق كرة السلة في مدرسة تشينغ تاي اللامعة ذات يوم ويواجه الآن نقصًا في الأعضاء وخطر تفكك النادي. بالصدفة ، يأتي شخص لديه شغف بكرة السلة ، لكن فتى كرة السلة هو باي كي ، الذي لا يعرف كيف يلعب كرة السلة وهو طالب انتقالي جديد. على الرغم من وجود الكثير من النكات في البداية ، إلا أن باي تشي يعتمد على مواهبه غير العادية وعزمه على الفوز ، ويبدأ حقبة جديدة لفريق كرة السلة في مدرسة تشينغ تاي الثانوية ، ويتنافس في المنافسة الوطنية! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://olympustaff.com/.../00.jpg` (image/jpeg, 2697161 bytes, 750x10439) |  |  |  |
