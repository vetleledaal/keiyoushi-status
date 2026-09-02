# Extension Validation Report

- Extension: tachiyomi-uk.comixtopia-v1.6.1
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
- Source ID: 7425856965491574725
- Source name: ComixTopia
- Source language: uk
- Selected manga input: popular offset 0: Хлопаки (`.../hlopaki`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Хлопаки (`.../hlopaki`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Сага (`.../saga-kniga-persha-2014`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Зелений ліхтар: переродження (`.../zelenij-lihtar-pererodzhennya-2004`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Геллбой у Мексиці (`.../gellboj-u-meksici-2010`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Хлопаки (`.../hlopaki`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Хлопаки (`.../hlopaki`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 11 | Розділ #1 (`.../41`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Хлопаки, URL=`hlopaki` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comicbookstorage.fra1.cdn.digitaloceanspaces.com/.../1708698311264-1 Ð¿Ð¾ÑÑÐµÑ (9).jpg` (image/jpeg, 445017 bytes, 1089x1700; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `hlopaki` |  |  |  |
| details thumbnail URL | PASS | `https://comicbookstorage.fra1.cdn.digitaloceanspaces.com/.../1708698311264-1 Ð¿Ð¾ÑÑÐµÑ (9).jpg` |  |  |  |
| details author | PASS | Ґарт Енніс, Дерік Робертсон |  |  |  |
| details artist | PASS | Dynamite |  |  |  |
| details genres | PASS | 18+, Альтернатива, Бойовик, Комедія, Детектив |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Оригінальна назва**: The Boys<br>**Рейтинг**: 4.67/5 (Голосів: 49)<br>**Рік випуску**: 2006<br>Буде боляче! Зустрічайте Хлопаків! У світі де супергерої козли, хтось має тримати їх на повідку. Команда Хлопаків бореться з всевладдям суперів. Для цього в дію іде компромат, шантаж та (зазвичай) стара добра груба сила. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 11 chapters |  |  |  |
| chapter dates | PASS | 11 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://comicbookstorage.fra1.cdn.digitaloceanspaces.com/.../1%20(9).jpg` (image/jpeg, 906880 bytes, 1089x1700) |  |  |  |
