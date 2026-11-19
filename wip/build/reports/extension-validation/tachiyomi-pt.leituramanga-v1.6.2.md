# Extension Validation Report

- Extension: tachiyomi-pt.leituramanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 2
- Warnings: 0
- Skipped: 10
- Failed: 1
- Retry disposition: RETRY_WHEN
- Retry condition: RETRY_TIME_REACHED: 900

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1445343849143422351
- Source name: Leitura Mangá
- Source language: pt-BR
- Selected manga input: popular offset 0: Lágrimas Sobre Flores Murchas (`.../lagrimas-sobre-flores-murchas`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Lágrimas Sobre Flores Murchas (`.../lagrimas-sobre-flores-murchas`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Eu me Tornei a Mãe do Protagonista Sanguinário (`.../eu-me-tornei-a-mae-do-protagonista-sanguinario`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Aventura de um Bárbaro em um Mundo de Fantasia (`.../aventura-de-um-barbaro-em-um-mundo-de-fantasia`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Ela é a Irmã de um Merda (`.../ela-e-a-irma-de-um-merda`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lágrimas Sobre Flores Murchas (`.../lagrimas-sobre-flores-murchas`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lágrimas Sobre Flores Murchas (`.../lagrimas-sobre-flores-murchas`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 429 | RETRY_WHEN | RATE_LIMITED | RETRY_TIME_REACHED: 900 |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lágrimas Sobre Flores Murchas, URL=`.../lagrimas-sobre-flores-murchas` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.leituramanga.net/.../cover-md.webp` (image/webp (encoding: lossy), 35740 bytes, 463x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lagrimas-sobre-flores-murchas` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.leituramanga.net/.../cover-md.webp` |  |  |  |
| details author | PASS |  Gae (개) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Romance, Josei, Seinen, Adulto, Slice of Life, Psicológico, +18, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A vida de Na Hae-soo se desfaz quando seu marido a trai. Como se não bastasse estar endividada e ter perdido um filho… Em um golpe devastador, ela o flagra fazendo sexo com uma mulher bem mais jovem do que ela. Quebrada e desanimada, Na Hae-soo sente sua vida desmoronando ao seu redor. No entanto, um jovem misterioso inesperadamente entra em sua vida, pedindo para ser ensinado sobre o amor adulto. Sua vulnerabilidade e sinceridade começam a despertar emoções em Na Hae-soo, desafiando-a a reconsiderar seu caminho a seguir. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: author |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
