# Extension Validation Report

- Extension: tachiyomi-th.doodmanga-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4393941999923514698
- Source name: Doodmanga
- Source language: th
- Selected manga input: popular offset 0: Master Cultivation Return – โคตรเซียนเกรียนกลับมาเกิดใหม่ (`.../2244`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Master Cultivation Return – โคตรเซียนเกรียนกลับมาเกิดใหม่ (`.../2244`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | The Legend God King in The City – ตำนานราชันเซียนแห่งนคร (`.../1289`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | A Happy Ending After Divorce – ตอนจบแสนหวาน หลังหย่าขาดจากสามีเก่า (`.../51300`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | The Feisty Little Chef: Hungry Enough to Claw the Wall — แม่ครัวน้อยจอมแสบ หิวเมื่อไรก็แทบคลั่ง (`.../51391`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Master Cultivation Return – โคตรเซียนเกรียนกลับมาเกิดใหม่ (`.../2244`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 514 | ตอนที่ 1 (`.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| thumbnail | PASS | `https://www.doodmanga.com/.../Master-Cultivation-Return-TH-175x238.jpg` (image/jpeg, 15761 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `2244` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.doodmanga.com/.../Master-Cultivation-Return-TH-193x278.jpg` (image/jpeg, 19850 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Manhua, Sci-fi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 514 chapters |  |  |  |
| chapter dates | LINT | 339 of 514 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=339 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.doodmanga.com/.../Upload-Master-Cultivation-Return-1-IY4HO-Manhuathai.jpg` (image/jpeg, 165732 bytes, 1000x1326) |  |  |  |
