# Extension Validation Report

- Extension: tachiyomi-en.ocecomic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2461381064825938556
- Source name: OceComic
- Source language: en
- Selected manga input: popular offset 0: Crossed (`.../963928`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Crossed (`.../963928`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Jungle Fantasy: Survivors (`.../251150`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Stranger Things: Tales from Hawkins (`.../425036`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Who Are the Power Pals? (`.../122600`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Crossed (`.../963928`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Crossed (`.../963928`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | Issue #1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Crossed, URL=`963928` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ocecomic.com/.../cover.jpg` (image/jpeg, 103214 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `963928` |  |  |  |
| details thumbnail URL | PASS | `https://ocecomic.com/.../cover.jpg` |  |  |  |
| details author | PASS | Garth Ennis |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Apocalyptic, Dystopia, Occult, Zombie, Crime, Horror, Supernatural, Suspense, Thriller |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Garth Ennis has pulled out all the stops to write the most twisted book of his career, Crossed! Through ten heart-stopping chapters, Crossed is his horrifically visceral exploration of the pure evil that humans are truly capable of indulging. This gut-wrenching vision is brought to vivid – and more than a little disturbing – life by his partner-in-crime, Jacen Burrows. Imagine, for a moment, the worst crimes against humanity. Picture the cruelest affronts to dec...<br><br>**Publisher:** Avatar Press |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | LINT | All 10 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=10 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://1.bp.blogspot.com/.../v1_0_00.jpg` (image/jpeg, 263749 bytes, 1000x1547) |  |  |  |
