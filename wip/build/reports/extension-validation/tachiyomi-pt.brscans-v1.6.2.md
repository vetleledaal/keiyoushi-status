# Extension Validation Report

- Extension: tachiyomi-pt.brscans-v1.6.2
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
- Source ID: 1420003550573697308
- Source name: BRScans
- Source language: pt-BR
- Selected manga input: popular offset 0: Crônicas do Soberano Preguiçoso (`.../129`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Crônicas do Soberano Preguiçoso (`.../129`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 41 | Despertando o Trovão Púrpura no Início (`.../126`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Crônicas do Soberano Preguiçoso (`.../129`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Crônicas do Soberano Preguiçoso (`.../129`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 222 | Chapter 1 (`.../4164 <redacted query values: variant>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 41 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Crônicas do Soberano Preguiçoso, URL=`.../129` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 52/52 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 52/52 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://d47sf0ah3vbtc.cloudfront.net/.../ba366c8412e34fbca985335734098922.webp` (image/webp (encoding: lossy), 41074 bytes, 300x435) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../129` |  |  |  |
| details thumbnail URL | PASS | `https://d47sf0ah3vbtc.cloudfront.net/.../ba366c8412e34fbca985335734098922.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Crônicas do Soberano Preguigoso Manhwa<br>O grande guerreiro que pôs fim ao causto que assolava o mundo—esse é Wi Yeonho, o Radiante Soberano Marcial.<br>Ele era conhecido como um cavalheiro, um grande homem e um guerreiro cavalheiresco…<br>'Aquele cara? Ele é um completo canalha.'<br>A verdade chocante, vergonhosa demais para ser revelada ao mundo, por trás do chamado maior guerreiro cavalheiresco da história, é finalmente desvendada!<br>태존비록<br><br>**Título original:** Chronicles of the Lazy Sovereign |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 222 chapters |  |  |  |
| chapter dates | PASS | 222 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://d47sf0ah3vbtc.cloudfront.net/.../012bd22ec1864fc5a6c2ff7550c804c5.jpeg` (image/webp (encoding: lossy), 293906 bytes, 700x11325; server Content-Type: image/jpeg) |  |  |  |
