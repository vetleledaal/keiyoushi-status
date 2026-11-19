# Extension Validation Report

- Extension: tachiyomi-en.yiffcomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8728786976342675797
- Source name: Yiff Comics (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: A Nefarious Friend (`.../a-nefarious-friend`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | A Nefarious Friend (`.../a-nefarious-friend`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Early Afternoon Kozue-san (`.../early-afternoon-kozue-san`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Nefarious Friend (`.../a-nefarious-friend`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Nefarious Friend (`.../a-nefarious-friend`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../a-nefarious-friend`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Nefarious Friend, URL=`.../a-nefarious-friend` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.yiff-comics.com/.../cover-card.webp` (image/webp (encoding: lossy), 58434 bytes, 640x903) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-nefarious-friend` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.yiff-comics.com/.../cover.webp` (image/webp (encoding: lossy), 126914 bytes, 800x1129) |  |  |  |
| details author | PASS | kyatune |  |  |  |
| details artist | PASS | kyatune |  |  |  |
| details genres | PASS | Gay, ahegao, anal, anal intercourse, anthro, big penis, catboy, dog boy, moral degeneration, muscle, nakadashi, netorare, rough translation, yaoi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 26 pages |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.yiff-comics.com/.../p001.webp` (image/webp (encoding: lossy), 128662 bytes, 1032x1456) |  |  |  |
