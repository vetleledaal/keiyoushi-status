# Extension Validation Report

- Extension: tachiyomi-es.lectortmounoriginal-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7092791175237698168
- Source name: LectorTMO (unoriginal)
- Source language: es
- Selected manga input: popular offset 0: Jinx (`.../jinx-s1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Jinx (`.../jinx-s1`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Roses and Champagne (`.../roses-and-champagne`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Mairimashita! Iruma-kun (`.../mairimashita-iruma-kun`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | El villano quiere ser rescatado (`.../el-villano-quiere-ser-rescatado`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Jinx (`.../jinx-s1`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (`.../jinx-s1`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 108 | Capítulo 1 (`.../jinx-cap-001`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jinx, URL=`jinx-s1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://myanimelist.net/.../272696l.webp` (image/webp (encoding: lossy), 35628 bytes, 450x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `jinx-s1` |  |  |  |
| details thumbnail URL | PASS | `https://myanimelist.net/.../272696l.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Boys Love, Erotica, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Campeón de peso semipesado de artes marciales ‘Joo Jae-kyung’. Escribe el mito de estar invicto, pero de hecho, también tiene un ritual secreto. ¡Lo que significa que necesitas tener sexo satisfactorio en la víspera de la pelea para ganar! Jaekyung intenta resolver la mala suerte a través del fisioterapeuta.<br><br>Título original: 징크스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 108 chapters |  |  |  |
| chapter dates | PASS | 108 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://myanimelist.net/.../272696l.webp` to `https://cdn.myanimelist.net/.../272696l.webp` (1 redirects) |  |  |  |
| page load | PASS | `https://repelishd.onl/.../01.webp` (image/webp (encoding: lossy), 56174 bytes, 1000x625) |  |  |  |
