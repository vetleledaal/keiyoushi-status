# Extension Validation Report

- Extension: tachiyomi-pt.leituramanga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

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
| popular_next | `getPopularManga(2)` | success | 24 | Who Made Me a Princess (`.../who-made-me-a-princess`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Jantar à Luz de Velas com Lewellyn (`.../jantar-a-luz-de-velas-com-lewellyn`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | A Superação do Nobre Vagabundo (`.../a-superacao-do-nobre-vagabundo`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lágrimas Sobre Flores Murchas (`.../lagrimas-sobre-flores-murchas`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lágrimas Sobre Flores Murchas (`.../lagrimas-sobre-flores-murchas`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 122 | Capítulo 1 (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 145 |  |  | 1-10s |

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
| details thumbnail URL | PASS | `https://cdn.leituramanga.net/.../cover-md.webp` |  |  |  |
| details author | PASS |  Gae (개) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Romance, Josei, Seinen, Adulto, Slice of Life, Psicológico, +18 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A vida de Na Hae-soo se desfaz quando seu marido a trai. Como se não bastasse estar endividada e ter perdido um filho… Em um golpe devastador, ela o flagra fazendo sexo com uma mulher bem mais jovem do que ela. Quebrada e desanimada, Na Hae-soo sente sua vida desmoronando ao seu redor. No entanto, um jovem misterioso inesperadamente entra em sua vida, pedindo para ser ensinado sobre o amor adulto. Sua vulnerabilidade e sinceridade começam a despertar emoções em Na Hae-soo, desafiando-a a reconsiderar seu caminho a seguir. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: author |  |  |  |
| chapters | PASS | 122 chapters |  |  |  |
| chapter dates | PASS | 122 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 145 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.leituramanga.net/.../page-1.webp` (image/webp (encoding: lossy), 92484 bytes, 1920x1280) |  |  |  |
