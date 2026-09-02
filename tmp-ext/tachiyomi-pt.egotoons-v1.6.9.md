# Extension Validation Report

- Extension: tachiyomi-pt.egotoons-v1.6.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4749792168996703143
- Source name: Ego Toons
- Source language: pt-BR
- Selected manga input: popular offset 0: O Retorno do Demônio de Sangue (`.../12509`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | O Retorno do Demônio de Sangue (`.../12509`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Tornando-me um Funcionário Lendário (`.../12625`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Simulação de Namoro Fantasma (`.../282`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Vivendo Como Um Jardineiro Num Mundo de Caçadores (`.../430`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | O Retorno do Demônio de Sangue (`.../12509`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Retorno do Demônio de Sangue (`.../12509`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 62 | Capítulo 1 (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=O Retorno do Demônio de Sangue, URL=`.../12509` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://egotoons.com/.../capa <redacted query values: v>` (image/webp (encoding: lossy), 68936 bytes, 600x858) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12509` |  |  |  |
| details thumbnail URL | PASS | `https://egotoons.com/.../capa <redacted query values: v>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | manhwa, Ação, Aventura, Fantasia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | \[Do mesmo autor que trouxe {The Heavenly Demon Can't Live a Normal Life}! Kang San é um petroleiro do 1% inferior, sem talento, habilidades ou destreza. A desgraça o persegue até que um dia um mensageiro divino aparece diante dele. “Você foi o Demônio de Sangue em sua vida passada.” Para expiar os pecados de sua vida passada, ele deve passar por duras provações. Mas, em troca, ele receberá imensas recompensas? “Tudo bem. Farei o que for preciso.” Será que um fraco tanque de nível F encharcado de sangue pode mudar seu destino? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 62 chapters |  |  |  |
| chapter dates | PASS | 62 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://api.egotoons.com/.../0` (image/webp (encoding: lossy), 1339140 bytes, 800x15000) |  |  |  |
