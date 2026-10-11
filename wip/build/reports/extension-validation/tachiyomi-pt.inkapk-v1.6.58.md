# Extension Validation Report

- Extension: tachiyomi-pt.inkapk-v1.6.58
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
- Source ID: 8541224312340631016
- Source name: Inkapk
- Source language: pt-BR
- Selected manga input: popular offset 0: Supervisor Access (`.../2083`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Supervisor Access (`.../2083`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Workplace Relationship Management (`.../2140`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | MILF Exchange Plan (`.../4061`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Jasmine (`.../3989`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Supervisor Access (`.../2083`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Supervisor Access (`.../2083`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 137 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Supervisor Access, URL=`2083` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://inkapk.net/.../Screenshot_2-350x476.jpg` (image/jpeg, 29781 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2083` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://inkapk.net/.../Screenshot_2-580x1024.jpg` (image/jpeg, 85601 bytes, 580x1024) |  |  |  |
| details author | PASS | Employee workerKim Deokjo, khsPark Soobeom |  |  |  |
| details artist | PASS | Soobeom |  |  |  |
| details genres | PASS | Adulto, Drama, Manhwa, Romance, Seinen, Webtoon |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Supervisor Access Hyunwu é um típico funcionário de escritório preso a uma rotina cansativa e repetitiva: relatórios, reuniões, tarefas acumuladas e um ambiente corporativo dominado por disputas silenciosas e hierarquias sufocantes. Sua vida segue no automático, sem emoções ou grandes expectativas. Para ele, cada dia parece igual ao anterior, e a monotonia consome qualquer traço de entusiasmo. Tudo muda de forma abrupta quando Hyunwu recebe uma notificação inesperada em seu celular. O aplicativo — estranho e não identificado — apresenta... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 137 chapters |  |  |  |
| chapter dates | PASS | 137 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://inkapk.net/.../_18846_0_0.jpg` (image/jpeg, 143109 bytes, 720x1100) |  |  |  |
