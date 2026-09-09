# Extension Validation Report

- Extension: tachiyomi-all.imhentai-v1.6.25
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 30
- Lint: 5
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: galleryadults
- Source ID: 1797754663718263026
- Source name: IMHentai
- Source language: en
- Selected manga input: latest offset 0: Sonic hentai XXX Art Gallery (`.../1735100`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [Maron ☆ Maron] Gaki ni Modotte Yarinaoshi!!! | Turning Back Into a Kid And Starting Over!!! [English] [friggo+B.E.C. Scans] (`.../386132`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | [Hot Mikan (Kishimen)] Doinaka no Natsuyasumi wa Kaa-chan to Asedaku Sex o Suru | Summertime Sweat Dripping Sex with Mother in the Boondocks [English][Amoskandy] (`.../432426`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Sonic hentai XXX Art Gallery (`.../1735100`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [Dirty Bunny] Brambletree Family Summer Break Part 2: Family History (ongoing) (`.../1734948`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sonic hentai XXX Art Gallery (`.../1735112`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sonic hentai XXX Art Gallery (`.../1735100`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../1735100`) |  | <1s |
| pages | `getPageList(chapter)` | success | 77 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Sonic hentai XXX Art Gallery, URL=`.../1735112` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://m11.imhentai.xxx/.../thumb.jpg` (image/jpeg, 38745 bytes, 250x321) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1735100` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://m11.imhentai.xxx/.../cover.jpg` (image/jpeg, 60820 bytes, 350x449) |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Languages**: english<br><br>**Category**: western<br><br>**Pages**: 77 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 77 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://imhentai.xxx/.../1735100` to `https://imhentai.xxx/.../1735112` (1 redirects); popular: `https://imhentai.xxx/.../1735100` to `https://imhentai.xxx/.../1735112` (1 redirects) |  |  |  |
| page load | PASS | `https://m11.imhentai.xxx/.../1.jpg` (image/jpeg, 74731 bytes, 625x803) |  |  |  |
