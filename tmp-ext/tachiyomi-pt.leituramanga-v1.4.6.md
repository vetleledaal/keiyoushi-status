# Extension Validation Report

- Extension: tachiyomi-pt.leituramanga-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1445343849143422351
- Source name: Leitura Mangá
- Source language: pt-BR
- Selected manga input: popular offset 0: Lágrimas Sobre Flores Murchas (`.../lagrimas-sobre-flores-murchas`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Lágrimas Sobre Flores Murchas (`.../lagrimas-sobre-flores-murchas`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Por Favor, Olhe para a Jasmine (`.../por-favor-olhe-para-a-jasmine`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Sobrevivendo como a Esposa de um Assassino em Série (`.../sobrevivendo-como-a-esposa-de-um-assassino-em-serie`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Os Planos do Mercenário Regressado (`.../os-planos-do-mercenario-regressado`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Lágrimas Sobre Flores Murchas (`.../lagrimas-sobre-flores-murchas`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Lágrimas Sobre Flores Murchas (`.../lagrimas-sobre-flores-murchas`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 117 | Capítulo 1 (`.../1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 145 |  |  | 1-10s |

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
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS |  Gae (개) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Romance, Josei, Seinen, Adulto, Slice of Life, Psicológico, +18 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A vida de Na Hae-soo se desfaz quando seu marido a trai. Como se não bastasse estar endividada e ter perdido um filho… Em um golpe devastador, ela o flagra fazendo sexo com uma mulher bem mais jovem do que ela. Quebrada e desanimada, Na Hae-soo sente sua vida desmoronando ao seu redor. No entanto, um jovem misterioso inesperadamente entra em sua vida, pedindo para ser ensinado sobre o amor adulto. Sua vulnerabilidade e sinceridade começam a despertar emoções em Na Hae-soo, desafiando-a a reconsiderar seu caminho a seguir. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: author |  |  |  |
| chapters | PASS | 117 chapters |  |  |  |
| chapter dates | PASS | 117 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 145 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.leituramanga.net/.../page-1.webp` (image/webp (encoding: lossy), 92484 bytes, 1920x1280) |  |  |  |
