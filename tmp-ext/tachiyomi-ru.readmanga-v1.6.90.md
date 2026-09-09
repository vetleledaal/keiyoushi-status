# Extension Validation Report

- Extension: tachiyomi-ru.readmanga-v1.6.90
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 25
- Lint: 0
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: grouple
- Source ID: 5
- Source name: ReadManga
- Source language: ru
- Selected manga input: popular offset 0: Поднятие уровня в одиночку (`.../podniatie_urovnia_v_odinochku__A5ea4`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Поднятие уровня в одиночку (`.../podniatie_urovnia_v_odinochku__A5ea4`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | Ранкер, который живёт второй раз (`.../ranker__kotoryi_jivet_vtoroi_raz__A35c96`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Возрождение ада: руководство демона по воспитанию детей (Ремейк) (`.../vozrojdenie_ada__rukovodstvo_demona_po_vospitaniiu_detei__remeik_`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Один + Один (`.../odin___odin_2013`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Поднятие уровня в одиночку (`.../podniatie_urovnia_v_odinochku__A5ea4`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Поднятие уровня в одиночку (`.../podniatie_urovnia_v_odinochku__A5ea4`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.lang.Exception: Для просмотра контента необходима авторизация через WebView🌍 или включите автоматическую авторизацию в настройках расширения | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.Exception: Для просмотра контента необходима авторизация через WebView🌍 или включите автоматическую авторизацию в настройках расширения | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Поднятие уровня в одиночку, URL=`.../podniatie_urovnia_v_odinochku__A5ea4` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 203/203 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 203/203 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rm.one-way.work/.../482.webp` (image/webp (encoding: lossy), 46552 bytes, 325x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../podniatie_urovnia_v_odinochku__A5ea4` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://rm.one-way.work/.../113.webp` (image/webp (encoding: lossy), 28168 bytes, 325x450) |  |  |  |
| details author | PASS | Ки Сорён, Чхугон |  |  |  |
| details artist | PASS | Студия Redice, Чан Сон Нак |  |  |  |
| details genres | PASS | манхва, 12+, боевик, драма, приключения, сёнэн, фэнтези, артефакты, бои на мечах, брат и сестра, взрослая пара, война, волшебники, волшебные существа, выживание, гг имба, гг мужчина, гильдии, городское фэнтези, демоны, драконы, жестокий мир, животные-компаньоны, игра, игровые элементы, квесты, легендарное оружие, магия, монстры, навыки, насилие, нежить, по мотивам романа, подземелья, призраки, разумные расы, ранги силы, современное фэнтези, сокрытие личности, спасение мира, умный гг, холодное оружие, эльфы |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★✬ 9.5 (голосов: 28663)<br>10 лет назад, после того как распахнулись Врата, связавшие наш мир с миром монстров, некоторые люди приобрели способности, позволяющие им охотиться на монстров внутри Врат. Их стали именовать Охотниками. Однако не все Охотники были сильны. Моё имя — Сон Джин У, я охотник ранга Е. Мне приходится рисковать своей жизнью в самых низкоуровневых подземельях. Не имея необходимых навыков, я едва мог зарабатывать деньги, сражаясь со слабейшими монстрами... По крайней мере это длилось до того, пока я не нашёл скрытое подземелье, сложнейшее из всех подземелий ранга D! Находясь на грани жизни и смерти, я внезапно получил странную силу — «Систему», содержащую секреты и особенности поднятия уровня, о которых я даже и не догадывался! Если я хочу, чтобы мой уровень постоянно рос, я должен начать тренировки в соответствии со списком квестов. От самого слабого Охотника E-ранга к сильнейшему Охотнику S-ранга! Описание от Ньюби.<br>**Альтернативные названия**:<br>- Поднятие уровня в одиночку<br>- Solo Leveling<br>- 나 혼자만 레벨업<br>- 俺だけレベルアップな件<br>- 我独自升级<br>- Ore Dake Level Up na Ken<br>- Only I Level Up<br>- I level up alone<br>- I am the only one who levels up<br>- Na Honjaman Lebel-eob<br>- Na Honjaman Level Up |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
