# Extension Validation Report

- Extension: tachiyomi-th.manhuathai-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 27
- Lint: 1
- Warnings: 2
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7916744898099174736
- Source name: ManhuaThai
- Source language: th
- Selected manga input: popular offset 0: Master Cultivation Return – โคตรเซียนเกรียนกลับมาเกิดใหม่ (`.../master-cultivation-return`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Master Cultivation Return – โคตรเซียนเกรียนกลับมาเกิดใหม่ (`.../master-cultivation-return`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | The Strongest Knight Become To Lolicon Vampire – ผมคืออัศวินผู้แข็งแกร่งที่ถูกสาปให้กลายเป็นแวมไพร์โลลิคอน (`.../the-strongest-knight-become-to-lolicon-vampire`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Master Cultivation Return – โคตรเซียนเกรียนกลับมาเกิดใหม่ (`.../master-cultivation-return`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 514 | ตอนที่ 1 (`https://www.manhuathai.com/.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 20/20 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 20/20 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.manhuathai.com/.../Master-Cultivation-Return-TH-110x150.jpg` (image/jpeg, 7413 bytes, 110x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../master-cultivation-return` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.manhuathai.com/.../Master-Cultivation-Return-TH-193x278.jpg` (image/jpeg, 19850 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Manhua, Sci-fi, Popular |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 514 chapters |  |  |  |
| chapter dates | PASS | 514 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 514 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.manhuathai.com/.../Upload-Master-Cultivation-Return-1-IY4HO-Manhuathai.jpg` (image/jpeg, 165732 bytes, 1000x1326) |  |  |  |
