# Extension Validation Report

- Extension: tachiyomi-all.manhwa18net-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 687150405919946955
- Source name: Manhwa18.Net
- Source language: en
- Selected manga input: popular offset 0: Secret class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Secret class (`.../secret-class`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Absolute Hypnosis in Another World (`.../absolute-hypnosis-in-another-world`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Slave Code (`.../slave-code`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Paradise Villa (`.../paradise-villa`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Secret class (`.../secret-class`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret class (`.../secret-class`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 323 | Chap 01 (`.../chap-01-361`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 99/99 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 99/99 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwa18.net/.../8e1b6098-c6f8-4956-8d59-65aed6066e12.jpg` (image/jpeg, 43780 bytes, 344x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | PASS | `https://manhwa18.net/.../8e1b6098-c6f8-4956-8d59-65aed6066e12.jpg` |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Wang Kang Cheol |  |  |  |
| details genres | PASS | Adult, Manhwa, Mature, Harem, Romance, M18Scan |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Secret Class is about a wife of two cheating on her husband with whom she has two daughters and a boy they took in. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 323 chapters |  |  |  |
| chapter dates | PASS | 323 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.pornwa.us/.../674053a83f15e.jpg` (image/jpeg, 555348 bytes, 720x12500) |  |  |  |
