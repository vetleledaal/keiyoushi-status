# Extension Validation Report

- Extension: tachiyomi-th.doodmanga-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 4393941999923514698
- Source name: Doodmanga
- Source language: th
- Selected manga input: popular offset 0: Master Cultivation Return – โคตรเซียนเกรียนกลับมาเกิดใหม่ (`.../master-cultivation-return`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Master Cultivation Return – โคตรเซียนเกรียนกลับมาเกิดใหม่ (`.../master-cultivation-return`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | The Legend God King in The City – ตำนานราชันเซียนแห่งนคร (`.../the-legend-god-king-in-the-city`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Beaten to Death, My Siblings Begged for Forgiveness — หลังถูกทุบตีจนตาย พี่น้องของข้ากลับอ้อนวอนขอการให้อภัย (`.../beaten-to-death-my-siblings-begged-for-forgiveness`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | A Despicable Marriage – ทวงคืนทุกอย่างจากสามีอัปยศ (`.../a-despicable-marriage`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Master Cultivation Return – โคตรเซียนเกรียนกลับมาเกิดใหม่ (`.../master-cultivation-return`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 514 | ตอนที่ 1 (`https://www.doodmanga.com/.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.doodmanga.com/.../Master-Cultivation-Return-TH-110x150.jpg` (image/jpeg, 7413 bytes, 110x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../master-cultivation-return` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.doodmanga.com/.../Master-Cultivation-Return-TH-193x278.jpg` (image/jpeg, 19850 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Manhua, Sci-fi |  |  |  |
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
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.doodmanga.com/.../Upload-Master-Cultivation-Return-1-IY4HO-Manhuathai.jpg` (image/jpeg, 165732 bytes, 1000x1326) |  |  |  |
