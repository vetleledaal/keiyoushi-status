# Extension Validation Report

- Extension: tachiyomi-pt.superhq-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8618551173246946816
- Source name: SuperHQ
- Source language: pt-BR
- Selected manga input: popular offset 0: Foda-madrinha (`.../foda-madrinha.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Foda-madrinha (`.../foda-madrinha.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 17 | Daval3D – Immoral Desires 14 (`.../daval3d-immoral-desires-14.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Foda-madrinha (`.../foda-madrinha.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Foda-madrinha (`.../foda-madrinha.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo (`.../foda-madrinha.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Foda-madrinha, URL=`.../foda-madrinha.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 34/34 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 33/34 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.superhq.net/.../Foda-madrinha.webp` (image/webp (encoding: lossy), 29272 bytes, 775x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../foda-madrinha.html` |  |  |  |
| details thumbnail URL | PASS | `https://www.superhq.net/.../Foda-madrinha.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Casa da mãe Joana Tufos, Hentai, HQ, tufos, peitões |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Foda-madrinha. Fernando guarda um anseio oculto por sua madrinha Luciana… Toda vez que a vê, ele se apressa para o banheiro para se aliviar! Numa certa noite, ao retornar de mais uma dessas escapadas, o jovem se depara com a encantadora madrinha deitada na cama, usando uma lingerie transparente… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.superhq.net/.../Foda-madrinha-01.webp` (image/webp (encoding: lossy), 161290 bytes, 900x1200) |  |  |  |
