# Extension Validation Report

- Extension: tachiyomi-ru.wamanga-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
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
- Selected manga input: popular offset 0: Ветролом (`.../windbreaker`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Ветролом (`.../windbreaker`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Распятие Шести (`.../raspyatie-shesti`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Да Капо для музыкального гения (`.../da-kapo-dlya-muzykalnogo-geniya`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Зловещий пик (`.../zloveshchiy-pik`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Ветролом (`.../vetrolom`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ветролом (`.../windbreaker`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 565 | Глава 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Ветролом, URL=`manhwa/windbreaker` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 99/99 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 99/99 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wamanga.ru/.../cover.webp` (image/avif (format: avif), 112094 bytes, 375x487; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `manhwa/windbreaker` |  |  |  |
| details thumbnail URL | PASS | `https://wamanga.ru/.../cover.webp` |  |  |  |
| details author | PASS | JO Yongseok |  |  |  |
| details artist | PASS | JO Yongseok |  |  |  |
| details genres | PASS | 16+, Драма, Комедия, Повседневность, Романтика, Сёнэн, Спорт, Дружба, Шантаж, Антигерой, Спортивное тело, Насилие / жестокость, ГГ мужчина |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Ветролом — драма о юных уличных гонщиках, мечтающих о свободе. Главный герой — Джа Хён — сын успешных родителей и лучший ученик в своей школе, он никогда не знал, что значит «бороться за свою мечту», ведь вся его жизнь определялась родителями, которые хотят для сына только одного — успешного окончания школы. Но однажды Джа Хён, с детства любящий велоспорт, оказывается втянут в деятельность местных гонщиков, что заставляет героя пересмотреть приоритеты родителей и прислушаться к себе, ведь на своем новом пути он обретает друзей, любовь и приключения!<br><br>Просмотров: 24.4K<br>Лайков: 1.3M<br>Год выпуска: 2024<br>Возрастное ограничение: 16+<br><br>Альтернативные названия:<br>• Windbreaker<br>• ウインドブレーカー<br>• 冲锋衣<br>• 衝鋒衣ウ<br>• 윈드브레이커<br>• Wind Breaker |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 565 chapters |  |  |  |
| chapter dates | PASS | 565 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://wamanga.ru/.../e918a1a9-4f2f-4dcf-9485-688f6a3ddb7f-ready-0.webp` (image/webp (encoding: lossy), 349516 bytes, 690x10041) |  |  |  |
