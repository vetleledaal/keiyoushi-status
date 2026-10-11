# Extension Validation Report

- Extension: tachiyomi-pt.huntersscans-v1.6.66
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 0
- Warnings: 2
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 7310576253330700902
- Source name: Hunters Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: Evolução dos Animais de Estimação (`.../652`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Evolução dos Animais de Estimação (`.../652`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | A Evolução de uma Carpa para um Dragão Divino (`.../7431`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | A Flor que Empunhava uma Espada (`.../13592`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | O Retorno da Neta do Clã Namgung (`.../15250`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Evolução dos Animais de Estimação (`.../652`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Evolução dos Animais de Estimação (`.../652`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 171 | Capítulo 01 (`.../capitulo-01`) |  | 10s+ |
| pages | `getPageList(chapter)` | success | 0 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Evolução dos Animais de Estimação, URL=`652` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://readhunters.xyz/.../monster-pet-evolution-175x238.jpg` (image/jpeg, 17393 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `652` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://readhunters.xyz/.../monster-pet-evolution.jpg` (image/jpeg, 136214 bytes, 552x780) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Comédia, Fantasia, Manhua, Monstros, Shounen, Sistema |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Monster Pet Evolution – PT-BR<br><br>O mundo experimentou um cataclismo e monstros agora estão vagando pela Terra. Nascido da necessidade de subjugar esses monstros, esta nova era viu o surgimento de uma nova profissão. Treinadores de Monstros – indivíduos que conquistam, cultivam e treinam esses monstros. Assim começa a história de Gao Peng. Um jovem ambicioso com seus próprios sonhos, que é lançado direto na era de ouro do cultivo de monstros. Gao Peng: “Mesmo que seja uma bota, serei capaz de evoluí-la para um dragão que pode voar até os céus!”<br><br><br><br>Nosso Discord |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 171 chapters |  |  |  |
| chapter dates | PASS | 171 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `http://readhunters.xyz/.../monster-pet-evolution-175x238.jpg` to `https://readhunters.xyz/.../monster-pet-evolution-175x238.jpg` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
