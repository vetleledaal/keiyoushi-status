# Extension Validation Report

- Extension: tachiyomi-ar.onma-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mmrcms
- Source ID: 335499577904379512
- Source name: مانجا اون لاين
- Source language: ar
- Selected manga input: popular offset 0: One Piece (`.../one-piece-`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | One Piece (`.../one-piece-`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Hunter x Hunter (`.../hunter-x-hunter`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 6 | One Piece (`.../one-piece-`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 7 | Kingdom (`.../kingdom`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | One Piece (`.../one-piece-`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../one-piece-`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 966 | 0: ون بيس (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 6 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../one-piece-` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=One Piece, URL=`.../one-piece-` at page 1 offset 0 and page 2 offset 3, title=Kingdom, URL=`.../kingdom` at page 1 offset 1 and page 2 offset 0, title=Boruto: Two Blue Vortex, URL=`.../boruto-two-blue-vortex` at page 1 offset 2 and page 2 offset 4, title=Blue Lock, URL=`.../blue_lock` at page 1 offset 4 and page 2 offset 1, title=Sakamoto Days, URL=`.../sakamoto-days` at page 1 offset 5 and page 2 offset 2 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 55/55 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 55/55 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.onma.top/.../cover_250x350.jpg` (image/jpeg, 28699 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-piece-` |  |  |  |
| details thumbnail URL | PASS | `https://www.onma.top/.../cover_250x350.jpg` |  |  |  |
| details author | PASS | Oda Eiichiro |  |  |  |
| details artist | PASS | Oda Eiichiro |  |  |  |
| details genres | PASS | أكشن, مغامرة, كوميدي, دراما, خيال, فنون قتالية, غموض, شونين, خارق للطبيعة |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <br>القوة والشهرة والثروة. القرصان جولد روجر امتلك هذه الثلاث . في منصة إعدامه يعلن على أن كنزه "ون بيس" موجود في الـجراند لاين. بعد 22 سنة من موته، القرصان المسمى مونكي دي لوفي يعزم على انه يريد أن يصبح ملك القراصنة، وبهذا تبدأ مغامراته. مونكي دي لوفي يبحر إلى البحر بحثاً عن "ون بيس" لكي يصبح ملك القراصنة، بعد أكله لفاكهة شيطانية. لكن قبل هذا يجب أن يبحث عن طاقم لسفينته. في القصة، يلتقي طاقم لوفي بالكثير من القراصنة والبحرية الذين يحاولون إيقافهم، بالإضافة إلى حكومة العالم التي تبحث عن العدل وتحاول إنهاء عصر القراصنة العظيم... |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 966 chapters |  |  |  |
| chapter dates | PASS | 966 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.onma.top/.../01.jpg` (image/jpeg, 249642 bytes, 759x1100) |  |  |  |
