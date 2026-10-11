# Extension Validation Report

- Extension: tachiyomi-pt.hqnow-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1639829368022947378
- Source name: HQ Now!
- Source language: pt-BR
- Selected manga input: popular offset 0: Invencível (2003) (`.../invencivel-2003`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 300 | Invencível (2003) (`.../invencivel-2003`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 45 | Doutor Estranho (2023) (`.../doutor-estranho-2023`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Invencível (2003) (`.../invencivel-2003`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Invencível (2003) (`.../invencivel-2003`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 147 | #0 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 300 entries |  |  |  |
| latest listing | PASS | 45 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Invencível (2003), URL=`.../invencivel-2003` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 346/346 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 345/346 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://static.hq-now.com/.../Invincible-144-000.jpg` (image/jpeg, 271350 bytes, 976x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../invencivel-2003` |  |  |  |
| details thumbnail URL | PASS | `http://static.hq-now.com/.../Invincible-144-000.jpg` |  |  |  |
| details author | PASS | Image Comics |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Mark Grayson é um adolescente como a maioria dos jovens da sua idade. A única coisa que diferencia Mark dos outros jovens é que ele é filho de um dos superseres mais poderosos da Terra. Adotando o nome de Invencível, Mark terá que provar, entre lições de casa e batatas fritas, que pode ser um grande herói. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 147 chapters |  |  |  |
| chapter dates | LINT | All 147 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=147 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `http://static.hq-now.com/.../0001_0000.jpg` to `https://static.hq-now.com/.../0001_0000.jpg` (1 redirects); popular: `http://static.hq-now.com/.../Invincible-144-000.jpg` to `https://static.hq-now.com/.../Invincible-144-000.jpg` (1 redirects) |  |  |  |
| page load | PASS | `http://static.hq-now.com/.../0001_0000.jpg` (image/jpeg, 306097 bytes, 966x1500) |  |  |  |
