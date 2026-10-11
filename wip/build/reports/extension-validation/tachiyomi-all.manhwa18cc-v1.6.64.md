# Extension Validation Report

- Extension: tachiyomi-all.manhwa18cc-v1.6.64
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: madara
- Source ID: 4841602236575491202
- Source name: Manhwa18.cc
- Source language: en
- Selected manga input: popular offset 0: Keep it a secret from your mother! (`.../keep-it-a-secret-from-your-mother-01`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 23 | Keep it a secret from your mother! (`.../keep-it-a-secret-from-your-mother-01`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 22 | My Landlady Noona (`.../my-landlady-noona-01`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Slave Code (`.../slave-code`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 14 | While the World Sleeps (`.../while-the-world-sleeps`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Keep it a secret from your mother! (`.../keep-it-a-secret-from-your-mother-01`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Keep it a secret from your mother! (`.../keep-it-a-secret-from-your-mother-01`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 112 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | <1s |

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
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Keep it a secret from your mother!, URL=`.../keep-it-a-secret-from-your-mother-01` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 84/84 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 84/84 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwa18.cc/.../keep-it-a-secret-from-your-motherm.jpg` (image/jpeg, 12956 bytes, 187x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../keep-it-a-secret-from-your-mother-01` |  |  |  |
| details thumbnail URL | PASS | `https://manhwa18.cc/.../keep-it-a-secret-from-your-motherm.jpg` |  |  |  |
| details author | PASS | Noah |  |  |  |
| details artist | PASS | Noah |  |  |  |
| details genres | PASS | Romance, School Life, Slice of Life, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Hae-Seong is staying at his mom’s friend’s house whose name is Yona. He thought it would be enough to study well at school but the top students are good at love too. “The classroom wasn’t only for studying…?!"<br><br>Alternative Names: 엄마한텐 비밀이야 / Secret to your mom |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 112 chapters |  |  |  |
| chapter dates | PASS | 112 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://manhwa18.cc/.../webtoons <redacted query values: orderby>` to `https://manhwa18.cc/.../webtoons <redacted query values: orderby>` (1 redirects); popular: `https://manhwa18.cc/.../webtoons` to `https://manhwa18.cc/.../webtoons` (1 redirects); popular: `https://manhwa18.cc/.../2 <redacted query values: orderby>` to `https://manhwa18.cc/.../2 <redacted query values: orderby>` (1 redirects); popular: `https://manhwa18.cc/.../2` to `https://manhwa18.cc/.../2` (1 redirects); popular: `https://manhwa18.cc/.../chapter-1` to `https://manhwa18.cc/.../chapter-1` (1 redirects) |  |  |  |
| page load | PASS | `https://img01.manhwa18.cc/.../1-534.jpg` (image/jpeg, 359157 bytes, 719x2975) |  |  |  |
