# Extension Validation Report

- Extension: tachiyomi-pt.horahentai-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 542325806354392983
- Source name: Hora Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Uma Mulher Divorciada e Uma Esposa Que Gosta de Dar Sermões: Vou Transformá-las Em Brinquedos Sexuais Maduros Com Histórias para Contar. (`.../uma-mulher-divorciada-e-uma-esposa-que-gosta-de-dar-sermoes-vou-transforma-las-em-brinquedos-sexuais-maduros-com-historias-para-contar`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Uma Mulher Divorciada e Uma Esposa Que Gosta de Dar Sermões: Vou Transformá-las Em Brinquedos Sexuais Maduros Com Histórias para Contar. (`.../uma-mulher-divorciada-e-uma-esposa-que-gosta-de-dar-sermoes-vou-transforma-las-em-brinquedos-sexuais-maduros-com-historias-para-contar`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | A Minha Amiga Tomboy Alta Quer Transar 2 (`.../a-minha-amiga-tomboy-alta-quer-transar-2`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Heroína do Prazer ~ Suor, Mel e Suspiros ~ (`.../heroina-do-prazer-suor-mel-e-suspiros`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Pegando Fogo Com A Melhor da Natação (`.../pegando-fogo-com-a-melhor-da-natacao`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Uma Mulher Divorciada e Uma Esposa Que Gosta de Dar Sermões: Vou Transformá-las Em Brinquedos Sexuais Maduros Com Histórias para Contar. (`.../uma-mulher-divorciada-e-uma-esposa-que-gosta-de-dar-sermoes-vou-transforma-las-em-brinquedos-sexuais-maduros-com-historias-para-contar`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Uma Mulher Divorciada e Uma Esposa Que Gosta de Dar Sermões: Vou Transformá-las Em Brinquedos Sexuais Maduros Com Histórias para Contar. (`.../uma-mulher-divorciada-e-uma-esposa-que-gosta-de-dar-sermoes-vou-transforma-las-em-brinquedos-sexuais-maduros-com-historias-para-contar`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo (`.../uma-mulher-divorciada-e-uma-esposa-que-gosta-de-dar-sermoes-vou-transforma-las-em-brinquedos-sexuais-maduros-com-historias-para-contar`) |  | <1s |
| pages | `getPageList(chapter)` | success | 70 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Uma Mulher Divorciada e Uma Esposa Que Gosta de Dar Sermões: Vou Transformá-las Em Brinquedos Sexuais Maduros Com Histórias para Contar., URL=`.../uma-mulher-divorciada-e-uma-esposa-que-gosta-de-dar-sermoes-vou-transforma-las-em-brinquedos-sexuais-maduros-com-historias-para-contar` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=A Aprovação da Vovó, URL=`.../a-aprovacao-da-vovo` at page 1 offsets 1, 23 and page 2 offset 23, title=Anne, URL=`.../anne` at page 1 offsets 3, 24 and page 2 offset 24, title=A Fantasia Amarela: Fases da Vida, URL=`.../a-fantasia-amarela-fases-da-vida` at page 1 offsets 6, 28 and page 2 offset 28, title=O Segredo Pervertido do Hokage, URL=`.../o-segredo-pervertido-do-hokage` at page 1 offsets 7, 26 and page 2 offset 26, title=A Fantasia Amarela: Annika Van Houten, URL=`.../fantasia-amarela-annika-van-houten` at page 1 offsets 8, 29 and page 2 offset 29, title=O Café da Manhã, URL=`.../o-cafe-da-manha` at page 1 offsets 10, 22 and page 2 offset 22, title=A Fantasia Amarela: A Lista, URL=`.../a-fantasia-amarela-a-lista` at page 1 offsets 11, 25 and page 2 offset 25, title=A Fantasia Amarela: A Professora do Nelson, URL=`.../a-fantasia-amarela-a-professora-do-nelson` at page 1 offsets 16, 27 and page 2 offset 27, title=Enxergando Vermelho, URL=`.../enxergando-vermelho` at page 1 offset 20 and page 2 offset 20, title=Compartilhar É Cuidar, URL=`.../compartilhar-e-cuidar` at page 1 offset 21 and page 2 offset 21 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Enxergando Vermelho, URL=`.../enxergando-vermelho` at page 1 offsets 12, 20 and page 2 offset 20, title=Compartilhar É Cuidar, URL=`.../compartilhar-e-cuidar` at page 1 offset 21 and page 2 offsets 2, 21, title=O Café da Manhã, URL=`.../o-cafe-da-manha` at page 1 offset 22 and page 2 offsets 19, 22, title=A Aprovação da Vovó, URL=`.../a-aprovacao-da-vovo` at page 1 offset 23 and page 2 offset 23, title=Anne, URL=`.../anne` at page 1 offset 24 and page 2 offset 24, title=A Fantasia Amarela: A Lista, URL=`.../a-fantasia-amarela-a-lista` at page 1 offset 25 and page 2 offset 25, title=O Segredo Pervertido do Hokage, URL=`.../o-segredo-pervertido-do-hokage` at page 1 offset 26 and page 2 offset 26, title=A Fantasia Amarela: A Professora do Nelson, URL=`.../a-fantasia-amarela-a-professora-do-nelson` at page 1 offset 27 and page 2 offset 27, title=A Fantasia Amarela: Fases da Vida, URL=`.../a-fantasia-amarela-fases-da-vida` at page 1 offset 28 and page 2 offset 28, title=A Fantasia Amarela: Annika Van Houten, URL=`.../fantasia-amarela-annika-van-houten` at page 1 offset 29 and page 2 offset 29 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 8 manga entries; Latest page 1 repeats 1 manga entry: title=Enxergando Vermelho, URL=`.../enxergando-vermelho`; Latest page 2 repeats 2 manga entries: title=Compartilhar É Cuidar, URL=`.../compartilhar-e-cuidar`, title=O Café da Manhã, URL=`.../o-cafe-da-manha` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://horahentai.com/.../01-33-360x500.jpg` (image/jpeg, 44384 bytes, 360x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../uma-mulher-divorciada-e-uma-esposa-que-gosta-de-dar-sermoes-vou-transforma-las-em-brinquedos-sexuais-maduros-com-historias-para-contar` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://horahentai.com/.../01-33-736x1024.jpg` (image/jpeg, 132007 bytes, 736x1024) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Doujinshi, Hentai, Ahegao, Boquete, Creampie, Grupal, Masturbação, MILF, Netorare, Óculos, Peitões, Pelos Pubianos |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Iguchi e Sasaki são colegas de trabalho que vivem dando bronca no protagonista. Porém, a situação vira quando ele as pega roubando cervejas do próprio mercadinho onde trabalham. Com a prova gravada em vídeo, ele decide usar a chantagem para conseguir o que quer: encontros sexuais com as duas. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 70 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://horahentai.com/.../01-33.jpg` (image/jpeg, 342049 bytes, 1294x1800) |  |  |  |
