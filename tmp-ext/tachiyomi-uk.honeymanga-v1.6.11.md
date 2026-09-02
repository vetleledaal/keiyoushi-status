# Extension Validation Report

- Extension: tachiyomi-uk.honeymanga-v1.6.11
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4712783922379490416
- Source name: HoneyManga
- Source language: uk
- Selected manga input: popular offset 0: Обери мене! (`.../52e6a78a-8930-4265-b0eb-f77c0dcb6b96`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 29 | Обери мене! (`.../52e6a78a-8930-4265-b0eb-f77c0dcb6b96`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Клуб 1Нр (`.../9336f6ce-81b8-443e-b3ba-935892da2553`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Повелитель чотирьох стін (`.../8ea02ec6-4109-4b9a-ada7-0ba64cac449d`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Навіжений в Мурімі! (`.../a83bb2f2-508d-4782-acaf-97cf6f1fec26`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Обери мене! (`.../52e6a78a-8930-4265-b0eb-f77c0dcb6b96`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Обери мене! (`.../52e6a78a-8930-4265-b0eb-f77c0dcb6b96`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 214 | Том 1 - Розділ 1 (`.../38f5e0ec-3675-4325-9cd2-fd791fa2ab53`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 55 |  |  | <1s |

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
| popular listing | PASS | 29 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Обери мене!, URL=`52e6a78a-8930-4265-b0eb-f77c0dcb6b96` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hmvolumestorage.b-cdn.net/.../611a3bed-7b16-4e51-881c-d700a3d95c31` (image/png, 5372744 bytes, 2000x2861) |  |  |  |
| details identity | PASS | Details preserved selected URL `52e6a78a-8930-4265-b0eb-f77c0dcb6b96` |  |  |  |
| details thumbnail URL | PASS | `https://hmvolumestorage.b-cdn.net/.../611a3bed-7b16-4e51-881c-d700a3d95c31` |  |  |  |
| details author | PASS | Hermode/Cho Wooneh (RedIce Studio) |  |  |  |
| details artist | PASS | Redice Studio/(3B2S) |  |  |  |
| details genres | PASS | Манхва, Фентезі, Екшн, Магія, Пригоди, Кіберпанк, ГГ чоловік, Виживання, Підземелля, Система, Артефакти, Бої на мечах, Гільдії, Чарівники |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Локі, гравець, що посідає 5-те місце у світі, втрачає свідомість під час рейду Підземелля в мобільній ґача-грі. «Що? Я тепер ігровий персонаж?». Прийшовши до тями, Локі усвідомлює, що став 1-зірковим героєм першого рівня – Ганом Іслатом. Щоб повернутися на Землю, йому необхідно підкорити 100-рівневу Вежу! Але спочатку він має допомогти Майстру-новачку та іншим героям опанувати ігрові механіки. «Не на того напали». Це розповідь про героя Локі, що ніколи не визнає жодної поразки. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 6 name, chapter 8 name, chapter 10 name, chapter 11 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 24 name, chapter 32 name, chapter 34 name, chapter 44 name, chapter 52 name, chapter 68 name, chapter 107 name, chapter 109 name |  |  |  |
| chapters | PASS | 214 chapters |  |  |  |
| chapter dates | PASS | 214 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hmvolumestorage.b-cdn.net/.../888a37d2-03bf-4e1d-b2f2-4b5a446d4101` (image/webp (encoding: lossy), 100922 bytes, 800x3000) |  |  |  |
