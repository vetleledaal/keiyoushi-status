# Extension Validation Report

- Extension: tachiyomi-th.mikudoujin-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 31
- Lint: 3
- Warnings: 1
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3142948916822290453
- Source name: MikuDoujin
- Source language: th
- Selected manga input: latest offset 0: ล่อลวงให้กลายเป็นทาสเซ็กส์ [Smells Like] (`.../bx8fr`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | ล่อลวงให้กลายเป็นทาสเซ็กส์ [Smells Like] (`.../bx8fr`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | ฉันที่เเต่งงานกับคนแปลกหน้า (Mishibe Hamata) (`.../23favl`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | ล่อลวงให้กลายเป็นทาสเซ็กส์ [Smells Like] (`.../bx8fr`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | ฉันที่เเต่งงานกับคนแปลกหน้า (Mishibe Hamata) (`.../23favl`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.io.IOException: closed | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ล่อลวงให้กลายเป็นทาสเซ็กส์ [Smells Like] (`.../bx8fr`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3 | ล่อลวงให้กลายเป็นทาสเซ็กส์ 1 (`.../ep-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 79 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | java.io.IOException: closed | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | SKIP | closed |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://miku-doujin.com/.../38c9fcb2c49bd3f74ada045a04a567cf_thumb.webp` (image/webp (encoding: lossy), 15464 bytes, 240x339) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bx8fr` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://miku-doujin.com/.../38c9fcb2c49bd3f74ada045a04a567cf.webp` (image/webp (encoding: lossy), 76100 bytes, 790x1115) |  |  |  |
| details author | PASS | Smells Like |  |  |  |
| details artist | PASS | Smells Like |  |  |  |
| details genres | PASS | Unknown, Unknown, Ahegao, NTR, นมใหญ่, สาวใหญ่.../%E0%B9%81%E0%B8%A1%E0%B9%88%E0%B8%9A%E0%B9%89%E0%B8%B2%E0%B8%99 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | No Story |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | LINT | All 3 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 79 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://miku-doujin.com/.../04d20c17b1acec89dcacb91ee7a991bf.webp` (image/webp (encoding: lossy), 78428 bytes, 790x1115) |  |  |  |
