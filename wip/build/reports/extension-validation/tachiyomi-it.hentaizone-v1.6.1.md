# Extension Validation Report

- Extension: tachiyomi-it.hentaizone-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7646644620523526397
- Source name: Hentai Zone
- Source language: it
- Selected manga input: latest offset 0: Svenduta 1 (`.../svenduta-1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 0 |  |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 0 |  |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Svenduta 1 (`.../svenduta-1`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Un fantasma in cerca di passione (`.../un-fantasma-in-cerca-di-passione`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Svenduta 1 (`.../svenduta-1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capitolo unico (Premium) (`.../svenduta-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaizone.me/.../Hentaizone.me600001-4-1024x1478.jpg` (image/jpeg, 155931 bytes, 1024x1478) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../svenduta-1` |  |  |  |
| details thumbnail URL | PASS | `https://hentaizone.me/.../Hentaizone.me600001-4-1024x1478.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai Manga, Hentai Tette Grosse, Teen, Tradotti da noi, Blowjobs, Cazzo grosso, creampie, gangbang, schiava, studentessa, Tette enormi, venduta |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Titolo Premium: il sito mostra le pagine solo agli abbonati Patreon che hanno effettuato l'accesso. Per accedere apri la WebView (icona del mappamondo), tocca «Entra con Patreon» e completa il login. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://hentaizone.me <redacted query values: category_name, orderby, and order>` to `https://hentaizone.me/.../hentai-manga <redacted query values: orderby and order>` (1 redirects); popular: `https://hentaizone.me <redacted query values: category_name, orderby, order, and paged>` to `https://hentaizone.me/.../2 <redacted query values: orderby and order>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
