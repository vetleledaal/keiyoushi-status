# Extension Validation Report

- Extension: tachiyomi-pt.inkapk-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8541224312340631016
- Source name: Inkapk
- Source language: pt-BR
- Selected manga input: popular offset 0: Supervisor Access (`.../supervisor-access`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Supervisor Access (`.../supervisor-access`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Workplace Relationship Management (`.../workplace-relationship-management`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | A Visit to Hell (`.../a-visit-to-hell`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Black and White | Welcome to Tentacle Park 1 (`.../black-and-white-welcome-to-tentacle-park-1`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Supervisor Access (`.../supervisor-access`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Supervisor Access (`.../supervisor-access`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 137 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Supervisor Access, URL=`.../supervisor-access` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://inkapk.net/.../Screenshot_2-170x300.jpg` (image/jpeg, 12939 bytes, 170x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../supervisor-access` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://inkapk.net/.../Screenshot_2-580x1024.jpg` (image/jpeg, 85601 bytes, 580x1024) |  |  |  |
| details author | PASS | Employee workerKim Deokjo, khsPark Soobeom |  |  |  |
| details artist | PASS | Soobeom |  |  |  |
| details genres | PASS | Adulto, Drama, Manhwa, Romance, Seinen, Webtoon |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Supervisor Access Hyunwu é um típico funcionário de escritório preso a uma rotina cansativa e repetitiva: relatórios, reuniões, tarefas acumuladas e um ambiente corporativo dominado por disputas silenciosas e hierarquias sufocantes. Sua vida segue no automático, sem emoções ou grandes expectativas. Para ele, cada dia parece igual ao anterior, e a monotonia consome qualquer traço de entusiasmo. Tudo muda de forma abrupta quando Hyunwu recebe uma notificação inesperada em seu celular. O aplicativo — estranho e não identificado — apresenta... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 137 chapters |  |  |  |
| chapter dates | LINT | 113 of 137 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=113 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://inkapk.net/.../_18846_0_0.jpg` (image/jpeg, 143109 bytes, 720x1100) |  |  |  |
