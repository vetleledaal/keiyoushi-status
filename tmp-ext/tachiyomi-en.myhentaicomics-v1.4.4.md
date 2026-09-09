# Extension Validation Report

- Extension: tachiyomi-en.myhentaicomics-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
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
- Selected manga input: latest offset 0: Waifunator 6 (Futa Version) (`.../62779`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 22 | The Joy Of Breeding (`.../20251`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 22 | Redheads Gone Wild! (`.../36392`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 22 | Waifunator 6 (Futa Version) (`.../62779`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 22 | Mono Nightmares 2 (`.../62757`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Waifunator 6 (Futa Version) (`.../62779`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Waifunator 6 (Futa Version) (`.../62779`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 104 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Waifunator 6 (Futa Version), URL=`.../62779` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.myhentaicomics.com/.../001.jpg <redacted query values: 22>` (image/jpeg, 38650 bytes, 350x490) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../62779` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.myhentaicomics.com/.../001.jpg <redacted query values: 22>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Forced, Futanari \| Shemale \| Dickgirl, Ahegao, Futanari X Male, Transformation, Threesome, Mind Control \| Hypnosis, Futanari X Futanari, Selfcest, Aroma Sensei, Western |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Artists: Aroma Sensei<br>Groups: Western<br>Pages: 104 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 104 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.myhentaicomics.com/.../001.jpg <redacted query values: 22>` (image/jpeg, 343258 bytes, 1280x1881) |  |  |  |
