# Extension Validation Report

- Extension: tachiyomi-en.lusttoon-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5466172882050312169
- Source name: LustToon
- Source language: en
- Selected manga input: latest offset 0: What Belongs To Us (`.../what-belongs-to-us`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Wild Dogs Dream of Predation (`.../wild-dogs-dream-of-predation`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Plase Forget me (`.../plase-forget-me`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | What Belongs To Us (`.../what-belongs-to-us`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | A Political Marriage with My Crush (`.../a-political-marriage-with-my-crush`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | What Belongs To Us (`.../what-belongs-to-us`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | What Belongs To Us (`.../what-belongs-to-us`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 13 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 0 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=What Belongs To Us, URL=`.../what-belongs-to-us` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.lustoon.com/.../c8de12dc-98de-4e11-ab5b-7b752e92fb69.webp` (image/webp (encoding: lossless), 337012 bytes, 541x768) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../what-belongs-to-us` |  |  |  |
| details thumbnail URL | PASS | `https://media.lustoon.com/.../c8de12dc-98de-4e11-ab5b-7b752e92fb69.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Crimen, Drama, Romance, Telenovela |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | What happens when love, desire, and obsession become impossible to separate?<br><br>Two people who were never supposed to belong together find themselves drawn into a relationship neither of them can escape. What begins as an unexpected attraction soon becomes something deeper—something possessive, dangerous, and impossible to deny. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 13 chapters |  |  |  |
| chapter dates | PASS | 13 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
