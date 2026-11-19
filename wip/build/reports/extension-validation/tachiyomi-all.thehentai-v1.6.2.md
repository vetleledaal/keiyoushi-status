# Extension Validation Report

- Extension: tachiyomi-all.thehentai-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 6996262189349007954
- Source name: The Hentai
- Source language: en
- Selected manga input: popular offset 0: Dismissed 7 (`.../dismissed-by-rose-blue-3d-7`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Dismissed 7 (`.../dismissed-by-rose-blue-3d-7`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | My Girlfriend Is a Cheerleader... For The Opposing Team! (`.../my-girlfriend-is-a-cheerleader-for-the-opposing-team`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 16 | Dismissed 7 (`.../dismissed-by-rose-blue-3d-7`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dismissed 7 (`.../dismissed-by-rose-blue-3d-7`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../dismissed-by-rose-blue-3d-7`) |  | <1s |
| pages | `getPageList(chapter)` | success | 43 |  |  | <1s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dismissed 7, URL=`.../dismissed-by-rose-blue-3d-7` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://en.thehentai.net/.../dismissed-by-rose-blue-3d-part-7-porn-comics-english-01-300x400.jpg` (image/jpeg, 15668 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../dismissed-by-rose-blue-3d-7` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://en.thehentai.net/.../dismissed-by-rose-blue-3d-part-7-porn-comics-english-01.jpg` (image/jpeg, 506416 bytes, 1280x1916) |  |  |  |
| details author | PASS | Rose Blue 3D |  |  |  |
| details artist | PASS | Rose Blue 3D |  |  |  |
| details genres | PASS | 3D Porn, Exclusive, Ahegao, Big Tits, Condom, Flexible, Glasses, Hot, Large Hips, Monster Cock, Sleeping, Thrusts |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | An 3D Porn porn with Ahegao, Big Tits, Condom comic designed by artist Rose Blue 3D<br><br>**Serie:** Dismissed |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://en.thehentai.net/.../dismissed-by-rose-blue-3d-part-7-porn-comics-english-01.jpg` (image/jpeg, 506416 bytes, 1280x1916) |  |  |  |
