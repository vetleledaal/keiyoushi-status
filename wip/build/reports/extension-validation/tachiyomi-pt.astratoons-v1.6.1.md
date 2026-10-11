# Extension Validation Report

- Extension: tachiyomi-pt.astratoons-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 551908063793499841
- Source name: Astratoons
- Source language: pt-BR
- Selected manga input: latest offset 0: O Retorno de Mia (`.../o-retorno-de-mia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | O Tutorial é Muito Difícil (`.../o-tutorial-e-muito-dificil`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | O Retorno de Mia (`.../o-retorno-de-mia`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | O Retorno do Herói de Classe Desastre (`.../o-retorno-do-heroi-de-classe-desastre`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | O Retorno de Mia (`.../o-retorno-de-mia`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Retorno de Mia (`.../o-retorno-de-mia`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 44 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 35 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=O Retorno de Mia, URL=`.../o-retorno-de-mia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://new.astratoons.com/.../01KQX09ANRZXH8R5YV81FG9HPV.webp` (image/webp (encoding: lossy), 45256 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../o-retorno-de-mia` |  |  |  |
| details thumbnail URL | PASS | `https://new.astratoons.com/.../01KQX09ANRZXH8R5YV81FG9HPV.webp` |  |  |  |
| details author | PASS | Tangerine |  |  |  |
| details artist | PASS | Meom Meom |  |  |  |
| details genres | PASS | Drama, Romance, misterio, Slice of Life, comedia, silence |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | Cinco anos atrás, meu primeiro amor, Cha Mia, desapareceu. Agora, ela reapareceu diante de mim, completamente transformada. Um reencontro inesperado na delegacia... e ela se revela caloura na mesma universidade? A história de duas pessoas que pensavam que tudo havia acabado recomeça no campus. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 44 chapters |  |  |  |
| chapter dates | LINT | All 44 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=44 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://new.astratoons.com/.../01.0.webp` (image/webp (encoding: lossy), 61184 bytes, 549x494) |  |  |  |
