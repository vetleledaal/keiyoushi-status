# Extension Validation Report

- Extension: tachiyomi-en.randowiz-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 24
- Lint: 0
- Warnings: 0
- Skipped: 11
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1502370949450941405
- Source name: Randowiz
- Source language: en
- Selected manga input: popular offset 0: Randowiz: We live in an MMO!? (`.../we-live-in-an-mmo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 3 | Randowiz: We live in an MMO!? (`.../we-live-in-an-mmo`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Randowiz: We live in an MMO!? (`.../we-live-in-an-mmo`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Randowiz: We live in an MMO!? (`.../we-live-in-an-mmo`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 12 | We Live In An MMO?! – CHAPTER 6 (`.../we-live-in-an-mmo-chapter-6`) |  | <1s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Randowiz: We live in an MMO!?, URL=`.../we-live-in-an-mmo` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 4/4 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 4/4 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../MMO_CHP_001_CSP_000.jpg <redacted query values: resize and ssl>` (image/jpeg, 94204 bytes, 800x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../we-live-in-an-mmo` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../MMO_CHP_001_CSP_000.jpg <redacted query values: resize and ssl>` |  |  |  |
| details author | PASS | Randowiz |  |  |  |
| details artist | PASS | Randowiz |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The world of 'Mamuon' where players and NPC's live together in harmony. Or do they? DO THEY? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
