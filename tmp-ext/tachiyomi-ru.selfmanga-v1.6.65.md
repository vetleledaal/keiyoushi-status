# Extension Validation Report

- Extension: tachiyomi-ru.selfmanga-v1.6.65
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
- Lint: 0
- Warnings: 0
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5227602742162454547
- Source name: SelfManga
- Source language: ru
- Selected manga input: popular offset 0: NO_WAY (`.../no_way`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | NO_WAY (`.../no_way`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | Прямо в кокоро (`.../priamo_v_kokoro`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Я же говорила, что старшая школа - самая скучная пора в жизни (`.../ia_je_govorila__chto_starshaia_shkola___samaia_skuchnaia_pora_v_jizni`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Путеводитель по Иным Мирам (`.../putevoditel_po_inym_miram`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | NO_WAY (`.../no_way`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | NO_WAY (`.../no_way`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=NO_WAY, URL=`.../no_way` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://sm.one-way.work/.../988.webp` (image/webp (encoding: lossy), 28012 bytes, 325x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../no_way` |  |  |  |
| details thumbnail URL | PASS | `https://sm.one-way.work/.../988.webp` |  |  |  |
| details author | PASS | Lay_lo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | вебтун, гендерная интрига, комедия, романтика, сверхъестественное, фэнтези, гг мужчина, юноши |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | ★★★★✬ 9.5 (голосов: 5450)<br>Бессюжетная, бессмысленная история о династической помолвке эльфа и вампира. Да, именно такого уровня бред вас ждет)) Короткие и длинные стрипы и ситуации. Нетрадиционная любовь, традиционная любовь, роман, единороги, сказочное отсутствие логики у персонажей и у автора))<br>**Альтернативные названия**:<br>- NO_WAY |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
