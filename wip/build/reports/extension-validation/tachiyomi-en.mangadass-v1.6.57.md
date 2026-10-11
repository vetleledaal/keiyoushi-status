# Extension Validation Report

- Extension: tachiyomi-en.mangadass-v1.6.57
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5571661567325096882
- Source name: Manga Dass
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Secret Class (`.../secret-class`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | One’s In-Laws Virgins (`.../ones-in-laws-virgins`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Mother’s Friends (`.../mothers-friends`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Friendzone Face-Off (`.../friendzone-face-off`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../secret-class`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 333 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangadass.com/.../secret-classm.jpg` (image/jpeg, 16570 bytes, 214x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://mangadass.com/.../secret-classm.jpg` |  |  |  |
| details author | PASS | Gang-cheol Wang |  |  |  |
| details artist | PASS | Minachan |  |  |  |
| details genres | PASS | Comedy, Harem, Mature, Romance, Slice of Life, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Alternative Names: Bimilsueop ; 비밀 수업 ; 秘密教學 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 333 chapters |  |  |  |
| chapter dates | PASS | 333 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangadass.com/.../manga <redacted query values: orderby>` to `https://mangadass.com/.../manga <redacted query values: orderby>` (1 redirects); popular: `https://mangadass.com/.../manga <redacted query values: orderby>` to `https://mangadass.com/.../manga <redacted query values: orderby>` (1 redirects); popular: `https://mangadass.com/.../2 <redacted query values: orderby>` to `https://mangadass.com/.../2 <redacted query values: orderby>` (1 redirects); popular: `https://mangadass.com/.../2 <redacted query values: orderby>` to `https://mangadass.com/.../2 <redacted query values: orderby>` (1 redirects); popular: `https://mangadass.com/.../chapter-1` to `https://mangadass.com/.../chapter-1` (1 redirects) |  |  |  |
| page load | PASS | `https://img01.mangadass.com/.../1-001.jpg` (image/webp (encoding: lossy), 41812 bytes, 720x880; server Content-Type: image/jpeg) |  |  |  |
