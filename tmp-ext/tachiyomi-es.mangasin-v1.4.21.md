# Extension Validation Report

- Extension: tachiyomi-es.mangasin-v1.4.21
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 20
- Lint: 1
- Warnings: 0
- Skipped: 14
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mmrcms
- Source ID: 3344386250058668105
- Source name: Mangas.in
- Source language: es
- Selected manga input: latest offset 0: I Killed the Main Player (`.../i-killed-the-main-player`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 80 | I Killed the Main Player (`.../i-killed-the-main-player`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 80 | Mayonaka Heart Tune (`.../mayonaka-heart-tune`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | I Killed the Main Player (`.../i-killed-the-main-player`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | I Killed the Main Player (`.../i-killed-the-main-player`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | java.lang.Exception: No se pudo encontrar la clave | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.Exception: No se pudo encontrar la clave | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | SKIP | HTTP error 403 |  |  |  |
| latest listing | PASS | 80 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Killed the Main Player, URL=`.../i-killed-the-main-player` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | HTTP error 403 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://m440.in/.../cover_250x350.jpg` (image/webp (encoding: lossy), 31038 bytes, 250x350; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../i-killed-the-main-player` |  |  |  |
| details thumbnail URL | PASS | `https://m440.in/.../cover_250x350.jpg` |  |  |  |
| details author | PASS | Salamsallyeo |  |  |  |
| details artist | PASS | Greenkyrin |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Harem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | <br><br>¡Ser un personaje en tu juego favorito es genial! Claro, es solo un NPC menor, pero Corin conoce este juego como la palma de su mano. Con su conocimiento y las habilidades del jugador principal Sihu, todo iba bien... hasta que Corin descubre que Sihu ha estado asesinando NPCs inocentes y robándoles sus objetos. Horrorizado pero impotente para detenerlo, Corin espera el final del juego... solo para que Sihu falle misteriosamente en la última misión. Al instante, Corin viaja tres años atrás en el tiempo. Ahora, está decidido a matar a Sihu y asumir su rol: derrotar al jefe final y salvar el mundo. <br>93 Chapters (Ongoing) <br>S1: 69 Chapters (1~69) <br>S2: 23 Chapters (70~?) <br>Original Novel: <br>Chapters: Naver Series, Munpia <br>Volumes: Naver Series, Munpia <br>Original Webtoon: <br>Naver Webtoon, Naver Series <br>Official Translations: <br>English, T.Chinese, Thai, Indonesian, Japanese, S.Chinese <br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
