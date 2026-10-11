# Extension Validation Report

- Extension: tachiyomi-pt.hentaiseason-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gattsu
- Source ID: 28629678708276
- Source name: Hentai Season
- Source language: pt-BR
- Selected manga input: popular offset 0: A Garota que Vendia Camisinhas (`.../a-garota-que-vendia-camisinhas`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | A Garota que Vendia Camisinhas (`.../a-garota-que-vendia-camisinhas`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Pack de Imagens (High School DxD / Rias) (`.../pack-de-imagens-high-school-dxd-rias`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Garota que Vendia Camisinhas (`.../a-garota-que-vendia-camisinhas`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Garota que Vendia Camisinhas (`.../a-garota-que-vendia-camisinhas`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../a-garota-que-vendia-camisinhas`) |  | <1s |
| pages | `getPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Garota que Vendia Camisinhas, URL=`.../a-garota-que-vendia-camisinhas` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaiseason.com/.../garota_vendia_camisinha_01-241x334.webp` (image/webp (encoding: lossy), 21660 bytes, 241x334) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-garota-que-vendia-camisinhas` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaiseason.com/.../garota_vendia_camisinha_01.webp` (image/webp (encoding: lossy), 231808 bytes, 1280x1804) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Biquíni, Bundão, Camisinha, Creampie, lançamentos, Oral, Peitão |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Sinopse: Machi começou a vender camisinhas para fazer um trocado a mais e acabou descobrindo um jeito super gostoso e fácil de fazer suas vendas.<br><br>Comissão de traduções? Você pode pedir uma aqui! Sugestão de packs? Participe do nosso discord clicando aqui! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentaiseason.com/.../2` to `https://hentaiseason.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://hentaiseason.com/.../garota_vendia_camisinha_01.webp` (image/webp (encoding: lossy), 231808 bytes, 1280x1804) |  |  |  |
