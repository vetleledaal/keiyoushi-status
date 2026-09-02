# Extension Validation Report

- Extension: tachiyomi-ru.allhentai-v1.6.68
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
- Source ID: 1809051393403180443
- Source name: AllHentai
- Source language: ru
- Selected manga input: latest offset 0: Сам рисуй свою пошлятину! (`.../sam_risui_svoiu_poshliatinu_`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Мачеха и ее подруги!!! (`.../macheha_i_ee_podrugi___`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | «Членодевка!», история издевательств (`.../_chlenodevka____istoriia_izdevatelstv`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Сам рисуй свою пошлятину! (`.../sam_risui_svoiu_poshliatinu_`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Химическая любовь (`.../himicheskaia_liubov`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Сам рисуй свою пошлятину! (`.../sam_risui_svoiu_poshliatinu_`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Сам рисуй свою пошлятину! (`.../sam_risui_svoiu_poshliatinu_`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Сам рисуй свою пошлятину!, URL=`.../sam_risui_svoiu_poshliatinu_` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://staticahen2.aaa200.one/.../873.jpg` (image/jpeg, 35367 bytes, 325x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sam_risui_svoiu_poshliatinu_` |  |  |  |
| details thumbnail URL | PASS | `https://staticahen2.aaa200.one/.../873.jpg` |  |  |  |
| details author | PASS | Kimmundo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | манхва, без цензуры, большая грудь, в цвете, гарем, комедия, оральный секс, романтика, мастурбация, психические отклонения, сексуально возбужденная |  |  |  |
| details status | PASS | PUBLISHING_FINISHED (4) |  |  |  |
| details description | PASS | ★★★✬☆ 7.42 (голосов: 166)<br>История о двух авторах вебтунов, которые поселились в странном доме. Давать волю грязным фантазиям в одиночку не так-то просто… «Эй, не хочешь стать героем моего пикантного комикса?»<br>**Альтернативные названия**:<br>- Сам рисуй свою пошлятину!<br>- Draw Yours<br>- Cartoonists NSFW<br>- Художник 18+ |  |  |  |
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
