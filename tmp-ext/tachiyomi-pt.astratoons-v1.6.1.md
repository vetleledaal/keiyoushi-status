# Extension Validation Report

- Extension: tachiyomi-pt.astratoons-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 551908063793499841
- Source name: Astratoons
- Source language: pt-BR
- Selected manga input: popular offset 0: Um Mago Retornado Tem Que Ser Especial (`.../um-mago-retornado-tem-que-ser-especial`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Um Mago Retornado Tem Que Ser Especial (`.../um-mago-retornado-tem-que-ser-especial`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Artes Marciais Globais (`.../artes-marciais-globais`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Os Princípios De Um Bom Garoto (`.../os-principios-de-um-bom-garoto`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Um Mago Retornado Tem Que Ser Especial (`.../um-mago-retornado-tem-que-ser-especial`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Um Mago Retornado Tem Que Ser Especial (`.../um-mago-retornado-tem-que-ser-especial`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 269 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Um Mago Retornado Tem Que Ser Especial, URL=`.../um-mago-retornado-tem-que-ser-especial` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Os Princípios De Um Bom Garoto, URL=`.../os-principios-de-um-bom-garoto` at page 1 offset 9 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://new.astratoons.com/.../01KKAF6DR126NNEWA44E310HRT.webp` (image/webp (encoding: lossy), 149536 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../um-mago-retornado-tem-que-ser-especial` |  |  |  |
| details thumbnail URL | PASS | `https://new.astratoons.com/.../01KKAF6DR126NNEWA44E310HRT.webp` |  |  |  |
| details author | PASS | N/A |  |  |  |
| details artist | PASS | N/A |  |  |  |
| details genres | PASS | Drama, Aventura, Ação, Fantasia, Magia, Sobrenatural, misterio, viagem no tempo, Regressão |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Agora que estou de volta, não permitirei que aqueles que amo morram outra vez!” O Labirinto Sombrio – A catástrofe mais mortífera que a humanidade tem conhecimento. Desir Arman, um dos seis sobreviventes da raça humana, está dentro do labirinto. Os seis conseguem completar o último nível do labirinto, entretanto, eles falham no final, e o mundo chega ao seu fim. No entando, quando Desir acreditava que encontraria sua morte, o que aparece diante de seus olhos é o mundo… Trinta anos atrás?! Desir é mandado de volta ao passado, na época em que se matriculou na melhor academia mágica da nação, Havrion. Ele reencontra-se com seus preciosos amigos, e está determinado a mudar o passado e salvar aqueles que lhe são preciosos…! Faltam três anos até a emergência do Mundo das Sombras! Mude o passado e reúna companheiros poderosos para salvar a humanidade! Nomes Alternativos: |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 269 chapters |  |  |  |
| chapter dates | LINT | All 269 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=269 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://new.astratoons.com/.../001.webp` (image/webp (encoding: lossy), 70952 bytes, 600x700) |  |  |  |
