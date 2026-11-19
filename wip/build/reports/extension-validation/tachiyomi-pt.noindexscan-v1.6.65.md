# Extension Validation Report

- Extension: tachiyomi-pt.noindexscan-v1.6.65
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source theme: madara
- Source ID: 987786689720213769
- Source name: Hanami Heaven
- Source language: pt-BR
- Selected manga input: popular offset 0: Currently Filming (`.../7885`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Currently Filming (`.../7885`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | A Dona de Casa que Veio à Minha Porta (`.../6323`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Set It! (`.../3662`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | MILF Exchange Plan (`.../4381`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Currently Filming (`.../7885`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Currently Filming (`.../7885`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Cap. 01 (`.../cap-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Currently Filming, URL=`7885` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hanamiheaven.org/.../capa_upscayl_3x_upscayl-lite-4x-800x1120.webp` (image/webp (encoding: lossless), 591376 bytes, 800x1120) |  |  |  |
| details identity | PASS | Details preserved selected URL `7885` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hanamiheaven.org/.../capa_upscayl_3x_upscayl-lite-4x.webp` (image/webp (encoding: lossless), 759498 bytes, 900x1260) |  |  |  |
| details author | PASS | Numin |  |  |  |
| details artist | PASS | Red City |  |  |  |
| details genres | PASS | App, Harem, Revenge, Supernatural, Pornhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | No momento em que ele tira fotos das mulheres na academia usando uma câmera misteriosa que encontrou por acaso, a atitude delas muda repentinamente?! “O-O que foi… que eu acabei de ver?!” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hanamiheaven.org/.../0001.webp` (image/webp (encoding: lossy), 594898 bytes, 720x4360) |  |  |  |
