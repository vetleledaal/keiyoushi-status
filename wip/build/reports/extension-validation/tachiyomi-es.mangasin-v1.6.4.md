# Extension Validation Report

- Extension: tachiyomi-es.mangasin-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 12
- Lint: 0
- Warnings: 0
- Skipped: 22
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mmrcms
- Source ID: 3344386250058668105
- Source name: Mangas.in
- Source language: es
- Selected manga input: latest offset 0: Wan Gu Zui Qiang Zong (`.../wan-gu-zui-qiang-zong`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 80 | Wan Gu Zui Qiang Zong (`.../wan-gu-zui-qiang-zong`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 80 | Tadaima Taikichuu Nitsuki (`.../tadaima-taikichuu-nitsuki`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Wan Gu Zui Qiang Zong (`.../wan-gu-zui-qiang-zong`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.lang.Exception: No se pudo encontrar la clave | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.lang.Exception: No se pudo encontrar la clave | <1s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.Exception: No se pudo encontrar la clave | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | java.lang.Exception: No se pudo encontrar la clave | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | SKIP | HTTP error 403 |  |  |  |
| latest listing | PASS | 80 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Wan Gu Zui Qiang Zong, URL=`.../wan-gu-zui-qiang-zong` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | HTTP error 403 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://m440.in/.../cover_250x350.jpg` (image/jpeg, 48647 bytes, 250x350) |  |  |  |
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
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
