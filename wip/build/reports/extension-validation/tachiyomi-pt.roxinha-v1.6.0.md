# Extension Validation Report

- Extension: tachiyomi-pt.roxinha-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3961079268907869519
- Source name: Roxinha
- Source language: pt-BR
- Selected manga input: popular offset 0: Criando Vilões da Maneira Correta (`.../65`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Criando Vilões da Maneira Correta (`.../65`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Sobrevivência do Gênio com Tempo de Vida Limitado (`.../223`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Reverência Eterna (`.../3511`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Demônio Celestial Quer Viver em Paz (`.../1366`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Criando Vilões da Maneira Correta (`.../65`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Criando Vilões da Maneira Correta (`.../65`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 61 | Capítulo 1 (`.../4885`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Você precisa estar logado para acessar este conteúdo. Informe o e-mail e a senha da sua conta da Roxinha para ler os capítulos | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Você precisa estar logado para acessar este conteúdo. Informe o e-mail e a senha da sua conta da Roxinha para ler os capítulos | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Criando Vilões da Maneira Correta, URL=`65` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://roxinha.online/.../1770943172404-536749722.png` (image/png, 2123363 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `65` |  |  |  |
| details thumbnail URL | PASS | `https://roxinha.online/.../1770943172404-536749722.png` |  |  |  |
| details author | PASS | LICO, Bomhanbangul |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasia, Ação, Aventura, Drama, Suspense, Psicológico, Sobrenatural, Thriller, Seinen, Magia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Em um giro inesperado do destino, eu, um escravo corporativo exausto, me encontro inesperadamente no corpo de um nobre dentro de um jogo que parecia ser minha única fuga da rotina monótona. No entanto, minha alegria é breve, pois logo descubro que estou fadado a ser um mero figurante, condenado a um trágico fim nas mãos dos futuros vilões que se erguerão nesse mundo virtual. Mas, e se eu pudesse mudar esse destino? E se, em vez de ser uma vítima, eu pudesse me tornar o arquiteto do caos, criando os próprios vilões que um dia me ameaçariam? Uma jornada sinuosa de poder, intriga e redenção começa, desafiando as regras do jogo e reescrevendo o curso da história. Será que conseguirei subverter meu destino e emergir como o verdadeiro mestre desse mundo de fantasia, ou sucumbirei às sombras do meu próprio passado? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 61 chapters |  |  |  |
| chapter dates | PASS | 61 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Você precisa estar logado para acessar este conteúdo. Informe o e-mail e a senha da sua conta da Roxinha para ler os capítulos |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
