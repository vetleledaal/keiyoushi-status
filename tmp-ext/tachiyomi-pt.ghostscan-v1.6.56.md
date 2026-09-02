# Extension Validation Report

- Extension: tachiyomi-pt.ghostscan-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2150748053027323425
- Source name: Ghost Scan
- Source language: pt-BR
- Selected manga input: popular offset 0: Sonhando com a Liberdade (`.../176`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Sonhando com a Liberdade (`.../176`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 21 | Registros Eróticos da Dinastia Joseon (`.../1863`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | As Flores Dançam e o Vento Canta (`.../1402`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 21 | Todas as Cores da Neve (`.../978`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sonhando com a Liberdade (`.../176`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sonhando com a Liberdade (`.../176`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 185 | Cap 1 (`.../cap-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 68 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sonhando com a Liberdade, URL=`176` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 93/93 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 93/93 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ghostscan.xyz/.../capa-dream-350x476.jpeg` (image/jpeg, 39904 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `176` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ghostscan.xyz/.../capa-dream-193x278.jpeg` (image/jpeg, 15601 bytes, 193x278) |  |  |  |
| details author | PASS | 2 L |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Escolar, Josei, Manhwa, Psicológico, Romance, Sobrenatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Choi Jungmin é severamente intimidada no ensino médio por causa de um relacionamento ruim com Ha Joohyun quando criança. Seu único consolo é o “sonho lúcido” que assombra Ha Joohyun em um sonho que ninguém pode perturbar. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 185 chapters |  |  |  |
| chapter dates | LINT | 30 of 185 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=30 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ghostscan.xyz/.../0.png` (image/png, 456019 bytes, 720x405) |  |  |  |
