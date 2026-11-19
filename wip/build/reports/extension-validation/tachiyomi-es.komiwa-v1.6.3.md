# Extension Validation Report

- Extension: tachiyomi-es.komiwa-v1.6.3
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
- Source ID: 62756090386045468
- Source name: Komiwa
- Source language: es
- Selected manga input: popular offset 0: Luna De Miel Con Mi Suegra (`.../luna-de-miel-con-mi-suegra`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Luna De Miel Con Mi Suegra (`.../luna-de-miel-con-mi-suegra`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | El Maestro Espadachin Alentado Por Las Estrellas (`.../el-maestro-espadachin-alentado-por-las-e`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Akatsuki No Yona (`.../akatsuki-no-yona`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Piernas que no caminan (`.../piernas-que-no-caminan`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Luna De Miel Con Mi Suegra (`.../luna-de-miel-con-mi-suegra`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Luna De Miel Con Mi Suegra (`.../luna-de-miel-con-mi-suegra`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 17 | Capítulo 1 (`.../a6d54da8-dbca-4aa3-8b09-e5176502f9fd`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 1 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Luna De Miel Con Mi Suegra, URL=`luna-de-miel-con-mi-suegra` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Piernas que no caminan, URL=`piernas-que-no-caminan` at page 1 offset 19 and page 2 offset 0, title=Reencarne en el gran ganso dorado , URL=`reencarne-en-el-gran-ganso-dorado` at page 1 offset 20 and page 2 offset 1, title=The Aunt, URL=`the-aunt` at page 1 offset 21 and page 2 offset 2, title=I Am The Final Boss, URL=`i-am-the-final-boss` at page 1 offset 22 and page 2 offset 3, title=Jugador De Nivel 1, URL=`jugador-de-nivel-1-2` at page 1 offset 23 and page 2 offset 4 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.komiwa.net/.../814ac600ec1fe245.webp` (image/webp (encoding: lossy), 27004 bytes, 300x440) |  |  |  |
| details identity | PASS | Details preserved selected URL `luna-de-miel-con-mi-suegra` |  |  |  |
| details thumbnail URL | PASS | `https://images.komiwa.net/.../814ac600ec1fe245.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | manhwa, seinen, Romance, NTR, Milf, Drama, Pareja casada |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★✬ 8.88<br>2025<br><br>El periodo de indulgencia más esperado para la pareja da un giro inesperado cuando la suegra se une a ellos. ¿La luna de miel con mi suegra dará lugar a algunos momentos interesantes? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://h9s2.komiwa.net/.../aHR0cHM6Ly9pbWFnZXMua29taXdhLm5ldC9rb21pd2EtaW1hZ2VzL19taWhvbi9rb21pd2EtYXZpc28tMS53ZWJw <redacted query values: s>` (image/webp (encoding: lossy), 45010 bytes, 1080x1620) |  |  |  |
