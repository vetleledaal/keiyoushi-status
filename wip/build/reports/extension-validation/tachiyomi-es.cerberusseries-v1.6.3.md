# Extension Validation Report

- Extension: tachiyomi-es.cerberusseries-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 3
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1814471239661920836
- Source name: Cerberus Series
- Source language: es
- Selected manga input: popular offset 0: GACHA INFINITA (`.../gacha-infinita-nivel-9999`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | GACHA INFINITA (`.../gacha-infinita-nivel-9999`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Perfilador de villanos (`.../perfilador-de-villanos`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | La corona que conquistaré. (`.../la-corona-que-conquistare`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Mi tranquila tienda de conveniencia dentro de la academia. (`.../mi-tranquila-tienda-de-conveniencia-dentro-de-la-academia`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | GACHA INFINITA (`.../gacha-infinita-nivel-9999`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | GACHA INFINITA (`.../gacha-infinita-nivel-9999`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 236 | Chapter 01 - 01 (`.../01-3`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=GACHA INFINITA, URL=`.../gacha-infinita-nivel-9999` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../shinji-23.jpg <redacted query values: resize>` (image/jpeg, 51814 bytes, 285x425) |  |  |  |
| details identity | UNUSUAL | Details changed selected URL `.../gacha-infinita-nivel-9999` to `.../gacha-infinita-nivel-9999` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../shinji-23.jpg` (image/jpeg, 5076293 bytes, 3024x4299) |  |  |  |
| details author | PASS | MEIKYOU Shisui |  |  |  |
| details artist | PASS | OOMAE Takafumi |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Harem, Shounen, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Un niño llamado Light es traicionado por sus compañeros y se sumerge en el abismo de la mazmorra más peligrosa del mundo. Lo único que le queda es la Bendición(habilidad) \”Gacha infinito\”, ¡Que pensaba que era una basura! ¡Comienza la venganza de un chico desde la peor situación posible! 4.6 369 votes Article Rating |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 236 chapters |  |  |  |
| chapter dates | PASS | 236 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://legionscans.com/.../gacha-infinita-nivel-9999` to `https://legionscans.com/.../gacha-infinita-nivel-9999` (1 redirects); popular: `https://legionscans.com/.../01-3` to `https://legionscans.com/.../01-3` (1 redirects) |  |  |  |
| page load | PASS | `https://i1.wp.com/.../VV8mWb.png` (image/webp (container: extended), 158394 bytes, 1280x1820) |  |  |  |
