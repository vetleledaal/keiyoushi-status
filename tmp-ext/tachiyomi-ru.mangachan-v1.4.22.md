# Extension Validation Report

- Extension: tachiyomi-ru.mangachan-v1.4.22
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 24
- Lint: 0
- Warnings: 0
- Skipped: 11
- Failed: 2
- Retry disposition: RETRY_NOW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: multichan
- Source ID: 7
- Source name: MangaChan
- Source language: ru
- Selected manga input: popular offset 0: Girl the Wild's (`.../33-girl-the-wilds.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Girl the Wild's (`.../33-girl-the-wilds.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Re:Monster (`.../32360-remonster.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Nine Eomma Choego (`.../175021-nine-eomma-choego.html`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Otonarisan ni iyasaretai (`.../174666-otonarisan-ni-iyasaretai.html`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Girl the Wild's (Шальные девчонки) (`.../33-girl-the-wilds.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 262 | Том 0 Глава 1 Пролог (`.../373720-girl-the-wilds_v0_ch1.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 502 | RETRY_NOW | HTTP_SERVER_ERROR |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Girl the Wild's (Шальные девчонки), URL=`.../33-girl-the-wilds.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imgcover.manga-chan.me/.../1341859425_i125583.jpg` (image/jpeg, 18510 bytes, 248x350) |  |  |  |
| details identity | SKIP | No details manga URL to compare |  |  |  |
| details thumbnail URL | SKIP | No details manga to check |  |  |  |
| details author | SKIP | No details manga to check |  |  |  |
| details artist | SKIP | No details manga to check |  |  |  |
| details genres | SKIP | No details manga to check |  |  |  |
| details status | SKIP | No details manga to check |  |  |  |
| details description | SKIP | No details manga to check |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 262 chapters |  |  |  |
| chapter dates | PASS | 262 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 502 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
