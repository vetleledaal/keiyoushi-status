# Extension Validation Report

- Extension: tachiyomi-es.infrafandub-v1.6.59
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5594696691862732725
- Source name: InfraFandub
- Source language: es
- Selected manga input: popular offset 0: Combat Continent IV (`.../combat-continent-iv`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Combat Continent IV (`.../combat-continent-iv`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Combat Continent IV (`.../combat-continent-iv`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Combat Continent IV (`.../combat-continent-iv`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 698 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Combat Continent IV, URL=`.../combat-continent-iv` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 19/19 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 19/19 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://infrafandub.com/.../2eaa8cf13ed1731b44f7b36c400113ef.jpg` (image/jpeg, 324902 bytes, 1440x2027) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../combat-continent-iv` |  |  |  |
| details thumbnail URL | PASS | `https://infrafandub.com/.../2eaa8cf13ed1731b44f7b36c400113ef.jpg` |  |  |  |
| details author | PASS | Tang Jia San Shao |  |  |  |
| details artist | PASS | SHENMAN |  |  |  |
| details genres | PASS | Accion, Artes Marciales, Aventura, Fantasia, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Han pasado 10.000 años desde el final de la batalla del mundo Douluo con el mundo del abismo. Con las bestias espirituales casi extintas, los maestros del alma han unido fuerzas y han conseguido la paz. La abundante energía del Abismo abrió la puerta del mundo Douluo a los maestros del alma y a las bestias espirituales para alcanzar conocimientos, poder, y rangos que una vez fueron imposibles de lograr. Los humanos del planeta Douluo conquistaron el espacio y descubrieron otros planetas, esta es su historia… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 698 chapters |  |  |  |
| chapter dates | PASS | 698 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.imgur.com/.../XCZqUq4.png` (image/png, 624557 bytes, 1070x615) |  |  |  |
