# Extension Validation Report

- Extension: tachiyomi-es.heavenmanga-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 26
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
- Selected manga input: latest offset 0: La evolución de la serpiente inmortal (`.../la-evolucion-de-la-serpiente-inmortal`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 38 | La evolución de la serpiente inmortal (`.../la-evolucion-de-la-serpiente-inmortal`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | La evolución de la serpiente inmortal (`.../la-evolucion-de-la-serpiente-inmortal`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | La evolución de la serpiente inmortal (`.../la-evolucion-de-la-serpiente-inmortal`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 102 | Capítulo: 102-es (`.../102-es`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| latest listing | PASS | 38 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La evolución de la serpiente inmortal, URL=`.../la-evolucion-de-la-serpiente-inmortal` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | HTTP error 404 |  |  |  |
| latest pagination | SKIP | HTTP error 404 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://heavenmanga.com/.../cover_250x350.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../la-evolucion-de-la-serpiente-inmortal` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://heavenmanga.com/.../cover_250x350.webp` (image/jpeg, 23057 bytes, 250x350; server Content-Type: image/webp) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Accion, Artes Marciales, Aventura |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | En un pueblo, una vieja serpiente se tragó sin querer una píldora con forma humana de un cultivador, lo que le dio inteligencia y la llevó a empezar el camino del cultivo. Con solo una década de vida, la serpiente no le tiene miedo al paso del tiempo, sino que aprovecha cada momento al máximo. Esta es la historia del viaje de una vieja serpiente hacia la inmortalidad. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 102 chapters |  |  |  |
| chapter dates | PASS | 102 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0001.jpg` (image/jpeg, 341240 bytes, 720x1305) |  |  |  |
