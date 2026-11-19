# Extension Validation Report

- Extension: tachiyomi-es.catharsisworld-v1.6.7
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: catharsis
- Source ID: 2240276887816651754
- Source name: Catharsis World
- Source language: es
- Selected manga input: popular offset 0: Lágrimas entre Flores Marchitas (`.../83`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Lágrimas entre Flores Marchitas (`.../83`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Te Abrazare Fuerte Para Que No Escapes (`.../1182`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Un Romance De Ensueño (`.../2083`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | El pintor de mazmorras (`.../1841`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lágrimas entre Flores Marchitas (`.../83`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lágrimas entre Flores Marchitas (`.../83`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 129 | Capitulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.a.a.a.u: The site's reader changed, update the extension | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.a.a.a.u: The site's reader changed, update the extension | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lágrimas entre Flores Marchitas, URL=`83` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://newcatharsis.dig-it.info/.../2b32e4ff-3268-4d9d-9862-8b09161fea34` did not contain a decodable image (3158540 bytes) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `83` |  |  |  |
| details thumbnail URL | PASS | `https://newcatharsis.dig-it.info/.../2b32e4ff-3268-4d9d-9862-8b09161fea34` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Matrimonio, Moderno, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Mi marido cometió una aventura.<br>No sólo contrajo una enorme deuda y perdió a nuestro hijo, sino que también tuvo relaciones sexuales con una mujer mucho más joven justo delante de mí.<br>La vida herida estaba destinada a marchitarse y ser desechada.<br>Pero—»Enséñame sobre el amor adulto». Un joven sospechoso que de repente entró en la vida de Na Haesoo.<br>Él, que es peligroso y obediente, comienza a sacudir el mundo de Na Haesoo |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 129 chapters |  |  |  |
| chapter dates | PASS | 129 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | The site's reader changed, update the extension |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
