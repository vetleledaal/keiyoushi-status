# Extension Validation Report

- Extension: tachiyomi-pt.arthurscan-v1.6.63
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 1641160681602874924
- Source name: Arthur Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: I Randomly Have a New Career Every Week (`.../i-randomly-have-a-new-career-every-week-1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | I Randomly Have a New Career Every Week (`.../i-randomly-have-a-new-career-every-week-1`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | I Randomly Have a New Career Every Week (`.../i-randomly-have-a-new-career-every-week-1`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Randomly Have a New Career Every Week (`.../i-randomly-have-a-new-career-every-week-1`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Randomly Have a New Career Every Week (`.../i-randomly-have-a-new-career-every-week-1`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 296 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Randomly Have a New Career Every Week, URL=`.../i-randomly-have-a-new-career-every-week-1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arthurscan.xyz/.../I-randomly-have-a-new-career-every-week-capa-2-250x350.webp` (image/webp (container: extended), 29952 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../i-randomly-have-a-new-career-every-week-1` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://arthurscan.xyz/.../I-randomly-have-a-new-career-every-week-capa-2.webp` (image/webp (container: extended), 768442 bytes, 630x840) |  |  |  |
| details author | PASS | Reading Manga x Daxingdao Animation |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Drama, Fantasia, Harém, Manhua, Romance, Web Comic |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Após ser demitido, Lin Yi acidentalmente recebe um “Sistema de Experiência de Carreira Completa”. Lin Yi conta com os vários acordos de trabalho e recompensas dadas pelo sistema. Com isso ele será capaz de alcançar gradualmente com sua ambição um caminho de riqueza, se tornando o todo poderoso líder que dominará o mundo. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 296 chapters |  |  |  |
| chapter dates | PASS | 296 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://arthurscan.xyz/.../00.jpg` (image/jpeg, 1460551 bytes, 2031x1286) |  |  |  |
