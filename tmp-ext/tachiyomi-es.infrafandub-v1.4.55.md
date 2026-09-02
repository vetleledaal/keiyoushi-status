# Extension Validation Report

- Extension: tachiyomi-es.infrafandub-v1.4.55
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5594696691862732725
- Source name: InfraFandub
- Source language: es
- Selected manga input: popular offset 0: Combat Continent IV (`.../combat-continent-iv`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Combat Continent IV (`.../combat-continent-iv`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Cuñada, Ya no soy tonto (`.../cunada-ya-no-soy-tonto`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Combat Continent IV (`.../combat-continent-iv`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 694 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | SKIP | HTTP error 404 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 36/36 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 36/36 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://infrafandub.com/.../2eaa8cf13ed1731b44f7b36c400113ef.jpg` (image/jpeg, 324902 bytes, 1440x2027) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../combat-continent-iv` |  |  |  |
| details thumbnail URL | PASS | `https://infrafandub.com/.../2eaa8cf13ed1731b44f7b36c400113ef.jpg` |  |  |  |
| details author | PASS | Tang Jia San Shao |  |  |  |
| details artist | PASS | SHENMAN |  |  |  |
| details genres | PASS | Accion, Artes Marciales, Aventura, Fantasia, Shounen |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Han pasado 10.000 años desde el final de la batalla del mundo Douluo con el mundo del abismo. Con las bestias espirituales casi extintas, los maestros del alma han unido fuerzas y han conseguido la paz. La abundante energía del Abismo abrió la puerta del mundo Douluo a los maestros del alma y a las bestias espirituales para alcanzar conocimientos, poder, y rangos que una vez fueron imposibles de lograr. Los humanos del planeta Douluo conquistaron el espacio y descubrieron otros planetas, esta es su historia… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 694 chapters |  |  |  |
| chapter dates | PASS | 694 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i.imgur.com/.../XCZqUq4.png` (image/png, 624557 bytes, 1070x615) |  |  |  |
