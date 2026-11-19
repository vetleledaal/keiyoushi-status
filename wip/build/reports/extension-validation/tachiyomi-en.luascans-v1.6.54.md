# Extension Validation Report

- Extension: tachiyomi-en.luascans-v1.6.54
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: heancms
- Source ID: 972271455406675873
- Source name: Lua Scans
- Source language: en
- Selected manga input: popular offset 0: I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | The World Without My Sister Who Everyone Loved (`.../the-world-without-my-sister-who-everyone-loved`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | 24 hour Rebirth Consultation Centre (`.../24-hour-rebirth-consultation-centre`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Casting Cinderella (`.../casting-cinderella`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Need to Raise My Sister Properly (`.../i-need-to-raise-my-sister-properly`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 171 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 99 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Need to Raise My Sister Properly, URL=`.../i-need-to-raise-my-sister-properly` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.luacomic.org/.../oysh4jdz78cza3mqd08i6pih.webp` (image/webp (container: extended), 391454 bytes, 1048x1501) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../i-need-to-raise-my-sister-properly` |  |  |  |
| details thumbnail URL | PASS | `https://media.luacomic.org/.../oysh4jdz78cza3mqd08i6pih.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Transported into a novel as the villain's half-sister, she vows to change their tragic fate. But her plans derail when she catches the attention of the terrifying "Blood Duke," who denies having feelings yet acts like a jealous boyfriend.<br><br>Rating: 9.56<br>Updates: Saturday<br>Released: 2023<br><br>Alternative names:<br>- 언니는 여동생을 바르게 키워야 합니다 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 49 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name |  |  |  |
| chapters | PASS | 171 chapters |  |  |  |
| chapter dates | PASS | 171 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 99 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.luacomic.org/.../001.webp` (image/webp (encoding: lossy), 37420 bytes, 720x1199; server Content-Type: image/jpg) |  |  |  |
