# Extension Validation Report

- Extension: tachiyomi-all.comicskingdom-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 3350274514125477391
- Source name: Comics Kingdom
- Source language: en
- Selected manga input: latest offset 0: Wannabe (`.../7367349 <redacted query values: per_page, _fields, ck_language, and slug>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Wannabe (`.../7367349 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Katzenjammer Kids Vintage Sundays (`.../5819062 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Wannabe (`.../7367349 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Katzenjammer Kids Vintage Sundays (`.../5819062 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Wannabe (`.../7367349 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Wannabe (`.../7367349 <redacted query values: per_page, _fields, ck_language, and slug>`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 10 | 1-100 (`.../ck_comic <redacted query values: per_page, _fields, orderBy, order, ck_feature, and page>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 100 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Wannabe, URL=`.../7367349 <redacted query values: per_page, _fields, ck_language, and slug>` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 55/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https:\.../Cover-Image.png` (image/png, 733535 bytes, 1936x948) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../7367349 <redacted query values: per_page, _fields, ck_language, and slug>` |  |  |  |
| details thumbnail URL | PASS | `https:\.../Cover-Image.png` |  |  |  |
| details author | PASS | Luca Debus |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Wannabe explores the lives and hopes of three folks fresh out of school who must find their way in the modern world. However, the road to their dreams is paved with hardships of millennial struggles and economic survival. How will they ever be what they wanna be? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | LINT | All 10 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=10 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 100 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://wp.comicskingdom.com/.../Y2tXYW5uYWJlLUVORy01NjQyNDIx.jpg` (image/jpeg, 504518 bytes, 2047x670) |  |  |  |
