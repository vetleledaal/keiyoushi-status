# Extension Validation Report

- Extension: tachiyomi-es.platinumlilyscan-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5939158356306781713
- Source name: Platinum Lily Scan
- Source language: es
- Selected manga input: popular offset 0: Please Bully Me, Miss Villainess! (`.../please-bully-me-miss-villainess`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 77 | Please Bully Me, Miss Villainess! (`.../please-bully-me-miss-villainess`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 77 | Whispering You a Love Song "AyaMiki" (`.../whispering-you-a-love-song-ayamiki`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Please Bully Me, Miss Villainess! (`.../please-bully-me-miss-villainess`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Please Bully Me, Miss Villainess! (`.../please-bully-me-miss-villainess`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 140 | Capítulo 1 (`.../please-bully-me-miss-villainess`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | <1s |

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
| popular listing | PASS | 77 entries |  |  |  |
| latest listing | PASS | 77 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Please Bully Me, Miss Villainess!, URL=`please-bully-me-miss-villainess` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 155/155 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 155/155 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://platinumlilyscan.com/.../please-bully-me-miss-villainess.jpg` (image/jpeg, 153448 bytes, 512x725) |  |  |  |
| details identity | PASS | Details preserved selected URL `please-bully-me-miss-villainess` |  |  |  |
| details thumbnail URL | PASS | `https://platinumlilyscan.com/.../please-bully-me-miss-villainess.jpg` |  |  |  |
| details author | PASS |  Chise, Ciwei Mao Yuedu |  |  |  |
| details artist | PASS | Mo Xian She |  |  |  |
| details genres | PASS | Yuri, Romance, Comedia, Fantasía, Isekai, Sobrenatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yo, Yifang, reencarné en un juego otome como la villana. Según la trama del juego, un personaje detestado por todos como yo tiene el papel principal de acosar a la heroína, empujándola hacia las rutas románticas de los distintos intereses amorosos. Pero parece que a Xia shao, la heroína, le pasa algo. ¡Se está acercando demasiado a mí! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: author |  |  |  |
| chapters | PASS | 140 chapters |  |  |  |
| chapter dates | PASS | 140 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://platinumlilyscan.com/.../001.webp` (image/webp (encoding: lossy), 221804 bytes, 750x1999) |  |  |  |
