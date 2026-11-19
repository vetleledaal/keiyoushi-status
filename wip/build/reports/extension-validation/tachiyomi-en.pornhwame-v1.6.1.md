# Extension Validation Report

- Extension: tachiyomi-en.pornhwame-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4964211766486203362
- Source name: Pornhwa.me
- Source language: en
- Selected manga input: popular offset 0: The Hole is Open (`.../the-hole-is-open`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Hole is Open (`.../the-hole-is-open`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Benefactor’s Daughters (`.../benefactors-daughters`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | Currently Filming (`.../currently-filming`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | Time in the Rain (`.../time-in-the-rain`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Hole is Open (`.../the-hole-is-open`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Hole is Open (`.../the-hole-is-open`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 159 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 65 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Hole is Open, URL=`.../the-hole-is-open` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Benefactor’s Daughters, URL=`.../benefactors-daughters` at page 1 offset 19 and page 2 offset 0 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 1 manga entry: title=Secret Class, URL=`.../secret-class` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s3.manhwature.com/.../90cdb62d-395b-41cb-ac4b-c9fae77289f3.jpg` (image/jpeg, 38634 bytes, 344x500; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-hole-is-open` |  |  |  |
| details thumbnail URL | PASS | `https://s3.manhwature.com/.../90cdb62d-395b-41cb-ac4b-c9fae77289f3.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Manhwa, Mature |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | JA-KANG inherited his grandfather’s store. In the secret room, there is a secret “hole” ?! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 159 chapters |  |  |  |
| chapter dates | PASS | 159 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 65 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.manhwature.com/.../01e173840005d43b5e.jpg` (image/jpeg, 111243 bytes, 720x2500) |  |  |  |
