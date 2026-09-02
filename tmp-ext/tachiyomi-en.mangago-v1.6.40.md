# Extension Validation Report

- Extension: tachiyomi-en.mangago-v1.6.40
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: c0b1f5b3b64d4a186ef9b790b68e95e94a782d2e
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2470059397662084186
- Source name: Mangago
- Source language: en
- Selected manga input: latest offset 0: The Top Student Hides Her Regression (`.../the_top_student_hides_her_regression`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | Cherry Blossoms After Winter (`.../cherry_blossoms_after_winter`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 48 | How to Snag an Alpha (`.../how_to_chase_an_alpha`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 48 | The Top Student Hides Her Regression (`.../the_top_student_hides_her_regression`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Rebirth: Monarch of the Dead (`.../rebirth_monarch_of_the_dead`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Top Student Hides Her Regression (`.../the_top_student_hides_her_regression`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Top Student Hides Her Regression (`.../the_top_student_hides_her_regression`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | Ch.0 (`.../519c5e2ac6`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Top Student Hides Her Regression, URL=`.../the_top_student_hides_her_regression` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i9.mangapicgallery.com/.../rROHYYKHa8HlWy3U7kHm8eI5JAZfMAXQo8XfEwWcwmDVnaN.jpeg <redacted query values: 4>` (image/jpeg, 18128 bytes, 200x286) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the_top_student_hides_her_regression` |  |  |  |
| details thumbnail URL | PASS | `https://i9.mangapicgallery.com/.../rROHYYKHa8HlWy3U7kHm8eI5JAZfMAXQo8XfEwWcwmDVnaN.jpeg <redacted query values: 4>` |  |  |  |
| details author | PASS | Changman, Yu Jimin, Jail-hyun |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comedy, Drama, Romance, School Life, Shoujo, Slice Of Life, Webtoons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After failing another attempt at securing a permanent job, long-term unemployed Kang Dahye finds herself unexpectedly regressed eleven years into the past. Thrilled by the second chance, she determines to turn her life around by acing the college entrance exam, securing early employment at a prestigious university, and investing in stocks and crypto. However, her plans for a focused academic life are continually derailed by the surrounding boys—including Jeong Eunsung, a future idol group main vocalist present during her regression, and Seo Jae-gyeom, her former crush and a chaebol's illegitimate son. Despite her desire to quietly focus solely on studying, she gets tangled in unexpected attention and romance.<br><br>Alternative Names:<br>- 전교 1등이 회귀를 숨김<br>- First in Class Hides Regression<br>- 1st in Class Hides Regression |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://iweb_9.mangapicgallery.com/.../bb2c4fb7072e6ab8aca25e94a25a8f81.png` (image/jpeg, 63255 bytes, 1500x500; server Content-Type: image/png) |  |  |  |
