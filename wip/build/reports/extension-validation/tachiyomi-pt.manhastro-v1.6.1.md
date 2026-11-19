# Extension Validation Report

- Extension: tachiyomi-pt.manhastro-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 5123733616022476906
- Source name: Manhastro
- Source language: pt-BR
- Selected manga input: popular offset 0: Congelamento Global (`.../23788`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Congelamento Global (`.../23788`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 100 | O Grande Rei Demônio: Livre-me, Grande Senhor (`.../18312`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Congelamento Global (`.../23788`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Congelamento Global (`.../23788`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 299 | Capitulo 1 (`.../194394`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Congelamento Global, URL=`.../23788` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://capa.manhastro.net/.../thumbnail-21027.webp` (image/webp (encoding: lossy), 36762 bytes, 288x412) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../23788` |  |  |  |
| details thumbnail URL | PASS | `https://capa.manhastro.net/.../thumbnail-21027.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Manhua, Sobrevivência, Aventura, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | O mundo mergulhou numa era glacial, e 95% da humanidade foi dizimada! Na sua vida anterior, Zhang Yi foi tragicamente morto pelas pessoas que ajudou, mas ganhou uma segunda chance e agora domina a manipulação espacial, capaz de armazenar tudo o que deseja. Para sobreviver neste mundo congelado, ele se prepara estocando vastas quantidades de comida, e fará com que aqueles que o mataram sofram muito! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 299 chapters |  |  |  |
| chapter dates | PASS | 299 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://albums.manhastro.net/.../1.avif` (image/avif (format: avif), 300821 bytes, 2160x3002) |  |  |  |
