# Extension Validation Report

- Extension: tachiyomi-ru.mangalib-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 25
- Lint: 1
- Warnings: 1
- Skipped: 9
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
- Selected manga input: popular offset 0: Solo Leveling (`.../7580--i-alone-level-up`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Solo Leveling (`.../7580--i-alone-level-up`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | Return of the Blossoming Blade (`.../57751--hwasangwihwan-`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | Unconventional Isekai: Isn't It Too Much of a Black-Company Treatment to Fight Hordes of Monsters Without Magic? (`.../272433--jimi-isekai-mahou-nashi-de-bakemono-no-taigun-to-tatakae-tte-black-sugimasen`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Bolegar: the beast soul (`.../228967--bolegar-dusa-zveria`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Solo Leveling (`.../7580--i-alone-level-up`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo Leveling (`.../7580--i-alone-level-up`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 0 |  |  | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Solo Leveling, URL=`.../7580--i-alone-level-up` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Bolegar: the beast soul, URL=`.../228967--bolegar-dusa-zveria` at page 1 offset 14 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 153/153 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 153/153 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.cdnlibs.org/.../5c955cc1-1a25-4e9b-b9c2-e75677bfb15a.jpg` (image/jpeg, 76464 bytes, 375x506) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../7580--i-alone-level-up` |  |  |  |
| details thumbnail URL | PASS | `https://cover.cdnlibs.org/.../5c955cc1-1a25-4e9b-b9c2-e75677bfb15a.jpg` |  |  |  |
| details author | PASS | GEE So-Lyung, Chugong |  |  |  |
| details artist | PASS | Jang Sung-lak, Redice Studio |  |  |  |
| details genres | PASS | Манхва, 16+, Боевик, Постапокалиптика, Приключения, Сёнэн, Фэнтези, Военное, Монстры, Эльфы, Армия, Артефакты, Бои на мечах, Брат и сестра, Война, Волшебные существа, Гильдии, Ранги силы, Жестокий мир, Животные компаньоны, Игровые элементы, Квесты, Легендарное оружие, Навыки / способности, Насилие / жестокость, Нежить, Разумные расы, Система, Скрытие личности, Спасение мира, Холодное оружие, Волшебники / маги, ГГ имба, ГГ мужчина, Умный ГГ, Драконы, Подземелья |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Поднятие уровня в одиночку<br>★★★★✬ 9.47 (голосов: 198345)<br>Альтернативные названия:<br>I Alone Level-Up / I Level Up Alone / I alone level up / Na Honjaman Level Up / Na Honjaman Rebereop / Only I Level Up / Ore Dake Level Up na Ken / Соло Левелинг / Я один повышаю свой уровень / 俺だけレベルアップな件 / 我独自升级 / 나 혼자만 레벨업<br><br>10 лет назад раскрылись врата в другой мир, где людям дозволено убивать монстров. Так появились охотники, преследующие и уничтожающие тварей. Но не каждому из них суждено повысить свой уровень и стать сильнее. Сон Джин Ву был охотником низшего E-ранга, у которого не было ни единого шанса продвинуться по ранговой лестнице, пока однажды он случайно не очутился в подземелье D-ранга. Чуть не погибнув от рук сильнейших чудовищ, Джин Ву открывает секрет повышения уровня, известный только ему одному. Теперь даже самый слабый может стать сильнейшим.<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
