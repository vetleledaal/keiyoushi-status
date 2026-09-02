# Extension Validation Report

- Extension: tachiyomi-pt.mangalivreto-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1281902081932329042
- Source name: Manga Livre.to
- Source language: pt-BR
- Selected manga input: popular offset 0: Chainsaw Man (`.../461`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Chainsaw Man (`.../461`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Reincarnation of the Fist King (`.../413`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Madrasta vem primeiro (Sem Censura) (`.../2192`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Pensando nos Desejos Sexuais do Irmão Mais Novo 2 (`.../975`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Chainsaw Man (`.../461`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chainsaw Man (`.../461`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 238 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 53 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chainsaw Man, URL=`461` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangalivre.to/.../Chainsaw-Man-350x476.webp` (image/webp (encoding: lossy), 40922 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `461` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangalivre.to/.../Chainsaw-Man-193x278.webp` (image/webp (encoding: lossy), 18340 bytes, 193x278) |  |  |  |
| details author | PASS | Fujimoto, Tatsuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Aventura, Demônios, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Chainsaw Man, de Tatsuki Fujimoto, é um dos mangás mais impactantes da última década. Misturando ação intensa, horror psicológico e crítica social, a obra cativa pela sua originalidade e personagens fora do comum. Se você busca um mangá que fuja do convencional, com momentos chocantes e desenvolvimento narrativo instigante, essa é a escolha certa.<br><br>Denji é um jovem caçador de demônios que vive em condições miseráveis, tentando pagar uma dívida herdada de seu falecido pai. Seu único companheiro é Pochita, um cão-demônio motosserra. Após ser traído e morto, Denji renasce ao se fundir com Pochita, tornando-se o Chainsaw Man — um híbrido capaz de destruir demônios com lâminas que brotam de seu corpo.<br><br>Agora sob o comando da enigmática Makima e trabalhando para a Segurança Pública, Denji precisa lutar por sua sobrevivência em um mundo cruel, onde cada aliado pode esconder intenções sombrias.<br><br>Você pode ler Chainsaw Man online em português gratuitamente no Manga Livre. O site oferece capítulos atualizados com tradução de qualidade, leitura fluida e organização por volumes, ideal para acompanhar a saga completa de Denji e seus confrontos brutais.<br><br>Se você gosta de acompanhar histórias em capítulos e conteúdos que evoluem dia após dia, como mangás e animes, também existem outras formas de entretenimento digital que funcionam de maneira contínua.<br><br>Muitas pessoas também utilizam plataformas para assistir filmes, séries e animes online. Um exemplo é o Multicanais, onde é possível acompanhar diversos canais com conteúdos de entretenimento em streaming pela internet.<br><br>🔗 Leitura recomendada:<br><br>Nomes alternativos: チェンソーマン (Chensō Man) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 238 chapters |  |  |  |
| chapter dates | PASS | 238 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangalivre.to/.../001.webp` (image/webp (container: extended), 152888 bytes, 883x918) |  |  |  |
