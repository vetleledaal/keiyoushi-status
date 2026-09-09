# Extension Validation Report

- Extension: tachiyomi-pt.remangas-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
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
- Source ID: 7462657023971681136
- Source name: NoxManga
- Source language: pt-BR
- Selected manga input: latest offset 0: O Renascimento do Venerável Imortal (`.../o-renascimento-do-veneravel-imortal`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | O Renascimento do Venerável Imortal (`.../o-renascimento-do-veneravel-imortal`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | My First Girlfriend is a Gal (`.../my-first-girlfriend-is-a-gal`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | O Renascimento do Venerável Imortal (`.../o-renascimento-do-veneravel-imortal`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Nem Mais, Nem Menos (`.../nem-mais-nem-menos`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 13 | Renascimento: O Monarca dos Mortos (`.../renascimento-o-monarca-dos-mortos`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Renascimento do Venerável Imortal (`.../o-renascimento-do-veneravel-imortal`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 143 | Capítulo 1 (`.../17e1e17e-66ba-47ea-a129-ea5e2a972c62`) |  | 1-10s |
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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 5: title=O Renascimento do Venerável Imortal, URL=`.../o-renascimento-do-veneravel-imortal` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 109/109 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 109/109 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.mangastop.wtf/.../O-Renascimento-do-Veneravel-Imortal.webp` (image/webp (encoding: lossy), 45454 bytes, 512x683) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../o-renascimento-do-veneravel-imortal` |  |  |  |
| details thumbnail URL | PASS | `https://images.mangastop.wtf/.../O-Renascimento-do-Veneravel-Imortal.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhua, Harem, Wuxia, Vida Escolar, Artes Marciais, Reencarnação, Ação |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Conta a história de Chen Mo, um grande deus cultivador, explorando pessoalmente a terra proibida com sua irmã mais nova, renascendo e retornando ao terceiro ano da terra, reconstruindo as fundações do Tao, reconstruindo a fundação do Tao, confiando na força e nas memórias de vidas passadas, e assumindo a liderança no planejamento para acalmar todos os arrependimentos e proteger parentes e amigos. Meu caro amigo, mate as forças inimigas, derrote todas as conspirações e procure vestígios de sua irmã mais nova.<br><br>Títulos alternativos: Rebirth of the Earth Immortal Venerable |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 143 chapters |  |  |  |
| chapter dates | PASS | 143 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://noxmangas.org/.../001.webp <redacted query values: t>` (image/webp (encoding: lossy), 428054 bytes, 595x4396; server Content-Type: image/jpeg) |  |  |  |
