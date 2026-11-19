# Extension Validation Report

- Extension: tachiyomi-ru.nudemoon-v1.6.33
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 1
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6384784374922886076
- Source name: Nude-Moon
- Source language: ru
- Selected manga input: popular offset 0: EroNinja (`.../8152-online--witcher000-eroninja.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 26 | EroNinja (`.../8152-online--witcher000-eroninja.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 19 | Tsunade & Ino Double Trouble (`.../18388-online--dark-tl-tsunade-and-ino-double-troublecunade-i-ino-dvoynee-p.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Daixingzhe Mimi Dangan (`.../34691-online--analoli-daixingzhe-mimi-dangan--sekretnoe-dosie-agenta.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Another Kind of Happiness (`.../34675-online--shir0-another-kind-of-happiness--drugoy-vid-scastia-1.html`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: Поиск доступен только для авторизованных пользователей | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | EroNinja (`.../8152-online--witcher000-eroninja.html`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | EroNinja №1 (`.../8152-online--witcher000-eroninja.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 25 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | java.lang.Exception: Поиск доступен только для авторизованных пользователей | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | SKIP | Поиск доступен только для авторизованных пользователей |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nude-moon.org/.../094.jpg` (image/jpeg, 12776 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../8152-online--witcher000-eroninja.html` |  |  |  |
| details thumbnail URL | PASS | `https://nude-moon.org/.../094.jpg` |  |  |  |
| details author | PASS | StikyfinkaZ-003 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | обычный секс, комикс, цветная, романтика, запредельное, без цензуры |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Наруто познает секреты эро-дзюцу |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://nude-moon.org/.../search <redacted query values: stext and rowstart>` to `https://nude-moon.org/.../error.php` (1 redirects) |  |  |  |
| page load | PASS | `https://nude-moon.org/.../101.jpg` (image/jpeg, 454269 bytes, 1111x719) |  |  |  |
