# Extension Validation Report

- Extension: tachiyomi-en.luminaretranslations-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1698654724978495521
- Source name: Luminare Translations
- Source language: en
- Selected manga input: popular offset 0: Kirara Hoshikita Wants to Shine! (`.../kirara-hoshikita-wants-to-shine`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | Kirara Hoshikita Wants to Shine! (`.../kirara-hoshikita-wants-to-shine`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 17 | Living Together with the Queen from My High School Days Who was Arrogant, Surprisingly isn’t That Uncomfortable (`.../living-together-with-the-queen-from-my-high-school-days-who-was-arrogant-surprisingly-isnt-that-uncomfortable`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kirara Hoshikita Wants to Shine! (`.../kirara-hoshikita-wants-to-shine`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kirara Hoshikita Wants to Shine! (`.../kirara-hoshikita-wants-to-shine`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Chapter 1 (`.../17190`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 17 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kirara Hoshikita Wants to Shine!, URL=`kirara-hoshikita-wants-to-shine` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://luminaretranslations.com/.../03-1-1024x735.webp` (image/webp (encoding: lossy), 121876 bytes, 1024x735) |  |  |  |
| details identity | PASS | Details preserved selected URL `kirara-hoshikita-wants-to-shine` |  |  |  |
| details thumbnail URL | PASS | `https://luminaretranslations.com/.../03-1-1024x735.webp` |  |  |  |
| details author | PASS | Ichiki |  |  |  |
| details artist | PASS | Ichika |  |  |  |
| details genres | PASS | comedy, romance, school-life, slice-of-life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://luminaretranslations.com/.../kirara-hoshikita-wants-to-shine` to `https://luminaretranslations.com/.../kirara-hoshikita-wants-to-shine` (1 redirects) |  |  |  |
| page load | PASS | `https://luminaretranslations.com/.../0.webp` (image/webp (container: extended), 352242 bytes, 2304x3072) |  |  |  |
