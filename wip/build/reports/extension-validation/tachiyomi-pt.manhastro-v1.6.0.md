# Extension Validation Report

- Extension: tachiyomi-pt.manhastro-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5123733616022476906
- Source name: Manhastro
- Source language: pt-BR
- Selected manga input: popular offset 0: Me Tornei um Ladrão de Habilidades (`.../72584`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Me Tornei um Ladrão de Habilidades (`.../72584`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | Unlimited Bacteria Magician (`.../109092`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Me Tornei um Ladrão de Habilidades (`.../72584`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Me Tornei um Ladrão de Habilidades (`.../72584`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 43 | Capitulo 1 (`.../636852`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 36 |  |  | <1s |

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
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Me Tornei um Ladrão de Habilidades, URL=`.../72584` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://temp2.manhastro.com/.../cover.webp` (image/webp (encoding: lossy), 153028 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../72584` |  |  |  |
| details thumbnail URL | PASS | `https://temp2.manhastro.com/.../cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasia, Manhwa, Ação |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Um jovem chamado Krash era desprezado como um "fracasso" e traído por aqueles que considerava aliados. Mas, à beira da morte, ele obteve um milagre: uma "Regressão" única. Ele nunca mais poderá usar esse poder... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 43 chapters |  |  |  |
| chapter dates | PASS | 43 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://temp2.manhastro.com/.../cover.webp` to `https://temp2.manhastro.net/.../cover.webp` (1 redirects) |  |  |  |
| page load | PASS | `https://albums.manhastro.net/.../1.webp` (image/webp (encoding: lossy), 667278 bytes, 800x9000) |  |  |  |
