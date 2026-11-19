# Extension Validation Report

- Extension: tachiyomi-pt.fleurblanche-v1.6.66
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 2748000026130339026
- Source name: Fleur Blanche
- Source language: pt-BR
- Selected manga input: popular offset 0: Jinx (`.../60`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Jinx (`.../60`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | I Like Your Pheromones (`.../5809`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | In a Scent (`.../13551`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Bubbling Up! (`.../13422`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Love Jinx (`.../250`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (`.../60`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 109 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 37 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Jinx, URL=`60` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://squadxfbs.com/.../IMG_1307-1-1-1-e1736918809371-175x238.jpg` (image/jpeg, 10164 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `60` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://squadxfbs.com/.../JINX-CAPA-NOVA-1.webp` (image/webp (container: extended), 481882 bytes, 2002x1065) |  |  |  |
| details author | PASS | Mingwa |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Adulto, BL, Drama, Esporte, manhwa, Psicológico, Romance, Sem censura, Completo, Fleur Blanche Scan, Mais Lidos |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | O fisioterapeuta Kim Dan está sem sorte desde que se lembra. Entre uma avó doente, agiotas ameaçadores e um antigo patrão que torna quase impossível para ele encontrar trabalho, Dan está realmente ficando sem opções. Naturalmente, parece um sonho tornado realidade quando ele finalmente é contratado para tratar o lutador de MMA bem pago Joo Jaekyung, especialmente quando o homem o chama para um tratamento na noite anterior à luta com uma oferta tão tentadora de cinco mil. dólares. Ele afirma ter um “azar” que precisa de um tipo específico de “tratamento”, mas é um que Dan não está preparado para oferecer… Veja, Jaekyung pode ser uma fera no ringue, mas ele é ainda mais rude no ringue. quarto, e Dan não tem certeza se conseguirá sobreviver a Jaekyung em sua forma mais primitiva. No entanto, a promessa do tão necessário dinheiro fez com que Dan concordasse com esse acordo malfadado… Poderia uma noite juntos ser a coisa para ajudar Jaekyung a quebrar esse azar uma vez? e para todos? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 109 chapters |  |  |  |
| chapter dates | PASS | 109 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://squadxfbs.com/.../01Resultado.webp` (image/webp (container: extended), 405612 bytes, 720x7658) |  |  |  |
