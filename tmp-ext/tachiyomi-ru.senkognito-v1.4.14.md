# Extension Validation Report

- Extension: tachiyomi-ru.senkognito-v1.4.14
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 3
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8393977756208732343
- Source name: Senkognito
- Source language: ru
- Selected manga input: popular offset 0: Герой — секретарь под столом (`.../TUFOR0E6MjQ1NDUzNzU2NzY4OTk0ODM1,,the-hero-is-the-secretary-under-the-desk`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Герой — секретарь под столом (`.../TUFOR0E6MjQ1NDUzNzU2NzY4OTk0ODM1,,the-hero-is-the-secretary-under-the-desk`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Нехватка мужчин (`.../TUFOR0E6MjI5ODU2NTkwOTg1OTcxMjQw,,there-are-not-enough-men`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 9 | Герой — секретарь под столом (`.../TUFOR0E6MjQ1NDUzNzU2NzY4OTk0ODM1,,the-hero-is-the-secretary-under-the-desk`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Герой — секретарь под столом (`.../TUFOR0E6MjQ1NDUzNzU2NzY4OTk0ODM1,,the-hero-is-the-secretary-under-the-desk`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 9 | 1. Глава 1  (`.../TUFOR0E6MjQ1NDUzNzU2NzY4OTk0ODM1,,the-hero-is-the-secretary-under-the-desk,,TUFOR0FfQ0hBUFRFUjoyNDU2OTk1MjAzNjc3MDc2ODA,,245699520367707680`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Герой — секретарь под столом, URL=`TUFOR0E6MjQ1NDUzNzU2NzY4OTk0ODM1,,the-hero-is-the-secretary-under-the-desk` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 29/29 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 29/29 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mirai.senkuro.net/.../104c43ba8c54fc1054ae92728ae08c2aa6cb5671_245854878109287986.jpeg` (image/jpeg, 189128 bytes, 700x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `TUFOR0E6MjQ1NDUzNzU2NzY4OTk0ODM1,,the-hero-is-the-secretary-under-the-desk` |  |  |  |
| details thumbnail URL | PASS | `https://mirai.senkuro.net/.../104c43ba8c54fc1054ae92728ae08c2aa6cb5671_245854878109287986.jpeg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Манхва, 18+, Веб, Вебтун, В цвете, Эротика, Этти, Хентай, Повседневность, Романтика, Женский гарем, Зрелые женщины, Большая попка, Большая грудь, Обычный секс, Владыка демонов, Фэнтези, Комедия, ГГ мужчина, Офисные работники |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Альтернативные названия:<br>You are the under-desk secretary / 용사님은 책상 밑 비서<br><br>Герой, который защитил Корею от вторжения демонов (сейчас эти демоны отчаянно пытаются устроиться хотя бы в малый или средний бизнес), однажды отправляется на собеседование в загадочную компанию. И там председателем правления оказывается королева демонов, которую он когда-то победил?! © Senkuro |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mirai.senkuro.net/.../tachiyomi-op.jpeg` (image/jpeg, 343802 bytes, 1000x1200) |  |  |  |
