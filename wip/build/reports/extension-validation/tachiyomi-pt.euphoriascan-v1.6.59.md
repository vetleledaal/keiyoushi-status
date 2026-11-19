# Extension Validation Report

- Extension: tachiyomi-pt.euphoriascan-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6045078216682014867
- Source name: Euphoria Scan
- Source language: pt-BR
- Selected manga input: latest offset 0: O Apartamento onde vive o fantasma da sodomia (`.../1185`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | A Sedução da Serpente Sagrada (`.../423`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Love & Hatred (`.../126`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | O Apartamento onde vive o fantasma da sodomia (`.../1185`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Caught Red-Hot-Handed (`.../695`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | O Apartamento onde vive o fantasma da sodomia (`.../1185`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Apartamento onde vive o fantasma da sodomia (`.../1185`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../capitulo-unico`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=O Apartamento onde vive o fantasma da sodomia, URL=`1185` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 100/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://euphoriascan.com/.../Capa-manga-e1793310987826-350x476.png` (image/png, 211451 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `1185` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://euphoriascan.com/.../Capa-manga-e1793310987826-193x278.png` (image/png, 79023 bytes, 193x278) |  |  |  |
| details author | PASS | Mugitoro Karma (Chimple Hotter) |  |  |  |
| details artist | PASS | Mugitoro Karma (Chimple Hotter) |  |  |  |
| details genres | PASS | Adult, Drama, Fantasia, Horror, One-shot, Smut, Supernatural, Yaoi, Completo, Mangá |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Fansub: Euphoria Scan<br><br>Ryosuke se vê morando em um prédio de apartamentos assombrado, onde “todos os inquilinos são homens e se mudam em três meses sem dar nenhuma explicação”. O prédio é um conjunto habitacional decadente que, segundo boatos, era assombrado até mesmo na universidade.<br><br>“Não acredito em fantasmas, então vai ficar tudo bem (risos)”,<br><br>pensa ele ingenuamente, mas, ao contrário de suas expectativas, “isso” começa logo na primeira noite em que se muda.<br><br>Subitamente paralisado e incapaz de mover os membros, Ryosuke é apalpado na virilha por “algo” e forçado a sentir prazer. Ele tenta bancar o durão, dizendo que não tem como sentir prazer em uma situação tão assustadora, mas acaba chegando ao orgasmo.<br><br>Gradualmente condicionado pelo prazer que lhe é dado aos poucos, dia após dia, Ryosuke finalmente é forçado a perder a virgindade…!?<br><br>Nomes alternativos: Danshoku Rei no Sumu Apart ~Nonke no Ore ga Mienai Nanika o Hamerarete Mesuiki nanka Suru Wakenai~ The Apartment in Which the Ghost of Sodomy Lives 男色霊の棲むアパート 男色霊の棲むアパート～ノンケの俺が見えないナニかをハメられてメスイキなんかするわけない～ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://euphoriascan.com/.../01.png` (image/png, 1500285 bytes, 1144x1600) |  |  |  |
