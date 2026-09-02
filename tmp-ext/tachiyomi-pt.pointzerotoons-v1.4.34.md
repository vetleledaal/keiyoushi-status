# Extension Validation Report

- Extension: tachiyomi-pt.pointzerotoons-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2210021497257492329
- Source name: Point Zero Toons
- Source language: pt-BR
- Selected manga input: latest offset 0: Ultra Equipado (`.../ultra-equipado`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Pico Marcial (`.../pico-marcial`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Começando a Evolução como uma Grande Árvore (`.../comecando-a-evolucao-como-uma-grande-arvore`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Ultra Equipado (`.../ultra-equipado`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | A Lendária Mulher Malvada que Morreu na Guilhotina Deseja uma Vida Pacífica como uma Garota Estudiosa e Entediante de Óculos (`.../a-lendaria-mulher-malvada-que-morreu-na-guilhotina-deseja-uma-vida-pacifica-como-uma-garota-estudiosa-e-entediante-de-oculos`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ultra Equipado (`.../ultra-equipado`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ultra Equipado (`.../ultra-equipado`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 338 | Capítulo 00 (`.../ultra-equipado-capitulo-00`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ultra Equipado, URL=`.../ultra-equipado` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kitsuneyako.com/.../f6262a3d4b3d99b1e133062faca0fa653fa8e42a-1.webp` (image/webp (encoding: lossy), 138972 bytes, 1000x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ultra-equipado` |  |  |  |
| details thumbnail URL | PASS | `https://kitsuneyako.com/.../f6262a3d4b3d99b1e133062faca0fa653fa8e42a-1.webp` |  |  |  |
| details author | PASS | LEE Dong Wook/ PARK Saenal |  |  |  |
| details artist | PASS | Team Argo {Redice Studio} |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Shin Youngwoo (também conhecido como Greed), um homem azarado na vida e um jogador de baixo nível no popular jogo de realidade virtual “Satisfy”, encontra um item poderoso que lhe vale um raro título de classe lendária: “Sucessor de Pagma”. Ele agora é um ferreiro habilidoso que pode forjar armas exclusivas e equipar os equipamentos mais poderosos do jogo. Grid resolve usar suas novas habilidades para alcançar fama e fortuna, mas conforme sua própria existência começa a causar problemas em Satisfy, ele percebe que a vida como uma lenda pode ser mais do que ele esperava….<br><br>Alternative Names: Overgeared تا دندان مسلح Kekuatan Item テムパル〜アイテムの力〜 템빨 Во всеоружии 装备我最强 裝備仔 ~ As Aventuras de Greed |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 338 chapters |  |  |  |
| chapter dates | PASS | 338 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.kitsuneyako.com/.../001.webp` (image/webp (encoding: lossy), 375952 bytes, 720x9270) |  |  |  |
