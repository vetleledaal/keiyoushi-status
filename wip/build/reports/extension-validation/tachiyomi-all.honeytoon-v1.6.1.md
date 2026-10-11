# Extension Validation Report

- Extension: tachiyomi-all.honeytoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 1063521896373496908
- Source name: Honeytoon
- Source language: en
- Selected manga input: popular offset 0: My Sister is a Big Star (`.../my-sister-is-a-big-star`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 13 | My sister is a big star (`.../my-sister-is-a-big-star`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 21 | Start with a mountain (`.../start-with-a-mountain`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My Sister is a Big Star (`.../my-sister-is-a-big-star`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Sister is a Big Star (`.../my-sister-is-a-big-star`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 112 | Prologue (`.../prologue`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

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
| popular listing | PASS | 13 entries |  |  |  |
| latest listing | PASS | 21 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Sister is a Big Star, URL=`.../my-sister-is-a-big-star` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pic.honeytoon.com/.../45b97525-06f5-44e5-8e5e-212ca6f60e26-1689090566-93.webp` (image/webp (container: extended), 68354 bytes, 248x368) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../my-sister-is-a-big-star` |  |  |  |
| details thumbnail URL | PASS | `https://pic.honeytoon.com/.../45b97525-06f5-44e5-8e5e-212ca6f60e26-1689090566-93.webp` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, #neighbours, #college, #redhead, #kindred, #idol |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | In My Sister Is a Big Star, Qin Ze is ready to begin a new chapter—young, smart, and prepared for university. But his am In My Sister Is a Big Star, Qin Ze is ready to begin a new chapter—young, smart, and prepared for university. But his ambitious older sister has other plans. As family secrets surface, Qin Ze discovers how far she’s willing to go and how her schemes might change his future. What awaits him at university, and can he break free from her control? In My Sister Is a Big Star, Qin Ze is ready to begin a new chapter—young, smart, and prepared for university. But his ambitious older sister has other plans. As family secrets surface, Qin Ze discovers how far she’s willing to go and how her schemes might change his future. What awaits him at university, and can he break free from her control? ... Read more Hide |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 112 chapters |  |  |  |
| chapter dates | LINT | 1 of 112 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://pic.honeytoon.com/.../0b1aa1f6-0eba-4eac-8d1d-2c4d23b6888c.webp` (image/webp (container: extended), 286218 bytes, 1000x3125) |  |  |  |
