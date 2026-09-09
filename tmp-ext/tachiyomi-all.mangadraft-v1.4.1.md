# Extension Validation Report

- Extension: tachiyomi-all.mangadraft-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 4
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6866320578550428692
- Source name: MangaDraft
- Source language: all
- Selected manga input: latest offset 0: Éro - Magia (`.../ero-magia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Dragon Ball Kakumei (`.../dragon-ball-kakumei`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | A Place Like Home (`.../a-place-like-home`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Éro - Magia (`.../ero-magia`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Le Club des Exorcistes (`.../le-club-des-exorcistes`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | Le Fléau du Capillophagocyte (`.../le-fleau-du-capillophagocyte`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Éro - Magia (`.../ero-magia`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 0.0.  (`https://www.mangadraft.com/.../1083002`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 20 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.mangadraft.com/.../6a9fda30dd36b.png` (image/png, 328403 bytes, 500x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ero-magia` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | Haakimx |  |  |  |
| details genres | PASS | SF \| Fantasy \| Fantastique, Aventure |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Estan et Flire, deux mages, veulent partir à l’aventure. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 1 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangadraft.com/.../projects <redacted query values: order, type, page, and number>` to `https://www.mangadraft.com/.../projects <redacted query values: order, type, page, and number>` (1 redirects); popular_next: `https://mangadraft.com/.../projects <redacted query values: order, type, page, and number>` to `https://www.mangadraft.com/.../projects <redacted query values: order, type, page, and number>` (1 redirects); latest: `https://mangadraft.com/.../projects <redacted query values: order, type, page, and number>` to `https://www.mangadraft.com/.../projects <redacted query values: order, type, page, and number>` (1 redirects); latest_next: `https://mangadraft.com/.../projects <redacted query values: order, type, page, and number>` to `https://www.mangadraft.com/.../projects <redacted query values: order, type, page, and number>` (1 redirects); search: `https://mangadraft.com/.../projects <redacted query values: type, order, section, genre, format, language, status, order_all, page, and number>` to `https://www.mangadraft.com/.../projects <redacted query values: type, order, section, genre, format, language, status, order_all, page, and number>` (1 redirects); details: `https://mangadraft.com/.../ero-magia` to `https://www.mangadraft.com/.../ero-magia` (1 redirects); chapters: `https://mangadraft.com/.../ero-magia` to `https://www.mangadraft.com/.../ero-magia` (1 redirects); pages: `https://mangadraft.com/.../listPages <redacted query values: first_page and grouped_by_category>` to `https://www.mangadraft.com/.../listPages <redacted query values: first_page and grouped_by_category>` (1 redirects) |  |  |  |
| page load | PASS | `https://www.mangadraft.com/.../6a7b5464edefc <redacted query values: size>` (image/webp (encoding: lossy), 528256 bytes, 1080x1499) |  |  |  |
