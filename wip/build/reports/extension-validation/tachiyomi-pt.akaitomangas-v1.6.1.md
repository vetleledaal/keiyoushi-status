# Extension Validation Report

- Extension: tachiyomi-pt.akaitomangas-v1.6.1
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
- Source ID: 2836576732412182275
- Source name: Akaito Mangás
- Source language: pt-BR
- Selected manga input: popular offset 0: Marcial Inverso (`.../marcial-inverso`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Marcial Inverso (`.../marcial-inverso`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Só Tenho Olhos Para Você (`.../so-tenho-olhos-para-voce`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Marcial Inverso (`.../marcial-inverso`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Marcial Inverso (`.../marcial-inverso`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 552 | Capítulo 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Marcial Inverso, URL=`.../marcial-inverso` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.akaitomangas.com/.../bd8434d0-d2eb-456c-9645-9ec631eeb565.webp` (image/webp (encoding: lossy), 99804 bytes, 640x800; server Content-Type: text/plain;charset=UTF-8) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../marcial-inverso` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.akaitomangas.com/.../bd8434d0-d2eb-456c-9645-9ec631eeb565.webp` |  |  |  |
| details author | PASS | iCiyuan Animation |  |  |  |
| details artist | PASS | iCiyuan Animation |  |  |  |
| details genres | PASS | Ação, Aventura, Fantasia |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | No Continente Tianwu, os mais fortes dominam. Feng Hao, o filho mais velho do Clã Feng, era considerado um lixo apesar de possuir um físico incomparável, e foi repetidamente humilhado por todos! Por sorte, seu físico mudou, permitindo-lhe reverter seu destino! Ele usou um Cristal Aberrante para forjar sua carne e recebeu o corpo supremo. No momento em que ele controlar o vazio, será o momento em que ele destruirá o céu e a terra para aniquilar tudo! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 552 chapters |  |  |  |
| chapter dates | PASS | 552 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.akaitomangas.com/.../05254a5c-041c-491b-8750-a6ac1001d137.webp` (image/webp (container: extended), 385626 bytes, 800x9255; server Content-Type: text/plain;charset=UTF-8) |  |  |  |
