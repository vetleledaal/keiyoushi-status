# Extension Validation Report

- Extension: tachiyomi-vi.seikowo-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 13
- Lint: 0
- Warnings: 0
- Skipped: 20
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3049157397733640125
- Source name: Seikowo
- Source language: vi
- Selected manga input: popular offset 0: TS Tensei Bishoujo Netora Reiko wa Netoraretai (`.../ts-tensei-bishoujo-netora-reiko-wa.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | TS Tensei Bishoujo Netora Reiko wa Netoraretai (`.../ts-tensei-bishoujo-netora-reiko-wa.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 21 | Cuộc chơi trên núi tử thần (`.../cuoc-choi-tren-nui-tu-than_5.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Haimiya-Senpai Vừa Đáng Sợ Lại Vừa Dễ Thương (`.../haimiya-senpai-khong-chi-ang-so-ma-con.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | error | 0 |  | java.lang.Exception: Cannot find metadata | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.lang.Exception: Cannot find metadata | 10s+ |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | ERROR | java.lang.Exception: Cannot find metadata | REVIEW | INSUFFICIENT_EVIDENCE |  |
| chapters operation | ERROR | java.lang.Exception: Cannot find metadata | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 55/55 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 55/55 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lh3.googleusercontent.com/.../8_XuDgi19AgfYD410Z8Ktl1_SFeCW4CFwCNcBGAsYHQ` (image/jpeg, 109381 bytes, 360x512) |  |  |  |
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
| page load | SKIP | No pages to load |  |  |  |
