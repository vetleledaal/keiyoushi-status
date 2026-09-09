# Extension Validation Report

- Extension: tachiyomi-en.eightmuses-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: eu.kanade.tachiyomi.extension.en.eightmuses.EightMuses
- Source theme: eromuse
- Source ID: 1802675169972965535
- Source name: 8Muses
- Source language: en
- Selected manga input: popular offset 0: Meet the Neighbors - What If (`.../-Meet-the-Neighbors-What-If`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 72 | Meet the Neighbors - What If (`.../-Meet-the-Neighbors-What-If`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Sabrinas Big Black Wish (`.../Sabrinas-Big-Black-Wish`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | error | 0 |  | kotlin.UninitializedPropertyAccessException: lateinit property  has not been initialized | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Meet the Neighbors - What If (`.../-Meet-the-Neighbors-What-If`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Meet the Neighbors - What If (`.../-Meet-the-Neighbors-What-If`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../-Meet-the-Neighbors-What-If`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | ERROR | kotlin.UninitializedPropertyAccessException: lateinit property  has not been initialized | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 72 entries |  |  |  |
| latest listing | SKIP | lateinit property  has not been initialized |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Meet the Neighbors - What If, URL=`.../-Meet-the-Neighbors-What-If` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | lateinit property  has not been initialized |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comics.8muses.com/.../j-63S1jO8YVn3lYBZH6ITOrBETYnRdexW-uJNXMK12rZYDMQURnrDep9D7izrbQAqkIIv4UChAYzyp3qc5FS70hAgjRgDUVQThZLsAnmeqR+zU-zMsgX7hTMVP9bsHii0x+JZBrzcITRiQpMoxhXAA.jpg` (image/jpeg, 46644 bytes, 360x313) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../-Meet-the-Neighbors-What-If` |  |  |  |
| details thumbnail URL | PASS | `https://comics.8muses.com/.../j-63S1jO8YVn3lYBZH6ITOrBETYnRdexW-uJNXMK12rZYDMQURnrDep9D7izrbQAqkIIv4UChAYzyp3qc5FS70hAgjRgDUVQThZLsAnmeqR+zU-zMsgX7hTMVP9bsHii0x+JZBrzcITRiQpMoxhXAA.jpg` |  |  |  |
| details author | PASS | KennyComix |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://comics.8muses.com/.../j-63S1jO8YVn3lYBZH6ITOrBETYnRdexW-uJNXMK12rZYDMQURnrDep9D7izrbQAqkIIv4UChAYzyp3qc5FS70hAgjRgDUVQThZLsAnmeqR+zU-zMsgX7hTMVP9bsHii0x+JZBrzcITRiQpMoxhXAA.jpg` (image/jpeg, 567000 bytes, 1280x1963) |  |  |  |
