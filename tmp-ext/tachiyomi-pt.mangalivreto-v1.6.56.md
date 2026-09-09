# Extension Validation Report

- Extension: tachiyomi-pt.mangalivreto-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 1281902081932329042
- Source name: Manga Livre.to
- Source language: pt-BR
- Selected manga input: popular offset 0: The Greatest Estate Developer – O Melhor Engenheiro do Mundo (`.../748`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Greatest Estate Developer – O Melhor Engenheiro do Mundo (`.../748`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Reincarnation of the Fist King (`.../413`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Madrasta vem primeiro (Sem Censura) (`.../2192`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Pensando nos Desejos Sexuais do Irmão Mais Novo 2 (`.../975`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Greatest Estate Developer – O Melhor Engenheiro do Mundo (`.../748`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 222 | Capitulo 01 (`.../capitulo-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangalivre.to/.../The-Greatest-Estate-Developer-o-Melhor-engenheiro-do-mundo-350x476.webp` (image/webp (encoding: lossy), 36986 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `748` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangalivre.to/.../The-Greatest-Estate-Developer-o-Melhor-engenheiro-do-mundo-193x278.webp` (image/webp (encoding: lossy), 16088 bytes, 193x278) |  |  |  |
| details author | PASS | BK_Moon, Lee Hyunmin |  |  |  |
| details artist | PASS | Kim Hyeon-Soo |  |  |  |
| details genres | PASS | Ação, Aventura, Comédia, Drama, Fantasia, Isekai, Manhwa, Reencarnação, Shounen, Sobrenatural |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | <br><br>Este título se destaca entre os mangás e manhwas de fantasia por abordar um tema pouco comum — engenharia e urbanismo — dentro de um mundo medieval mágico. A narrativa é envolvente e mostra como raciocínio, técnica e visão de longo prazo podem transformar realidades.<br><br>Se você gosta de histórias em que o protagonista vence com inteligência, planejamento e conhecimento técnico, esta é uma leitura obrigatória por isso você deve ler O melhor engenheiro do mundo no manga livre. Além disso, o traço é limpo e detalhado, reforçando a qualidade artística da obra.<br><br>Você pode acompanhar The Greatest Estate Developer em português no Manga Livre, o melhor site para ler mangás e manhwas online. O portal oferece leitura gratuita, capítulos atualizados e uma navegação leve tanto no celular quanto no navegador.<br><br>Nomes alternativos: O Melhor Engenheiro do Mundo / Violence Hurray / 暴力万歳Violence Hurray / 暴力万歳 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 222 chapters |  |  |  |
| chapter dates | PASS | 222 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangalivre.to/.../001.webp` (image/webp (container: extended), 76648 bytes, 720x438) |  |  |  |
