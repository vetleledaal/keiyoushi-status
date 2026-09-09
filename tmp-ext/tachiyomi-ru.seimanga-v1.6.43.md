# Extension Validation Report

- Extension: tachiyomi-ru.seimanga-v1.6.43
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
- Source ID: 6340120447386662351
- Source name: SeiManga
- Source language: ru
- Selected manga input: popular offset 0: Токийские мстители (`.../tokiiskie_mstiteli`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Токийские мстители (`.../tokiiskie_mstiteli`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | Клинок зла (`.../klinok_zla`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | Токийские мстители: Письмо от Баджи Кэйскэ (`.../tokiiskie_mstiteli__pismo_ot_badji_keiske`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Сильнейший в истории ученик Кэнъити 2: Арка мастеров (`.../silneishii_v_istorii_uchenik_keniti_2__arka_masterov`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Токийские мстители (`.../tokiiskie_mstiteli`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Токийские мстители (`.../tokiiskie_mstiteli`) |  | 1-10s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Токийские мстители, URL=`.../tokiiskie_mstiteli` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 203/203 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 203/203 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sei.one-way.work/.../110.webp` (image/webp (encoding: lossy), 34648 bytes, 325x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tokiiskie_mstiteli` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://sei.one-way.work/.../928.webp` (image/webp (encoding: lossy), 29978 bytes, 325x450) |  |  |  |
| details author | PASS | Вакуи Кэн |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | манга, 18+, боевик, драма, романтика, сёнэн, школа, банды, гг мужчина, насилие, путешествие во времени, япония |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★✬ 9.1 (голосов: 3058)<br>В один день 26 летний девственник-неудачник, Такемичи, узнаёт, что единственная девушка, которая с ним встречалась, погибла в ходе разборок токийской группировки “Свастоны”. После того, как он падает под поезд, Такемичи перемещается на 12 лет назад, во времена средней школы. Он решает изменить будущее, дабы спасти девушку. Заручившись помощью от её младшего брата, Такемичи начинает свой путь к верхушкам самой опасной группировки города.<br>**Альтернативные названия**:<br>- Токийские мстители<br>- Tokyo Revengers<br>- Tokyo卍Revengers<br>- 東京卍リベンジャーズ<br>- Tokyo Manji Revengers<br>- 东京卍复仇者<br>- 도쿄 리벤저스<br>- Toukyou卍Revengers |  |  |  |
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
