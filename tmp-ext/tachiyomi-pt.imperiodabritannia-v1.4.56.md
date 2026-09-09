# Extension Validation Report

- Extension: tachiyomi-pt.imperiodabritannia-v1.4.56
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangotheme
- Source ID: 7355004027880350247
- Source name: Sagrado Império da Britannia
- Source language: pt-BR
- Selected manga input: latest offset 0: Torne-se o Herói Mais Forte Através do Sistema de Trapaça (`.../2679`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Imperador Demoníaco (`.../1404`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Torne-se o Herói Mais Forte Através do Sistema de Trapaça (`.../2679`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | É Ruim que o Protagonista Fique Imerso Demais no Personagem? (`.../2596`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Torne-se o Herói Mais Forte Através do Sistema de Trapaça (`.../2679 <redacted query values: slug>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Torne-se o Herói Mais Forte Através do Sistema de Trapaça (`.../2679 <redacted query values: slug>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 48 | Capitulo 1 (`.../1 <redacted query values: slug>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 42 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Torne-se o Herói Mais Forte Através do Sistema de Trapaça, URL=`.../2679 <redacted query values: slug>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://cdn.imperiodabritannia.net/.../1788965349508_cover.webp` -> 2 manga URLs (examples: `.../2679`, `.../2679 <redacted query values: slug>`) |  |  |  |
| thumbnail | PASS | `https://cdn.imperiodabritannia.net/.../1788965349508_cover.webp` (image/webp (encoding: lossy), 53906 bytes, 600x822) |  |  |  |
| details identity | UNUSUAL | Details changed selected URL `.../2679` to `.../2679 <redacted query values: slug>` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.imperiodabritannia.net/.../1788965349508_cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Aventura, Drama, Fantasia, Medíocre scan, Shounen, Sistema, Transmigração, Verdinha, Vida escolar, Xuanhuan |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[Do mesmo estúdio de Necromante: Rei dos mortos\] Em um mundo dominado por monstros conhecidos como “Sombras”, um jovem chamado Tsuyoshi, que perdeu os pais, vivia de recolher itens para sustentar a si mesmo e sua irmã mais nova. Porém, um dia, ao encontrar um item estranho chamado “Anel Sem Limites”, Tsuyoshi foi transportado para outro mundo, onde se viu prestes a ser executado por homens-fera! Mas, no instante em que sua alma gritou “Eu não quero morrer” e “Quero ser um herói”, o “Anel Sem Limites” começou a brilhar, concedendo-lhe um corpo incrivelmente poderoso e colocando em suas mãos o tesouro sagrado dos homens-fera, o “Martelo Divino”. Ao presenciar essa virada, o Rei dos homens-fera propôs um desafio: se Tsuyoshi pudesse treinar e se tornar a esperança do povo em um ano, ele seria poupado da execução. Sem outras alternativas, ele agora só pode seguir em frente e ficar mais forte. Será que Tsuyoshi conseguirá sobreviver e prosperar neste outro mundo, superando as provações que o aguardam? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 48 chapters |  |  |  |
| chapter dates | PASS | 48 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.imperiodabritannia.net/.../1788965623637_pagina_001.webp` (image/webp (container: extended), 220620 bytes, 800x4000) |  |  |  |
