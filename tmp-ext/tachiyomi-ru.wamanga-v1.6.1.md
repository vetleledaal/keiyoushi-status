# Extension Validation Report

- Extension: tachiyomi-ru.wamanga-v1.6.1
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
- Source ID: 1686869715645322994
- Source name: WaManga
- Source language: ru
- Selected manga input: popular offset 0: Я убил игрока академии (`.../ya-ubil-igroka-akademii`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Я убил игрока академии (`.../ya-ubil-igroka-akademii`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Я стала слугой тирана (`.../ya-stala-slugoy-tirana`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Путь орхидеи (`.../put-orhidei`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Всемогущий чародей не осознаёт, что он сильнейший! (`.../vsemogushchiy-charodey-ne-osoznayot-chto-on-silneyshiy`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Я убил игрока академии (`.../ya-ubil-igroka-akademii`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Я убил игрока академии (`.../ya-ubil-igroka-akademii`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 134 | Глава 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Я убил игрока академии, URL=`manhwa/ya-ubil-igroka-akademii` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wamanga.ru/.../cover.webp` (image/webp (encoding: lossy), 28464 bytes, 375x543) |  |  |  |
| details identity | PASS | Details preserved selected URL `manhwa/ya-ubil-igroka-akademii` |  |  |  |
| details thumbnail URL | PASS | `https://wamanga.ru/.../cover.webp` |  |  |  |
| details author | PASS | Salam Sallyeo |  |  |  |
| details artist | PASS | Green Kyrin |  |  |  |
| details genres | PASS | 16+, Безумие, Боевик, Гарем, Игра, Комедия, Магия, Повседневность, Приключения, Сёнэн, Фэнтези, Антигерой, Артефакты, Бои на мечах, Видеоигры, Волшебники / маги, ГГ имба, ГГ мужчина, Гильдии, Игровые элементы, Квесты, Магическая академия, Монстры, Навыки / способности, Насилие / жестокость, Ранги силы, Реинкарнация, Скрытие личности, Спортивное тело, Средневековье, Умный ГГ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Я убил игрока.
<br>
<br>Он был настоящим сукиным сыном...<br><br>Просмотров: 74.2K<br>Лайков: 92<br>Год выпуска: 2023<br>Возрастное ограничение: 16+<br><br>Альтернативные названия:<br>• I Killed an Academy Player<br>• I Killed the Player of the Academy<br>• Убийство игрока<br>• 아카데미 플레이어를 죽였다<br>• I Killed the Academy Player |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 134 chapters |  |  |  |
| chapter dates | PASS | 134 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://wamanga.ru/.../cDExNzc4OTMzODc0Nzcw-part-0.webp` (image/webp (encoding: lossy), 201188 bytes, 690x10000) |  |  |  |
