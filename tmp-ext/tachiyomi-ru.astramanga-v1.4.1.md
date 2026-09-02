# Extension Validation Report

- Extension: tachiyomi-ru.astramanga-v1.4.1
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7938304578940592570
- Source name: AstraManga
- Source language: ru
- Selected manga input: popular offset 0: Возрождение Хуашань (`.../vozrozhdenie-huashan`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Возрождение Хуашань (`.../vozrozhdenie-huashan`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Новая жизнь убийцы богов (`.../novaya-zhizn-ubiytsy-bogov`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Наномашины (`.../nanomashiny`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Весна столицы (`.../vesna-stolitsy`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | Возрождение Хуашань (`.../vozrozhdenie-huashan`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Возрождение Хуашань (`.../vozrozhdenie-huashan`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 168 | Том 1 Глава 1 — Глава 1 (`.../17512`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 56 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Возрождение Хуашань, URL=`vozrozhdenie-huashan` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://astramanga.org/.../cover_06_3e2aa087.jpg` (image/webp (encoding: lossy), 286618 bytes, 1696x2432) |  |  |  |
| details identity | PASS | Details preserved selected URL `vozrozhdenie-huashan` |  |  |  |
| details thumbnail URL | PASS | `https://astramanga.org/.../cover_06_3e2aa087.jpg` |  |  |  |
| details author | PASS | Naver |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Манхва, Боевые искусства, Выживание, Героическое фэнтези, Драма, Исторический, Комедия, Культивация, Мурим, Приключения, Сёнен, Философия, Фэнтези, Экшен, Элементы юмора, Антигерой, Артефакты, Бои на мечах, ГГ мужчина, ГГ имба, Жестокий мир, Месть, Навыки / Способности, Ранги силы, Реинкарнация, Сокрытие личности, Спортивное тело, Умный ГГ, Школа |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Альт. название: Return of the Blossoming Blade<br>Другие названия: Hwasan Gwihwan, Return of Sword Master, Return of the Flowery Mountain Sect, Return of the Mount Hua Sect, Volcanic Return, Возвращение Хуашань, Возвращение секты горы Хуа<br>Год выпуска: 2021<br><br>13-й ученик великой школы Хуашань, один из трех величайших фехтовальщиков в мире — благородный клинок цветущей сливы Чхон Мён.<br>Последним ударом клинка он убивает Чхонма, повергшего весь мир в хаос, и погибает на вершине горы из голов тысячи демонов.<br>А спустя 100 лет он перерождается в теле ребенка, чтобы возродить из пепла некогда одну из самых великих, но ныне всеми забытую школу Мурима — Хуашань.<br>Цветки сливы рано или поздно опадают. Однако когда приходит холодная зима, а за ней — весна, слива распускается в своем полном великолепии. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 168 chapters |  |  |  |
| chapter dates | PASS | 168 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.astramanga.org/.../0_11c4c1fa.webp` (image/webp (encoding: lossy), 429446 bytes, 690x5000) |  |  |  |
