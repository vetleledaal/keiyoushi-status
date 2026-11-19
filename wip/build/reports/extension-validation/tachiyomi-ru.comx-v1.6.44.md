# Extension Validation Report

- Extension: tachiyomi-ru.comx-v1.6.44
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 14
- Lint: 0
- Warnings: 1
- Skipped: 19
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1114173092141608635
- Source name: Com-X
- Source language: ru
- Selected manga input: popular offset 0: Магическая битва (`.../9514-magicheskaya-bitva-reads.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Магическая битва (`.../9514-magicheskaya-bitva-reads.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Чёрный Клевер (`.../10072-chernyj-klever.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Я подобрал женщину-рыцаря на рисовом поле, но люди думают, что она моя жена в деревне (`.../14528-ja-podobral-zhenschinu-rycarja-na-risovom-pole-no-ljudi-dumajut-chto-ona-moja-zhena-v-derevne.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Хори-сан и Миямура-кун (`.../22123-hori-san-i-mijamura-kun.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | SKIP | HTTP error 404 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rus.com-x.life/.../f92db20c161406b77e296961db27d2.webp` (image/webp (encoding: lossy), 8496 bytes, 130x196) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | SKIP | No details metadata to check |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://ru.com-x.life/.../comix-read` to `https://ru.com-x.life/.../_c <redacted query values: t and u>` (1 redirects); popular: `https://ru.com-x.life/.../9514-magicheskaya-bitva-reads.html` to `https://ru.com-x.life/.../_c <redacted query values: t and u>` (1 redirects); popular: `https://ru.com-x.life/.../1` to `https://ru.com-x.life/.../_c <redacted query values: t and u>` (1 redirects); popular: `https://ru.com-x.life/.../9514-magicheskaya-bitva-reads.html` to `https://ru.com-x.life/.../_c <redacted query values: t and u>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
