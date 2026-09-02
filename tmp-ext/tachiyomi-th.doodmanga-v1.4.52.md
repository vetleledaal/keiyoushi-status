# Extension Validation Report

- Extension: tachiyomi-th.doodmanga-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4393941999923514698
- Source name: Doodmanga
- Source language: th
- Selected manga input: latest offset 0: Fake Celebrity – เกมรักซ่อนเร้นของเซเลบจอมปลอม (`.../fake-celebrity`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Master Cultivation Return – โคตรเซียนเกรียนกลับมาเกิดใหม่ (`.../master-cultivation-return`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | The Legend God King in The City – ตำนานราชันเซียนแห่งนคร (`.../the-legend-god-king-in-the-city`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Fake Celebrity – เกมรักซ่อนเร้นของเซเลบจอมปลอม (`.../fake-celebrity`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | The Siren’s Beloved — สุดที่รักของเทพบุตรแห่งท้องทะเล (`.../the-sirens-beloved`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Fake Celebrity – เกมรักซ่อนเร้นของเซเลบจอมปลอม (`.../fake-celebrity`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Fake Celebrity – เกมรักซ่อนเร้นของเซเลบจอมปลอม (`.../fake-celebrity`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 10 | ตอนที่ 1 (`https://www.doodmanga.com/.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Fake Celebrity – เกมรักซ่อนเร้นของเซเลบจอมปลอม, URL=`.../fake-celebrity` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.doodmanga.com/.../Fake-Celebrity-110x150.jpg` (image/jpeg, 17274 bytes, 110x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fake-celebrity` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.doodmanga.com/.../Fake-Celebrity-193x278.jpg` (image/jpeg, 27359 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Manhua, Romance, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 10 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.doodmanga.com/.../76VQI_20250825215805.jpg` (image/jpeg, 154395 bytes, 1000x1140) |  |  |  |
