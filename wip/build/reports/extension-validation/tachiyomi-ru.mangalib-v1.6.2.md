# Extension Validation Report

- Extension: tachiyomi-ru.mangalib-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: libgroup
- Source ID: 6111047689498497237
- Source name: MangaLib
- Source language: ru
- Selected manga input: popular offset 0: Omniscient Reader (`.../34466--jeonjijeog-dogja-sijeom_`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Omniscient Reader (`.../34466--jeonjijeog-dogja-sijeom_`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 60 | Kaguya-sama: Love is War (`.../6435--kaguya-sama-wa-kokurasetai-tensai-tachi-no-renai-zunousen`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | Kusunoki's Flunking Her High School Glow-Up (`.../162442--kusunoki-san-wa-koukou-debut-ni-shippai-shite-iru`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | A Rookie, Also an Actor With 10+ Million Viewers (`.../199450--sin-in-inde-cheonmanbaeu`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Omniscient Reader (`.../34466--jeonjijeog-dogja-sijeom_`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Omniscient Reader (`.../34466--jeonjijeog-dogja-sijeom_`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 313 | Том 1. Глава 0 (`.../chapter <redacted query values: , volume, and number>`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Omniscient Reader, URL=`.../34466--jeonjijeog-dogja-sijeom_` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 154/154 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 154/154 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.lib.social/.../c8403880-e3b9-4c36-a4de-0c7209a6589d.jpg` (image/jpeg, 61088 bytes, 375x536) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../34466--jeonjijeog-dogja-sijeom_` |  |  |  |
| details thumbnail URL | PASS | `https://cover.lib.social/.../c8403880-e3b9-4c36-a4de-0c7209a6589d.jpg` |  |  |  |
| details author | PASS | singNsong |  |  |  |
| details artist | PASS | Redice Studio |  |  |  |
| details genres | PASS | Манхва, 18+, Боевик, Боевые искусства, Постапокалиптика, Приключения, Сверхъестественное, Сэйнэн, Триллер, Фантастика, Фэнтези, Исекай, Монстры, Реинкарнация, Демоны, Зверолюди, Призраки / Духи, Выживание, Путешествие во времени, Боги, Ангелы, Апокалипсис, Артефакты, Бои на мечах, Владыка демонов, Волшебные существа, Дружба, Жестокий мир, Злые духи, Игровые элементы, Квесты, Легендарное оружие, Навыки / способности, Насилие / жестокость, Разумные расы, Система, Скрытие личности, Спасение мира, Холодное оружие, Шантаж, ГГ имба, ГГ мужчина, Умный ГГ, Драконы, Подземелья, Амнезия / Потеря памяти |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | Всеведущий читатель<br>★★★★★ 9.78 (голосов: 77156)<br>Альтернативные названия:<br>Omniscient Reader’s Viewpoint / Точка зрения всеведущего читателя / Точка зрения всезнающего читателя / 전지적 독자 시점<br><br>«Я знаю то, что сейчас будет». В тот момент, когда он подумал об этом, мир был уже разрушен, и вдруг открылась новая вселенная. Новая жизнь обычного читателя начинается в мире романа... романа, который смог прочесть лишь он.<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 7 name, chapter 8 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name |  |  |  |
| chapters | PASS | 313 chapters |  |  |  |
| chapter dates | PASS | 313 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | FAIL | 3 of 4 pages have invalid URLs: page 2: url=`.../002_7LoT.png` (protocol-relative URL), page 3: url=`.../003_maiV.png` (protocol-relative URL), page 4: url=`.../004_dJpa.png` (protocol-relative URL) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img3.cdnlibs.org/.../001_TLcV.png` (image/jpeg, 895858 bytes, 690x17662) |  |  |  |
