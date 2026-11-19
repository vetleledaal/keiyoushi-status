# Extension Validation Report

- Extension: tachiyomi-pt.hentaiseason-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Selected manga input: popular offset 0: Pack de Imagens (Genshin Impact / Varesa) (`.../pack-de-imagens-genshin-impact-varesa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Pack de Imagens (Genshin Impact / Varesa) (`.../pack-de-imagens-genshin-impact-varesa`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Tive sexo selvagem com uma gyaru gostosa e comprometida que trabalhava meio período! 2 (`.../tive-sexo-selvagem-com-uma-gyaru-gostosa-e-comprometida-que-trabalhava-meio-periodo-2`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Pack de Imagens (Genshin Impact / Varesa) (`.../pack-de-imagens-genshin-impact-varesa`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Pack de Imagens (Genshin Impact / Varesa) (`.../pack-de-imagens-genshin-impact-varesa`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../pack-de-imagens-genshin-impact-varesa`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pack de Imagens (Genshin Impact / Varesa), URL=`.../pack-de-imagens-genshin-impact-varesa` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaiseason.com/.../pack_imagens_genshin_impact_varesa_21-241x334.webp` (image/webp (encoding: lossy), 11628 bytes, 241x334) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pack-de-imagens-genshin-impact-varesa` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaiseason.com/.../pack_imagens_genshin_impact_varesa_21.webp` (image/webp (encoding: lossy), 68726 bytes, 811x1142) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | lançamentos |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Comissão de traduções? Você pode pedir uma aqui! Sugestão de packs? Participe do nosso discord clicando aqui! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentaiseason.com/.../2` to `https://hentaiseason.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://hentaiseason.com/.../pack_imagens_genshin_impact_varesa_01.webp` (image/webp (container: extended), 112822 bytes, 768x1280) |  |  |  |
