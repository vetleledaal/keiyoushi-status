# Extension Validation Report

- Extension: tachiyomi-pt.noindexscan-v1.6.60
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
- Source theme: madara
- Source ID: 987786689720213769
- Source name: Hanami Heaven
- Source language: pt-BR
- Selected manga input: popular offset 0: College life starts with clubs (`.../2061`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | College life starts with clubs (`.../2061`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | A Dangerous Deal and The Girl Next Door (`.../6233`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Love Quest (`.../6210`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Mind Control (`.../6786`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | College life starts with clubs (`.../2061`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | College life starts with clubs (`.../2061`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 97 | Cap. 01 (`.../cap-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 106 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=College life starts with clubs, URL=`2061` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hanamiheaven.org/.../college-175x238.png` (image/png, 65669 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `2061` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hanamiheaven.org/.../college.png` (image/png, 577811 bytes, 1091x1527) |  |  |  |
| details author | PASS | IngSook |  |  |  |
| details artist | PASS | Momose |  |  |  |
| details genres | PASS | Comédia, Drama, Harem, Romance, School Life, Completo, Coreano, Pornhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Sinopse<br><br>Nosso protagonista um menino que, por ter adoecido no dia da festa dos primeiros anos, acaba tendo uma vida solitária… , certos dias passam, até que um certo Sunbae em uma determinada cena pergunta a ele, VOCÊ FEZ SEXO? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 97 chapters |  |  |  |
| chapter dates | PASS | 97 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 106 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hanamiheaven.org/.../003.jpg` (image/jpeg, 331726 bytes, 1600x900) |  |  |  |
