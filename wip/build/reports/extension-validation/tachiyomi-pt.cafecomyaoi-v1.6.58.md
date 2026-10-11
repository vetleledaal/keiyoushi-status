# Extension Validation Report

- Extension: tachiyomi-pt.cafecomyaoi-v1.6.58
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 340055543197648554
- Source name: Café com Yaoi
- Source language: pt-BR
- Selected manga input: popular offset 0: Colheita do Amor (`.../268`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Colheita do Amor (`.../268`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Hexus Elegia (`.../926`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Amado Desde os Pés (`.../1346`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Relação sem Ajuda (`.../350`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Colheita do Amor (`.../268`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Colheita do Amor (`.../268`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 80 | Capítulo 01 (`.../capitulo-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Colheita do Amor, URL=`268` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cafecomyaoi.com.br/.../imagem_2023-08-25_134958385-175x238.png` (image/png, 75585 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `268` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cafecomyaoi.com.br/.../imagem_2023-08-25_134958385-193x278.png` (image/png, 94829 bytes, 193x278) |  |  |  |
| details author | PASS | HMM YONG YONG |  |  |  |
| details artist | PASS | AngryMonster |  |  |  |
| details genres | PASS | BL, Comédia, Drama, Romance, Slice-of-life, 1, Concluído, Manhwa, Recomendado |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Nível de Quentura: ☕<br><br>Quando as obrigações familiares forçam Sun Yool, um estressado estudante de direito, a ir para o campo, parece ser uma grande oportunidade para escapar do caos da cidade. Afinal, o ar livre promete ar puro, sol… e um novo romance?! Logo após chegar, Sun Yool se vê envolvido em uma série de estranhos encontros e mal-entendidos com seu vizinho de 20 anos, Yechan. Mas apesar da primeira impressão desajeitada de Yechan e do exterior espinhoso de Sun Yool, os dois se sentem atraídos um pelo outro… Será que o charme rústico deste garanhão motorista de trator será suficiente para derreter o coração deste frio garoto da cidade?<br><br>Nomes alternativos: Love Tractor; Tractor Full of Love; 트랙터는 사랑을 싣고 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 80 chapters |  |  |  |
| chapter dates | PASS | 80 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cafecomyaoi.com.br/.../00capa_fazendeiros_CAP1_720.png` (image/png, 412298 bytes, 720x408) |  |  |  |
