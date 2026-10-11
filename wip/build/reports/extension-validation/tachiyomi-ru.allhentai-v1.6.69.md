# Extension Validation Report

- Extension: tachiyomi-ru.allhentai-v1.6.69
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
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
| popular | `getPopularManga(1)` | success | 50 | Мачеха и ее подруги!!! (`.../macheha_i_ee_podrugi___`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | «Членодевка!», история издевательств (`.../_chlenodevka____istoriia_izdevatelstv`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Мой сладкий роман с бесчувственной девушкой (`.../moi_sladkii_roman_s_beschuvstvennoi_devushkoi`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Включайся! (`.../vkliuchaisia_`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Мачеха и ее подруги!!! (`.../macheha_i_ee_podrugi___`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Мачеха и ее подруги!!! (`.../macheha_i_ee_podrugi___`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 147 | 1 - 1 (`.../1 <redacted query values: mtr>`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Для просмотра главы необходима авторизация через WebView🌎 (Ошибка 404). Авторизуйтесь в WebView и обновите мангу. | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Для просмотра главы необходима авторизация через WebView🌎 (Ошибка 404). Авторизуйтесь в WebView и обновите мангу. | REVIEW | INSUFFICIENT_EVIDENCE |  |
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
| details genres | PASS | манхва |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★☆ 8.5 (голосов: 4945)<br>История про паренька, у которого, появляется сексапильная мачеха, у которой много сексуальных подруг,которых он увидел в порнухе ,все бы ничего если бы там не участвовала его новая сексуальная мачеха. Как развернётся его судьба и сексуальное мышление вы узнаете когда прочтёте<br>**Альтернативные названия**:<br>- Мачеха и ее подруги!!!<br>- STEPMOTHER FRIENDS<br>- STEPMOTHER'S FRIENDS<br>- Saeeommaui Chingudeul |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 147 chapters |  |  |  |
| chapter dates | PASS | 147 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Для просмотра главы необходима авторизация через WebView🌎 (Ошибка 404). Авторизуйтесь в WebView и обновите мангу. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://20.allhen.online/.../1 <redacted query values: mtr>` to `https://20.allhen.online/.../1` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
