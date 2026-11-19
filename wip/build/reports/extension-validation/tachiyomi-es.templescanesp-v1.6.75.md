# Extension Validation Report

- Extension: tachiyomi-es.templescanesp-v1.6.75
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4334604114708629478
- Source name: Aedex
- Source language: es
- Selected manga input: popular offset 0: Lágrimas entre Flores Marchitas (`.../lagrimas-entre-flores-marchitas`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Lágrimas entre Flores Marchitas (`.../lagrimas-entre-flores-marchitas`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Chicas Universitarias Que Son Inesperadas (`.../chicas-universitarias-que-son-inesperadas`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Un Romance De Ensueño (`.../un-romance-de-ensueno`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Conviviendo Con Mi Profesora (`.../conviviendo-con-mi-profesora`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lágrimas entre Flores Marchitas (`.../lagrimas-entre-flores-marchitas`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lágrimas entre Flores Marchitas (`.../lagrimas-entre-flores-marchitas`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 128 | Capitulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but no scheme was found for  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but no scheme was found for  | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lágrimas entre Flores Marchitas, URL=`lagrimas-entre-flores-marchitas` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://aedexnox.com/.../5d690b0d-21ba-4a5a-a6bb-5e0678ac8a6f` did not contain a decodable image (3158540 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `lagrimas-entre-flores-marchitas` |  |  |  |
| details thumbnail URL | PASS | `https://aedexnox.com/.../5d690b0d-21ba-4a5a-a6bb-5e0678ac8a6f` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Matrimonio, Moderno, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mi marido cometió una aventura.<br>No sólo contrajo una enorme deuda y perdió a nuestro hijo, sino que también tuvo relaciones sexuales con una mujer mucho más joven justo delante de mí.<br>La vida herida estaba destinada a marchitarse y ser desechada.<br>Pero—»Enséñame sobre el amor adulto». Un joven sospechoso que de repente entró en la vida de Na Haesoo.<br>Él, que es peligroso y obediente, comienza a sacudir el mundo de Na Haesoo |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 128 chapters |  |  |  |
| chapter dates | PASS | 128 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Expected URL scheme 'http' or 'https' but no scheme was found for  |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://blayvia.com/.../accesibilidad-en-android-funciones-que-todos-deberian-usar` to `https://blayvia.com/.../accesibilidad-en-android-funciones-que-todos-deberian-usar` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
