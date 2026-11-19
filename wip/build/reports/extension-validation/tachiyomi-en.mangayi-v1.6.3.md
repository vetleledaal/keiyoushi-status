# Extension Validation Report

- Extension: tachiyomi-en.mangayi-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
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
- Selected manga input: popular offset 0: A Parallel World With a 1:39 Male to Female Ratio is Unexpectedly Normal (`.../a-parallel-world-with-a-139-male-to-female-ratio-is-unexpectedly-normal`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | A Parallel World With a 1:39 Male to Female Ratio is Unexpectedly Normal (`.../a-parallel-world-with-a-139-male-to-female-ratio-is-unexpectedly-normal`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Journey Home After School (`.../journey-home-after-school`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | A Parallel World With a 1:39 Male to Female Ratio is Unexpectedly Normal (`.../a-parallel-world-with-a-139-male-to-female-ratio-is-unexpectedly-normal`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Parallel World With a 1:39 Male to Female Ratio is Unexpectedly Normal (`.../a-parallel-world-with-a-139-male-to-female-ratio-is-unexpectedly-normal`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 310 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 3 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Parallel World With a 1:39 Male to Female Ratio is Unexpectedly Normal, URL=`a-parallel-world-with-a-139-male-to-female-ratio-is-unexpectedly-normal` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://scp.keterfoundation.com/.../a-parallel-world-with-a-139-male-to-female-ratio-is-unexpectedly-normal.jpg` (image/jpeg, 170455 bytes, 565x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `a-parallel-world-with-a-139-male-to-female-ratio-is-unexpectedly-normal` |  |  |  |
| details thumbnail URL | PASS | `https://scp.keterfoundation.com/.../a-parallel-world-with-a-139-male-to-female-ratio-is-unexpectedly-normal.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ao Sato is accidentally swapped with himself in a parallel world with a male/female ratio of 1:39.<br>He finds a kind family and lovely women at the place where he was switched.<br>Seeing the outside of these women, he's relieved to see that the number of men and women has changed, but not much else.<br>However, their inner lives are filled with conflicts and troubles. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 310 chapters |  |  |  |
| chapter dates | PASS | 310 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://scp.keterfoundation.com/.../1.jpg` (image/jpeg, 234118 bytes, 1344x1344) |  |  |  |
