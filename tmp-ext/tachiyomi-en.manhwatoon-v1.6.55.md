# Extension Validation Report

- Extension: tachiyomi-en.manhwatoon-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
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
- Source theme: madara
- Source ID: 3590279382085161370
- Source name: Manhwa Toon
- Source language: en
- Selected manga input: popular offset 0: MILF Exchange Plan (`.../444`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | MILF Exchange Plan (`.../444`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Moby Dick (`.../1223`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Martial Inverse (Wu Ni) (`.../30662`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | SSS-geup Jugeoya Saneun Hunter (`.../39621`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | MILF Exchange Plan (`.../444`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | MILF Exchange Plan (`.../444`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 110 | Chapter 1 (`.../chapter1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=MILF Exchange Plan, URL=`444` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.manhwatoon.me/.../MILF-Exchange-Plan-444-175x238.png` (image/png, 73295 bytes, 175x238; server Content-Type: text/plain; charset=koi8-r) |  |  |  |
| details identity | PASS | Details preserved selected URL `444` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.manhwatoon.me/.../MILF-Exchange-Plan-444-193x278.png` (image/png, 90708 bytes, 193x278; server Content-Type: text/plain; charset=koi8-r) |  |  |  |
| details author | PASS | Yagyeong |  |  |  |
| details artist | PASS | Bangkki |  |  |  |
| details genres | PASS | Adult, Drama, Manhwa, Mature, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Eunnam develops a sexual desire towards the mother of his best friend, Jidong! He then makes a rebellious bet with his stepmother on the line…<br><br>A secret alliance of unfilial sons targeting each other’s mothers begins!<br><br>“We’re just fairly ‘exchanging’ our moms” Show more |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 110 chapters |  |  |  |
| chapter dates | LINT | 104 of 110 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=104 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://cdn.manhwatoon.me/.../1-1.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 400 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
