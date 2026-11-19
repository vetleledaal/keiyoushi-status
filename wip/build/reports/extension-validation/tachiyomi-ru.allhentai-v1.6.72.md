# Extension Validation Report

- Extension: tachiyomi-ru.allhentai-v1.6.72
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 2
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
- Selected manga input: latest offset 0: Это правда? (`.../eto_pravda_`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Мачеха и ее подруги!!! (`.../macheha_i_ee_podrugi___`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | Сборник комиксов от Neocoill (`.../sbornik_komiksov_ot_neocoill`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | Это правда? (`.../eto_pravda_`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Геройские Истории (`.../geroiskie_istorii`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Это правда? (`.../eto_pravda_`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Это правда? (`.../eto_pravda_`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 68 | 1 - 1 (`.../1 <redacted query values: mtr>`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Это правда?, URL=`.../eto_pravda_` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 203/203 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 202/203 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://staticahen2.aaa200.one/.../047.jpg` (image/jpeg, 43952 bytes, 325x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../eto_pravda_` |  |  |  |
| details thumbnail URL | PASS | `https://staticahen2.aaa200.one/.../047.jpg` |  |  |  |
| details author | PASS | Pyo |  |  |  |
| details artist | PASS | Ddingjol |  |  |  |
| details genres | PASS | манхва |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★✬☆ 6.7 (голосов: 1412)<br>Слишком пикантно, чтобы быть правдой? Или слишком реально, чтобы в это поверить? Жаркие фантазии о женатом друге... Шокирующая выходка незнакомой четверки... Кто из нас не мечтал сорвать покровы с запретного? Сборник глав, подогревающая азарт до самой развязки. Проверьте, насколько тонка грань между былью и вымыслом. Сделайте свою ставку... Если хватит смелости.<br>**Альтернативные названия**:<br>- Это правда?<br>- Is it a true story?<br>- Silhwailkka?<br>- 실화일까? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 68 chapters |  |  |  |
| chapter dates | PASS | 68 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Для просмотра главы необходима авторизация через WebView🌎 (Ошибка 404). Авторизуйтесь в WebView и обновите мангу. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://20.allhen.online/.../1 <redacted query values: mtr>` to `https://20.allhen.online/.../1` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
