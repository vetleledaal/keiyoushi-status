# Extension Validation Report

- Extension: tachiyomi-ru.hentailib-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: libgroup
- Source ID: 6425650164840473547
- Source name: HentaiLib
- Source language: ru
- Selected manga input: latest offset 0: Angel Marriage (`.../279641--angel-marriage`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Adabana (`.../33052--adabana`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | My Kingdom (Silent War) (`.../17085--my-kingdom-silent-war`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | Angel Marriage (`.../279641--angel-marriage`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | The Hero is the secretary under the desk (`.../270712--yongsanim-eun-chaegsang-mit-biseo`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Angel Marriage (`.../279641--angel-marriage`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Angel Marriage (`.../279641--angel-marriage`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Том 1. Глава 1 - angel honey (`.../chapter <redacted query values: , volume, and number>`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Angel Marriage, URL=`.../279641--angel-marriage` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=The Hero is the secretary under the desk, URL=`.../270712--yongsanim-eun-chaegsang-mit-biseo` at page 1 offset 14 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.lib.social/.../8fa9df8b-895e-443f-a9b0-5b88de03ac4b.jpg` (image/jpeg, 51200 bytes, 375x495) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../279641--angel-marriage` |  |  |  |
| details thumbnail URL | PASS | `https://cover.lib.social/.../8fa9df8b-895e-443f-a9b0-5b88de03ac4b.jpg` |  |  |  |
| details author | PASS | Amesaki Vanilla |  |  |  |
| details artist | PASS | Amesaki Vanilla |  |  |  |
| details genres | PASS | Манга, 18+ (RX), , Кримпай, Втроём, Пайзури |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Брак с ангелом<br>☆☆☆☆☆ 0.0 (голосов: 0)<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 404 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
