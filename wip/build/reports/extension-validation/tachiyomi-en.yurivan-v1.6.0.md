# Extension Validation Report

- Extension: tachiyomi-en.yurivan-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2396200775010426393
- Source name: Yurivan
- Source language: en
- Selected manga input: popular offset 0: Just Hold My Hand (`.../47d1437e-5991-4abf-85f4-18f6e8594e91`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Just Hold My Hand (`.../47d1437e-5991-4abf-85f4-18f6e8594e91`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Block 69 (`.../1e396401-6851-40d2-8da7-a5b302cf30b7`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Drunken My Boss (`.../5bed0971-d178-47f4-a156-387d7467117f`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | The Moon On A Rainy Night (`.../0739f62d-3e35-4010-887c-1d3b19d57811`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Just Hold My Hand (`.../47d1437e-5991-4abf-85f4-18f6e8594e91`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Just Hold My Hand (`.../47d1437e-5991-4abf-85f4-18f6e8594e91`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 12 | Chapter 01 (`.../e55ff689-cc1a-46f3-a74e-49e928f6c099`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Just Hold My Hand, URL=`47d1437e-5991-4abf-85f4-18f6e8594e91` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.yurivan.com/.../cover_v3.jpg` (image/jpeg, 151721 bytes, 1024x1700) |  |  |  |
| details identity | PASS | Details preserved selected URL `47d1437e-5991-4abf-85f4-18f6e8594e91` |  |  |  |
| details thumbnail URL | PASS | `https://img.yurivan.com/.../cover_v3.jpg` |  |  |  |
| details author | PASS | webtoon_addict |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | manhwa, pornhwa, romance, age-gap, college, student, glasses, shy-girl, femdom, submissive, bdsm, collar, leash, maid, roleplay, seduction, praise, dirty-talk, first-time, supernatural, magic, big-breasts, huge-breasts, breast-play, nipple-play, fingering, cunnilingus, kissing, lingerie, naked, intense, sensual, steamy, explicit, modern, long-hair, curvy, english, forced, video, anal, futanari, multiple-orgasms, toys, spanking, gender-bender, male-present, incest, enemies-to-lovers, uncensored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★☆ 3.82 (148)<br><br>---<br><br>A shy college girl with a magical "wet hand" power gets dragged out of her shell by a confident older blonde who turns her into a personal pet. Awkward first touches give way to maid outfits, collars, leashes, and a sub/dom rhythm that neither of them wants to stop. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.yurivan.com/.../0.jpg` (image/webp (encoding: lossy), 190906 bytes, 800x4037) |  |  |  |
