# Extension Validation Report

- Extension: tachiyomi-en.myhentaicomics-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4899971628155084225
- Source name: MyHentaiComics
- Source language: en
- Selected manga input: latest offset 0: Coco The Ceo (`.../62579`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 22 | The Joy Of Breeding (`.../20251`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 22 | Redheads Gone Wild! (`.../36392`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 22 | Coco The Ceo (`.../62579`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 22 | Good Neighbourly Relations 4 - First Date (`.../62557`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Coco The Ceo (`.../62579`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Coco The Ceo (`.../62579`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 4 |  |  | <1s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Coco The Ceo, URL=`.../62579` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.myhentaicomics.com/.../001.jpg <redacted query values: 22>` (image/jpeg, 49825 bytes, 350x490) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../62579` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.myhentaicomics.com/.../001.jpg <redacted query values: 22>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Furry, Futanari \| Shemale \| Dickgirl, Inflation \| Stomach Bulge, Futanari X Female, Idolomantises \| Quill, Western |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Artists: Idolomantises \| Quill<br>Groups: Western<br>Pages: 4 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.myhentaicomics.com/.../001.jpg <redacted query values: 22>` (image/jpeg, 394709 bytes, 1280x1916) |  |  |  |
