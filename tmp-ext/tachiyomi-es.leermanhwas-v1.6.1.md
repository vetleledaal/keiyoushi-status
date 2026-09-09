# Extension Validation Report

- Extension: tachiyomi-es.leermanhwas-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8701445043633550960
- Source name: LeerManhwas
- Source language: es
- Selected manga input: popular offset 0: Cada Cuerpo Es Un Universo Distinto (`.../cada-cuerpo-es-un-universo-distinto`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Cada Cuerpo Es Un Universo Distinto (`.../cada-cuerpo-es-un-universo-distinto`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Pagarás con tu vida por haberme engañado (`.../pagaras-con-tu-vida-por-haberme-enganado`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Cada Cuerpo Es Un Universo Distinto (`.../cada-cuerpo-es-un-universo-distinto`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Pagarás con tu vida por haberme engañado (`.../pagaras-con-tu-vida-por-haberme-enganado`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Cada Cuerpo Es Un Universo Distinto (`.../cada-cuerpo-es-un-universo-distinto`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cada Cuerpo Es Un Universo Distinto (`.../cada-cuerpo-es-un-universo-distinto`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 60 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cada Cuerpo Es Un Universo Distinto, URL=`.../cada-cuerpo-es-un-universo-distinto` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://leermanhwas.com/.../cada-cuerpo-es-un-universo-distinto-thumbnail.jpg` (image/jpeg, 19669 bytes, 234x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cada-cuerpo-es-un-universo-distinto` |  |  |  |
| details thumbnail URL | PASS | `https://leermanhwas.com/.../cada-cuerpo-es-un-universo-distinto-thumbnail.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Harem, Maduro |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kang Yi-hyeon, un nuevo empleado, se detiene en una tienda de conveniencia después del trabajo para comprar soju. Sin embargo, algo en la actitud de la cajera le resulta inusualmente extraño... ¿Está viendo bien o es solo su imaginación? Una situación inesperada lo deja totalmente desconcertado. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 60 chapters |  |  |  |
| chapter dates | LINT | All 60 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=60 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://leermanhwas.com/.../search <redacted query values: s>` to `https://leermanhwas.com/.../search <redacted query values: s>` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn03.leermanhwas.com/.../1-b8a.jpg` (image/jpeg, 512992 bytes, 850x7500) |  |  |  |
