# Extension Validation Report

- Extension: tachiyomi-pt.azuretoons-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6272815455807597212
- Source name: Azuretoons
- Source language: pt-BR
- Selected manga input: latest offset 0: Seu Guarda Costas Particular (`.../seu-guarda-costas-particular`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 178 | O Médico Divino Urbano (`.../o-medico-divino-urbano`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 178 | Seu Guarda Costas Particular (`.../seu-guarda-costas-particular`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Seu Guarda Costas Particular (`.../seu-guarda-costas-particular`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Seu Guarda Costas Particular (`.../seu-guarda-costas-particular`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 41 | Capítulo 0 (`.../0.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 178 entries |  |  |  |
| latest listing | PASS | 178 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Seu Guarda Costas Particular, URL=`.../seu-guarda-costas-particular` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 357/357 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 357/357 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://azuretoons.com/.../image <redacted query values: url and hash>` (image/webp (encoding: lossy), 58708 bytes, 520x780) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../seu-guarda-costas-particular` |  |  |  |
| details thumbnail URL | PASS | `https://azuretoons.com/.../image <redacted query values: url and hash>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Antigamente o ás da gangue misteriosa “Dragon Spirit”, ele foi nomeado o “Deus da Morte” que aterrorizava até as forças mais sombrias. Agora ele está aposentado e tentando levar uma vida comum, apenas para se ver enredado com uma série de beldades: uma esposa parecida com uma deusa, uma policial violenta, uma secretária inocente, uma máfia legal… para piorar as coisas, toda mulher vem com problemas em abundância… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 41 chapters |  |  |  |
| chapter dates | PASS | 41 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://azuretoons.com/.../image <redacted query values: url and hash>` (image/webp (container: extended), 91750 bytes, 1410x752) |  |  |  |
