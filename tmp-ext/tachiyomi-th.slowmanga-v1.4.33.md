# Extension Validation Report

- Extension: tachiyomi-th.slowmanga-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 3894617311216312574
- Source name: Slow Manga
- Source language: th
- Selected manga input: latest offset 0: An Extraordinary Lawyer’s Subspace (`.../an-extraordinary-lawyers-subspace`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | I Took over The Academy With a Single Sashimi Knife (`.../i-took-over-the-academy-with-a-single-sashimi-knife`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Regressing with the King’s Power (`.../regressing-with-the-kings-power`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | An Extraordinary Lawyer’s Subspace (`.../an-extraordinary-lawyers-subspace`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Bad Born Blood (`.../bad-born-blood`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | An Extraordinary Lawyer’s Subspace (`.../an-extraordinary-lawyers-subspace`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | An Extraordinary Lawyer’s Subspace (`.../an-extraordinary-lawyers-subspace`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 40 | ตอนที่ 1 (`.../an-extraordinary-lawyers-subspace-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=An Extraordinary Lawyer’s Subspace, URL=`.../an-extraordinary-lawyers-subspace` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.slow-manga.net/.../images-2.jpg` (image/jpeg, 13214 bytes, 186x270) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../an-extraordinary-lawyers-subspace` |  |  |  |
| details thumbnail URL | PASS | `https://www.slow-manga.net/.../images-2.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Manhwa, ดราม่า |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 40 chapters |  |  |  |
| chapter dates | LINT | All 40 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=40 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | pages: `https://img3.flash-manga.com/.../6846c2621b12fKbWtw.jpg` to `https://img3.flash-manga.net/.../6846c2621b12fKbWtw.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://img3.flash-manga.com/.../6846c2621b12fKbWtw.jpg` (image/jpeg, 311240 bytes, 1000x4347) |  |  |  |
