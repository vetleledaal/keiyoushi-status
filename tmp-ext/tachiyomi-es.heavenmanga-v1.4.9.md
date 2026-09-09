# Extension Validation Report

- Extension: tachiyomi-es.heavenmanga-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1872740333369520717
- Source name: HeavenManga
- Source language: es
- Selected manga input: latest offset 0: Le miento a mi hermanastra ~Decidí acoger a mi hermana, con quien no comparto lazos sanguíneos~ (`.../le-miento-a-mi-hermanastra-decid-acoger-a-mi-hermana-con-quien-no-comparto-lazos-sanguneos`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 39 | Le miento a mi hermanastra ~Decidí acoger a mi hermana, con quien no comparto lazos sanguíneos~ (`.../le-miento-a-mi-hermanastra-decid-acoger-a-mi-hermana-con-quien-no-comparto-lazos-sanguneos`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Le miento a mi hermanastra ~Decidí acoger a mi hermana, con quien no comparto lazos sanguíneos~ (`.../le-miento-a-mi-hermanastra-decid-acoger-a-mi-hermana-con-quien-no-comparto-lazos-sanguneos`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Le miento a mi hermanastra ~Decidí acoger a mi hermana, con quien no comparto lazos sanguíneos~ (`.../le-miento-a-mi-hermanastra-decid-acoger-a-mi-hermana-con-quien-no-comparto-lazos-sanguneos`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 4 | Capítulo: 1 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 65 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | SKIP | HTTP error 404 |  |  |  |
| latest listing | PASS | 39 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Le miento a mi hermanastra ~Decidí acoger a mi hermana, con quien no comparto lazos sanguíneos~, URL=`.../le-miento-a-mi-hermanastra-decid-acoger-a-mi-hermana-con-quien-no-comparto-lazos-sanguneos` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | HTTP error 404 |  |  |  |
| latest pagination | SKIP | HTTP error 404 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://heavenmanga.com/.../cover_250x350.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../le-miento-a-mi-hermanastra-decid-acoger-a-mi-hermana-con-quien-no-comparto-lazos-sanguneos` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://heavenmanga.com/.../cover_250x350.png` (image/jpeg, 16969 bytes, 250x350; server Content-Type: image/png) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Recuentos de la vida, Seinen |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Animado por un mal amigo, Rokurou Sanjo, un trabajador de medio tiempo, comienza a usar una aplicación de citas. La persona a la que le envió un "Me gusta" por un impulso de borracho no fue otra que su hermanastra, Yuuha, de quien se había distanciado desde que lo echaron de la casa hace dos años. Sin embargo, por alguna razón, ¡¡termina haciendo "match" con ella!! Impulsado por un capricho momentáneo, Rokuro comienza a intercambiar mensajes con ella mientras finge ser un completo desconocido, pero...!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 65 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../001.png` (image/png, 1217772 bytes, 1126x1600) |  |  |  |
