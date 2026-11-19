# Extension Validation Report

- Extension: tachiyomi-es.homocdrs-v1.6.19
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
- Source theme: zeistmanga
- Source ID: 9152760302020017063
- Source name: HOMOcdrs
- Source language: es
- Selected manga input: popular offset 0: Mata ne, Kami-sama (`.../mata-ne-kami-sama.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Mata ne, Kami-sama (`.../mata-ne-kami-sama.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 5 | Kabukicho Cat Honey (`.../kabukicho-cat-honey.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mata ne, Kami-sama (`.../mata-ne-kami-sama.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mata ne, Kami-sama (`.../mata-ne-kami-sama.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Mata ne, Kami-sama Chapter 1 (`.../mata-ne-kami-sama-chapter-1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mata ne, Kami-sama, URL=`.../mata-ne-kami-sama.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 26/26 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 26/26 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangaupdates.com/.../i483564.png` (image/png, 188860 bytes, 281x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mata-ne-kami-sama.html` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangaupdates.com/.../i483564.png` |  |  |  |
| details author | PASS | Vuyama |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Boys' Love, Abuso, Sectas, Explotación |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ryou está enamorado de Koutarou, un hermoso chico al que siempre ve en la biblioteca. A medida que ambos se conocen mejor, Ryou se siente cada vez más cautivado por el encanto inocente y misterioso de Koutarou. Sin embargo, un día, un compañero de clase le cuenta un rumor sobre la familia de Koutarou... Una oscura historia de amor, locura e inocencia.<br><br>**Volume:** 2<br><br>**Alternative Names:**<br>- またね、神様 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../Portada-Milky-Nuevo_01.jpg` (image/jpeg, 384778 bytes, 2160x1080) |  |  |  |
