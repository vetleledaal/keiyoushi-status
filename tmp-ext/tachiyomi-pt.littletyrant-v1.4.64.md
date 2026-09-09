# Extension Validation Report

- Extension: tachiyomi-pt.littletyrant-v1.4.64
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 4886334142812146511
- Source name: Little Tyrant
- Source language: pt-BR
- Selected manga input: popular offset 0: Limite absoluto (`.../limite-absoluto`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Limite absoluto (`.../limite-absoluto`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Conforme o seu coração guiar (`.../conforme-o-seu-coracao-guiar`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Domei um Escravo Corrompido (`.../domei-um-escravo-corrupto`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Escândalo Amoroso da Imperatriz (`.../escandalo-amoroso-da-imperatriz`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Limite absoluto (`.../limite-absoluto`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Limite absoluto (`.../limite-absoluto`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 94 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Limite absoluto, URL=`.../limite-absoluto` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tiraninha.world/.../capa-de-limite.webp` (image/webp (encoding: lossy), 329862 bytes, 1054x1492) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../limite-absoluto` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://tiraninha.world/.../capa-de-limite-350x476.webp` (image/webp (encoding: lossy), 65546 bytes, 350x476) |  |  |  |
| details author | PASS | Gyogyeol |  |  |  |
| details artist | PASS | Bulgama |  |  |  |
| details genres | PASS | Adulto, drama, josei, Romance, Smut |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ela é filha única de uma família rica e poderosa, Choi Yumi. Ela parece ter tudo, mas vive uma vida solitária, incapaz de fazer qualquer coisa por sua própria vontade. E num inverno especialmente frio e longo, ela conhece aquele homem. Um homem impiedoso, cruel e frio. Jung Yoon kyo, um figurão e herdeiro da Woosung, a maior organização de gangues da Coreia do Sul. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 94 chapters |  |  |  |
| chapter dates | PASS | 94 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
