# Extension Validation Report

- Extension: tachiyomi-ru.mintmanga-v1.6.89
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 25
- Lint: 0
- Warnings: 0
- Skipped: 10
- Failed: 2
- Retry disposition: RETRY_NOW

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
| popular | `getPopularManga(1)` | success | 50 | 19 дней — Однажды (`.../19_dnei___odnajdy`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | Смирна и Капри (`.../smirna_i_kapri`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Современный роман (`.../sovremennyi_roman`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Игра вничью (`.../igra_vnichiu`) |  | 1-10s |
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
| thumbnail | FAIL | Thumbnail URL `https://mmm.one-way.work/.../543.webp` could not be downloaded: kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 30000 ms | RETRY_NOW | TIMEOUT |  |
| details identity | PASS | Details preserved selected URL `.../19_dnei___odnajdy` |  |  |  |
| details thumbnail URL | PASS | `https://mmm.one-way.work/.../543.webp` |  |  |  |
| details author | PASS | Студия Мосспака, Олд Сянь |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | маньхуа, драма, комедия, мужчины, повседневность, романтика, школа, юноши, благополучные семьи, брат и сестра, братья, гг мужчина, дружба, друзья детства, издевательства, китай, насилие, неблагополучные семьи, несколько гг, преступники, путешествие, современный мир |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 9.6 (голосов: 31983)<br>Стрипы про четырех школьников, сперва в виде комедийных зарисовок, позже перерастающие в маньхуа с полноценным сюжетом.<br>**Альтернативные названия**:<br>- 19 дней — Однажды<br>- 19 Days — One Day<br>- 19 Tian<br>- 19天 一旦<br>- 19 Tian Yidan<br>- 19 Days<br>- 19天 |  |  |  |
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
