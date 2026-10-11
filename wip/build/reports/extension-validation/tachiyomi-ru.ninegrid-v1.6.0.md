# Extension Validation Report

- Extension: tachiyomi-ru.ninegrid-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5811065998267343017
- Source name: NineGrid
- Source language: ru
- Selected manga input: popular offset 0: Crossed Badlands (`.../10327`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Crossed Badlands (`.../10327`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Boys (`.../3607`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Vampirella (`.../11026`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | World War Hulk Prologue: World Breaker (`.../8781`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 16 | Crossed Badlands (`.../10327`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Crossed Badlands (`.../10327`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 100 | #1 (`.../pages`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Crossed Badlands, URL=`10327` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://9grid.cc/.../thumbnail` (image/webp (encoding: lossy), 76158 bytes, 600x910) |  |  |  |
| details identity | PASS | Details preserved selected URL `10327` |  |  |  |
| details thumbnail URL | PASS | `https://9grid.cc/.../thumbnail` |  |  |  |
| details author | PASS | Avatar Press |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Horror |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Группа выживших пытается найти безопасное место в мире, захваченном вирусом, который превращает людей в садистских монстров с красными крестами на лицах. Каждая история показывает новых персонажей в разных уголках планеты — от британских военных до обычных семей. Все они сталкиваются с заражёнными, которые стремятся только к насилию и извращениям.<br><br>Читается как самый жестокий фильм ужасов, где зомби-апокалипсис встречается с пыточным порно. Атмосфера безысходности и отвращения не отпускает ни на секунду. Каждая страница шокирует новыми извращениями и кровавыми сценами. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 100 chapters |  |  |  |
| chapter dates | PASS | 100 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://9grid.cc/.../thumbnail` to `https://cdn.9grid.cc/.../136851.webp` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.9grid.cc/.../1778324723130_page_001.webp` (image/webp (container: extended), 301986 bytes, 1280x1939) |  |  |  |
