# Extension Validation Report

- Extension: tachiyomi-pt.mangotoons-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8989984812354857153
- Source name: Mango Toons
- Source language: pt-BR
- Selected manga input: latest offset 0: Fui Confundido com um Gênio Monstruoso (`.../11472`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Mestre Espadachim Criado Pelas Estrelas (`.../10642`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Fui Confundido com um Gênio Monstruoso (`.../11472`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | O Retorno da Seita do Monte Hua (`.../10746`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Fui Confundido com um Gênio Monstruoso (`.../11472`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Fui Confundido com um Gênio Monstruoso (`.../11472`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 116 | Capitulo 0 (`.../0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Fui Confundido com um Gênio Monstruoso, URL=`.../11472` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangotoons.com/.../cover.webp` (image/webp (encoding: lossy), 116864 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../11472` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangotoons.com/.../cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Aventura, Comédia, Drama, Fantasia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Eu, Kang Woojin, estava largando meu trabalho de design e me tornei um desempregado. No dia seguinte, meu amigo me levou para audições e fui forçado a me apresentar. Quando me deram um roteiro, o espaço vazio apareceu na minha mente e me forçou a reviver o personagem. Fui esfaqueado. Virei um serial killer. Virei um exorcista. Conforme me tornei ator, os mal-entendidos continuaram crescendo dia a dia. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 116 chapters |  |  |  |
| chapter dates | PASS | 116 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://api.mangotoons.com/.../0` (image/webp (encoding: lossy), 532516 bytes, 750x14095) |  |  |  |
