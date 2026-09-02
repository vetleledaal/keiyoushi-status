# Extension Validation Report

- Extension: tachiyomi-pt.kamisamaexplorer-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5221484950287110636
- Source name: Kami Sama Explorer
- Source language: pt-BR
- Selected manga input: popular offset 0: Dragon Ball Super (`.../19`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Dragon Ball Super (`.../19`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 9 | BattleMan F-1 Nishi Doitsu Hockenheim GP Kanshinki (`.../208`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Dragon Ball GT – DBGalaxyTouring (`.../291`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 9 | Super Dragon Ball Heroes Universe Mission!! (`.../74`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 13 | Dragon Ball Super Divers (`.../268`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dragon Ball Super (`.../19`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 106 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 3: title=Dragon Ball Super, URL=`19` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 78/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://leitor.kamisama.com.br/.../dragon-ball-super-capa-volume-12-175x238.jpg` (image/jpeg, 14217 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `19` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://leitor.kamisama.com.br/.../dragon-ball-super-capa-volume-12-193x278.jpg` (image/jpeg, 17470 bytes, 193x278) |  |  |  |
| details author | PASS | Akira Toriyama, Toyotarou |  |  |  |
| details artist | PASS | Akira Toriyama, Toyotarou |  |  |  |
| details genres | PASS | Shonen, dragon ball super, pt br |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dragon Ball Super foi lançado em 20 de junho de 2015 e segue as aventuras do protagonista Goku e seus amigos, depois de derrotar Majin Buu e trazer paz para Terra mais uma vez. Goku encontra seres de longe mais poderosos e atinge o poder de um Deus.<br><br>Nomes alternativos: ドラゴンボール 超 （ スーパー ）, Doragon Bōru Sūpā |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 106 chapters |  |  |  |
| chapter dates | LINT | 1 of 106 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `capitulo-32` at offsets 72, 73, `capitulo-31` at offsets 74, 75 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://leitor.kamisama.com.br/.../DBSUPER02.jpg` (image/jpeg, 670110 bytes, 744x1080) |  |  |  |
