# Extension Validation Report

- Extension: tachiyomi-pt.geasscomics-v1.6.1
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
- Source ID: 7839519253265657488
- Source name: Geass Comics
- Source language: pt-BR
- Selected manga input: popular offset 0: Academia da Transcendência (`.../academia-da-transcendencia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Academia da Transcendência (`.../academia-da-transcendencia`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Eu Realmente Não Sou o Lacaio do Deus Demônio (`.../eu-realmente-nao-sou-o-lacaio-do-deus-demonio`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Apocalipse dos Mortos-Vivos: Ergo a Mão e Invoco um Mar de Milhões de Ossos (`.../apocalipse-dos-mortos-vivos-ergo-a-mao-e-invoco-um-mar-de-milhoes-de-ossos`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Ela é a Irmã de um Merda (`.../ela-e-a-irma-de-um-merda`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Academia da Transcendência (`.../academia-da-transcendencia`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Academia da Transcendência (`.../academia-da-transcendencia`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 200 | Capítulo 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Academia da Transcendência, URL=`.../academia-da-transcendencia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.geasscomics.xyz/.../1767912486110-academia-da-transcedencia-w1800.webp` (image/webp (encoding: lossy), 282794 bytes, 1800x2700) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../academia-da-transcendencia` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.geasscomics.xyz/.../1767912486110-academia-da-transcedencia-w1800.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Ação, Fantasia, Vida Escolar, Shounen, Comédia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Após cem anos de invasões de monstros, treinar em academias de hunters tornou-se o único caminho para quem deseja ser um profissional. E esse é exatamente o sonho de Seojun Kim, um órfão extremamente dedicado. Mas quando um acidente terrível destrói suas esperanças, anúncios da misteriosa Academia Transcendente começam a surgir em seu celular, oferecendo a chance de treinar virtualmente com os guerreiros mais lendários da história. Conforme sobe de nível, Seojun é tragado para um mundo de academias de elite, raides em dungeons e torneios competitivos. Porém, quanto mais forte ele fica, mais dúvidas surgem sobre as pessoas ao seu redor, seu próprio passado e os segredos sombrios por trás da Academia Transcendente. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 200 chapters |  |  |  |
| chapter dates | PASS | 200 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.geasscomics.xyz/.../1-001_result.webp` (image/webp (encoding: lossy), 775242 bytes, 700x15000; server Content-Type: image/jpeg) |  |  |  |
