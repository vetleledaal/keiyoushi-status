# Extension Validation Report

- Extension: tachiyomi-pt.noindexscan-v1.4.57
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 987786689720213769
- Source name: Hanami Heaven
- Source language: pt-BR
- Selected manga input: popular offset 0: College life starts with clubs (`.../college-life-starts-with-clubs`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | College life starts with clubs (`.../college-life-starts-with-clubs`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 12 | Switch On (`.../switch-on`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 11 | Never Just Friends (`.../never-just-friends`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | Dirty Talk (`.../dirty-talk`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | College life starts with clubs (`.../college-life-starts-with-clubs`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | College life starts with clubs (`.../college-life-starts-with-clubs`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 97 | Cap. 01 (`https://hanamiheaven.org/.../cap-01 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 106 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 11 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=College life starts with clubs, URL=`.../college-life-starts-with-clubs` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hanamiheaven.org/.../college-175x238.png` (image/png, 65314 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../college-life-starts-with-clubs` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hanamiheaven.org/.../college.png` (image/png, 569595 bytes, 1091x1527) |  |  |  |
| details author | PASS | IngSook |  |  |  |
| details artist | PASS | Momose |  |  |  |
| details genres | PASS | Comédia, Drama, Harem, Romance, School Life, Completo, Coreano, Pornhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Sinopse<br><br>Nosso protagonista um menino que, por ter adoecido no dia da festa dos primeiros anos, acaba tendo uma vida solitária… , certos dias passam, até que um certo Sunbae em uma determinada cena pergunta a ele, VOCÊ FEZ SEXO? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 97 chapters |  |  |  |
| chapter dates | PASS | 97 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 97 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 106 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hanamiheaven.org/.../003.jpg` (image/jpeg, 331726 bytes, 1600x900) |  |  |  |
