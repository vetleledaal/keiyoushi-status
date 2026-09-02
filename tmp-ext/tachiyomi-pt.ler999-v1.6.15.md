# Extension Validation Report

- Extension: tachiyomi-pt.ler999-v1.6.15
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 11864058740306611
- Source name: Ler 999
- Source language: pt-BR
- Selected manga input: popular offset 0: What Level Are You, How Dare You Pretend in Front of My Seven Senior Sisters (`.../what-level-are-you-how-dare-you-pretend.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 7 | What Level Are You, How Dare You Pretend in Front of My Seven Senior Sisters (`.../what-level-are-you-how-dare-you-pretend.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 7 | What Level Are You, How Dare You Pretend in Front of My Seven Senior Sisters (`.../what-level-are-you-how-dare-you-pretend.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | What Level Are You, How Dare You Pretend in Front of My Seven Senior Sisters (`.../what-level-are-you-how-dare-you-pretend.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | What Level Are You, How Dare You Pretend in Front of My Seven Senior Sisters (`.../what-level-are-you-how-dare-you-pretend.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Chapter 00 (`.../chapter-00.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 7 entries |  |  |  |
| latest listing | PASS | 7 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=What Level Are You, How Dare You Pretend in Front of My Seven Senior Sisters, URL=`.../what-level-are-you-how-dare-you-pretend.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 15/15 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 15/15 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../What%20Level%20Are%20You,%20How%20Dare%20You%20Pretend%20in%20Front%20of%20My%20Seven%20Senior%20Sisters.jpg` (image/jpeg, 104637 bytes, 288x412) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../what-level-are-you-how-dare-you-pretend.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../What%20Level%20Are%20You,%20How%20Dare%20You%20Pretend%20in%20Front%20of%20My%20Seven%20Senior%20Sisters.jpg` (image/jpeg, 104637 bytes, 288x412) |  |  |  |
| details author | PASS | 奇想漫画 |  |  |  |
| details artist | PASS | 奇想漫画 |  |  |  |
| details genres | PASS | Action, Harem, Martial Arts, Romance, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Aos dois anos de idade, Chu Ming foi adotado por uma seita oculta com sete grandes mestres. Ao longo dos seus dezoito anos, ele dominou as habilidades únicas de todos os sete mestres. Assim que Chu Ming se acostumou com sua vida isolada e pensou que poderia desfrutar de uma existência pacífica mas montanhas, seus mestres o instruíram, em seu vigésimo aniversário, a descer a montanha e procurar suas sete irmãs mais velhas que haviam passado por suas próprias provações no mundo mortal. Isso tudo com o intuito de estender a influência da seita no mundo. Obedecendo relutantemente ao comando dos mestres, Chu Ming embarcou em uma jornada para encontrar as sete lindas irmãs mais velhas. Agora com a aparição de Chu Ming, o mundo calmo foi perturbado como uma pedra atirada na água, criando ondas ilimitadas. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../001.jpg` (image/jpeg, 2179918 bytes, 800x14814) |  |  |  |
