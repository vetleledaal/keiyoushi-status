# Extension Validation Report

- Extension: tachiyomi-th.ecchidoujin-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 7257262636858275074
- Source name: Ecchi-Doujin
- Source language: th
- Selected manga input: popular offset 0: เย็ดแม่ [FRLEXZ] Mama (`.../%E0%B9%80%E0%B8%A2%E0%B9%87%E0%B8%94%E0%B9%81%E0%B8%A1%E0%B9%88-frlexz-mama`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | เย็ดแม่ [FRLEXZ] Mama (`.../%E0%B9%80%E0%B8%A2%E0%B9%87%E0%B8%94%E0%B9%81%E0%B8%A1%E0%B9%88-frlexz-mama`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | นายหญิงใจเริง [Poyeop] Tolerance (`.../%E0%B8%99%E0%B8%B2%E0%B8%A2%E0%B8%AB%E0%B8%8D%E0%B8%B4%E0%B8%87%E0%B9%83%E0%B8%88%E0%B9%80%E0%B8%A3%E0%B8%B4%E0%B8%87-poyeop-tolerance`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Like Father, Like Son (`.../like-father-like-son`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | ห้องพักครูหลังเลิกเรียน (Mogudan) (Neon Genesis Evangelion) (`.../%E0%B8%AB%E0%B9%89%E0%B8%AD%E0%B8%87%E0%B8%9E%E0%B8%B1%E0%B8%81%E0%B8%84%E0%B8%A3%E0%B8%B9%E0%B8%AB%E0%B8%A5%E0%B8%B1%E0%B8%87%E0%B9%80%E0%B8%A5%E0%B8%B4%E0%B8%81%E0%B9%80%E0%B8%A3%E0%B8%B5%E0%B8%A2`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | เย็ดแม่ [FRLEXZ] Mama (`.../%E0%B9%80%E0%B8%A2%E0%B9%87%E0%B8%94%E0%B9%81%E0%B8%A1%E0%B9%88-frlexz-mama`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | เย็ดแม่ [FRLEXZ] Mama (`.../%E0%B9%80%E0%B8%A2%E0%B9%87%E0%B8%94%E0%B9%81%E0%B8%A1%E0%B9%88-frlexz-mama`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 31 | ตอนที่ 1 (`.../%E0%B9%80%E0%B8%A2%E0%B9%87%E0%B8%94%E0%B9%81%E0%B8%A1%E0%B9%88-frlexz-mama-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=เย็ดแม่ \[FRLEXZ\] Mama, URL=`.../%E0%B9%80%E0%B8%A2%E0%B9%87%E0%B8%94%E0%B9%81%E0%B8%A1%E0%B9%88-frlexz-mama` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../ff.jpg <redacted query values: resize>` (image/jpeg, 16869 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../%E0%B9%80%E0%B8%A2%E0%B9%87%E0%B8%94%E0%B9%81%E0%B8%A1%E0%B9%88-frlexz-mama` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../ff.jpg` (image/jpeg, 1306183 bytes, 1280x1920) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | โดจินครอบครัว incest, โดจินนมใหญ่ big breasts, โดจินภาพสี full color, โดจินสาวใหญ่ แม่บ้าน milf, โดจินหน้าฟิน ahegao, โดจินโชตะ shotacon shota, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 31 chapters |  |  |  |
| chapter dates | PASS | 31 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ecchi-doujin.com/.../1-500.jpg` (image/jpeg, 301450 bytes, 1280x1632) |  |  |  |
