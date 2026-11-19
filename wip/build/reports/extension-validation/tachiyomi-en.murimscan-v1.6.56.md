# Extension Validation Report

- Extension: tachiyomi-en.murimscan-v1.6.56
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 5524031489110351257
- Source name: MurimScan
- Source language: en
- Selected manga input: popular offset 0: The Lone Necromancer (`.../the-lone-necromancer.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | The Lone Necromancer (`.../the-lone-necromancer.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Lone Necromancer (`.../the-lone-necromancer.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Lone Necromancer (`.../the-lone-necromancer.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | The Lone Necromancer Chapter 218 (`.../the-lone-necromancer-chapter-218_02023378733.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Lone Necromancer, URL=`.../the-lone-necromancer.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 6/6 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 6/6 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.ibb.co/.../OS9jvi-JRtu-Nw-Zpl-Q73-VTIDspt-ALm-YPHPPt-BFsm3og-V3-Zcw-EShw-Favmw0-N-S9p-R84odvtg-HP7-Qu-LTLp-4s9i-Fm.webp` (image/webp (encoding: lossy), 70386 bytes, 690x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-lone-necromancer.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lh3.googleusercontent.com/.../AEn0k_vcFC_rIceXFalIRM_1DMoqPijGYXEDjRmGg4VYfQt1s6Y40L1ng0GAZpgNKRF0zUaLlUg0lAf7Rj1K7iDIBlLFlW0DtE3SiPaJU2CXm-FVIiZDBLvArbjAKxDZAMz7GZpsQ1q1ZIJ-2E5GUnqLAu9FYV8Le3EgjLl5hPRLxQBF1BBQqvkeVdYCN-nRDbMXc8nTCQKEcWda3pIslsqRthN52_DAPiU-ycFA=w300` (image/jpeg, 43883 bytes, 300x435) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Action, Isekai, System |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Seongwu is a former special forces soldier who has returned to college after completing his national service. His ordinary life as a student is shattered during class one day when he and his fellow students are faced with a mysterious prompt asking them to "select a role." Seongwu chooses the necromancer, a rare ability that grants him the power to control the undead. With the campus and outside world seemingly on the brink of collapse, Seongwu must use his newfound powers to battle fearsome monsters and help save his fellow students. But will they make it out alive? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.ibb.co/.../blob.jpg` (image/jpeg, 1636661 bytes, 690x14000) |  |  |  |
