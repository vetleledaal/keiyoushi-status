# Extension Validation Report

- Extension: tachiyomi-pt.yuriverso-v1.6.65
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4476506734614164770
- Source name: Yuri on Air
- Source language: pt-BR
- Selected manga input: popular offset 0: Tamen de Gushi (Tan Jiu) (`.../129`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Tamen de Gushi (Tan Jiu) (`.../129`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | Lily (Yy) (`.../132`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 12 | O cara que estou a fim não é um cara?! (`.../24489`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Wicked Spot (`.../24616`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tamen de Gushi (Tan Jiu) (`.../129`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tamen de Gushi (Tan Jiu) (`.../129`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 131 | Episódio 001 (`.../episodio-001`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tamen de Gushi (Tan Jiu), URL=`129` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yurionair.top/.../tamen-de-gushi-manhua-175x238.jpg` (image/jpeg, 7256 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `129` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yurionair.top/.../tamen-de-gushi-manhua-193x278.jpg` (image/jpeg, 9129 bytes, 193x278) |  |  |  |
| details author | PASS | Tan Jiu |  |  |  |
| details artist | PASS | Tan Jiu |  |  |  |
| details genres | PASS | Comédia, Cotidiano, Romance, Vida Escolar |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Uma romântica e divertida história de como Qiu Tong e Sun Jing se conheceram e se apaixonaram. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 131 chapters |  |  |  |
| chapter dates | PASS | 131 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `http://farm66.staticflickr.com/.../50102863161_02eb87c522_o.jpg` to `https://farm66.staticflickr.com/.../50102863161_02eb87c522_o.jpg` (1 redirects) |  |  |  |
| page load | PASS | `http://farm66.staticflickr.com/.../50102863161_02eb87c522_o.jpg` (image/jpeg, 171014 bytes, 900x600) |  |  |  |
