# Extension Validation Report

- Extension: tachiyomi-en.mangayi-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 712011166912060070
- Source name: MangaYi
- Source language: en
- Selected manga input: popular offset 0: A Love Letter and a 13-Year-Old Actress (`.../a-love-letter-and-a-13-year-old-actress`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | A Love Letter and a 13-Year-Old Actress (`.../a-love-letter-and-a-13-year-old-actress`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | A Hero Who Is Good At Everything (`.../a-hero-who-is-good-at-everything`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | A Love Letter and a 13-Year-Old Actress (`.../a-love-letter-and-a-13-year-old-actress`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Love Letter and a 13-Year-Old Actress (`.../a-love-letter-and-a-13-year-old-actress`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 75 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Love Letter and a 13-Year-Old Actress, URL=`a-love-letter-and-a-13-year-old-actress` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://scp.keterfoundation.com/.../a-love-letter-and-a-13-year-old-actress.jpg` (image/jpeg, 185690 bytes, 562x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `a-love-letter-and-a-13-year-old-actress` |  |  |  |
| details thumbnail URL | PASS | `https://scp.keterfoundation.com/.../a-love-letter-and-a-13-year-old-actress.jpg` |  |  |  |
| details author | PASS | Jaga |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Seinen, Romance, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Fumi Isshiki works as an accountant at an entertainment agency. One day, he is transferred to the management department, where Ayano Haga, a 13-year-old child actress, seems to take a liking to him...?<br>She is just a child, yet she acts more mature than most adults.<br>A dramatic story woven between a professional child actress and her manager!<br>(Source: Comic Fuz, translated) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 75 chapters |  |  |  |
| chapter dates | PASS | 75 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://scp.keterfoundation.com/.../1.jpg` (image/jpeg, 144749 bytes, 650x924) |  |  |  |
