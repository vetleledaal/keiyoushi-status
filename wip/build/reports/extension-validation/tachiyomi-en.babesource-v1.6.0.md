# Extension Validation Report

- Extension: tachiyomi-en.babesource-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1392050123569941796
- Source name: BabeSource
- Source language: en
- Selected manga input: popular offset 0: Sophia Leone - Blacked (`.../sophia-leone-blacked-19111.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 76 | Sophia Leone - Blacked (`.../sophia-leone-blacked-19111.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 76 | Ava Addams - Milfs Like It Big (`.../ava-addams-milfs-like-it-big-63821.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 76 | Amalia Davis - Vixen (`.../amalia-davis-vixen-220817.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 76 | Cherry Kiss - Evil Angel (`.../cherry-kiss-evil-angel-220767.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 75 | Sophia Leone - A Black Bull For My Hotwife #4 (`.../sophia-leone-a-black-bull-for-my-hotwife-4-76181.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sophia Leone - Blacked (`.../sophia-leone-blacked-19111.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../sophia-leone-blacked-19111.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| popular listing | PASS | 76 entries |  |  |  |
| latest listing | PASS | 76 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 75 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 379/379 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 379/379 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.babesource.com/.../SOPHIE-LEONE-BLACKED 02.jpg` (image/jpeg, 25993 bytes, 226x306) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sophia-leone-blacked-19111.html` |  |  |  |
| details thumbnail URL | PASS | `https://media.babesource.com/.../SOPHIE-LEONE-BLACKED 02.jpg` |  |  |  |
| details author | PASS | Sophia Leone |  |  |  |
| details artist | PASS | Blacked |  |  |  |
| details genres | PASS | Big Cock, Facial, Interracial, monstercock |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 75% liked · 1,444 votes · 15 photos<br><br>**Paysite:**<br>- \[Blacked\](https://babesource.com/.../Blacked)<br><br>**Models:**<br>- \[Sophia Leone\](https://babesource.com/.../sophia-leone-1816) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://babesource.com/.../SOPHIE-LEONE-BLACKED%2001.jpg` (image/jpeg, 299952 bytes, 2000x3000) |  |  |  |
