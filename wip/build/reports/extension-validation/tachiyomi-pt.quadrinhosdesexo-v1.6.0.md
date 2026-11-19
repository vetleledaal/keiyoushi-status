# Extension Validation Report

- Extension: tachiyomi-pt.quadrinhosdesexo-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3633164010012574936
- Source name: Quadrinhos de Sexo
- Source language: pt-BR
- Selected manga input: popular offset 0: Uns Poucos Pecados – Parte 3 (`.../uns-poucos-pecados-parte-3`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Uns Poucos Pecados – Parte 3 (`.../uns-poucos-pecados-parte-3`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Kinkymation – Sweet Tooth (`.../kinkymation-sweet-tooth`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Uns Poucos Pecados – Parte 3 (`.../uns-poucos-pecados-parte-3`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo Único (`.../uns-poucos-pecados-parte-3`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets.quadrinhosdesexo.com/.../UNS-POUCOS-PECADOS-PARTE-3.jpg` (image/jpeg, 17240 bytes, 260x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `uns-poucos-pecados-parte-3` |  |  |  |
| details thumbnail URL | PASS | `https://assets.quadrinhosdesexo.com/.../UNS-POUCOS-PECADOS-PARTE-3.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comics Porno, Contos Eróticos, Hentai, HQ De Sexo |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A morena prossegue com sua confissão no confessionário escuro, o ar carregado de incenso e tensão palpável, enquanto o padre ouve em silêncio, as mãos cruzadas sobre o colo. De repente, ela nota o volume proeminente sob a batina dele, uma ereção inconfundível que trai sua suposta santidade. Seus olhos se arregalam por um instante, mas um sorriso malicioso curva seus lábios, e sem uma palavra, ela se ajoelha, erguendo a vestimenta sagrada para expor a rigidez pulsante.<br><br>Com uma fome voraz, ela envolve o pau do padre com a boca quente e úmida, sugando devagar no início, sentindo-o inchar ainda mais entre seus lábios. Ele solta um gemido baixo, as mãos tremendo ao segurar a grade do confessionário, e murmura roucamente: “Continue… continue a confissão, filha. Conte-me tudo, enquanto… ah… enquanto me agrada.” Ela obedece, as palavras saindo entre lambidas e sucções profundas, o som molhado ecoando no espaço confinado.<br><br>“Era um sábado ensolarado como veremos no Hentai HQ, padre, e eu estava indo ao mercado, vestida com uma saia curta que balançava ao vento, sentindo os olhares dos homens na rua”, ela começa, a voz abafada pelo ato, mas clara o suficiente para excitar ainda mais o ouvinte. “Passei em frente a um canteiro de obras barulhento, onde o encarregado, um homem musculoso e suado, com tatuagens nos braços, gritou algo vulgar, me chamando de ‘gostosa’ e piscando com um sorriso safado. Eu ignorei, erguendo o queixo e seguindo em frente, focada nas compras, mas no fundo, uma faísca de curiosidade se acendeu.”<br><br>Na volta, com as sacolas pesadas nos braços, ela sente a bexiga apertar e decide arriscar, aproximando-se do canteiro novamente. “Eu pedi ao encarregado se podia usar o banheiro improvisado ali, alegando urgência, e ele sorriu de forma predatória, guiando-me para uma cabana suja no fundo do terreno, longe dos olhares dos outros operários.” O padre geme mais alto, empurrando os quadris levemente para frente, incentivando-a a prosseguir tanto na narrativa quanto no prazer.<br><br>Lá dentro, no banheiro precário e fedorento, o homem tranca a porta atrás deles, os olhos flamejantes de desejo bruto. “Ele não perdeu tempo, padre… me empurrou contra a parede fria, rasgando minha calcinha com mãos ásperas e me penetrando com força, sem piedade, enquanto eu gritava e tentava lutar, mas meu corpo traidor respondia ao estupro selvagem.” Ela acelera o ritmo da boca no pau dele, sentindo-o pulsar próximo ao clímax, as palavras da confissão se misturando ao êxtase proibido do momento. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://assets.quadrinhosdesexo.com/.../1-10.jpg` (image/jpeg, 45690 bytes, 700x950) |  |  |  |
