# Extension Validation Report

- Extension: tachiyomi-pt.mangasbrasuka-v1.6.62
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: aurora
- Source ID: 9021069622172695017
- Source name: Mangas Brasuka
- Source language: pt-BR
- Selected manga input: popular offset 0: Ao Ashi (`.../ao-ashi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 700 | Ao Ashi (`.../ao-ashi`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | Servamp (`.../servamp`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ao Ashi (`.../ao-ashi`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ao Ashi (`.../ao-ashi`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 411 | Capítulo 1 (`.../chp_1792179941185`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 10s+ |

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
| popular listing | PASS | 700 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ao Ashi, URL=`ao-ashi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 801/801 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 801/801 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://aurora.snipercache.com/.../1792246589275-ao-ashi.webp` (image/webp (encoding: lossy), 170158 bytes, 900x1276) |  |  |  |
| details identity | PASS | Details preserved selected URL `ao-ashi` |  |  |  |
| details thumbnail URL | PASS | `https://aurora.snipercache.com/.../1792246589275-ao-ashi.webp` |  |  |  |
| details author | PASS | Yuugo Kobayashi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Esportes, Premiado, Vida Escolar, Slice of Life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Para o palco mundial! Glória e ambição aguardam o jovem Ashito Aoi enquanto ele dá os primeiros passos rumo a se tornar um jogador profissional de futebol. Mas, ao ser lançado em um ambiente novo e implacável, será que ele conseguirá se manter firme e escalar até o topo?<br><br>Um encontro decisivo na Praia de Futami, em Ehime, Japão, marca o início da relação entre Fukuda Tatsuya — um ex-astro em ascensão cuja carreira foi interrompida precocemente — e Aoi Ashito, um atacante impulsivo e temperamental que ama o futebol, apesar de suas tendências egoístas.<br><br>Ao ser selecionado para um teste no clube juvenil Tokyo City Esperion, Ashito aposta seu futuro nessa oportunidade de construir uma vida melhor para sua mãe solteira e seu irmão mais velho, ao mesmo tempo em que precisa encarar suas próprias limitações e enfrentar o altamente competitivo mundo do futebol juvenil japonês.<br><br>**Títulos alternativos:**<br>- Aoashi |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 411 chapters |  |  |  |
| chapter dates | PASS | 411 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://mangasbrasuka.org/.../callback <redacted query values: token>` to `https://mangasbrasuka.org/.../1` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
