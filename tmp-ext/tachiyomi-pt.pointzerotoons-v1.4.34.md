# Extension Validation Report

- Extension: tachiyomi-pt.pointzerotoons-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 2210021497257492329
- Source name: Point Zero Toons
- Source language: pt-BR
- Selected manga input: latest offset 0: Mesa Humana (`.../mesa-humana`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Pico Marcial (`.../pico-marcial`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | O Melhor Engenheiro Do Mundo (`.../o-melhor-engenheiro-do-mundo`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Mesa Humana (`.../mesa-humana`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Você não é supostamente uma mulher disfarçada de homem?! (`.../voce-nao-e-supostamente-uma-mulher-disfarcada-de-homem`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mesa Humana (`.../mesa-humana`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mesa Humana (`.../mesa-humana`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 11 | Capítulo 01 (`.../mesa-humana-capitulo-01`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 91 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mesa Humana, URL=`.../mesa-humana` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kitsuneyako.com/.../capa.webp` (image/webp (encoding: lossy), 45458 bytes, 600x781) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mesa-humana` |  |  |  |
| details thumbnail URL | PASS | `https://kitsuneyako.com/.../capa.webp` |  |  |  |
| details author | PASS | Kim Gyu-sam (김규삼) |  |  |  |
| details artist | PASS | Kim Gyu-sam (김규삼) |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | O “Mesa Humana”, uma usina nuclear flutuante em alto-mar, deriva solitário na imensidão do oceano. Yun-ho e seus colegas, que visitavam o local para uma inspeção de segurança, ficam isolados depois que uma explosão misteriosa corta toda a comunicação com o mundo exterior. No entanto, a explosão era apenas o começo. Uma criatura gigante não identificada emerge da fumaça do reator e começa a atacar e devorar os sobreviventes. Isolados, eles travam uma luta desesperada pela sobrevivência, enfrentando tanto a iminente submersão da usina quanto a perseguição do gigante devorador de homens. À mesa de quem o Leviathan servirá de banquete…<br><br>Alternative Names: 인간의 식탁 / Human Table |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 91 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.kitsuneyako.com/.../001.webp <redacted query values: kver>` (image/webp (encoding: lossy), 238622 bytes, 800x4000) |  |  |  |
