# Extension Validation Report

- Extension: tachiyomi-en.comickfan-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 569821715369244319
- Source name: ComicK Fanmade
- Source language: en
- Selected manga input: popular offset 0: My Home Hero (`.../my-home-hero`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | My Home Hero (`.../my-home-hero`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 15 | I Look Too Much Like The Boss And The World Actually Believes It (`.../i-look-too-much-like-the-boss-and-the-world-actually-believes-it`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 15 | I’ll Try to Save My Father (`.../ill-try-to-save-my-father`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | College Coeds (`.../college-coeds`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | My Home Hero (`.../my-home-hero`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | My Home Hero (`.../my-home-hero`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 444 | Chapter 1 (`.../chapter-1-YCZeAFskBT4`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 45 |  |  | <1s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Home Hero, URL=`.../my-home-hero` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://meo.cdncmk.com/.../XhIYAQUoClgGMCBYS1ssGlYZRkZbdV4XWmVrUg.webp` (image/webp (encoding: lossy), 934376 bytes, 3023x4299) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-home-hero` |  |  |  |
| details thumbnail URL | PASS | `https://meo.cdncmk.com/.../XhIYAQUoClgGMCBYS1ssGlYZRkZbdV4XWmVrUg.webp` |  |  |  |
| details author | PASS | Yamakawa Naoki |  |  |  |
| details artist | PASS | Asaki Masashi |  |  |  |
| details genres | PASS | Drama, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | For the sake of his daughter, a middle-aged man embarks on the journey of a lifetime. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 444 chapters |  |  |  |
| chapter dates | PASS | 444 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://meo.cdncmk.com/.../XhIYAQUoClgGMCBYSwgcXR1bGgwEalZNWWJhBVRcbFw.webp` (image/webp (encoding: lossy), 208566 bytes, 1500x2137) |  |  |  |
