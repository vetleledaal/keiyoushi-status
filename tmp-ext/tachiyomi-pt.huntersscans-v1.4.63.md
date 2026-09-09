# Extension Validation Report

- Extension: tachiyomi-pt.huntersscans-v1.4.63
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 25
- Lint: 0
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 7310576253330700902
- Source name: Hunters Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: Evolução dos Animais de Estimação (`.../monster-pet-evolution`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | Evolução dos Animais de Estimação (`.../monster-pet-evolution`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 16 | Mago Infinito (`.../mago-infinito`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 16 | A Maldição Perfeita (`.../a-maldicao-perfeita`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | A Pequena Bola de Algodão do Clã Tigre Branco (`.../a-pequena-bola-de-algodao-do-cla-tigre-branco`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Evolução dos Animais de Estimação (`.../monster-pet-evolution`) |  | 10s+ |
| details | `fetchMangaDetails(manga)` | success | 1 | Evolução dos Animais de Estimação (`.../monster-pet-evolution`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | error | 0 |  | java.io.InterruptedIOException | 10s+ |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.io.InterruptedIOException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Evolução dos Animais de Estimação, URL=`.../monster-pet-evolution` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://readhunters.xyz/.../monster-pet-evolution-175x238.jpg` (image/jpeg, 17393 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../monster-pet-evolution` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://readhunters.xyz/.../monster-pet-evolution.jpg` (image/jpeg, 136214 bytes, 552x780) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Comédia, Fantasia, Manhua, Monstros, Shounen, Sistema |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Monster Pet Evolution – PT-BR<br><br>O mundo experimentou um cataclismo e monstros agora estão vagando pela Terra. Nascido da necessidade de subjugar esses monstros, esta nova era viu o surgimento de uma nova profissão. Treinadores de Monstros – indivíduos que conquistam, cultivam e treinam esses monstros. Assim começa a história de Gao Peng. Um jovem ambicioso com seus próprios sonhos, que é lançado direto na era de ouro do cultivo de monstros. Gao Peng: “Mesmo que seja uma bota, serei capaz de evoluí-la para um dragão que pode voar até os céus!”<br><br><br><br>Nosso Discord |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
