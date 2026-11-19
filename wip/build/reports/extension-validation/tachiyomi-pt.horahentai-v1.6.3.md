# Extension Validation Report

- Extension: tachiyomi-pt.horahentai-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: A Aprovação da Vovó (`.../a-aprovacao-da-vovo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | A Aprovação da Vovó (`.../a-aprovacao-da-vovo`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | A Fantasia Amarela: A Professora do Nelson (`.../a-fantasia-amarela-a-professora-do-nelson`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Safadeza Em Andamento (`.../safadeza-em-andamento`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Introdução a Ejaculação Feminina (`.../introducao-a-ejaculacao-feminina`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Aprovação da Vovó (`.../a-aprovacao-da-vovo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Aprovação da Vovó (`.../a-aprovacao-da-vovo`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo (`.../a-aprovacao-da-vovo`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Aprovação da Vovó, URL=`.../a-aprovacao-da-vovo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=A Aprovação da Vovó, URL=`.../a-aprovacao-da-vovo` at page 1 offsets 0, 27 and page 2 offset 27, title=O Café da Manhã, URL=`.../o-cafe-da-manha` at page 1 offsets 1, 26 and page 2 offset 26, title=Anne, URL=`.../anne` at page 1 offsets 2, 28 and page 2 offset 28, title=A Fantasia Amarela: A Lista, URL=`.../a-fantasia-amarela-a-lista` at page 1 offsets 6, 29 and page 2 offset 29, title=Compartilhar É Cuidar, URL=`.../compartilhar-e-cuidar` at page 1 offsets 12, 25 and page 2 offset 25, title=Enxergando Vermelho, URL=`.../enxergando-vermelho` at page 1 offsets 19, 24 and page 2 offset 24, title=Dobrando Aço, URL=`.../dobrando-aco` at page 1 offset 20 and page 2 offset 20, title=A Confissão de Wendy, URL=`.../a-confissao-de-wendy` at page 1 offset 21 and page 2 offset 21, title=Treinamento Da Cheelai ~ Parte 1, URL=`.../treinamento-da-cheelai-parte-1` at page 1 offset 22 and page 2 offset 22, title=Amostrado, URL=`.../amostrado` at page 1 offset 23 and page 2 offsets 1, 23 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Dobrando Aço, URL=`.../dobrando-aco` at page 1 offsets 1, 20 and page 2 offset 20, title=A Confissão de Wendy, URL=`.../a-confissao-de-wendy` at page 1 offsets 12, 21 and page 2 offset 21, title=Treinamento Da Cheelai ~ Parte 1, URL=`.../treinamento-da-cheelai-parte-1` at page 1 offset 22 and page 2 offsets 3, 22, title=Amostrado, URL=`.../amostrado` at page 1 offset 23 and page 2 offset 23, title=Enxergando Vermelho, URL=`.../enxergando-vermelho` at page 1 offset 24 and page 2 offset 24, title=Compartilhar É Cuidar, URL=`.../compartilhar-e-cuidar` at page 1 offset 25 and page 2 offset 25, title=O Café da Manhã, URL=`.../o-cafe-da-manha` at page 1 offset 26 and page 2 offset 26, title=A Aprovação da Vovó, URL=`.../a-aprovacao-da-vovo` at page 1 offset 27 and page 2 offset 27, title=Anne, URL=`.../anne` at page 1 offset 28 and page 2 offset 28, title=A Fantasia Amarela: A Lista, URL=`.../a-fantasia-amarela-a-lista` at page 1 offset 29 and page 2 offset 29 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 6 manga entries; Popular page 2 repeats 1 manga entry: title=Amostrado, URL=`.../amostrado`; Latest page 1 repeats 2 manga entries: title=Dobrando Aço, URL=`.../dobrando-aco`, title=A Confissão de Wendy, URL=`.../a-confissao-de-wendy`; Latest page 2 repeats 1 manga entry: title=Treinamento Da Cheelai ~ Parte 1, URL=`.../treinamento-da-cheelai-parte-1` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://horahentai.com/.../001-53-360x500.jpg` (image/jpeg, 44702 bytes, 360x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-aprovacao-da-vovo` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://horahentai.com/.../001-53-722x1024.jpg` (image/jpeg, 119767 bytes, 722x1024) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comics, Ahegao, Aréolas Grandes, Boquete, Bunda Grande, Colorido, Creampie, MILF, Netorare, Óculos, Pau Grande, Peitões, Raio-X |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Para celebrar o compromisso de sua neta, a avó de Ayase convida o rapaz para uma noite de bebidas. O problema é que, quando a bebida sobe à cabeça, a senhora revela um lado extremamente libertino e provocante. Aproveitando o estado alterado pelo álcool, o jovem acaba se envolvendo em um encontro carnal inesperado com a futura sogra. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://horahentai.com/.../001-53.jpg` (image/jpeg, 359793 bytes, 1280x1816) |  |  |  |
