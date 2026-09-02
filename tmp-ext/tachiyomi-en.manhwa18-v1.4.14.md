# Extension Validation Report

- Extension: tachiyomi-en.manhwa18-v1.4.14
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
- Lint: 1
- Warnings: 0
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 28198508135984457
- Source name: Manhwa18
- Source language: en
- Selected manga input: popular offset 0: Secret class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Secret class (`.../secret-class`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | Welcome to Kids Cafe (`.../welcome-to-kids-cafe`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | A Theme For Every Building (`.../a-theme-for-every-building`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | Scumbag (`.../scumbag`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Secret class (`.../secret-class`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Secret class (`.../secret-class`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 74/74 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 74/74 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwa18.com/.../8e1b6098-c6f8-4956-8d59-65aed6066e12.jpg` (image/jpeg, 43780 bytes, 344x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://manhwa18.com/.../8e1b6098-c6f8-4956-8d59-65aed6066e12.jpg` |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Manhwa, Mature, Harem, Romance |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Secret Class is about a wife of two cheating on her husband with whom she has two daughters and a boy they took in. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
