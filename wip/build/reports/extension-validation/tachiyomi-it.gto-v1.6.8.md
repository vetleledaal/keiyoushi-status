# Extension Validation Report

- Extension: tachiyomi-it.gto-v1.6.8
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: pizzareader
- Source ID: 2773063800266255222
- Source name: GTO The Great Site
- Source language: it
- Selected manga input: latest offset 0: Il mio senpai è irritante (`.../il-mio-senpai-e-irritante`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 83 | 100% Fragola East Side Story (`.../100-fragola-east-side-story`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Il mio senpai è irritante (`.../il-mio-senpai-e-irritante`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Il mio senpai è irritante (`.../il-mio-senpai-e-irritante`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 276 | Vol.1 Ch.1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | <1s |

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
| popular listing | PASS | 83 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 93/93 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 93/93 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reader.gtothegreatsite.net/.../il-mio-senpai-%C3%A8-irritante.jpg <redacted query values: v>` (image/jpeg, 398369 bytes, 1165x1655) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../il-mio-senpai-e-irritante` |  |  |  |
| details thumbnail URL | PASS | `https://reader.gtothegreatsite.net/.../il-mio-senpai-%C3%A8-irritante.jpg <redacted query values: v>` |  |  |  |
| details author | PASS | Shiro Manta |  |  |  |
| details artist | PASS | Shiro Manta |  |  |  |
| details genres | PASS | Commedia, Romantico, Slice of Life |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Un divertente web manga incentrato sulla quotidianità di due colleghi di lavoro: Igarashi, una giovane impiegata, e Takeda, il suo irritante senpai a cui è molto legata. Giorno dopo giorno il loro rapporto cresce lasciando spazio ad altro... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 276 chapters |  |  |  |
| chapter dates | PASS | 276 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://reader.gtothegreatsite.net/.../Cover.png <redacted query values: v>` (image/png, 1076428 bytes, 1126x1600) |  |  |  |
