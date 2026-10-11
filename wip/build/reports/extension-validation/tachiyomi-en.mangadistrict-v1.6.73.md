# Extension Validation Report

- Extension: tachiyomi-en.mangadistrict-v1.6.73
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: madara
- Source ID: 2964723819258267786
- Source name: Manga District
- Source language: en
- Selected manga input: popular offset 0: Teach Me first! (Uncensored) (`.../327633`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Teach Me first! (Uncensored) (`.../327633`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | No Man’s Land (`.../114637`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Moral Panic (Uncensored) (`.../332975`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | The Hounds of Sisyphus (Official Uncensored) (`.../327495`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | Teach Me first! (Uncensored) (`.../327633`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Teach Me first! (Uncensored) (`.../327633`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 21 | Chapter 0 - Prologue (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Teach Me first! (Uncensored), URL=`327633` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 125/125 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 125/125 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangadistrict.com/.../teach-me-first-uncensored-3.webp` (image/webp (encoding: lossless), 176834 bytes, 400x594) |  |  |  |
| details identity | PASS | Details preserved selected URL `327633` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangadistrict.com/.../teach-me-first-uncensored-3.webp` |  |  |  |
| details author | PASS | Mischievous Moon, Pantsumania |  |  |  |
| details artist | PASS | Mischievous Moon, Pantsumania |  |  |  |
| details genres | PASS | Borderline H, Cohabitation, Comedy, Drama, Explicit Sex, Full Color, Harem, Incest, OEL, Romance, Uncensored, Webtoons, Childhood Promise, Cows, Infidelity, Living Together, Married Life, NTR, Sisters, Step Family, Stepsister, OEL, Webtoons |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Teach Me first! (Uncensored)<br><br>Nothing can break the bond between step-siblings. But what happens when one of them decides to get married?<br><br>Alternative Names: Show Me How |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.mangadistrict.com/.../01.jpg` (image/jpeg, 1599453 bytes, 1440x10000) |  |  |  |
