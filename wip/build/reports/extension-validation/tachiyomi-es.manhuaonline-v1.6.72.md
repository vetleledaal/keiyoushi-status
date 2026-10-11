# Extension Validation Report

- Extension: tachiyomi-es.manhuaonline-v1.6.72
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 5713083996691468192
- Source name: SamuraiScan
- Source language: es
- Selected manga input: popular offset 0: El Heredero del Dragón Ancestral (`.../17`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | El Heredero del Dragón Ancestral (`.../17`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 3 | El Gobernante de los Dragones Celestiales (`.../128`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Emperador Magico (`.../27`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 3 | El Ciclo de la Caza Infinita (`.../119`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El Heredero del Dragón Ancestral (`.../17`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El Heredero del Dragón Ancestral (`.../17`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1269 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Heredero del Dragón Ancestral, URL=`17` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://samurai.j5z.xyz/.../DM_20230414032553_008-3-175x238.jpg` (image/jpeg, 13891 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `17` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://samurai.j5z.xyz/.../DM_20230414032553_008-3.jpg` (image/jpeg, 33905 bytes, 300x430) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Artes Marciales, Fantasía |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Un adolescente sostiene un bolígrafo, mientras un dragón baila; el caos rodea el mundo, iluminando el cielo. En este mundo, ¿la pitón se tragará al dragón o se levantará el dragón santo?” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1269 chapters |  |  |  |
| chapter dates | LINT | 1132 of 1269 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1132 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://samurai.j5z.xyz/.../01.webp` (image/webp (encoding: lossy), 349850 bytes, 1200x1873) |  |  |  |
