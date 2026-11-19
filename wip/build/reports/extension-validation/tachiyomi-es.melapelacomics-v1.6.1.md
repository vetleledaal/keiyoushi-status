# Extension Validation Report

- Extension: tachiyomi-es.melapelacomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7735812434824910750
- Source name: Melapela Comics
- Source language: es
- Selected manga input: popular offset 0: [RoseBlue3D] La Viuda De Mi Vecina 59 (`.../roseblue3d-la-viuda-de-mi-vecina-59`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | [RoseBlue3D] La Viuda De Mi Vecina 59 (`.../roseblue3d-la-viuda-de-mi-vecina-59`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | [YourJuicyWaifu] Boa Hancock X Luffy (`.../yourjuicywaifu-boa-hancock-x-luffy`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 18 | [RoseBlue3D] La Viuda De Mi Vecina 59 (`.../roseblue3d-la-viuda-de-mi-vecina-59`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [RoseBlue3D] La Viuda De Mi Vecina 59 (`.../roseblue3d-la-viuda-de-mi-vecina-59`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../roseblue3d-la-viuda-de-mi-vecina-59`) |  | <1s |
| pages | `getPageList(chapter)` | success | 30 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[RoseBlue3D\] La Viuda De Mi Vecina 59, URL=`.../roseblue3d-la-viuda-de-mi-vecina-59` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 54/54 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 54/54 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://melapelacomics.com/.../Image16-29.webp` (image/webp (container: extended), 48432 bytes, 510x765) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../roseblue3d-la-viuda-de-mi-vecina-59` |  |  |  |
| details thumbnail URL | PASS | `https://melapelacomics.com/.../Image16-29.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comics porno 3D, 18 años, 3d, Avengers, Black Widow, cachondas, chinas, corridas, corridas anales, culazos, culonas, doble penetracion anal, jovencitas, latex, lenceria, lenceria sexy, Los Vengadores, maduras, mamadas, masturbaciones, medias, milfs, morenas, nalgonas, Natasha Romanoff, orgias, orientales, parodias, parodias porno, parodias xxx, roseblue3d, sexo anal, sexys, superheroes, tetas grandes, tetonas, vecina, viciosas, viuda negra |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 30 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://melapelacomics.com/.../Image01-201.webp` (image/webp (container: extended), 40734 bytes, 720x1606) |  |  |  |
