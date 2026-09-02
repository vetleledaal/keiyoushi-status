# Extension Validation Report

- Extension: tachiyomi-pt.hentaitokyo-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 1
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7059984733794571635
- Source name: Hentai Tokyo
- Source language: pt-BR
- Selected manga input: latest offset 0: Não Tem Como Um Cara Impopular Como Eu, Recusar Um Convite Desses 2 (`.../nao-tem-como-um-cara-impopular-como-eu-recusar-um-convite-desses-2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 26 | Não Tem Como Um Cara Impopular Como Eu, Recusar Um Convite Desses 2 (`.../nao-tem-como-um-cara-impopular-como-eu-recusar-um-convite-desses-2`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 26 | Sendo Agiota de uma Garota Gyaru Folgada em Troca de Favores 2 (`.../sendo-agiota-de-uma-garota-gyaru-folgada-em-troca-de-favores-2`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 26 | Não Tem Como Um Cara Impopular Como Eu, Recusar Um Convite Desses 2 (`.../nao-tem-como-um-cara-impopular-como-eu-recusar-um-convite-desses-2`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 26 | Sendo Agiota de uma Garota Gyaru Folgada em Troca de Favores 2 (`.../sendo-agiota-de-uma-garota-gyaru-folgada-em-troca-de-favores-2`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Não Tem Como Um Cara Impopular Como Eu, Recusar Um Convite Desses 2 (`.../nao-tem-como-um-cara-impopular-como-eu-recusar-um-convite-desses-2`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Não Tem Como Um Cara Impopular Como Eu, Recusar Um Convite Desses 2 (`.../nao-tem-como-um-cara-impopular-como-eu-recusar-um-convite-desses-2`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo único (`.../nao-tem-como-um-cara-impopular-como-eu-recusar-um-convite-desses-2`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 47 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Não Tem Como Um Cara Impopular Como Eu, Recusar Um Convite Desses 2, URL=`.../nao-tem-como-um-cara-impopular-como-eu-recusar-um-convite-desses-2` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Eu Ainda Te Amo ~ Minha Ex Virou uma Idol Gravure Peituda e Me Seduz com Sexo Adúltero, URL=`.../eu-ainda-te-amo-minha-ex-virou-uma-idol-gravure-peituda-e-me-seduz-com-sexo-adultero` at page 1 offsets 5, 16 and page 2 offset 16, title=Sedução Familiar 4 ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Da Sua Verdadeira Face ~, URL=`.../seducao-familiar-4-os-segredos-ocultos-da-tia-kaoru-edicao-da-sua-verdadeira-face` at page 1 offsets 11, 17 and page 2 offset 17, title=Sedução Familiar 3 ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Da Educação Sexual, URL=`.../seducao-familiar-3-os-segredos-ocultos-da-tia-kaoru-edicao-da-educacao-sexual` at page 1 offsets 12, 18 and page 2 offset 18, title=Sedução Familiar ~ Os Segredos Ocultos da Tia Kaoru ~ Episódio 2: O Ponto Fraco, URL=`.../seducao-familiar-os-segredos-ocultos-da-tia-kaoru-episodio-2-o-ponto-fraco` at page 1 offsets 13, 19 and page 2 offset 19, title=Sedução Familiar ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Lingerie Erótica, URL=`.../seducao-familiar-os-segredos-ocultos-da-tia-kaoru-edicao-lingerie-erotica` at page 1 offsets 14, 20 and page 2 offset 20, title=Mães São Mulheres Também! 6, URL=`.../maes-sao-mulheres-tambem-6` at page 1 offset 21 and page 2 offsets 1, 21, title=Meu Dia A Dia Com Minha Nova Madrasta Super Erótica., URL=`.../meu-dia-a-dia-com-minha-nova-madrasta-super-erotica` at page 1 offset 22 and page 2 offsets 7, 22, title=A Veterana Gyaru Que Fugiu de Casa Me Deixa Foder Ela Facinho 6, URL=`.../a-veterana-gyaru-que-fugiu-de-casa-me-deixa-foder-ela-facinho-6` at page 1 offset 23 and page 2 offsets 12, 23, title=Eu, Um Universitário, Acabei Gozando Sem Camisinha Enquanto a Síndica Gyaru Negra (35) Me Cavalgava, URL=`.../eu-um-universitario-acabei-gozando-sem-camisinha-enquanto-a-sindica-gyaru-negra-35-me-cavalgava` at page 1 offset 24 and page 2 offsets 15, 24, title=A Veterana Gyaru Que Fugiu de Casa Me Deixa Foder Ela Facinho 5, URL=`.../a-veterana-gyaru-que-fugiu-de-casa-me-deixa-foder-ela-facinho-5` at page 1 offset 25 and page 2 offset 25 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Eu Ainda Te Amo ~ Minha Ex Virou uma Idol Gravure Peituda e Me Seduz com Sexo Adúltero, URL=`.../eu-ainda-te-amo-minha-ex-virou-uma-idol-gravure-peituda-e-me-seduz-com-sexo-adultero` at page 1 offsets 5, 16 and page 2 offset 16, title=Sedução Familiar 4 ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Da Sua Verdadeira Face ~, URL=`.../seducao-familiar-4-os-segredos-ocultos-da-tia-kaoru-edicao-da-sua-verdadeira-face` at page 1 offsets 11, 17 and page 2 offset 17, title=Sedução Familiar 3 ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Da Educação Sexual, URL=`.../seducao-familiar-3-os-segredos-ocultos-da-tia-kaoru-edicao-da-educacao-sexual` at page 1 offsets 12, 18 and page 2 offset 18, title=Sedução Familiar ~ Os Segredos Ocultos da Tia Kaoru ~ Episódio 2: O Ponto Fraco, URL=`.../seducao-familiar-os-segredos-ocultos-da-tia-kaoru-episodio-2-o-ponto-fraco` at page 1 offsets 13, 19 and page 2 offset 19, title=Sedução Familiar ~ Os Segredos Ocultos da Tia Kaoru ~ Edição Lingerie Erótica, URL=`.../seducao-familiar-os-segredos-ocultos-da-tia-kaoru-edicao-lingerie-erotica` at page 1 offsets 14, 20 and page 2 offset 20, title=Mães São Mulheres Também! 6, URL=`.../maes-sao-mulheres-tambem-6` at page 1 offset 21 and page 2 offsets 1, 21, title=Meu Dia A Dia Com Minha Nova Madrasta Super Erótica., URL=`.../meu-dia-a-dia-com-minha-nova-madrasta-super-erotica` at page 1 offset 22 and page 2 offsets 7, 22, title=A Veterana Gyaru Que Fugiu de Casa Me Deixa Foder Ela Facinho 6, URL=`.../a-veterana-gyaru-que-fugiu-de-casa-me-deixa-foder-ela-facinho-6` at page 1 offset 23 and page 2 offsets 12, 23, title=Eu, Um Universitário, Acabei Gozando Sem Camisinha Enquanto a Síndica Gyaru Negra (35) Me Cavalgava, URL=`.../eu-um-universitario-acabei-gozando-sem-camisinha-enquanto-a-sindica-gyaru-negra-35-me-cavalgava` at page 1 offset 24 and page 2 offsets 15, 24, title=A Veterana Gyaru Que Fugiu de Casa Me Deixa Foder Ela Facinho 5, URL=`.../a-veterana-gyaru-que-fugiu-de-casa-me-deixa-foder-ela-facinho-5` at page 1 offset 25 and page 2 offset 25 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 5 manga entries; Popular page 2 repeats 4 manga entries; Latest page 1 repeats 5 manga entries; Latest page 2 repeats 4 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaitokyo.net/.../01-4-360x500.jpg` (image/jpeg, 38587 bytes, 360x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../nao-tem-como-um-cara-impopular-como-eu-recusar-um-convite-desses-2` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaitokyo.net/.../01-4.jpg` (image/jpeg, 453064 bytes, 1280x1838) |  |  |  |
| details author | PASS | Login |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ahegao, Boquete, Colegial, Creampie, Maiô, Peitões, Raio-X, Suor |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Yuzushiro-san não conhece limites quando o assunto é ousadia, e seu novo desafio para Miyamori é o mais arriscado até agora. O plano? Uma sessão de prazer nos vestiários do clube de natação. O problema é que o risco de serem flagrados por qualquer membro da equipe é real, transformando cada segundo em um jogo perigoso entre o desejo e o medo de serem descobertos. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hentaitokyo.net/.../01-4.jpg` (image/jpeg, 453064 bytes, 1280x1838) |  |  |  |
