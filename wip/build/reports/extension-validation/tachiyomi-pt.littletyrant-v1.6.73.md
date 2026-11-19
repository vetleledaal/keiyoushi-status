# Extension Validation Report

- Extension: tachiyomi-pt.littletyrant-v1.6.73
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 26
- Lint: 0
- Warnings: 0
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4886334142812146511
- Source name: Little Tyrant
- Source language: pt-BR
- Selected manga input: popular offset 0: Limite absoluto (`.../1485`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Limite absoluto (`.../1485`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Como Proteger seu Coração (`.../5440`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Roxana: Como Proteger o Irmão Mais Velho da Protagonista (`.../7548`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Coração de Pêssego (`.../7730`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Limite absoluto (`.../1485`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Limite absoluto (`.../1485`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Limite absoluto, URL=`1485` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tiraninha.world/.../limite-350x476.webp` (image/webp (encoding: lossy), 27568 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `1485` |  |  |  |
| details thumbnail URL | PASS | `https://tiraninha.world/.../limite-350x476.webp` |  |  |  |
| details author | PASS | Gyogyeol |  |  |  |
| details artist | PASS | Bulgama |  |  |  |
| details genres | PASS | Adulto, drama, josei, Romance, Smut |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ela é filha única de uma família rica e poderosa, Choi Yumi. Ela parece ter tudo, mas vive uma vida solitária, incapaz de fazer qualquer coisa por sua própria vontade. E num inverno especialmente frio e longo, ela conhece aquele homem. Um homem impiedoso, cruel e frio. Jung Yoon kyo, um figurão e herdeiro da Woosung, a maior organização de gangues da Coreia do Sul. |  |  |  |
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
