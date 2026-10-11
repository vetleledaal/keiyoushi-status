# Extension Validation Report

- Extension: tachiyomi-ru.mintmanga-v1.6.90
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 6
- Source name: MintManga
- Source language: ru
- Selected manga input: popular offset 0: 19 дней — Однажды (`.../19_dnei___odnajdy`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 19 дней — Однажды (`.../19_dnei___odnajdy`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | Стыки (`.../styki__A2034ec`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Пожалуйста, поиздевайтесь надо мной, мисс Злодейка! (`.../pojaluista__poizdevaites_nado_mnoi__miss_zlodeika_`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Полёт в один конец (`.../polet_v_odin_konec`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 19 дней — Однажды (`.../19_dnei___odnajdy`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 19 дней — Однажды (`.../19_dnei___odnajdy`) |  | 1-10s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=19 дней — Однажды, URL=`.../19_dnei___odnajdy` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://zz.one-way.work/.../543.webp` (image/webp (encoding: lossy), 35372 bytes, 325x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../19_dnei___odnajdy` |  |  |  |
| details thumbnail URL | PASS | `https://zz.one-way.work/.../543.webp` |  |  |  |
| details author | PASS | Студия Мосспака, Олд Сянь |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | маньхуа, драма, комедия, мужчины, повседневность, романтика, школа, юноши, благополучные семьи, брат и сестра, братья, гг мужчина, дружба, друзья детства, издевательства, китай, любовный треугольник, насилие, неблагополучные семьи, несколько гг, преступники, путешествие, современный мир |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 9.6 (голосов: 32154)<br>Стрипы про четырех школьников, сперва в виде комедийных зарисовок, позже перерастающие в маньхуа с полноценным сюжетом.<br>**Альтернативные названия**:<br>- 19 дней — Однажды<br>- 19 Days — One Day<br>- 19 Tian<br>- 19天 一旦<br>- 19 Tian Yidan<br>- 19 Days<br>- 19天 |  |  |  |
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
