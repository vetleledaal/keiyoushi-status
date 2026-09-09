# Extension Validation Report

- Extension: tachiyomi-pt.hentaitokyo-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 1
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gattsu
- Source ID: 7059984733794571635
- Source name: Hentai Tokyo
- Source language: pt-BR
- Selected manga input: popular offset 0: Amigos de Bebedeira! (`.../amigos-de-bebedeira`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 26 | Amigos de Bebedeira! (`.../amigos-de-bebedeira`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 26 | Eu Ainda Te Amo ~ Minha Ex Virou uma Idol Gravure Peituda e Me Seduz com Sexo Adúltero Live Action (`.../eu-ainda-te-amo-minha-ex-virou-uma-idol-gravure-peituda-e-me-seduz-com-sexo-adultero-live-action`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 26 | Amigos de Bebedeira! (`.../amigos-de-bebedeira`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 26 | Eu Ainda Te Amo ~ Minha Ex Virou uma Idol Gravure Peituda e Me Seduz com Sexo Adúltero Live Action (`.../eu-ainda-te-amo-minha-ex-virou-uma-idol-gravure-peituda-e-me-seduz-com-sexo-adultero-live-action`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Amigos de Bebedeira! (`.../amigos-de-bebedeira`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Amigos de Bebedeira! (`.../amigos-de-bebedeira`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo único (`.../amigos-de-bebedeira`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 76 |  |  | 1-10s |

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
| popular listing | PASS | 26 entries |  |  |  |
| latest listing | PASS | 26 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Amigos de Bebedeira!, URL=`.../amigos-de-bebedeira` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Já Que Eu Vou Morrer, Faça O Que Bem Quiser Comigo, URL=`.../ja-que-eu-vou-morrer-faca-o-que-bem-quiser-comigo` at page 1 offsets 5, 16 and page 2 offset 16, title=Eu Ainda Te Amo ~ Minha Ex Virou uma Idol Gravure Peituda e Me Seduz com Sexo Adúltero, URL=`.../eu-ainda-te-amo-minha-ex-virou-uma-idol-gravure-peituda-e-me-seduz-com-sexo-adultero` at page 1 offsets 15, 17 and page 2 offset 17, title=Sedução Familiar 4 ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Da Sua Verdadeira Face ~, URL=`.../seducao-familiar-4-os-segredos-ocultos-da-tia-kaoru-edicao-da-sua-verdadeira-face` at page 1 offset 18 and page 2 offsets 5, 18, title=Sedução Familiar 3 ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Da Educação Sexual, URL=`.../seducao-familiar-3-os-segredos-ocultos-da-tia-kaoru-edicao-da-educacao-sexual` at page 1 offset 19 and page 2 offsets 6, 19, title=Sedução Familiar ~ Os Segredos Ocultos da Tia Kaoru ~ Episódio 2: O Ponto Fraco, URL=`.../seducao-familiar-os-segredos-ocultos-da-tia-kaoru-episodio-2-o-ponto-fraco` at page 1 offset 20 and page 2 offsets 7, 20, title=Sedução Familiar ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Lingerie Erótica, URL=`.../seducao-familiar-os-segredos-ocultos-da-tia-kaoru-edicao-lingerie-erotica` at page 1 offset 21 and page 2 offsets 8, 21, title=Mães São Mulheres Também! 6, URL=`.../maes-sao-mulheres-tambem-6` at page 1 offset 22 and page 2 offsets 11, 22, title=Meu Dia A Dia Com Minha Nova Madrasta Super Erótica., URL=`.../meu-dia-a-dia-com-minha-nova-madrasta-super-erotica` at page 1 offset 23 and page 2 offset 23, title=A Veterana Gyaru Que Fugiu de Casa Me Deixa Foder Ela Facinho 6, URL=`.../a-veterana-gyaru-que-fugiu-de-casa-me-deixa-foder-ela-facinho-6` at page 1 offset 24 and page 2 offset 24, title=Eu, Um Universitário, Acabei Gozando Sem Camisinha Enquanto a Síndica Gyaru Negra (35) Me Cavalgava, URL=`.../eu-um-universitario-acabei-gozando-sem-camisinha-enquanto-a-sindica-gyaru-negra-35-me-cavalgava` at page 1 offset 25 and page 2 offset 25 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Já Que Eu Vou Morrer, Faça O Que Bem Quiser Comigo, URL=`.../ja-que-eu-vou-morrer-faca-o-que-bem-quiser-comigo` at page 1 offsets 5, 16 and page 2 offset 16, title=Eu Ainda Te Amo ~ Minha Ex Virou uma Idol Gravure Peituda e Me Seduz com Sexo Adúltero, URL=`.../eu-ainda-te-amo-minha-ex-virou-uma-idol-gravure-peituda-e-me-seduz-com-sexo-adultero` at page 1 offsets 15, 17 and page 2 offset 17, title=Sedução Familiar 4 ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Da Sua Verdadeira Face ~, URL=`.../seducao-familiar-4-os-segredos-ocultos-da-tia-kaoru-edicao-da-sua-verdadeira-face` at page 1 offset 18 and page 2 offsets 5, 18, title=Sedução Familiar 3 ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Da Educação Sexual, URL=`.../seducao-familiar-3-os-segredos-ocultos-da-tia-kaoru-edicao-da-educacao-sexual` at page 1 offset 19 and page 2 offsets 6, 19, title=Sedução Familiar ~ Os Segredos Ocultos da Tia Kaoru ~ Episódio 2: O Ponto Fraco, URL=`.../seducao-familiar-os-segredos-ocultos-da-tia-kaoru-episodio-2-o-ponto-fraco` at page 1 offset 20 and page 2 offsets 7, 20, title=Sedução Familiar ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Lingerie Erótica, URL=`.../seducao-familiar-os-segredos-ocultos-da-tia-kaoru-edicao-lingerie-erotica` at page 1 offset 21 and page 2 offsets 8, 21, title=Mães São Mulheres Também! 6, URL=`.../maes-sao-mulheres-tambem-6` at page 1 offset 22 and page 2 offsets 11, 22, title=Meu Dia A Dia Com Minha Nova Madrasta Super Erótica., URL=`.../meu-dia-a-dia-com-minha-nova-madrasta-super-erotica` at page 1 offset 23 and page 2 offset 23, title=A Veterana Gyaru Que Fugiu de Casa Me Deixa Foder Ela Facinho 6, URL=`.../a-veterana-gyaru-que-fugiu-de-casa-me-deixa-foder-ela-facinho-6` at page 1 offset 24 and page 2 offset 24, title=Eu, Um Universitário, Acabei Gozando Sem Camisinha Enquanto a Síndica Gyaru Negra (35) Me Cavalgava, URL=`.../eu-um-universitario-acabei-gozando-sem-camisinha-enquanto-a-sindica-gyaru-negra-35-me-cavalgava` at page 1 offset 25 and page 2 offset 25 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 2 manga entries: title=Já Que Eu Vou Morrer, Faça O Que Bem Quiser Comigo, URL=`.../ja-que-eu-vou-morrer-faca-o-que-bem-quiser-comigo`, title=Eu Ainda Te Amo ~ Minha Ex Virou uma Idol Gravure Peituda e Me Seduz com Sexo Adúltero, URL=`.../eu-ainda-te-amo-minha-ex-virou-uma-idol-gravure-peituda-e-me-seduz-com-sexo-adultero`; Popular page 2 repeats 5 manga entries; Latest page 1 repeats 2 manga entries: title=Já Que Eu Vou Morrer, Faça O Que Bem Quiser Comigo, URL=`.../ja-que-eu-vou-morrer-faca-o-que-bem-quiser-comigo`, title=Eu Ainda Te Amo ~ Minha Ex Virou uma Idol Gravure Peituda e Me Seduz com Sexo Adúltero, URL=`.../eu-ainda-te-amo-minha-ex-virou-uma-idol-gravure-peituda-e-me-seduz-com-sexo-adultero`; Latest page 2 repeats 5 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaitokyo.net/.../001-6-360x500.jpg` (image/jpeg, 42715 bytes, 360x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../amigos-de-bebedeira` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaitokyo.net/.../001-6.jpg` (image/jpeg, 442534 bytes, 1280x1780) |  |  |  |
| details author | PASS | Login |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boquete, Creampie, Masturbação, Meia-Calça, Paizuri, Pau Grande, Peitões, Raio-X |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Para ajudar Gojo a superar uma rejeição, seus amigos decidem sair para beber. A noite toma um rumo inesperado quando Mitarai, após exagerar no álcool, decide que a melhor forma de animar o amigo é através de uma abordagem íntima e intensa. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 76 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hentaitokyo.net/.../001-6.jpg` (image/jpeg, 442534 bytes, 1280x1780) |  |  |  |
