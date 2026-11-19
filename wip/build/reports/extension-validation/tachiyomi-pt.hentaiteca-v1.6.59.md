# Extension Validation Report

- Extension: tachiyomi-pt.hentaiteca-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source theme: madara
- Source ID: 5744105605190975461
- Source name: Hentai Teca
- Source language: pt-BR
- Selected manga input: popular offset 0: Minha amiga Gyaru me Deixa Usar a Buceta Dela (`.../617`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Minha amiga Gyaru me Deixa Usar a Buceta Dela (`.../617`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Eu, o Gerente do Dormitório Feminino, Estou Sendo Manipulado Pelas Gals do Dormitório (`.../647`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | A Gyaru que se apaixona por um pau gentil (`.../1324`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Você está sempre no meu coração (`.../1260`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Minha amiga Gyaru me Deixa Usar a Buceta Dela (`.../617`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Minha amiga Gyaru me Deixa Usar a Buceta Dela (`.../617`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Minha amiga Gyaru me Deixa Usar a Buceta Dela, URL=`617` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://hentaiteca.online/.../Capao23o3o2-175x238.jpg` (image/jpeg, 25059 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `617` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaiteca.online/.../Capao23o3o2-193x278.jpg` (image/jpeg, 28273 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Manno |  |  |  |
| details genres | PASS | Doujinshi, Hentai, Boquete, Camisinha, Colegial, Creampie, Gyaru, Masturbação, Óculos, Peitões, Raio-X |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Nomes alternativos: Iribitari Gal ni Manko Tsukawasete Morau Hanashi |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://hentaiteca.online/.../01-1.jpg` (image/jpeg, 289951 bytes, 1280x1805) |  |  |  |
