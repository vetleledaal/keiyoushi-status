# Extension Validation Report

- Extension: tachiyomi-en.readfairytailedenszeromangaonline-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 21
- Lint: 4
- Warnings: 2
- Skipped: 8
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1330793582354406642
- Source name: Read Fairy Tail & Edens Zero Manga Online
- Source language: en
- Selected manga input: popular offset 0: Eden's Zero (`https://ww9.readfairytail.com/.../edens-zero`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Eden's Zero (`https://ww9.readfairytail.com/.../edens-zero`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Eden's Zero (`https://ww9.readfairytail.com/.../edens-zero`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Eden’s Zero (`https://ww9.readfairytail.com/.../edens-zero`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 294 | Eden’s Zero Chapter 1 (`https://ww9.readfairytail.com/.../edens-zero-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 79 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Eden's Zero, URL=`https://ww9.readfairytail.com/.../edens-zero` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 2 manga entries: title=FT x Taizai, URL=`https://ww9.readfairytail.com/.../fairy-tail-x-nanatsu-no-taizai-christmas-special`, title=Gaiden 1, URL=`https://ww9.readfairytail.com/.../fairy-tail-gaiden-raigo-issen` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | LINT | 21/21 listing manga have titles and URLs; popular: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://ww9.readfairytail.com/.../edens-zero`, popular entry 2: `https://ww9.readfairytail.com/.../fairy-tail`, popular entry 3: `https://ww9.readfairytail.com/.../fairy-tail-zero` |  |  |  |
| thumbnail URLs | LINT | 0/21 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | SKIP | No thumbnail URL to load |  |  |  |
| details identity | UNUSUAL | Details changed selected title Eden's Zero to Eden’s Zero |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../XUDUoez.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Eden’s Zero (Japanese: エデンズゼロ Hepburn: Edenzu Zero) is an upcoming Japanese manga series written and illustrated by Hiro Mashima. The series will launch on June 27, 2018, and will be published simultaneously in five different languages. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 294 chapters |  |  |  |
| chapter dates | LINT | All 294 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=294 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 294 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 79 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.readfairytail.com/.../2.jpeg` (image/jpeg, 254333 bytes, 1066x1600) |  |  |  |
