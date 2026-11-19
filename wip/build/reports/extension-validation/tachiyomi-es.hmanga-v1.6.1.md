# Extension Validation Report

- Extension: tachiyomi-es.hmanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6583644309098281299
- Source name: HManga
- Source language: es
- Selected manga input: popular offset 0: Jugando a las Mamas (`.../jugando-a-las-mamas`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Jugando a las Mamas (`.../jugando-a-las-mamas`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Sairin JD 2 (`.../sairin-jd-2`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Ore to Musume wa Chi ga Tsunagatteinai (Ge) (`.../ore-to-musume-wa-chi-ga-tsunagatteinai-ge`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Yokkyuu Fuman de Bakunyuu no Tomodachi no Haha ni Micchaku Sarete… (`.../yokkyuu-fuman-de-bakunyuu-no-tomodachi-no-haha-ni-micchaku-sarete`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Jugando a las Mamas (`.../jugando-a-las-mamas`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jugando a las Mamas (`.../jugando-a-las-mamas`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo (`.../jugando-a-las-mamas`) |  | <1s |
| pages | `getPageList(chapter)` | success | 47 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jugando a las Mamas, URL=`.../jugando-a-las-mamas` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hmanga.asia/.../Jugando-a-las-Mamas.jpg` (image/jpeg, 219754 bytes, 950x1328) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jugando-a-las-mamas` |  |  |  |
| details thumbnail URL | PASS | `https://hmanga.asia/.../Jugando-a-las-Mamas.jpg` |  |  |  |
| details author | PASS | Makoto |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Handjob, Manga, Masturbacion, MILF, Tetonas, Titjob, Traje de Baño |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hmanga.asia/.../01.jpg` (image/jpeg, 219754 bytes, 950x1328) |  |  |  |
