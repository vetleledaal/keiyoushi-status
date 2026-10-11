# Extension Validation Report

- Extension: tachiyomi-pt.exhentainetbr-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1408140394859123923
- Source name: ExHentai.net.br
- Source language: pt-BR
- Selected manga input: popular offset 0: Esposas do Conjunto Habitacional que eu quero comer e lamber (`.../esposas-do-conjunto-habitacional-que-eu-quero-comer-e-lamber`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 21 | Esposas do Conjunto Habitacional que eu quero comer e lamber (`.../esposas-do-conjunto-habitacional-que-eu-quero-comer-e-lamber`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 21 | Minha Irmã… (`.../minha-irma`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Esposas do Conjunto Habitacional que eu quero comer e lamber (`.../esposas-do-conjunto-habitacional-que-eu-quero-comer-e-lamber`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Esposas do Conjunto Habitacional que eu quero comer e lamber (`.../esposas-do-conjunto-habitacional-que-eu-quero-comer-e-lamber`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Capítulo 1 (`.../chapter <redacted query values: id and ch>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 27 |  |  | <1s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Esposas do Conjunto Habitacional que eu quero comer e lamber, URL=`.../esposas-do-conjunto-habitacional-que-eu-quero-comer-e-lamber` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 43/43 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 43/43 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://exhentai.net.br/.../esposas-do-conjunto-habitacional-que-eu-quero-comer-e-lamber-capa-216x300.jpg` (image/jpeg, 136358 bytes, 400x560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../esposas-do-conjunto-habitacional-que-eu-quero-comer-e-lamber` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://exhentai.net.br/.../esposas-do-conjunto-habitacional-que-eu-quero-comer-e-lamber-capa-400x560.jpg` was not downloaded |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai, Mangá Hentai, Boquete, Brinquedos Sexuais, Creampie, Dilf, Masturbação, Meia-Calça, Pau Grande, Peitões, Pelos Pubianos, Suor |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Confira agora o mangá adulto Esposas do Conjunto Habitacional que eu quero comer e lamber em alta qualidade em nosso portal. Se você é fã de um bom hentai online, esta obra traz uma história envolvente e ilustrações incríveis traduzidas para o português. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://exhentai.net.br/.../1` to `https://exhentai.net.br/.../lista-de-mangas` (1 redirects); popular: `https://exhentai.net.br/.../2` to `https://exhentai.net.br/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://exhentai.net.br/.../esposas-do-conjunto-habitacional-que-eu-quero-comer-e-lamber-cap-1-pag-01.jpg` (image/jpeg, 500521 bytes, 1715x1400) |  |  |  |
