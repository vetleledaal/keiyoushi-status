# Extension Validation Report

- Extension: tachiyomi-th.manhuakey-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8056131118089201650
- Source name: ManhuaKey
- Source language: th
- Selected manga input: latest offset 0: Fake Celebrity – เกมรักซ่อนเร้นของเซเลบจอมปลอม (`.../fake-celebrity`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | I’m The Great Immortal – ข้านี่แหละราชันอมตะผู้ยิ่งใหญ่ (`.../im-the-great-immortal`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Emperor LingTian – จักพรรดิหลิงเทียน (`.../emperor-lingtian`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Fake Celebrity – เกมรักซ่อนเร้นของเซเลบจอมปลอม (`.../fake-celebrity`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | The Siren’s Beloved — สุดที่รักของเทพบุตรแห่งท้องทะเล (`.../the-sirens-beloved`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Fake Celebrity – เกมรักซ่อนเร้นของเซเลบจอมปลอม (`.../fake-celebrity`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 10 | ตอนที่ 1 (`https://www.manhuakey.com/.../%e0%b8%95%e0%b8%ad%e0%b8%99%e0%b8%97%e0%b8%b5%e0%b9%88-1 <redacted query values: style>`) |  | 1-10s |
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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.manhuakey.com/.../Fake-Celebrity-110x150.jpg` (image/jpeg, 17274 bytes, 110x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fake-celebrity` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.manhuakey.com/.../Fake-Celebrity-193x278.jpg` (image/jpeg, 27359 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Manhua, Romance, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | LINT | All 10 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=10 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 10 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.manhuakey.com/.../76VQI_20250825215805.jpg` (image/jpeg, 154395 bytes, 1000x1140) |  |  |  |
