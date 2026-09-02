# Extension Validation Report

- Extension: tachiyomi-pt.apecomics-v1.4.47
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4475020039832513819
- Source name: Capitoons
- Source language: pt-BR
- Selected manga input: latest offset 0: Despertar Global: Começando com um Exército de Mortos-Vivos Sintetizado (`.../despertar-global-comecando-com-um-exercito-de-mortos-vivos-sintetizado`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Despertando o Trovão Roxo no Início (`.../despertando-o-trovao-roxo-no-inicio`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | O Renascimento do Ladino de Nível Divino (`.../o-renascimento-do-ladino-de-nivel-divino`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Despertar Global: Começando com um Exército de Mortos-Vivos Sintetizado (`.../despertar-global-comecando-com-um-exercito-de-mortos-vivos-sintetizado`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | O Renascimento do Ladino de Nível Divino (`.../o-renascimento-do-ladino-de-nivel-divino`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Despertar Global: Começando com um Exército de Mortos-Vivos Sintetizado (`.../despertar-global-comecando-com-um-exercito-de-mortos-vivos-sintetizado`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Despertar Global: Começando com um Exército de Mortos-Vivos Sintetizado (`.../despertar-global-comecando-com-um-exercito-de-mortos-vivos-sintetizado`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 8 | Capítulo 1 (`.../despertar-global-comecando-com-um-exercito-de-mortos-vivos-sintetizado-capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Despertar Global: Começando com um Exército de Mortos-Vivos Sintetizado, URL=`.../despertar-global-comecando-com-um-exercito-de-mortos-vivos-sintetizado` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://capitoons.com/.../000.jpg` (image/jpeg, 866466 bytes, 800x1143) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../despertar-global-comecando-com-um-exercito-de-mortos-vivos-sintetizado` |  |  |  |
| details thumbnail URL | PASS | `https://capitoons.com/.../000.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Quando a era do despertar global de classes chegou, Chen Mo despertou a única classe oculta existente: Sintetizador. Fosse esqueleto ou espectro, tudo podia ser fundido e evoluído, aprimorando sem limites a sua legião de mortos-vivos. Enquanto um mar de ossos cobria a terra e um flagelo assolava o continente, ele aniquilou inimigos formidáveis por todos os céus contando unicamente com a própria força. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://capitoons.com/.../01.webp` (image/webp (encoding: lossy), 2849260 bytes, 800x15000) |  |  |  |
