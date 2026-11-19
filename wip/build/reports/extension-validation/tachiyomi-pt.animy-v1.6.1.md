# Extension Validation Report

- Extension: tachiyomi-pt.animy-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4704251131541894836
- Source name: Animy
- Source language: pt-BR
- Selected manga input: popular offset 0: Blue Lock (`.../2753`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Blue Lock (`.../2753`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Conquistando Masmorras com Copiar e Colar (`.../16190`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Game Chishiki de Saikyou ni Natta Mob Heishi wa, Shin no Jitsuryoku wo Kakushitai (`.../26030`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Goedam e Tteoreojyeodo Chulgeun eul Haeya Haneunguna (`.../20556`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Blue Lock (`.../2753`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blue Lock (`.../2753`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 374 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 78 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blue Lock, URL=`2753` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 99/99 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 99/99 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://animy.net/.../cover` (image/jpeg, 5429617 bytes, 2717x4063) |  |  |  |
| details identity | PASS | Details preserved selected URL `2753` |  |  |  |
| details thumbnail URL | PASS | `https://animy.net/.../cover` |  |  |  |
| details author | PASS | Kaneshiro Muneyuki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Thriller, Psychological, Sports, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yoichi Isagi perdeu a oportunidade de ir para o campeonato nacional do ensino médio porque ele passou para seu companheiro de equipe que perdeu em vez de chutar para o gol si mesmo. Isagi é um dos 300 atacantes de Sub-18 escolhidos por Jinpachi Ego, contratado pela Associação de Futebol do Japão após a Copa do Mundo de 2018, para guiar o Japão na conquista da Copa do Mundo ao destruir o futebol japonês. O plano de Ego é isolar os 300 atacantes em uma instituição parecida com uma prisão chamada “Blue Lock”, para criar o maior “egoista” / atacante do mundo, que tem faltado no futebol japonês. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 374 chapters |  |  |  |
| chapter dates | PASS | 374 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 78 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://animy.net/.../1.avif` (image/webp (container: extended), 171954 bytes, 850x1271) |  |  |  |
