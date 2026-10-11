# Extension Validation Report

- Extension: tachiyomi-bg.utsukushii-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mmrcms
- Source ID: 4406556873729219957
- Source name: Utsukushii
- Source language: bg
- Selected manga input: popular offset 0: -SINS- (`.../sins`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | -SINS- (`.../sins`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | -SINS- (`.../sins`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 4 | Solty Rei: Aka no Shukujo (`.../solty-rei-aka-no-shukujo`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 5 | Claymore (`.../claymore`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | -SINS- (`.../sins`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | -SINS- (`.../sins`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1: Грехове (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 49 |  |  | <1s |

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
| latest listing | PASS | 4 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=-SINS-, URL=`.../sins` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | FAIL | Page 2 matches page 1 exactly | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Fairy Tail, URL=`.../fairy-tail` at page 1 offset 2 and page 2 offset 4, title=Claymore, URL=`.../claymore` at page 1 offset 3 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://utsukushii-bg.com/.../cover_250x350.jpg` (image/jpeg, 36614 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sins` |  |  |  |
| details thumbnail URL | PASS | `http://utsukushii-bg.com/.../cover_250x350.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Комедия, Самостоятелна.../%D0%9F%D0%B8%D0%BB%D0%BE%D1%82%D0%BD%D0%B0 глава, Шонен |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | <br>В училището на Ерма Микагами се мести ученик на име Сара Танаджуроу, който става бързо център на вниманието, поради необичайното си поведение - той доста често признава любовта си на някое момиче. Срамежливият Ерма не може да признае любовта си на момичето, което харесва, а това донякъде го сближава с новия ученик, с прякор „Сатана” (първата сричка от първото му име + първите две срички от второто му име). Но това европейче всъщност е част от тайна организация, която се опълчва на напоследък изперкалите ангели. Определено не е яко да станеш жертва на насъскания от „Венера” „Купидон”... |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://utsukushii-bg.com/.../01.jpg` (image/jpeg, 371499 bytes, 893x1247) |  |  |  |
