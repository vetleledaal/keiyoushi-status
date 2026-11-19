# Extension Validation Report

- Extension: tachiyomi-es.jabrascan-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7834765587341972487
- Source name: JabraScan
- Source language: es
- Selected manga input: popular offset 0: Cultivation Online (`.../CultivationOnline`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Cultivation Online (`.../CultivationOnline`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Cultivation Online (`.../CultivationOnline`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cultivation Online (`.../CultivationOnline`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2721 | 1: Cultivo en Línea (`.../CultivationOnline-0001_JabraScan.pdf`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cultivation Online, URL=`CultivationOnline` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://img.jabrascan.net/.../ForSaleFallenLady01-900w.webp` -> 2 manga URLs (examples: `ForSaleFallenLady`, `ForSaleFallenLadyCA`) |  |  |  |
| thumbnail | PASS | `https://img.jabrascan.net/.../CultivationOnline-900w.webp` (image/webp (encoding: lossy), 55834 bytes, 900x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `CultivationOnline` |  |  |  |
| details thumbnail URL | PASS | `https://img.jabrascan.net/.../CultivationOnline-900w.webp` |  |  |  |
| details author | PASS | MyLittleBrother |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Aventura, Comedia, Cultivo, Fantasía, Harén, Realidad Virtual, Videojuegos (VRMMORPG) |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yuan nació con una enfermedad incurable que le dejó ciego a una edad temprana y lisiado unos años después, dejando inútil todo lo que tenía por debajo de la cabeza. Considerado irremediable y sin esperanza, sus padres se dieron rápidamente por vencidos y el mundo lo ignoró. En este mundo oscuro e inmóvil, su hermana pequeña se convirtió en su única razón para vivir. Observa cómo este joven alcanza la cúspide como genio en Cultivation Online, el más reciente VRMMORPG, convirtiéndose en una figura legendaria en ambos mundos.<br><br>**Tipo:** Novela Web<br><br>**Alternative Names:**<br>- Cultivación Online<br>- Cultivation Online<br>- Cultivo En Línea<br>- Cultivo Online<br>- オンライン修行 (Onrain Shugyō)<br>- 在线修炼 (Zàixiàn Xiūliàn) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2721 chapters |  |  |  |
| chapter dates | PASS | 2721 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://books.jabrascan.net/.../CultivationOnline-0001_JabraScan.pdf` (image/jpeg, 447921 bytes, 1487x2105) |  |  |  |
