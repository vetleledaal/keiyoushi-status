# Extension Validation Report

- Extension: tachiyomi-pt.blitztoons-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2916575821827748941
- Source name: Blitz Toons
- Source language: pt-BR
- Selected manga input: popular offset 0: A Imperatriz se Casou Novamente (`.../a-imperatriz-se-casou-novamente`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | A Imperatriz se Casou Novamente (`.../a-imperatriz-se-casou-novamente`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Vou Me Aposentar Depois de Salvar o Mundo (`.../vou-me-aposentar-depois-de-salvar-o-mundo`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Fazendeiro Espiritual (`.../fazendeiro-espiritual`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Cale a Boca, Dragão Maligno! Não Quero Mais Criar um Filho com Você (`.../cale-a-boca-dragao-maligno-nao-quero-mais-criar-um-filho-com-voce`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Imperatriz se Casou Novamente (`.../a-imperatriz-se-casou-novamente`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Imperatriz se Casou Novamente (`.../a-imperatriz-se-casou-novamente`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 252 | Capítulo 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Imperatriz se Casou Novamente, URL=`.../a-imperatriz-se-casou-novamente` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Subindo de Nível Matando Deuses, URL=`.../subindo-de-nivel-matando-deuses` at page 1 offset 1 and page 2 offset 6 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.blitztoons.com/.../a-imperatriz-se-casou-novamente-be078db3e1ee.webp` (image/webp (encoding: lossy), 137348 bytes, 600x870) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-imperatriz-se-casou-novamente` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.blitztoons.com/.../a-imperatriz-se-casou-novamente-be078db3e1ee.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasia, Histórico, Josei, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 10 (9)<br>Shoujo<br><br>Navier Ellie Trovi foi uma imperatriz perfeita em todos os sentidos — inteligente, corajosa e socialmente hábil. Ela era gentil com seus súditos e dedicada ao marido. Navier estava perfeitamente satisfeita em viver o resto de seus dias como a sábia imperatriz do Império do Oriente. Isto é, até que o marido trouxesse uma amante para casa e exigisse o divórcio. "Aceito este divórcio... E peço a aprovação do meu novo casamento." Em uma reviravolta chocante, Navier se casa novamente com outro imperador e mantém seu título e sonho de infância como imperatriz. Mas como tudo se desenrolou? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 252 chapters |  |  |  |
| chapter dates | PASS | 252 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.blitztoons.com/.../001.webp` (image/webp (encoding: lossy), 186086 bytes, 1200x1200) |  |  |  |
