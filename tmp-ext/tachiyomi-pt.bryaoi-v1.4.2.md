# Extension Validation Report

- Extension: tachiyomi-pt.bryaoi-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 28
- Lint: 3
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3480299458405323329
- Source name: BR Yaoi
- Source language: pt-BR
- Selected manga input: popular offset 0: Global Examination | QQGK (`.../global-examination-qqgk-online`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Global Examination | QQGK (`.../global-examination-qqgk-online`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | Alpine (Novel) (`.../alpine-novel-online`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Global Examination | QQGK (`.../global-examination-qqgk-online`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Global Examination | QQGK (`.../global-examination-qqgk-online`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 43 | Capítulo 01 (`.../global-examination-qqgk-01-online`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 18 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Global Examination \| QQGK, URL=`.../global-examination-qqgk-online` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nameclubpower.xyz/.../global-examination-qqgk.webp` (image/webp (encoding: lossy), 307994 bytes, 1200x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../global-examination-qqgk-online` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://nameclubpower.xyz/.../global-examination-qqgk_178.webp` (image/webp (encoding: lossy), 18024 bytes, 246x328) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Mangás, Manhua, Romance, Shounen-ai, Yaois |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | <br>Este é um teste que coloca sua vida em risco. Responda a uma infinidade de perguntas, passe no teste e você pode sobreviver. Quando o inspetor duas-caras, Qin Jiu, encontra o frio candidato, You Huo, os dois amnésicos são colocados frente a frente em uma luta pelo sistema desumano. Apesar disso, eles firmam um forte acordo tático. O sistema entra em colapso após uma série de avisos e as memórias apagadas gradualmente retornam. “Acontece que mesmo no fim do mundo, onde só resta poeira, você ainda é a primeira pessoa que conheci. O que há de tão bom neste sistema? Nós o destruiremos. O mundo ainda é brilhante e grandioso, então bem-vindo ao lar.” Nome alternativo: Quanqiu Gaokao Qqgk Global Examination Global University Entrance Examination<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 43 chapters |  |  |  |
| chapter dates | LINT | All 43 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=43 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://nameclubpower.xyz/.../1.webp` (image/webp (encoding: lossy), 179556 bytes, 1127x2048) |  |  |  |
