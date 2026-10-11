# Extension Validation Report

- Extension: tachiyomi-pt.nexusmangas-v1.6.1
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
- Source ID: 3647960912061862872
- Source name: Nexus Mangás
- Source language: pt-BR
- Selected manga input: popular offset 0: Eu Sou o Boss Final! (`.../eu-sou-o-boss-final`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Eu Sou o Boss Final! (`.../eu-sou-o-boss-final`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Kimi ni Sasageru Otokomae (`.../kimi-ni-sasageru-otokomae`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | O Retorno do Demônio de Sangue (`.../o-retorno-do-demonio-de-sangue`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Estou Desistindo de Tudo Para Vender Coca (`.../estou-desistindo-de-tudo-para-vender-coca`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Eu Sou o Boss Final! (`.../eu-sou-o-boss-final`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Eu Sou o Boss Final! (`.../eu-sou-o-boss-final`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 26 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Eu Sou o Boss Final!, URL=`eu-sou-o-boss-final` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://supabase.nexusmangas.com/.../read-public-media <redacted query values: key>` (image/webp (encoding: lossy), 106362 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `eu-sou-o-boss-final` |  |  |  |
| details thumbnail URL | PASS | `https://supabase.nexusmangas.com/.../read-public-media <redacted query values: key>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Bae Do-jun é um trabalhador comum que tenta sobreviver em um mundo onde "Despertados" lutam contra monstros em torres e masmorras. Tudo muda quando, por um erro do sistema ou destino, ele acaba sendo transportado para o nível mais profundo de uma masmorra e recebe a identidade do Boss Final.<br>Agora, em vez de ser o herói que sobe a torre, ele é o alvo principal que todos os caçadores e heróis "rank S" querem derrotar para ganhar fama e tesouros. Do-jun precisa usar suas habilidades de monstro e sua inteligência humana para gerenciar a masmorra, fortalecer seus subordinados e impedir que os jogadores "zerem" o seu andar. É uma inversão de papéis onde ele tem que ser o vilão para não morrer.<br><br>Scan: NX Scan |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 26 chapters |  |  |  |
| chapter dates | PASS | 26 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://supabase.nexusmangas.com/.../read-public-media <redacted query values: key>` to `https://assets.nexusmangas.com/.../cover_1791518084098.webp` (1 redirects) |  |  |  |
| page load | PASS | `https://assets.nexusmangas.com/.../p_0_03af487eb1144ab3acfbe54f196947d9.webp` (image/webp (encoding: lossy), 1163318 bytes, 750x15195) |  |  |  |
