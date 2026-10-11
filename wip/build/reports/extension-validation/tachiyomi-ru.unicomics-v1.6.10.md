# Extension Validation Report

- Extension: tachiyomi-ru.unicomics-v1.6.10
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6859623422196397486
- Source name: UniComics
- Source language: ru
- Selected manga input: popular offset 0: Танос: Конец Бесконечности (`.../thanos-the-infinity-ending-2019-marvel`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Танос: Конец Бесконечности (`.../thanos-the-infinity-ending-2019-marvel`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Конвергенция Титаны (`.../convergence-titans-2015-dc`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | 100 Пуль (`.../100-bullets`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Её Собственный Дар (`.../a-gift-of-her-own`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 9 | Танос: Конец Бесконечности (`.../60`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Танос: Конец Бесконечности (`.../thanos-the-infinity-ending-2019-marvel`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | ​Танос: Конец Бесконечности (`.../thanos-the-infinity-ending-2019-marvel`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 105 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Танос: Конец Бесконечности, URL=`.../thanos-the-infinity-ending-2019-marvel` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 80/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://unicomics.ru/.../thanos-the-infinity-ending-2019-marvel_big.jpg` (image/jpeg, 44026 bytes, 260x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../thanos-the-infinity-ending-2019-marvel` |  |  |  |
| details thumbnail URL | PASS | `https://unicomics.ru/.../thanos-the-infinity-ending-2019-marvel_big.jpg` |  |  |  |
| details author | PASS | Marvel |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Thanos: The Infinity Ending<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 105 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ii1.unicomics.ru/.../001.jpg` (image/jpeg, 988493 bytes, 1988x3056) |  |  |  |
