# Extension Validation Report

- Extension: tachiyomi-uk.mangainua-v1.6.12
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7444761572611117628
- Source name: MANGA/in/UA
- Source language: uk
- Selected manga input: popular offset 0: Людина-бензопила (`.../168-ludyna-benzopyla.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Людина-бензопила (`.../168-ludyna-benzopyla.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | Їхня історія (`.../85-ikhnia-istoriia.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | Маєток, де чекають на весну (`.../117848-the-mansion-awaits-spring.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Примарний ноктюрн (`.../20332-night-song.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | Людина-бензопила (`.../168-ludyna-benzopyla.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Людина-бензопила (`.../168-ludyna-benzopyla.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 232 | Том 1. Розділ 1 - Пес і бензопила (`.../44147-ljudina-benzopila-tom-1-rozdil-1.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Людина-бензопила, URL=`.../168-ludyna-benzopyla.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 69/69 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 69/69 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manga.in.ua/.../1769015877_23-tom-obkladynka-2285x3600.jpg` (image/jpeg, 323932 bytes, 508x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../168-ludyna-benzopyla.html` |  |  |  |
| details thumbnail URL | PASS | `https://manga.in.ua/.../1769015877_23-tom-obkladynka-2285x3600.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | МАНҐА, Божевілля, Бойовик, Демони, Драма, Надприродне, Шьонен |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Злиденне життя Денджі кардинально змінилося, коли він злився зі своїм ручним демоном Почітою: тепер хлопець живе у великому місті та працює мисливцем на демонів у відділі громадської безпеки. Але йому доведеться ще багато дізнатися про нову роботу і силу демона-бензопили. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 232 chapters |  |  |  |
| chapter dates | PASS | 232 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://manga.in.ua/.../1685566127_dlraw_net-img-0001.png` (image/png, 454345 bytes, 764x1200) |  |  |  |
