# Extension Validation Report

- Extension: tachiyomi-ar.arabtoons-v1.6.57
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
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
- Source ID: 2424761902286195560
- Source name: عرب تونز
- Source language: ar
- Selected manga input: popular offset 0: Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | The Man Who Devours (`.../the-man-who-devours`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Making friends with streamers by hacking (`.../making-friends-with-streamers-by-hacking`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | I Banged All My Classmates After Graduation (`.../i-banged-all-my-classmates-after-graduation`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Regressed Warrior’s Female Dominance (`.../regressed-warriors-female-dominance`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 98 | الفصل 1 (`.../%D8%A7%D9%84%D9%81%D8%B5%D9%84-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Regressed Warrior’s Female Dominance, URL=`regressed-warriors-female-dominance` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arabtoons.net/.../caad6ce98ac37827.webp` (image/webp (encoding: lossy), 73130 bytes, 500x750) |  |  |  |
| details identity | PASS | Details preserved selected URL `regressed-warriors-female-dominance` |  |  |  |
| details thumbnail URL | PASS | `https://arabtoons.net/.../caad6ce98ac37827.webp` |  |  |  |
| details author | PASS | usagi / Lenan |  |  |  |
| details artist | PASS | usagi |  |  |  |
| details genres | PASS | اكشن, حريم, خيال, دراما |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | لقد تعرضت للضغط والترهيب في حياتي الماضية، ولكن هذه المرة سأعيش بالطريقة التي أريدها. بالتأكيد سأضاجع كل النساء الجميلات اللاتي أراهن، هيمنتي الأنثوية ستبدأ الآن!<br><br>Alternative Names: الحياة الجنسية للمحارب العائد |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 98 chapters |  |  |  |
| chapter dates | PASS | 98 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://arabtoons.net/.../000001.webp` (image/webp (encoding: lossy), 613242 bytes, 720x9335) |  |  |  |
