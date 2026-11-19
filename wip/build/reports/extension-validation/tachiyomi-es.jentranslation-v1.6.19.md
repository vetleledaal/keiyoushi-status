# Extension Validation Report

- Extension: tachiyomi-es.jentranslation-v1.6.19
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zeistmanga
- Source ID: 6637675624589915581
- Source name: JenTranslation
- Source language: es
- Selected manga input: popular offset 0: Ao to Midori (`.../ao-to-midori.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Ao to Midori (`.../ao-to-midori.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 12 | A tí, que no existes en este mundo (`.../a-ti-que-no-existes-en-este-mundo.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Ao to Midori (`.../ao-to-midori.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ao to Midori (`.../ao-to-midori.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | Chapter 1 (`.../chapter-1_01766722554.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ao to Midori, URL=`.../ao-to-midori.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 34/34 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 34/34 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../0.1.jpg` (image/jpeg, 155995 bytes, 600x854) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ao-to-midori.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../0.1.jpg` (image/jpeg, 1066675 bytes, 1200x1708) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Drama, Recuentos de la vida, Romance, Shounen Ai |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Durante ocho años, he deseado una mañana como esta.”<br>Primer lugar en los exámenes, ganador en la carrera de relevos... Para Ao, un genio en lo académico y en los deportes, esta es la primera vez que realmente desea algo desde el fondo de su corazón. Ese “algo” es Midori, quien siempre queda en segundo lugar y se considera su rival.<br>Ao no puede controlar el amor que siente por él, y cuando lo ve, la felicidad lo desborda al punto de querer correr hacia él. Sin embargo, por miedo a arruinar su relación, esconde sus sentimientos y lo añora en silencio cada noche...<br>💭 “Quiero que lo primero que vea al despertar sean tus pestañas.”<br><br>**Year:** 2023 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | PASS | 15 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../0.1_resultado.webp` (image/jpeg, 351717 bytes, 1200x1708) |  |  |  |
