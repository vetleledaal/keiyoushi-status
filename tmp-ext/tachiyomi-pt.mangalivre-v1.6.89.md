# Extension Validation Report

- Extension: tachiyomi-pt.mangalivre-v1.6.89
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: RETRY_WHEN
- Retry condition: HARNESS_REVISION_CHANGES: java.lang.RuntimeException

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2834885536325274328
- Source name: ToonLivre
- Source language: pt-BR
- Selected manga input: popular offset 0: O Retorno do Cão de Caça dos Baskerville (`.../obra-c1f65a0b`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | O Retorno do Cão de Caça dos Baskerville (`.../obra-c1f65a0b`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Estou Te Dizendo, Só Tenho Olhos para Você (`.../obra-695ec683`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Simulação de Namoro Fantasma (`.../obra-9c33fd2a`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | A Espada Suprema do Culto Demoníaco (`.../obra-6955dd77`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | O Retorno do Cão de Caça dos Baskerville (`.../obra-c1f65a0b`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Retorno do Cão de Caça dos Baskerville (`.../obra-c1f65a0b`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 178 | Capítulo 01 (`.../01`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.RuntimeException: Stub! | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.RuntimeException: Stub! | RETRY_WHEN | HARNESS_COMPATIBILITY_FAILURE | HARNESS_REVISION_CHANGES: java.lang.RuntimeException |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=O Retorno do Cão de Caça dos Baskerville, URL=`obra-c1f65a0b` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.toonlivre.net/.../cover-6a395d11cb5a265741583dfbbe47de14.webp` (image/webp (encoding: lossy), 98538 bytes, 720x1081) |  |  |  |
| details identity | PASS | Details preserved selected URL `obra-c1f65a0b` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.toonlivre.net/.../cover-6a395d11cb5a265741583dfbbe47de14.webp` |  |  |  |
| details author | PASS | Legobalbasseo, Seol Arang |  |  |  |
| details artist | PASS | Lee Sanchaek (REDICE STUDIO) |  |  |  |
| details genres | PASS | Ação, Aventura, Fantasia, Mistério, Harém, Magia, Viagem no Tempo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Criados para matar como uma matilha de cães leais, as crianças Baskerville tiraram incontáveis vidas como um grupo de assassinos temíveis. Apesar de ser o filho ilegítimo desprezado da família, Vikir serviu fielmente seu clã — apenas para encontrar uma morte prematura pelas mãos de seu próprio pai. Mas quando inexplicavelmente renasce com uma segunda chance, Vikir, munido das memórias e do conhecimento de sua vida passada, jura se elevar acima da matilha e buscar vingança. Desta vez, ele está pronto para morder a mão que o alimentou.<br><br><br> Nome alternativo: Revenge of the Baskerville Bloodhound<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 178 chapters |  |  |  |
| chapter dates | PASS | 178 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Stub! |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
