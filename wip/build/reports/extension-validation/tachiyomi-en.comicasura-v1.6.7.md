# Extension Validation Report

- Extension: tachiyomi-en.comicasura-v1.6.7
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
- Source theme: mangathemesia
- Source ID: 499082788596590240
- Source name: Comic Asura
- Source language: en
- Selected manga input: popular offset 0: How to be Good (`.../how-to-be-good`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | How to be Good (`.../how-to-be-good`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Jan Is in Danger! (`.../jan-is-in-danger`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | How to be Good (`.../how-to-be-good`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Qi Fei Jintian You Qifei Le Ma (`.../qi-fei-jintian-you-qifei-le-ma`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | How to be Good (`.../how-to-be-good`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | How to be Good (`.../how-to-be-good`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 20 | Chapter 0: Prologue (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=How to be Good, URL=`.../how-to-be-good` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img-r1.2xstorage.com/.../how-to-be-good.webp` (image/webp (encoding: lossy), 31374 bytes, 460x472) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../how-to-be-good` |  |  |  |
| details thumbnail URL | PASS | `https://img-r1.2xstorage.com/.../how-to-be-good.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Psychological |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The "perfect" girl Noa, known throughout school for her good behavior, gets kidnapped after school one day. But things don't quite go the way her kidnappers had planned... What will happen when it's no longer Good vs Bad, but Bad vs Bad?! (Source: Lezhin) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 20 chapters |  |  |  |
| chapter dates | PASS | 20 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img-r1.2xstorage.com/.../0.webp` (image/webp (encoding: lossy), 29108 bytes, 1280x1500) |  |  |  |
