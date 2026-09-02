# Extension Validation Report

- Extension: tachiyomi-en.theduckwebcomics-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 23
- Lint: 1
- Warnings: 1
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5361143498571709507
- Source name: The Duck Webcomics
- Source language: en
- Selected manga input: popular offset 0: Familiar (`.../Familiar`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Familiar (`.../Familiar`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Exposure (`.../Exposure`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Abejitas (`.../Abejitas`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Secrets of the ... (`.../Secrets_of_the_Dark_Temple_anthology`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 25 | Actrasier (`.../Actrasier`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Familiar (`.../Familiar`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | java.lang.IllegalStateException: this comic is only viewable to 18+ please login to view | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.IllegalStateException: this comic is only viewable to 18+ please login to view | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 12: title=Familiar, URL=`.../Familiar` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 110/110 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 110/110 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.theduckwebcomics.com/.../avatar-generic-comic-A.png` -> 5 manga URLs (examples: `.../Familiar`, `.../Banana_Cream_Cake`, `.../Hentai_Action_Theater`), `https://www.theduckwebcomics.com/.../avatar-generic-comic.png` -> 6 manga URLs (examples: `.../Captura_Magaro`, `.../Finetas`, `.../For_The_Win`) |  |  |  |
| thumbnail | PASS | `https://www.theduckwebcomics.com/.../avatar-generic-comic-A.png` (image/png, 1429 bytes, 105x160) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Familiar` |  |  |  |
| details thumbnail URL | PASS | `https://www.theduckwebcomics.com/.../avatar-generic-comic-A.png` |  |  |  |
| details author | PASS | soushiyo |  |  |  |
| details artist | PASS | soushiyo |  |  |  |
| details genres | PASS | Adult |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | When career-driven editor Diana Vallejo accidentally summons a familiar whose specialty is soft domination, her life takes a turn for the better – but for how long? Familiar is a modern-day, slice-of-life romcomic about magick, work/life balance, BDSM, and relationships. It is kinky, queer, and sex-positive. It is also erotic, sexually explicit, and written for adult audiences only. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
