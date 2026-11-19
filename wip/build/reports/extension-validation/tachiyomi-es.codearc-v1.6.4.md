# Extension Validation Report

- Extension: tachiyomi-es.codearc-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5491278213927672737
- Source name: Code Arc Mangas
- Source language: es
- Selected manga input: latest offset 0: Tratamiento sexual obligatorio a nivel mundial (`.../004885`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Game Over (`.../004545`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | La Milf de Yor (`.../004394`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | Tratamiento sexual obligatorio a nivel mundial (`.../004885`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Las Chicas Hipsters Aman Las Grandes Pollas [Ultimate Edition] (`.../004882`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tratamiento sexual obligatorio a nivel mundial (`.../tratamiento-sexual-obligatorio-a-nivel-mundial`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tratamiento sexual obligatorio a nivel mundial (`.../004885`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo 1 (`.../cascade`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Captcha needs interaction, but the app isn't in the foreground | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Captcha needs interaction, but the app isn't in the foreground | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Tratamiento sexual obligatorio a nivel mundial, URL=`.../tratamiento-sexual-obligatorio-a-nivel-mundial` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://cdn.codearctraducciones.com/.../ee06691c20.w320.webp` -> 2 manga URLs (examples: `.../004885`, `.../tratamiento-sexual-obligatorio-a-nivel-mundial`) |  |  |  |
| thumbnail | PASS | `https://cdn.codearctraducciones.com/.../ee06691c20.w320.webp` (image/webp (encoding: lossy), 29762 bytes, 320x512) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../004885` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.codearctraducciones.com/.../ee06691c20.webp` (image/webp (encoding: lossy), 169468 bytes, 1000x1600) |  |  |  |
| details author | PASS | Tawara Hiryuu |  |  |  |
| details artist | PASS | Tawara Hiryuu |  |  |  |
| details genres | PASS | Pechos grandes, Culo grande, Pene grande, Pezones grandes, Creampie, Ahegao |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Sin sipnosis disponible. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Captcha needs interaction, but the app isn't in the foreground |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
