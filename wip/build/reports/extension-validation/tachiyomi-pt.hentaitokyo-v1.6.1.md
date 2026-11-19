# Extension Validation Report

- Extension: tachiyomi-pt.hentaitokyo-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 0
- Warnings: 3
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gattsu
- Source ID: 7059984733794571635
- Source name: Hentai Tokyo
- Source language: pt-BR
- Selected manga input: popular offset 0: Recepção da Torre Residencial: Atendimento em Andamento 3 (`.../recepcao-da-torre-residencial-atendimento-em-andamento-3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 26 | Recepção da Torre Residencial: Atendimento em Andamento 3 (`.../recepcao-da-torre-residencial-atendimento-em-andamento-3`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 26 | A História Sobre Fazer Sexo Sem Parar Com Uma Garota Gyaru Que por Algum Motivo Estava no Clube de Literatura (`.../a-historia-sobre-fazer-sexo-sem-parar-com-uma-garota-gyaru-que-por-algum-motivo-estava-no-clube-de-literatura`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Recepção da Torre Residencial: Atendimento em Andamento 3 (`.../recepcao-da-torre-residencial-atendimento-em-andamento-3`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Recepção da Torre Residencial: Atendimento em Andamento 3 (`.../recepcao-da-torre-residencial-atendimento-em-andamento-3`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../recepcao-da-torre-residencial-atendimento-em-andamento-3`) |  | <1s |
| pages | `getPageList(chapter)` | success | 67 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Recepção da Torre Residencial: Atendimento em Andamento 3, URL=`.../recepcao-da-torre-residencial-atendimento-em-andamento-3` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Oh Sim! Eu me dei bem com uma Linda Prostituta de uma Agência 5 ~ Uma Última Vez ~, URL=`.../oh-sim-eu-me-dei-bem-com-uma-linda-prostituta-de-uma-agencia-5-uma-ultima-vez` at page 1 offsets 1, 16 and page 2 offset 16, title=A Irmã da Minha Noiva Tem Rosto Super Raro, Mas Personalidade Horrível — Uma Dançarina Sexual Infernal. 2, URL=`.../a-irma-da-minha-noiva-tem-rosto-super-raro-mas-personalidade-horrivel-uma-dancarina-sexual-infernal-2` at page 1 offsets 6, 17 and page 2 offset 17, title=A Irmã da Minha Noiva tem Rosto Super Raro, Mas Personalidade Horrível — Uma Dançarina Sexual Infernal., URL=`.../a-irma-da-minha-noiva-tem-rosto-super-raro-mas-personalidade-horrivel-uma-dancarina-sexual-infernal` at page 1 offsets 7, 18 and page 2 offset 18, title=Oh Sim! Eu me dei bem com uma Linda Prostituta de uma Agência 4, URL=`.../oh-sim-eu-me-dei-bem-com-uma-linda-prostituta-de-uma-agencia-4` at page 1 offsets 9, 19 and page 2 offset 19, title=A Garota Que Dei Um Fora, Acabou Virando Uma Modelo e Agora Quer Me Dar 3, URL=`.../a-garota-que-dei-um-fora-acabou-virando-uma-modelo-e-agora-quer-me-dar-3` at page 1 offsets 14, 20 and page 2 offset 20, title=A Casa de Massagem Acima do Cursinho de Reforço 2, URL=`.../a-casa-de-massagem-acima-do-cursinho-de-reforco-2` at page 1 offset 21 and page 2 offsets 2, 21, title=A Casa de Massagem Acima do Cursinho de Reforço, URL=`.../a-casa-de-massagem-acima-do-cursinho-de-reforco` at page 1 offset 22 and page 2 offsets 3, 22, title=A Garota Que Dei Um Fora, Acabou Virando Uma Modelo e Agora Quer Me Dar 2, URL=`.../a-garota-que-dei-um-fora-acabou-virando-uma-modelo-e-agora-quer-me-dar-2` at page 1 offset 23 and page 2 offsets 8, 23, title=Sedução Familiar 5 ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Da Sua Verdadeira Face ~, URL=`.../seducao-familiar-5-os-segredos-ocultos-da-tia-kaoru-edicao-da-sua-verdadeira-face` at page 1 offset 24 and page 2 offsets 10, 24, title=Plano Oculto, URL=`.../plano-oculto` at page 1 offset 25 and page 2 offset 25 |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 5 manga entries; Popular page 2 repeats 4 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaitokyo.net/.../001-54-360x500.jpg` (image/jpeg, 36540 bytes, 360x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../recepcao-da-torre-residencial-atendimento-em-andamento-3` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaitokyo.net/.../001-54.jpg` (image/jpeg, 400418 bytes, 1280x1780) |  |  |  |
| details author | PASS | Login |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Biquíni, Boquete, Camisinha, Creampie, Lingerie, Meia-Calça, MILF, Paizuri, Peitões, Raio-X |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | A Mitsuki ficou louca pelo Ryouta depois daquela química toda no spa e não perdeu tempo. Aproveitando que o marido dela viajou a trabalho, ela mandou a real e convidou ele para passar uns dias na casa dela. Sem regras, sem cobranças, só ela e ele aproveitando o momento enquanto o marido não volta. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 67 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentaitokyo.net/.../2` to `https://hentaitokyo.net/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://hentaitokyo.net/.../001-54.jpg` (image/jpeg, 400418 bytes, 1280x1780) |  |  |  |
