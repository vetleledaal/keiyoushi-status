# Extension Validation Report

- Extension: tachiyomi-es.fokascans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3533678542470353642
- Source name: FokaScans
- Source language: es
- Selected manga input: popular offset 0: One Piece - Manga (`.../onepiecemanga`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 2 | One Piece - Manga (`.../onepiecemanga`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | One Piece - Manga (`.../onepiecemanga`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece - Manga (`.../onepiecemanga`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 24 | Cap. 1175: Nidhogg (`.../1175`) |  | <1s |
| pages | `getPageList(chapter)` | success | 11 |  |  | <1s |

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
| popular listing | PASS | 2 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece - Manga, URL=`.../onepiecemanga` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 3/3 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 3/3 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pub-74673ac64d554344a8f96bcb62977c0d.r2.dev/.../cover.jpg <redacted query values: v>` (image/jpeg, 19313 bytes, 183x275) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../onepiecemanga` |  |  |  |
| details thumbnail URL | PASS | `https://pub-74673ac64d554344a8f96bcb62977c0d.r2.dev/.../cover.jpg <redacted query values: v>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Original, Sci-Fi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Veintidós años después de la muerte del rey de los piratas Gol D. Roger, un joven llamado Monkey D. Luffy está listo para embarcarse en su propia aventura, en busca del One Piece y con el objetivo de convertirse en el nuevo Rey de los Piratas. Armado solo con un sombrero de paja, un pequeño bote y un cuerpo elástico, se embarca en un fantástico viaje para reunir a su propia tripulación y un barco digno que los lleve a través de Grand Line para reclamar el estatus más alto en alta mar. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 15 name |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | LINT | 1 of 24 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pub-74673ac64d554344a8f96bcb62977c0d.r2.dev/.../00.jpg <redacted query values: v>` (image/jpeg, 387885 bytes, 900x1301) |  |  |  |
