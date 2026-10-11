# Extension Validation Report

- Extension: tachiyomi-es.jeazscans-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 26
- Lint: 1
- Warnings: 1
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8103409233756077332
- Source name: Jeaz Scans
- Source language: es
- Selected manga input: popular offset 0: Me hice cargo de la Academia con un solo cuchillo de sashimi (`.../manga.php <redacted query values: id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | Me hice cargo de la Academia con un solo cuchillo de sashimi (`.../manga.php <redacted query values: id>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Soy un Magnate Divino, Es Lógico que Sea un Canalla, ¿No? (`.../manga.php <redacted query values: id>`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Me hice cargo de la Academia con un solo cuchillo de sashimi (`.../manga.php <redacted query values: id>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Me hice cargo de la Academia con un solo cuchillo de sashimi (`.../manga.php <redacted query values: id>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 102 | Capítulo 1 (`.../capitulo-1.00`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Me hice cargo de la Academia con un solo cuchillo de sashimi, URL=`.../manga.php <redacted query values: id>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 27/27 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 27/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lectorhub.j5z.xyz/.../96ff53a3b4ea08c978e653c87e6ddfed.webp` (image/webp (encoding: lossy), 89956 bytes, 600x773) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga.php <redacted query values: id>` |  |  |  |
| details thumbnail URL | PASS | `https://lectorhub.j5z.xyz/.../96ff53a3b4ea08c978e653c87e6ddfed.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Aventura, Fantasía, Harem, Manhwa, Escolar, Reencarnación |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | «Si corto, será cortado». Yo, que una vez fui llamado el mejor espadachín de la nación, he caído en un juego de móvil en el que sólo he gastado un poco de dinero. Además, ¡me han otorgado la «Bendición del Dios de la Espada»…! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 102 chapters |  |  |  |
| chapter dates | PASS | 102 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 404 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://lectorhub.j5z.xyz/.../manga.php <redacted query values: id>` to `https://lectorhub.j5z.xyz/.../me-hice-cargo-de-la-academia-con-un-solo-cuchillo-de-sashimi` (1 redirects); popular: `https://lectorhub.j5z.xyz/.../manga.php <redacted query values: id>` to `https://lectorhub.j5z.xyz/.../me-hice-cargo-de-la-academia-con-un-solo-cuchillo-de-sashimi` (1 redirects); popular: `https://lectorhub.j5z.xyz/.../capitulo-1.00` to `https://lectorhub.j5z.xyz` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
