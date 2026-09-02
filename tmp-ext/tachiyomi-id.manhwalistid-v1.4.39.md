# Extension Validation Report

- Extension: tachiyomi-id.manhwalistid-v1.4.39
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 24
- Lint: 0
- Warnings: 1
- Skipped: 9
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3111049819536223391
- Source name: Manhwa List
- Source language: id
- Selected manga input: latest offset 0: Immortal’s Way of Life (`.../immortals-way-of-life`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Lookism (`.../lookism`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Ranker’s Return ( Remake ) (`.../rankers-return-remake`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Immortal’s Way of Life (`.../immortals-way-of-life`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The Returned C-Rank Tank Won’t Die! (`.../the-returned-c-rank-tank-wont-die`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Immortal’s Way of Life (`.../immortals-way-of-life`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../Immortals-Way-of-Life.jpg <redacted query values: resize>` (image/jpeg, 16852 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../immortals-way-of-life` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../Immortals-Way-of-Life.jpg` (image/jpeg, 3474317 bytes, 4000x5750) |  |  |  |
| details author | PASS | Cha Won, Gyeoul Eokeon |  |  |  |
| details artist | PASS | Robi |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Historical, Mystery, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Roberta, a priest of the Public Church, is assigned as the head priest of Dietmarschen — a remote backwater at the far northern edge of the world. The position is handed to her immediately after her predecessor mysteriously disappears, so Roberta approaches her new post with wariness and begins to quietly investigate the Duke of Dietmarschen, Ulrich. By all accounts, he has held his lordship for over 300 years. And by his own admission, he is an immortal — one who has lived a life no ordinary human could ever know.<br><br>Alternative Names: Immortal's Ascending Path, Immortal's Way of Life, Living as the Immortal Lord, Living Immortally, To Live as an Immortal, What It Means to Live Undying and Immortal, 不老不死地活着, 불로불사로 산다는 것은 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
