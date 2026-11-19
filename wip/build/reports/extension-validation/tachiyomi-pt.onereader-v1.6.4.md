# Extension Validation Report

- Extension: tachiyomi-pt.onereader-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5026351287650198434
- Source name: OneReader
- Source language: pt-BR
- Selected manga input: popular offset 0: O Trailer de Comida do Go Deok-chun (`.../o-trailer-de-comida-do-go-deok-chun`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | O Trailer de Comida do Go Deok-chun (`.../o-trailer-de-comida-do-go-deok-chun`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | O Retorno do Assassino de Dragões de Classe Única (`.../retorno-assassino-dragoes`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | O Caçador imortal de rank-SSS (`.../imortal-sss`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Escândalo Amoroso da Imperatriz (`.../escandalo-amoroso-da-imperatriz`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | O Trailer de Comida do Go Deok-chun (`.../o-trailer-de-comida-do-go-deok-chun`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Trailer de Comida do Go Deok-chun (`.../o-trailer-de-comida-do-go-deok-chun`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 57 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=O Trailer de Comida do Go Deok-chun, URL=`o-trailer-de-comida-do-go-deok-chun` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://b2.onereader.net/.../1792294006929-42ffecb1-adb.webp` (image/webp (container: extended), 1519608 bytes, 1696x2458) |  |  |  |
| details identity | PASS | Details preserved selected URL `o-trailer-de-comida-do-go-deok-chun` |  |  |  |
| details thumbnail URL | PASS | `https://b2.onereader.net/.../1792294006929-42ffecb1-adb.webp` |  |  |  |
| details author | PASS | Popo |  |  |  |
| details artist | PASS | Popo |  |  |  |
| details genres | PASS | Webtoon, Romance, Comédia, Harém, Drama, Vida Cotidiana |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Coreia · 2025 · Naver<br><br>Junho herda um food truck de seu falecido tio Deokchun e parte em uma jornada pelo país para tornar o nome "Go Deokchun" famoso através de sua culinária. Começando com Sehee, uma herdeira de um chaebol, Junho se envolve com mulheres que têm suas próprias histórias em cada região. Embora todas se apaixonem por ele, o coração de Junho é conquistado apenas pela culinária! Esta é uma história de viagem romântica por todo o país, com o carismático Junho — "Vamos começar os negócios!"<br><br>**Títulos alternativos:**<br>- Go Deok-chun ui Food Truck<br>- 고덕춘의 푸드트럭<br><br>**Links:**<br>- \[Naver\](https://comic.naver.com/.../list <redacted query values: titleId>) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 57 chapters |  |  |  |
| chapter dates | PASS | 57 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://onereader.invalid/.../1` (image/webp (encoding: lossy), 1742362 bytes, 720x13500; server Content-Type: application/octet-stream) |  |  |  |
