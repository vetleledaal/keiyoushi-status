# Extension Validation Report

- Extension: tachiyomi-es.leermanhwas-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8701445043633550960
- Source name: LeerManhwas
- Source language: es
- Selected manga input: popular offset 0: Te enseñaremos defensa personal (`.../te-ensenaremos-defensa-personal`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Te enseñaremos defensa personal (`.../te-ensenaremos-defensa-personal`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Passion: raga (`.../passion-raga`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Te enseñaremos defensa personal (`.../te-ensenaremos-defensa-personal`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Passion: raga (`.../passion-raga`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Te enseñaremos defensa personal (`.../te-ensenaremos-defensa-personal`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Te enseñaremos defensa personal (`.../te-ensenaremos-defensa-personal`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Te enseñaremos defensa personal, URL=`.../te-ensenaremos-defensa-personal` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://leermanhwas.com/.../te-ensenaremos-defensa-personal-thumbnail.jpg` (image/jpeg, 26228 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../te-ensenaremos-defensa-personal` |  |  |  |
| details thumbnail URL | PASS | `https://leermanhwas.com/.../te-ensenaremos-defensa-personal-thumbnail.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Ecchi, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | «Sexo… no, te enseñaré defensa personal». Seong-hyeon, director de un gimnasio de hapkido en decadencia, adquiere por accidente un programa misterioso un día. Dice que completar misiones hará que el gimnasio crezca, pero ¿cuál es la siguiente misión? \[Misión\] ¡Hacer que una socia llegue al climax! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | LINT | All 50 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=50 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://leermanhwas.com/.../search <redacted query values: s>` to `https://leermanhwas.com/.../search <redacted query values: s>` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn03.leermanhwas.com/.../1-784.jpg` (image/webp (encoding: lossy), 58138 bytes, 720x1080; server Content-Type: image/jpeg) |  |  |  |
