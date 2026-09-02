# Extension Validation Report

- Extension: tachiyomi-pt.horahentai-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
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
- Selected manga input: popular offset 0: Pedi Um Serviço de Acompanhante e Quem Apareceu Foi a Mãe da Minha Ex (`.../pedi-um-servico-de-acompanhante-e-quem-apareceu-foi-a-mae-da-minha-ex`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Pedi Um Serviço de Acompanhante e Quem Apareceu Foi a Mãe da Minha Ex (`.../pedi-um-servico-de-acompanhante-e-quem-apareceu-foi-a-mae-da-minha-ex`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | A Mãe do Meu Amigo - Como Ela É Peituda, Vou Tentar Foder Ela (`.../a-mae-do-meu-amigo-como-ela-e-peituda-vou-tentar-foder-ela`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | A História de Como Acabei Morando Com a Minha Mãe no Meu Quarto de 4 Tatames e Meio (`.../a-historia-de-como-acabei-morando-com-a-minha-mae-no-meu-quarto-de-4-tatames-e-meio`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Pedi Um Serviço de Acompanhante e Quem Apareceu Foi a Mãe da Minha Ex (`.../pedi-um-servico-de-acompanhante-e-quem-apareceu-foi-a-mae-da-minha-ex`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Pedi Um Serviço de Acompanhante e Quem Apareceu Foi a Mãe da Minha Ex (`.../pedi-um-servico-de-acompanhante-e-quem-apareceu-foi-a-mae-da-minha-ex`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Pedi Um Serviço de Acompanhante e Quem Apareceu Foi a Mãe da Minha Ex (`.../pedi-um-servico-de-acompanhante-e-quem-apareceu-foi-a-mae-da-minha-ex`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo (`.../pedi-um-servico-de-acompanhante-e-quem-apareceu-foi-a-mae-da-minha-ex`) |  | <1s |
| pages | `getPageList(chapter)` | success | 61 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pedi Um Serviço de Acompanhante e Quem Apareceu Foi a Mãe da Minha Ex, URL=`.../pedi-um-servico-de-acompanhante-e-quem-apareceu-foi-a-mae-da-minha-ex` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=A Fantasia Amarela: Annika Van Houten, URL=`.../fantasia-amarela-annika-van-houten` at page 1 offsets 1, 25 and page 2 offset 25, title=A Fantasia Amarela: Fases da Vida, URL=`.../a-fantasia-amarela-fases-da-vida` at page 1 offsets 2, 24 and page 2 offset 24, title=O Segredo Pervertido do Hokage, URL=`.../o-segredo-pervertido-do-hokage` at page 1 offsets 5, 22 and page 2 offset 22, title=Acordado e Ativo!, URL=`.../acordado-e-ativo` at page 1 offsets 9, 27 and page 2 offset 27, title=Anne, URL=`.../anne` at page 1 offsets 10, 20 and page 2 offset 20, title=A Fantasia Amarela: A Professora do Nelson, URL=`.../a-fantasia-amarela-a-professora-do-nelson` at page 1 offsets 14, 23 and page 2 offset 23, title=A Fantasia Amarela: A Lista, URL=`.../a-fantasia-amarela-a-lista` at page 1 offsets 17, 21 and page 2 offset 21, title=Bruxas da Noite, URL=`.../bruxas-da-noite` at page 1 offset 26 and page 2 offsets 12, 26, title=O Caminho Para El Dorado: O Início da Miscigenação, URL=`.../o-caminho-para-el-dorado-o-inicio-da-miscigenacao` at page 1 offset 28 and page 2 offsets 6, 28, title=A Fantasia Amarela: O Reencontro, URL=`.../a-fantasia-amarela-o-reencontro` at page 1 offset 29 and page 2 offset 29 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Anne, URL=`.../anne` at page 1 offsets 18, 20 and page 2 offset 20, title=A Fantasia Amarela: A Lista, URL=`.../a-fantasia-amarela-a-lista` at page 1 offset 21 and page 2 offsets 11, 21, title=O Segredo Pervertido do Hokage, URL=`.../o-segredo-pervertido-do-hokage` at page 1 offset 22 and page 2 offset 22, title=A Fantasia Amarela: A Professora do Nelson, URL=`.../a-fantasia-amarela-a-professora-do-nelson` at page 1 offset 23 and page 2 offset 23, title=A Fantasia Amarela: Fases da Vida, URL=`.../a-fantasia-amarela-fases-da-vida` at page 1 offset 24 and page 2 offset 24, title=A Fantasia Amarela: Annika Van Houten, URL=`.../fantasia-amarela-annika-van-houten` at page 1 offset 25 and page 2 offset 25, title=Bruxas da Noite, URL=`.../bruxas-da-noite` at page 1 offset 26 and page 2 offset 26, title=Acordado e Ativo!, URL=`.../acordado-e-ativo` at page 1 offset 27 and page 2 offset 27, title=O Caminho Para El Dorado: O Início da Miscigenação, URL=`.../o-caminho-para-el-dorado-o-inicio-da-miscigenacao` at page 1 offset 28 and page 2 offset 28, title=A Fantasia Amarela: O Reencontro, URL=`.../a-fantasia-amarela-o-reencontro` at page 1 offset 29 and page 2 offset 29 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 7 manga entries; Popular page 2 repeats 2 manga entries: title=O Caminho Para El Dorado: O Início da Miscigenação, URL=`.../o-caminho-para-el-dorado-o-inicio-da-miscigenacao`, title=Bruxas da Noite, URL=`.../bruxas-da-noite`; Latest page 1 repeats 1 manga entry: title=Anne, URL=`.../anne`; Latest page 2 repeats 1 manga entry: title=A Fantasia Amarela: A Lista, URL=`.../a-fantasia-amarela-a-lista` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://horahentai.com/.../1-65-360x500.jpg` (image/jpeg, 49520 bytes, 360x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pedi-um-servico-de-acompanhante-e-quem-apareceu-foi-a-mae-da-minha-ex` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://horahentai.com/.../1-65-725x1024.jpg` (image/jpeg, 146430 bytes, 725x1024) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Doujinshi, Hentai, Ahegao, Aréolas Grandes, Beijando, Boquete, Camisinha, Creampie, Masturbação, MILF, Pau Grande, Peitões, Pelos Pubianos, Prostituição, Raio-X |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Após terminar seu relacionamento atual, este jovem decide chamar uma acompanhante para sua casa para satisfazer seus desejos. O que ele não esperava era que a mulher contratada fosse sua própria ex-sogra, e que ela estivesse pronta para deixá-lo completamente sem fôlego. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 61 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://horahentai.com/.../1-65.jpg` (image/jpeg, 478995 bytes, 1280x1808) |  |  |  |
