# Extension Validation Report

- Extension: tachiyomi-th.tanukimanga-v1.4.33
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 422195356897516502
- Source name: Tanuki-Manga
- Source language: th
- Selected manga input: popular offset 0: Magic Emperor (`.../magic-emperor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 40 | Kagurabachi (`.../kagurabachi`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | The Tutorial is Too Hard (`.../the-tutorial-is-too-hard`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | The Forgotten Field (`.../the-forgotten-field`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 903 | ตอนที่ 1 (`.../magic-emperor-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 53 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Magic Emperor, URL=`.../magic-emperor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 162/162 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 162/162 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../Magic-Emperor.jpg <redacted query values: resize>` (image/jpeg, 29542 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../magic-emperor` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../Magic-Emperor.jpg` (image/jpeg, 60286 bytes, 450x600) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manhua, Martial arts, Shounen, Supernatural, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 903 chapters |  |  |  |
| chapter dates | PASS | 903 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.tanuki-manga.com/.../CSVQ3GI7RH-1587238097.jpg` (image/jpeg, 194228 bytes, 752x1759) |  |  |  |
