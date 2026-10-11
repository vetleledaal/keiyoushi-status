# Extension Validation Report

- Extension: tachiyomi-pt.geasscomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7839519253265657488
- Source name: Geass Comics
- Source language: pt-BR
- Selected manga input: popular offset 0: Nanotecnologia Marcial (`.../nanotecnologia-marcial`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Nanotecnologia Marcial (`.../nanotecnologia-marcial`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Eu Realmente Não Sou o Lacaio do Deus Demônio (`.../eu-realmente-nao-sou-o-lacaio-do-deus-demonio`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | A Pessoa Dentro da Vilã ~Vingarei a Heroína Mentirosa pela Pessoa Reencarnada que Foi Condenada~ (`.../a-pessoa-dentro-da-vila-vingarei-a-heroina-mentirosa-pela-pessoa-reencarnada-que-foi-condenada`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Eu Acidentalmente Ressuscitei Meu Marido (`.../eu-acidentalmente-ressuscitei-meu-marido`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nanotecnologia Marcial (`.../nanotecnologia-marcial`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nanotecnologia Marcial (`.../nanotecnologia-marcial`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 330 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nanotecnologia Marcial, URL=`.../nanotecnologia-marcial` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.geasscomics.xyz/.../1767911874955-nanotecnologia-marcial-w1800.webp` (image/webp (encoding: lossy), 363180 bytes, 1800x2314) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../nanotecnologia-marcial` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.geasscomics.xyz/.../1767911874955-nanotecnologia-marcial-w1800.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Cultivo, Aventura, Artes Marciais, Ação, Fantasia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A mãe de Yeo-un pode não ser uma das seis esposas oficiais do Sumo Sacerdote, mas o sangue de seu pai ainda o qualifica para disputar o cargo de Sacerdote Menor. Será que uma misteriosa injeção de nanomáquina vinda de um descendente do futuro vai ajudar Yeo-un nessa competição acirrada contra seus poderosos meio-irmãos? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 330 chapters |  |  |  |
| chapter dates | PASS | 330 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://cdn.geasscomics.xyz/.../1-001.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
