# Extension Validation Report

- Extension: tachiyomi-es.datgarscanlation-v1.6.15
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 2
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1626637101814976364
- Source name: Dat-Gar Scan
- Source language: es
- Selected manga input: popular offset 0: Koisuru Futari wa Kiba o Kakusu Gap ga Arisugiru Couple no Hanashi (`.../koisuru-futari-wa-kiba-o-kakusu-gap-ga.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Koisuru Futari wa Kiba o Kakusu Gap ga Arisugiru Couple no Hanashi (`.../koisuru-futari-wa-kiba-o-kakusu-gap-ga.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Fuufu Ijou Koibito Miman  (`.../fuufu-ijou-koibito-miman.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Koisuru Futari wa Kiba o Kakusu Gap ga Arisugiru Couple no Hanashi (`.../koisuru-futari-wa-kiba-o-kakusu-gap-ga.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Koisuru Futari wa Kiba o Kakusu Gap ga Arisugiru Couple no Hanashi (`.../koisuru-futari-wa-kiba-o-kakusu-gap-ga.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 19 | Cap 01  (`.../cap-01.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Koisuru Futari wa Kiba o Kakusu Gap ga Arisugiru Couple no Hanashi, URL=`.../koisuru-futari-wa-kiba-o-kakusu-gap-ga.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../IMG_20260308_201007_051.jpg` (image/png, 617382 bytes, 600x853) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../koisuru-futari-wa-kiba-o-kakusu-gap-ga.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../IMG_20260308_201007_051.jpg` |  |  |  |
| details author | PASS | Shirakawa Miabi |  |  |  |
| details artist | PASS | Matsumoto Komikan |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sengoku Yukiya e Ichijou Airi son estudiantes de secundaria que se conocieron en internet y se volvieron buenos amigos después de verse en persona varias veces. “Quiero que nos volvamos aún más cercanos.” Yukiya y Airi comienzan a sentir que entre ellos podría nacer algo romántico, pero cada uno guarda un secreto que no puede contarle al otro: ¡Yukiya es el líder de su escuela masculina de delincuentes, y Airi es la líder de su escuela femenina de delincuentes! ¡Sus verdaderas identidades absolutamente no pueden ser descubiertas! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 19 name |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | PASS | 19 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../00_00.5.jpg` (image/jpeg, 367443 bytes, 1143x1600) |  |  |  |
