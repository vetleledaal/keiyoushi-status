# Extension Validation Report

- Extension: tachiyomi-es.bymichiscan-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4436777272781358384
- Source name: Bymichi Scan
- Source language: es
- Selected manga input: popular offset 0: Hattori-sensei no quiere tener novia (`.../hattori-sensei-no-quiere-tener-novia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Hattori-sensei no quiere tener novia (`.../hattori-sensei-no-quiere-tener-novia`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | El caballero santo viste una armadura negra (`.../el-caballero-santo-viste-una-armadura-negra`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Quiero volver a amar (`.../quiero-volver-a-amar`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Encantado de conocerte, mi esposa. (`.../encantado-de-conocerte-mi-esposa`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Hattori-sensei no quiere tener novia (`.../hattori-sensei-no-quiere-tener-novia`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Hattori-sensei no quiere tener novia (`.../hattori-sensei-no-quiere-tener-novia`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | Chapter 1 (`.../hattori-sensei-no-quiere-tener-novia-parte-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hattori-sensei no quiere tener novia, URL=`.../hattori-sensei-no-quiere-tener-novia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bymichiby.com/.../Portadabymichi-213x300.webp` (image/webp (encoding: lossy), 14370 bytes, 213x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hattori-sensei-no-quiere-tener-novia` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://bymichiby.com/.../Portadabymichi.webp` (image/webp (encoding: lossy), 193136 bytes, 1064x1500) |  |  |  |
| details author | PASS | tamayura banko |  |  |  |
| details artist | PASS | tamayura banko |  |  |  |
| details genres | PASS | Diferencia de edad, Escolar, Pure love, Manga |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Este es un manga erótico sobre una chica que entabla una relación secreta con su profesor al que admira y al final terminan felices juntos. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://bymichiby.com/.../001.webp` (image/webp (encoding: lossy), 191342 bytes, 1280x1808) |  |  |  |
