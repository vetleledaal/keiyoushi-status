# Extension Validation Report

- Extension: tachiyomi-en.cartoonporn-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 28
- Lint: 2
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 7034264791241222160
- Source name: CartoonPorn
- Source language: en
- Selected manga input: popular offset 0: Horse-Men Incident porn comic (`.../horse-men-incident-porn-comic`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 22 | Horse-Men Incident porn comic (`.../horse-men-incident-porn-comic`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 22 | [NCP] Shikai Jack de NTR Houdai! Gal Mama no Bonyuu mo, Seifuku Joshi no Dekashiri mo, GraDol no Bakunyuu mo Zenbu Ore no Mono porn comic (`.../ncp-shikai-jack-de-ntr-houdai-gal-mama-no-bonyuu-mo-seifuku-joshi-no-dekashiri-mo-gradol-no-bakunyuu-mo-zenbu-ore-no-mono-porn-comic`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | CartoonPorn (`.../porncomic`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Horse-Men Incident porn comic (`.../horse-men-incident-porn-comic`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Horse men incident chapter 1 (`.../horse-men-incident-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 47 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 1 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 45/45 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 45/45 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://cartoonporn.to/.../horse-men-incident-monsters-tentacles-sex-comic.jpg` -> 2 manga URLs (examples: `.../horse-men-incident-porn-comic`, `.../porncomic`) |  |  |  |
| thumbnail | PASS | `https://cartoonporn.to/.../horse-men-incident-monsters-tentacles-sex-comic.jpg` (image/jpeg, 209616 bytes, 832x1216) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../horse-men-incident-porn-comic` |  |  |  |
| details thumbnail URL | PASS | `https://cartoonporn.to/.../horse-men-incident-monsters-tentacles-sex-comic.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ahegao, Ai Art, Big Cock, Blowjob, bubble butt, Cumshot, Deepthroat, excessive cum |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cartoonporn.to/.../image-1.jpg` (image/jpeg, 209616 bytes, 832x1216) |  |  |  |
