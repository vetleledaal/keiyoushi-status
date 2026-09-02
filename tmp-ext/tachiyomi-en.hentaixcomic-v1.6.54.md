# Extension Validation Report

- Extension: tachiyomi-en.hentaixcomic-v1.6.54
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
- Source ID: 7664311260874726882
- Source name: HentaiXComic
- Source language: en
- Selected manga input: popular offset 0: Boruto Erotic Adventure (Boruto) (`.../121`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Boruto Erotic Adventure (Boruto) (`.../121`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Exploring the Alley (Dora the Explorer) (`.../961`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Costa Carino Chronicles (`.../5884`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | NTR by microchip69 (`.../5767`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Boruto Erotic Adventure (Boruto) (`.../121`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Boruto Erotic Adventure (Boruto) (`.../121`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | 10 Pages (`.../10-pages`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Boruto Erotic Adventure (Boruto), URL=`121` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaixcomic.com/.../Page-0-175x238.jpg` (image/jpeg, 15786 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `121` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaixcomic.com/.../Page-0-193x278.jpg` (image/jpeg, 19968 bytes, 193x278) |  |  |  |
| details author | PASS | Yutto Prime |  |  |  |
| details artist | PASS | Yutto Prime |  |  |  |
| details genres | PASS | Big Breasts, Boruto, Full Color, Incest, MILF, Parody |  |  |  |
| details status | PASS | CANCELLED (5) |  |  |  |
| details description | PASS | Alternative Names: Boruto Erotic Adventure |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | LINT | 4 of 5 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=4 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hentaixcomic.com/.../Page-0.webp` (image/webp (encoding: lossy), 74246 bytes, 688x1080) |  |  |  |
