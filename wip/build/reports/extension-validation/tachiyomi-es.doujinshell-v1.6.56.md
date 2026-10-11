# Extension Validation Report

- Extension: tachiyomi-es.doujinshell-v1.6.56
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 7008709488397053596
- Source name: DoujinsHell
- Source language: es
- Selected manga input: popular offset 0: ESCUELA EN CASA 1 (`.../2918`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | ESCUELA EN CASA 1 (`.../2918`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | DIARIO DE OBSERVACIÓN CARIÑOSO 1 (`.../5890`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | OFICINISTA DESCUIDADA (`.../7036`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | CAMPAMENTO DE MADURAS TETONAS QUE ENTRENAN VERGAS JOVENES (`.../6950`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | ESCUELA EN CASA 1 (`.../2918`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ESCUELA EN CASA 1 (`.../2918`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo (`.../escuela-en-casa-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ESCUELA EN CASA 1, URL=`2918` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://doujinshell.net/.../02-2-2-175x238.jpg` (image/jpeg, 33039 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `2918` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://doujinshell.net/.../02-2-2-193x278.jpg` (image/jpeg, 34784 bytes, 193x278) |  |  |  |
| details author | PASS | HANNYASAN |  |  |  |
| details artist | PASS | HANNYASAN |  |  |  |
| details genres | PASS | Ahegao, Big Ass, Fetiches, Incesto, Maduras, Milfs, Nakadashi, Ninfomanas, Oral, Sin Censura, Tetonas |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <br><br>SOLO DENLE CLICK A LA IMAGEN PARA DESCARGAR EL DOUJIN<br><br>Nombres Alternativos: ESCUELA EN CASA 1 - HOME SCHOOL 1 #16280 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | `https://images2.imgbox.com/.../JEvgpFrB_o.jpg` (image/jpeg, 8091 bytes, 240x240); known placeholder: imgbox: Thumbnail Temporarily Unavailable | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
