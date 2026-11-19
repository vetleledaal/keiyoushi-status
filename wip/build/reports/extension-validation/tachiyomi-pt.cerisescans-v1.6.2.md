# Extension Validation Report

- Extension: tachiyomi-pt.cerisescans-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6986357795598884919
- Source name: Cerise Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: A Imperatriz se Casou Novamente (`.../a-imperatriz-se-casou-novamente`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | A Imperatriz se Casou Novamente (`.../a-imperatriz-se-casou-novamente`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | A Vilã Tem Um Crush (`.../a-vila-tem-um-crush`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Eu Acidentalmente Ressuscitei Meu Marido (`.../eu-acidentalmente-ressuscitei-meu-marido`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Lágrimas Sobre Flores Murchas (`.../lagrimas-sobre-flores-murchas`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Imperatriz se Casou Novamente (`.../a-imperatriz-se-casou-novamente`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Imperatriz se Casou Novamente (`.../a-imperatriz-se-casou-novamente`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 245 | Capítulo 1 (`.../1775121789452683`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Imperatriz se Casou Novamente, URL=`a-imperatriz-se-casou-novamente` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://loverstoon.net/.../1777273325009-a-imperatriz-se-casou-novamente.webp` (image/webp (encoding: lossy), 63934 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `a-imperatriz-se-casou-novamente` |  |  |  |
| details thumbnail URL | PASS | `https://loverstoon.net/.../1777273325009-a-imperatriz-se-casou-novamente.webp` |  |  |  |
| details author | PASS | Unknown |  |  |  |
| details artist | PASS | Unknown |  |  |  |
| details genres | PASS | Drama, Fantasia, Histórico, Josei, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Navier Ellie Trovi foi uma imperatriz perfeita em todos os sentidos — inteligente, corajosa e socialmente hábil. Ela era gentil com seus súditos e dedicada ao marido. Navier estava perfeitamente satisfeita em viver o resto de seus dias como a sábia imperatriz do Império do Oriente. Isto é, até que o marido trouxesse uma amante para casa e exigisse o divórcio. “Aceito este divórcio… E peço a aprovação do meu novo casamento.” Em uma reviravolta chocante, Navier se casa novamente com outro imperador e mantém seu título e sonho de infância como imperatriz. Mas como tudo se desenrolou? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 245 chapters |  |  |  |
| chapter dates | PASS | 245 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 401 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
