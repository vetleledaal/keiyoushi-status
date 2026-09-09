# Extension Validation Report

- Extension: tachiyomi-pt.mangotoons-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangotheme
- Source ID: 8989984812354857153
- Source name: Mango Toons
- Source language: pt-BR
- Selected manga input: popular offset 0: Mestre Espadachim Criado Pelas Estrelas (`.../10642`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Mestre Espadachim Criado Pelas Estrelas (`.../10642`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | O Amor é uma Droga (`.../14090`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | De Reclusa, A Princesa em um Dark Romance! (`.../12871`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mestre Espadachim Criado Pelas Estrelas (`.../10642`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mestre Espadachim Criado Pelas Estrelas (`.../10642`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 145 | Capitulo 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 120 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mestre Espadachim Criado Pelas Estrelas, URL=`.../10642` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://back2.mediocrescan.com/.../capa <redacted query values: f>` (image/webp (encoding: lossy), 57748 bytes, 520x780) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../10642` |  |  |  |
| details thumbnail URL | PASS | `https://back2.mediocrescan.com/.../capa <redacted query values: f>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Aventura, Drama, Fantasia, Magia, Shounen |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | Vlad era um fruto das favelas que sempre admirou os cavaleiros. Após um incidente em que foi atingido por um raio negro, ele começou a ouvir uma voz. Um cavaleiro do luar azul apareceu um dia, e a vida de Vlad, que parecia um beco sem saída, virou de cabeça para baixo… Mesmo uma estrela que não brilha até mesmo nos picos mais altos do céu noturno, ainda é uma estrela, se possuir o desejo de brilhar. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 145 chapters |  |  |  |
| chapter dates | PASS | 145 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../119` at offsets 18, 19, `.../43` at offsets 95, 96, `.../40` at offsets 99, 100, `.../39` at offsets 101, 102, `.../38` at offsets 103, 104, `.../37` at offsets 105, 106, `.../36` at offsets 107, 108, `.../35` at offsets 109, 110 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 120 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://api.mangotoons.com/.../0` to `https://api.mangotoons.com/.../0 <redacted query values: ts>` (1 redirects) |  |  |  |
| page load | PASS | `https://api.mangotoons.com/.../0` (image/webp (encoding: lossy), 303470 bytes, 800x2599) |  |  |  |
