# Extension Validation Report

- Extension: tachiyomi-es.sapphirescan-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 8955531858664387570
- Source name: SapphireScan
- Source language: es
- Selected manga input: popular offset 0: El yerno más fuerte de la historia. (`.../el-yerno-mas-fuerte-de-la-historia.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | El yerno más fuerte de la historia. (`.../el-yerno-mas-fuerte-de-la-historia.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | El yerno más fuerte de la historia. (`.../el-yerno-mas-fuerte-de-la-historia.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 8 | El último rey dragón (`.../el-ultimo-rey-dragon.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El yerno más fuerte de la historia. (`.../el-yerno-mas-fuerte-de-la-historia.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El yerno más fuerte de la historia. (`.../el-yerno-mas-fuerte-de-la-historia.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 29 | Capítulo 0 (`.../capitulo-0_77.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El yerno más fuerte de la historia., URL=`.../el-yerno-mas-fuerte-de-la-historia.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../portada%20%281%29.jpg` (image/jpeg, 20639 bytes, 133x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el-yerno-mas-fuerte-de-la-historia.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../portada%20%281%29.jpg` (image/jpeg, 186092 bytes, 600x900) |  |  |  |
| details author | PASS | 阅文漫画 x 午后漫画 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Shen Lang viajó a otro mundo y se convirtió en el pequeño yerno de cara blanca de una familia rica, y fue expulsado de la casa porque era demasiado derrochador. Así que trabajara duro para encontrar a la hija de una familia más poderosa para convertirse su yerno. ¡Es imposible practicar artes marciales en esta vida! Así que voy a entrenar a mi mujer para que sea la experta numero uno del mundo, ¡Quien se atreva a provocarme dejaré que mi esposa lo mate a golpes! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 29 chapters |  |  |  |
| chapter dates | PASS | 29 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0.jpg` (image/jpeg, 313760 bytes, 1600x777) |  |  |  |
