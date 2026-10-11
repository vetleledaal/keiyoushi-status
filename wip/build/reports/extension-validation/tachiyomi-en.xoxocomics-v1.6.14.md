# Extension Validation Report

- Extension: tachiyomi-en.xoxocomics-v1.6.14
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: wpcomics
- Source ID: 2385956107618754468
- Source name: XOXO Comics
- Source language: en
- Selected manga input: popular offset 0: Punisher (2026) (`.../punisher-2026`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Punisher (2026) (`.../punisher-2026`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | Teenage Mutant Ninja Turtles: Saturday Morning Adventures Continued (`.../teenage-mutant-ninja-turtles-saturday-morning-adventures-continued`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 97 | Neighborhood Watch (`.../neighborhood-watch`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 88 | Star Wars: Galaxy's Edge – Echoes of the Empire (`.../star-wars-galaxys-edge-echoes-of-the-empire`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Punisher (2026) (`.../punisher-2026`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Punisher (2026) (`.../punisher-2026`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Punisher (2026) Issue #1 (`.../issue-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 28 |  |  | <1s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 97 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Punisher (2026), URL=`.../punisher-2026` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Punisher (2026), URL=`.../punisher-2026` at page 1 offset 2 and page 2 offset 85, title=X-Men United, URL=`.../x-men-united` at page 1 offset 53 and page 2 offset 63, title=2000 AD, URL=`.../2000-ad` at page 1 offset 62 and page 2 offsets 28, 73 |  |  |  |
| listing duplicates | FAIL | Latest page 2 repeats 1 manga entry: title=2000 AD, URL=`.../2000-ad` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 258/258 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 258/258 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://xoxocomic.com/.../punisher-2026.jpg` (image/jpeg, 12973 bytes, 200x260) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../punisher-2026` |  |  |  |
| details thumbnail URL | PASS | `https://xoxocomic.com/.../punisher-2026.jpg` |  |  |  |
| details author | PASS | Benjamin Percy |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Marvel, Action, Adventure, Crime |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | CRIME'S WORST NIGHTMARE IS BACK IN AN ALL-NEW ONGOING SERIES!<br>As unflinching and uncompromising as ever, Frank Castle's memory is damaged and he's hunting for answers and criminals alike! He'll get more than he bargained for of both when the notorious and bloodthirsty JIGSAW returns... with THE PUNISHER dead in his sights!<br>LEGACY #280 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://xoxocomic.com/.../comic-update <redacted query values: page>` to `https://xoxocomic.com/.../comic-update` (1 redirects); popular: `https://xoxocomic.com/.../search-comic <redacted query values: keyword and page>` to `https://xoxocomic.com/.../search-comic <redacted query values: keyword>` (1 redirects) |  |  |  |
| page load | FAIL | First page URL `https://xoxocomic.com/.../1.jpg` did not contain a decodable image (106374 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
