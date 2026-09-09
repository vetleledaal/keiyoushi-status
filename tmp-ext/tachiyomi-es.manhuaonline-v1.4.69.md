# Extension Validation Report

- Extension: tachiyomi-es.manhuaonline-v1.4.69
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 5713083996691468192
- Source name: SamuraiScan
- Source language: es
- Selected manga input: popular offset 0: El Heredero del Dragón Ancestral (`.../el-heredero-del-dragon-ancestral`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | El Heredero del Dragón Ancestral (`.../el-heredero-del-dragon-ancestral`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 10 | El Viajero de los Nueve Cielos Regresa (`.../el-viajero-de-los-nueve-cielos-regresa`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Emperador Magico (`.../emperador-magico`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | El Registro de los Elegidos Celestiales (`.../el-registro-de-los-elegidos-celestiales`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | El Heredero del Dragón Ancestral (`.../el-heredero-del-dragon-ancestral`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | El Heredero del Dragón Ancestral (`.../el-heredero-del-dragon-ancestral`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1269 | Capitulo 1 (`https://samurai.j5z.xyz/.../capitulo-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Heredero del Dragón Ancestral, URL=`.../el-heredero-del-dragon-ancestral` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://samurai.j5z.xyz/.../DM_20230414032553_008-3-175x238.jpg` (image/jpeg, 13891 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el-heredero-del-dragon-ancestral` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://samurai.j5z.xyz/.../DM_20230414032553_008-3.jpg` (image/jpeg, 33905 bytes, 300x430) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Artes Marciales, Fantasía |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Un adolescente sostiene un bolígrafo, mientras un dragón baila; el caos rodea el mundo, iluminando el cielo. En este mundo, ¿la pitón se tragará al dragón o se levantará el dragón santo?” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1269 chapters |  |  |  |
| chapter dates | PASS | 1269 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 1269 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://samurai.j5z.xyz/.../01.webp` (image/webp (encoding: lossy), 349850 bytes, 1200x1873) |  |  |  |
