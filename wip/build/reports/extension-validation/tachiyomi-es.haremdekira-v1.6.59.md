# Extension Validation Report

- Extension: tachiyomi-es.haremdekira-v1.6.59
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 1480472727871484054
- Source name: Harem de Kira
- Source language: es
- Selected manga input: latest offset 0: El juego de supervivencia de la villana (`.../el-juego-de-supervivencia-de-la-villana`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | La Villana más Malvada de la Historia (`.../villana-mas-malvada`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Alianza con el Inframundo (`.../alianza-con-el-inframundo`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | El juego de supervivencia de la villana (`.../el-juego-de-supervivencia-de-la-villana`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Misión: Romance Sincero (`.../mision-romance-sincero`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El juego de supervivencia de la villana (`.../el-juego-de-supervivencia-de-la-villana`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El juego de supervivencia de la villana (`.../el-juego-de-supervivencia-de-la-villana`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 53 | Capitulo 0 (`.../capitulo-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El juego de supervivencia de la villana, URL=`.../el-juego-de-supervivencia-de-la-villana` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kiraproject.lat/.../portada-scaled.jpg` (image/jpeg, 793196 bytes, 1810x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el-juego-de-supervivencia-de-la-villana` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yu Luna, una chica social que fue reencarnada debido a muerte súbita en el mundo moderno por las horas extras del trabajo, tuvo la suerte de tener la oportunidad de volver a la realidad, pero la premisa es que necesita capturar con éxito a todos los protagonistas masculinos en un juego otome de fantasía occidental. Si tienes el halo de la heroína, incluso si no has jugado mucho a los juegos otome, debería estar bien, ¿verdad? ¡Pero qué le pasa a la hija inútil que a menudo intimida a la heroína en el juego! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 53 chapters |  |  |  |
| chapter dates | LINT | 28 of 53 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=28 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://kiraproject.lat/.../0.1_1_11zon.webp` (image/webp (container: extended), 31522 bytes, 304x406) |  |  |  |
