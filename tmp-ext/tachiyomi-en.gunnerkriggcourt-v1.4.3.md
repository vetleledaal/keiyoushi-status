# Extension Validation Report

- Extension: tachiyomi-en.gunnerkriggcourt-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 26
- Lint: 1
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6036325841864340105
- Source name: Gunnerkrigg Court
- Source language: en
- Selected manga input: popular offset 0: Gunnerkrigg Court (`.../archives`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1 | Gunnerkrigg Court (`.../archives`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Gunnerkrigg Court (`.../archives`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3100 | Chapter 1: The Shadow and the Robot (1) (`<redacted URL #1: selected resource; relative; no scheme; query parameters: p>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 1/1 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1/1 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.imgur.com/.../g2ukAIKh.jpg` (image/jpeg, 201196 bytes, 724x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../archives` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../g2ukAIKh.jpg` |  |  |  |
| details author | PASS | Tom Siddell |  |  |  |
| details artist | PASS | Tom Siddell |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gunnerkrigg Court is a Science Fantasy webcomic by Tom Siddell about a strange young girl attending an equally strange school. The intricate story is deeply rooted in world mythology, but has a strong focus on science (chemistry and robotics, most prominently) as well.<br><br>Antimony Carver begins classes at the eponymous U.K. Boarding School, and soon notices that strange events are happening: a shadow creature follows her around; a robot calls her "Mummy"; a Rogat Orjak smashes in the dormitory roof; odd birds, ticking like clockwork, stand guard in out-of-the-way places.<br><br>Stranger still, in the middle of all this, Annie remains calm and polite to a fault. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3100 chapters |  |  |  |
| chapter dates | LINT | All 3100 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3100 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.gunnerkrigg.com/.../00000001.jpg <redacted query values: v>` (image/jpeg, 76775 bytes, 600x800) |  |  |  |
