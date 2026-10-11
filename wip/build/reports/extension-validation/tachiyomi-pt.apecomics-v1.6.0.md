# Extension Validation Report

- Extension: tachiyomi-pt.apecomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangawork
- Source ID: 4475020039832513819
- Source name: Capitoons
- Source language: pt-BR
- Selected manga input: popular offset 0: Despertando o Trovão Roxo no Início (`.../despertando-o-trovao-roxo-no-inicio`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Despertando o Trovão Roxo no Início (`.../despertando-o-trovao-roxo-no-inicio`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | O Renascimento do Ladino de Nível Divino (`.../o-renascimento-do-ladino-de-nivel-divino`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Despertando o Trovão Roxo no Início (`.../despertando-o-trovao-roxo-no-inicio`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | O Renascimento do Ladino de Nível Divino (`.../o-renascimento-do-ladino-de-nivel-divino`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Despertando o Trovão Roxo no Início (`.../despertando-o-trovao-roxo-no-inicio`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Despertando o Trovão Roxo no Início (`.../despertando-o-trovao-roxo-no-inicio`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 95 | Capítulo 1 (`.../despertando-o-trovao-roxo-no-inicio-capitulo-1`) |  | 10s+ |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Despertando o Trovão Roxo no Início, URL=`.../despertando-o-trovao-roxo-no-inicio` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://capitoons.com/.../capa.jpg` (image/jpeg, 680884 bytes, 800x1410) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../despertando-o-trovao-roxo-no-inicio` |  |  |  |
| details thumbnail URL | PASS | `https://capitoons.com/.../capa.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | No mundo da Estrela Azul, bestas selvagens estão por toda parte. Todos podem despertar superpoderes e têm a chance de se tornarem fortes e dominar o mundo! No entanto, Xu Jingming, que viajou no tempo, só possuía um superpoder de Rank E. Felizmente, o Sistema apareceu, e seu fraco poder elétrico de Rank E foi promovido a Trovão Roxo de nível S! Matar bestas rende pontos de superpoder! Com 1.500.000 pontos, o Trovão Roxo evolui! Trovão do Caos de nível SSS! Assim nasceu a lenda de Xu Jingming na Estrela Azul. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 95 chapters |  |  |  |
| chapter dates | PASS | 95 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://capitoons.com/.../2 <redacted query values: title, order, status, and type>` to `https://capitoons.com/.../2 <redacted query values: title, order, status, and type>` (1 redirects); popular: `https://capitoons.com/.../2 <redacted query values: title, order, status, and type>` to `https://capitoons.com/.../2 <redacted query values: title, order, status, and type>` (1 redirects) |  |  |  |
| page load | PASS | `https://capitoons.com/.../01.webp` (image/webp (encoding: lossy), 1416942 bytes, 900x9525) |  |  |  |
