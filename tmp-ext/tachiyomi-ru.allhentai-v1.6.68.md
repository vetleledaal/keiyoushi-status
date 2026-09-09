# Extension Validation Report

- Extension: tachiyomi-ru.allhentai-v1.6.68
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 26
- Lint: 0
- Warnings: 0
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: grouple
- Source ID: 1809051393403180443
- Source name: AllHentai
- Source language: ru
- Selected manga input: popular offset 0: Мачеха и ее подруги!!! (`.../macheha_i_ee_podrugi___`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Мачеха и ее подруги!!! (`.../macheha_i_ee_podrugi___`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | «Членодевка!», история издевательств (`.../_chlenodevka____istoriia_izdevatelstv`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | Нехватка мужчин (`.../nehvatka_mujchin`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Комиксы от Junkzero (`.../komiksy_ot_junkzero`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Мачеха и ее подруги!!! (`.../macheha_i_ee_podrugi___`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Мачеха и ее подруги!!! (`.../macheha_i_ee_podrugi___`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.lang.Exception: Для просмотра контента необходима авторизация через WebView🌎 | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.Exception: Для просмотра контента необходима авторизация через WebView🌎 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Мачеха и ее подруги!!!, URL=`.../macheha_i_ee_podrugi___` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://staticahen2.aaa200.one/.../077.jpg` (image/jpeg, 39901 bytes, 325x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../macheha_i_ee_podrugi___` |  |  |  |
| details thumbnail URL | PASS | `https://staticahen2.aaa200.one/.../077.jpg` |  |  |  |
| details author | PASS | Neck Pillow |  |  |  |
| details artist | PASS | Red-A |  |  |  |
| details genres | PASS | манхва, ahegao, анал, бдсм, большая грудь, большая попка, большой член, в первый раз, в цвете, гарем, групповой секс, зрелые женщины, романтика, handjob, вибратор, глубокий минет, двойное проникновение, домохозяйки, исполнение желаний, латекс и кожа, пайзури, повседневность, спортивная форма, фетиш, шалава |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★✬ 8.55 (голосов: 4934)<br>История про паренька, у которого, появляется сексапильная мачеха, у которой много сексуальных подруг,которых он увидел в порнухе ,все бы ничего если бы там не участвовала его новая сексуальная мачеха. Как развернётся его судьба и сексуальное мышление вы узнаете когда прочтёте<br>**Альтернативные названия**:<br>- Мачеха и ее подруги!!!<br>- STEPMOTHER'S FRIENDS<br>- STEPMOTHER FRIENDS<br>- Saeeommaui Chingudeul |  |  |  |
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
