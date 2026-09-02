# Extension Validation Report

- Extension: tachiyomi-pt.hqnow-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1639829368022947378
- Source name: HQ Now!
- Source language: pt-BR
- Selected manga input: latest offset 0: Doutor Estranho (2023) (`.../doutor-estranho-2023`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 300 | Invencível (2003) (`.../invencivel-2003`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 45 | Doutor Estranho (2023) (`.../doutor-estranho-2023`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Doutor Estranho (2023) (`.../doutor-estranho-2023`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Doutor Estranho (2023) (`.../doutor-estranho-2023`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | #1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 300 entries |  |  |  |
| latest listing | PASS | 45 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Doutor Estranho (2023), URL=`.../doutor-estranho-2023` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 346/346 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 345/346 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://static.hq-now.com/.../Doctor_Strange_001-000.jpg` (image/jpeg, 374427 bytes, 976x1500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../doutor-estranho-2023` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `http://static.hq-now.com/.../Doctor_Strange_009__2023__00000.jpg` (image/jpeg, 236467 bytes, 976x1500) |  |  |  |
| details author | PASS | Marvel Comics |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Stephen Strange está de volta! Reunido com Clea e Wong, está de volta aos negócios como de costume para o Feiticeiro Supremo. Seus filhos já tiveram um pesadelo profundo? Os refugiados demoníacos estão invadindo sua casa? Seu marido está possuído por uma entidade satânica? Então chame o Doutor Estranho! Junte-se a Jed MacKay (Cavaleiro da Lua, Gata Negra) e Pasqual Ferry (Namor: Praias Conquistadas, Homem-Aranha: A Sombra da Aranha, Thor) enquanto eles iniciam um novo capítulo na vida do Mestre das Artes Místicas! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | LINT | All 9 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=9 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://static.hq-now.com/.../Doctor_Strange_001-000.jpg` (image/jpeg, 374427 bytes, 976x1500) |  |  |  |
