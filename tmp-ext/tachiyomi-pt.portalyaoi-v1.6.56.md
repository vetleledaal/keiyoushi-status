# Extension Validation Report

- Extension: tachiyomi-pt.portalyaoi-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3275945866985875190
- Source name: Portal Yaoi
- Source language: pt-BR
- Selected manga input: popular offset 0: Jinx (`.../748`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Jinx (`.../748`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Mo Dao Zu Shi (`.../1178`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Codename Anastasia (`.../2102`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Painter of the Night (`.../12`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Love Jinx (`.../838`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (`.../748`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 108 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Jinx, URL=`748` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 42/42 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 42/42 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://portalyaoi.com/.../e5846bf4-6326-429a-bd8c-2517c4bbc3e4-350x476.jpeg` (image/jpeg, 45667 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `748` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://portalyaoi.com/.../e5846bf4-6326-429a-bd8c-2517c4bbc3e4-193x278.jpeg` (image/jpeg, 17050 bytes, 193x278) |  |  |  |
| details author | PASS | Mingwa |  |  |  |
| details artist | PASS | Mingwa |  |  |  |
| details genres | PASS | Adulto, Drama, Lutador, Romance, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Jinx – Ler Online Grátis em Português – PORTALYAOI.COM<br><br>Jinx é um manhwa manga yaoi em lançamento (no pt-BR) lançado em 2022. A obra é escrita e ilustrada por Mingwa a mesma autora de BJ ALEX. Jinx mangá é uma história para adultos sobre drama e romance entre um fisioterapeuta e um lutador de mma.<br><br>Campeão meio-pesado de artes marciais ‘Joo Jae-kyung‘. Ele escreve o mito de ser invicto, mas, na verdade, ele também tem um ritual secreto. Ou seja, ele precisa fazer sexo satisfatório na véspera da partida para vencer! Jaekyung tenta resolver o seu problema com o fisioterapeuta ‘Dan Kim‘…<br><br>Nomes alternativos: 징크스, Jinx |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 108 chapters |  |  |  |
| chapter dates | PASS | 108 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | FAIL | 6 of 6 pages have invalid URLs: page 1: imageUrl=`data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` (data scheme), page 2: imageUrl=`data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` (data scheme), page 3: imageUrl=`data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` (data scheme), page 4: imageUrl=`data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` (data scheme), page 5: imageUrl=`data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` (data scheme), and 1 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | UNUSUAL | Duplicate page URLs: `data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` at pages 1, 2, 3, 4, 5, 6 |  |  |  |
| page load | FAIL | First page URL `data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7` could not be downloaded: java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but was 'data' | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
