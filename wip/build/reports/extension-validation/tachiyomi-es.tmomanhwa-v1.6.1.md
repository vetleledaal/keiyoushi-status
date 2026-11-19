# Extension Validation Report

- Extension: tachiyomi-es.tmomanhwa-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: yiimanga
- Source ID: 6910135245684799124
- Source name: TmoManhwa
- Source language: es
- Selected manga input: popular offset 0: Soy tan poderoso que rompí por completo el equilibrio del juego (`.../soy-tan-poderoso-que-rompi-por-completo-el-equilibrio-del-juego`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Soy tan poderoso que rompí por completo el equilibrio del juego (`.../soy-tan-poderoso-que-rompi-por-completo-el-equilibrio-del-juego`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Oferta secreta (`.../oferta-secreta`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Soy tan poderoso que rompí por completo el equilibrio del juego (`.../soy-tan-poderoso-que-rompi-por-completo-el-equilibrio-del-juego`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Soy tan poderoso que rompí por completo el equilibrio del juego (`.../soy-tan-poderoso-que-rompi-por-completo-el-equilibrio-del-juego`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 36 | Capítulo 54 (`.../capitulo-54`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Soy tan poderoso que rompí por completo el equilibrio del juego, URL=`.../soy-tan-poderoso-que-rompi-por-completo-el-equilibrio-del-juego` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tmomanhwa.com/.../soy-tan-poderoso-que-rompi-por-completo-el-equilibrio-del-juego-thumbnail.jpg` (image/jpeg, 37284 bytes, 247x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../soy-tan-poderoso-que-rompi-por-completo-el-equilibrio-del-juego` |  |  |  |
| details thumbnail URL | PASS | `https://tmomanhwa.com/.../soy-tan-poderoso-que-rompi-por-completo-el-equilibrio-del-juego-thumbnail.jpg` |  |  |  |
| details author | PASS | Roribasu |  |  |  |
| details artist | PASS | HOSHI Nasubi |  |  |  |
| details genres | PASS | Accion, Fantasia, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Itsuki fue un jugador profesional de videojuegos, pero después de sufrir un fracaso en su carrera, decidió ocultar su pasado trabajando como VTuber. Sin embargo, su tranquila vida da un giro inesperado cuando un fanático agresivo lo ataca y termina dejándolo inconsciente. Al despertar, descubre que ha viajado diez años al pasado, justo después del lanzamiento de «Metasense», un popular juego de realidad virtual que está causando furor. Esta vez, Itsuki tiene una segunda oportunidad para empezar de nuevo sin necesidad de esconder quién es. Gracias a su experiencia como jugador profesional y a todos los conocimientos que conserva del futuro, está decidido a convertirse en una estrella tanto dentro del juego como en el mundo de las transmisiones. ¡Con sus habilidades y una ventaja que nadie más posee, su objetivo es llegar a lo más alto de Metasense!<br><br>Alternative names: Ore Dake 2-Shuume Gachizei - Tsuyo Sugite Game Balance wo Hakai Shita/ I’m So Overpowered That I Completely Broke The Game Balance/ Solo Second Playthrough - Overpowered and Breaking Game Balance/ The Only New Game+ Hardcore Gamer ~I'm So Overpowered, I Shattered the Game's Balance~/ 俺だけ2周目ガチ勢～強すぎてゲームバランスを破壊した～ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 36 chapters |  |  |  |
| chapter dates | LINT | 6 of 36 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img01.tmomanhwa.com/.../001.webp` (image/webp (encoding: lossy), 313024 bytes, 800x5740) |  |  |  |
