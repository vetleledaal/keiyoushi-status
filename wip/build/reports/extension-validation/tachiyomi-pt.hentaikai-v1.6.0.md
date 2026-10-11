# Extension Validation Report

- Extension: tachiyomi-pt.hentaikai-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 3
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8041889466081243774
- Source name: Hentai Kai
- Source language: pt
- Selected manga input: popular offset 0: Você gosta de garotas mais velhas pervertidas 5 (`.../o-sacana-e-voce`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Decida o que fazer com essa xoxota! (`.../o-sacana-e-voce`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | Pagando o aluguel atrasado (`.../pagando-o-aluguel-atrasado`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | 1LDK + JK Ikinari Doukyo Micchaku Hatsu Ecchi (`.../1ldk-jk-ikinari-doukyo-micchaku-hatsu-ecchi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Ai Shimai Futari no Kajitsu (`.../ai-shimai-futari-no-kajitsu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Decida o que fazer com essa xoxota! (`.../o-sacana-e-voce`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Você gosta de garotas mais velhas pervertidas 5 (`.../o-sacana-e-voce`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../o-sacana-e-voce`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Decida o que fazer com essa xoxota!, URL=`games/o-sacana-e-voce/` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://hentaikai.com/.../aninha-bh-308x408.jpg` was not downloaded | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `games/o-sacana-e-voce/` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://hentaikai.com/.../o-sacana-e-voce` to `https://hentaikai.com/.../voce-gosta-de-garotas-mais-velhas-pervertidas` (1 redirects); popular: `https://hentaikai.com/.../o-sacana-e-voce` to `https://hentaikai.com/.../voce-gosta-de-garotas-mais-velhas-pervertidas` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
