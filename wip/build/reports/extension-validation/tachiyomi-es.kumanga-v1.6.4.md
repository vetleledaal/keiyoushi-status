# Extension Validation Report

- Extension: tachiyomi-es.kumanga-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 22
- Lint: 1
- Warnings: 0
- Skipped: 11
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5818858964600650549
- Source name: Kumanga
- Source language: es
- Selected manga input: latest offset 0: Lipstick Devil (sin censura) (`.../lipstick-devil-sin-censura`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 128 | Lipstick Devil (sin censura) (`.../lipstick-devil-sin-censura`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lipstick Devil (sin censura) (`.../lipstick-devil-sin-censura`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 27 | Capítulo 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: No page list | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: No page list | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | SKIP | HTTP error 403 |  |  |  |
| latest listing | PASS | 128 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | HTTP error 403 |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 128/128 latest manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 128/128 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.kumanga.com/.../14830.jpg` (image/jpeg, 109000 bytes, 465x659) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lipstick-devil-sin-censura` |  |  |  |
| details thumbnail URL | PASS | `https://static.kumanga.com/.../14830.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Comedia, Drama, Girls Love |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lim Mina, de 27 años, se muda a Seúl para explorar las prometedoras oportunidades laborales que ofrece esta vibrante ciudad. Rápidamente consigue un puesto en la prestigiosa empresa tecnológica ARPSE. Todo parece ir sobre ruedas hasta que, inesperadamente, se ve envuelta en una relación muy personal con sus jefes.<br><br>Nombres alternativos: El diablo del lápiz labial |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | LINT | All 27 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=27 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No page list |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
