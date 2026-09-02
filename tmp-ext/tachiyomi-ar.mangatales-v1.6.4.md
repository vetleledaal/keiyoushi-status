# Extension Validation Report

- Extension: tachiyomi-ar.mangatales-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 3
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5218550345649535189
- Source name: Manga Tales
- Source language: ar
- Selected manga input: latest offset 0: خيط الكراهية  (`.../2616`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | حفيد المملكة (`.../1337`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | ربيع شالا (`.../831`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 27 | خيط الكراهية  (`.../2616`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | RishanXFouladh (`.../1284`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | خيط الكراهية  (`.../2616`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | خيط الكراهية  (`.../2616`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 1 - الفصل الاول  (`.../3206`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 27 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=خيط الكراهية , URL=`.../2616` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=VEZIAX , URL=`.../2465` at page 1 offset 1 and page 2 offset 8, title=حجابي مرآة سعادتي , URL=`.../2548` at page 1 offset 2 and page 2 offset 2, title=Black Death, URL=`.../1256` at page 1 offset 5 and page 2 offset 5, title=Extraordinary Spy Boys, URL=`.../1856` at page 1 offset 7 and page 2 offset 10, title=ربيع شالا, URL=`.../831` at page 1 offset 9 and page 2 offset 21, title=جثمان, URL=`.../2425` at page 1 offset 10 and page 2 offset 24, title=RishanXFouladh, URL=`.../1284` at page 1 offset 15 and page 2 offset 0, title=Zero mirror , URL=`.../2537` at page 1 offset 18 and page 2 offset 4, title=أرواح ضائعة, URL=`.../146` at page 1 offset 19 and page 2 offset 20 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 153/153 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 149/153 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.mangatales.com/.../large_Screenshot_%D9%A2%D9%A0%D9%A2%D9%A6-%D9%A0%D9%A7-%D9%A3%D9%A0-%D9%A1%D9%A5-%D9%A3%D9%A7-%D9%A4%D9%A4-%D9%A7%D9%A8%D9%A9_jp.ne.ibis.ibispaintx.app.png` (image/png, 176090 bytes, 260x363) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2616` |  |  |  |
| details thumbnail URL | PASS | `https://media.mangatales.com/.../large_Screenshot_%D9%A2%D9%A0%D9%A2%D9%A6-%D9%A0%D9%A7-%D9%A3%D9%A0-%D9%A1%D9%A5-%D9%A3%D9%A7-%D9%A4%D9%A4-%D9%A7%D9%A8%D9%A9_jp.ne.ibis.ibispaintx.app.png` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | المانجا, عربي, رومانسي, دراما, شوجو, كوميدي, ويب-تون |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | بدأت نسب الطلاق تصبح عاليه لذا قررت الحكومه أن تضع حل لهذي المشكله.... <br><br>حالة الترجمة:<br>• منتهية<br><br>مسميّات أخرى:<br>• Thread of hatred <br>• خيط الكراهية <br>• Thread of hatred  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title, description, chapter 1 name, chapter 3 name |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://media.mangatales.com/.../1.png <redacted query values: ak>` (image/png, 2019062 bytes, 800x10000) |  |  |  |
