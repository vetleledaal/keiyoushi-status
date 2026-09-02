# Extension Validation Report

- Extension: tachiyomi-pt.mangalivreblog-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 588678420372440028
- Source name: Manga Livre Blog
- Source language: pt-BR
- Selected manga input: popular offset 0: Hajimete no Gal (`.../hajimete-no-gal`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Hajimete no Gal (`.../hajimete-no-gal`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Hajimete no Gal (`.../hajimete-no-gal`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Hajimete no Gal (`.../hajimete-no-gal`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 201 | Capítulo 1: Minha primeira dogueza (`.../hajimete-no-gal-capitulo-1-minha-primeira-dogueza`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | <1s |

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
| latest listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hajimete no Gal, URL=`.../hajimete-no-gal` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 has no manga to check |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 11/11 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 11/11 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangalivre.blog/.../c3dd439d-94bb-4210-8080-6d4d28871c41.jpg.512.jpg` (image/jpeg, 131799 bytes, 512x728) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hajimete-no-gal` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Ueno Meguru |  |  |  |
| details artist | PASS | Ueno Meguru |  |  |  |
| details genres | PASS | Comedy, Gyaru, Harem, Romance, School Life, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Junichi Hashiba é um jovem colegial virgem que está desesperado para perder esse status. Sob pressão de seus amigos, o garoto acaba se declarando para Yukana Yame. Surpreendentemente a garota aceita e um casal é formado. Porém, Jun acaba se encontrando em águas desconhecidas com Yame, que é uma gyaru (um tipo de moda urbana japonesa). Enquanto ele fantasia em perder a sua virgindade, ela se mostra mais normal e inocente do que ele imaginava. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 201 chapters |  |  |  |
| chapter dates | PASS | 201 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangalivre.blog/.../1-c50907b67d9d93e782d0bb29df8224c6aae2c088ea308f068deebbaba88a27b2-1.jpg` (image/jpeg, 152395 bytes, 1000x1000) |  |  |  |
