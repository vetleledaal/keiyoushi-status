# Extension Validation Report

- Extension: tachiyomi-fr.bigsolo-v1.6.6
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 4410528266393104437
- Source name: BigSolo
- Source language: fr
- Selected manga input: popular offset 0: Ghost Fixers (`.../ghost-fixers`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 5 | Ghost Fixers (`.../ghost-fixers`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 108 | Drama Queen (`.../drama-queen`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ghost Fixers (`.../ghost-fixers`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ghost Fixers (`.../ghost-fixers`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 99 | Vol. 1 Ch. 1 – Arrivée (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 83 |  |  | <1s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 108 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ghost Fixers, URL=`.../ghost-fixers` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 114/114 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 114/114 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.imgchest.com/.../30c3969948d6.webp` (image/webp (encoding: lossy), 90530 bytes, 702x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ghost-fixers` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.imgchest.com/.../30c3969948d6.webp` |  |  |  |
| details author | PASS | Yasuki Tanaka |  |  |  |
| details artist | PASS | Yasuki Tanaka |  |  |  |
| details genres | PASS | Action, Surnaturel, Fantômes |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Après un événement funeste, la nouvelle ville de Mikurigaoka est devenu le centre de phénomènes surréalistes connus sous le noms de "Fantômes" ! 7 ans plus tard, Hifumi, un collégien résidant dans cette ville, rencontre une jeune fille venant juste d'y emménager... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 99 chapters |  |  |  |
| chapter dates | PASS | 99 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 83 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.imgchest.com/.../0e6f01093f09.png` (image/png, 1470975 bytes, 1200x1752) |  |  |  |
