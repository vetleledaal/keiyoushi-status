# Extension Validation Report

- Extension: tachiyomi-pt.hentaitokyo-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: Marmelada da Gyaru Baixinha (`.../marmelada-da-gyaru-baixinha`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 26 | Marmelada da Gyaru Baixinha (`.../marmelada-da-gyaru-baixinha`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 26 | Uma Mulher Divorciada e Uma Esposa Que Gosta de Dar Sermões: Vou Transformá-las Em Brinquedos Sexuais Maduros Com Histórias para Contar. (`.../uma-mulher-divorciada-e-uma-esposa-que-gosta-de-dar-sermoes-vou-transforma-las-em-brinquedos-sexuais-maduros-com-historias-para-contar`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Marmelada da Gyaru Baixinha (`.../marmelada-da-gyaru-baixinha`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Marmelada da Gyaru Baixinha (`.../marmelada-da-gyaru-baixinha`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../marmelada-da-gyaru-baixinha`) |  | <1s |
| pages | `getPageList(chapter)` | success | 64 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Marmelada da Gyaru Baixinha, URL=`.../marmelada-da-gyaru-baixinha` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Leve-Me Além dos Meus Limites, URL=`.../leve-me-alem-dos-meus-limites` at page 1 offsets 2, 16 and page 2 offset 16, title=A História de Como Comecei a Namorar Minha Amiga Peituda 4, URL=`.../a-historia-de-como-comecei-a-namorar-minha-amiga-peituda-4` at page 1 offsets 8, 17 and page 2 offset 17, title=A História de Como Comecei a Namorar Minha Amiga Peituda 3, URL=`.../a-historia-de-como-comecei-a-namorar-minha-amiga-peituda-3` at page 1 offsets 9, 18 and page 2 offset 18, title=A História de Como Comecei a Namorar Minha Amiga Peituda 2, URL=`.../a-historia-de-como-comecei-a-namorar-minha-amiga-peituda-2` at page 1 offsets 10, 19 and page 2 offset 19, title=A História de Como Comecei a Namorar Minha Amiga Peituda, URL=`.../a-historia-de-como-comecei-a-namorar-minha-amiga-peituda` at page 1 offsets 11, 20 and page 2 offset 20, title=Nós Somos Amigos Otakus, URL=`.../nos-somos-amigos-otakus` at page 1 offset 21 and page 2 offsets 3, 21, title=Um Encontro Chato Com Minha Garota Durona e Seus Segredos Escondidos 2, URL=`.../um-encontro-chato-com-minha-garota-durona-e-seus-segredos-escondidos-2` at page 1 offset 22 and page 2 offsets 10, 22, title=Um Encontro Chato Com Minha Garota Durona e Seus Segredos Escondidos, URL=`.../um-encontro-chato-com-minha-garota-durona-e-seus-segredos-escondidos` at page 1 offset 23 and page 2 offsets 11, 23, title=Minha Vida Sexual em Tóquio ~A Senhoria E Sua Filha 1, URL=`.../minha-vida-sexual-em-toquio-a-senhoria-e-sua-filha-1` at page 1 offset 24 and page 2 offset 24, title=O Quarto Que Você Não Pode Sair Até Que Ejacule, URL=`.../o-quarto-que-voce-nao-pode-sair-ate-que-ejacule` at page 1 offset 25 and page 2 offset 25 |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 5 manga entries; Popular page 2 repeats 3 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaitokyo.net/.../001-21-360x500.jpg` (image/jpeg, 61704 bytes, 360x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../marmelada-da-gyaru-baixinha` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaitokyo.net/.../001-21.jpg` (image/jpeg, 464014 bytes, 1254x1771) |  |  |  |
| details author | PASS | Login |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boquete, Camisinha, Creampie, Gyaru, Masturbação, Meia-Calça, Paizuri, Peitões |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Depois de uma primeira festa de confraternização marcante, Mikan Kigara assume a missão de mudar a perspectiva do protagonista. Ela quer mostrar que existe muito mais para se viver além das obrigações, conduzindo-o em uma jornada para aprender a relaxar e curtir cada instante sem tanta rigidez. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 64 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentaitokyo.net/.../2` to `https://hentaitokyo.net/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://hentaitokyo.net/.../001-21.jpg` (image/jpeg, 464014 bytes, 1254x1771) |  |  |  |
