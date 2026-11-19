# Extension Validation Report

- Extension: tachiyomi-th.inumanga-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8311212024513454469
- Source name: Inu Manga
- Source language: th
- Selected manga input: popular offset 0: In This Life, I Will Be the Lord เกิดใหม่ชาตินี้ฉันจะเป็นเจ้าตระกูล (`.../in-this-life-i-will-be-the-lord`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | In This Life, I Will Be the Lord เกิดใหม่ชาตินี้ฉันจะเป็นเจ้าตระกูล (`.../in-this-life-i-will-be-the-lord`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | I Became the Male Lead’s Adopted Daughter (`.../i-became-the-male-leads-adopted-daughter`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | Tsuiraku JK to Haijin Kyoushi (`.../tsuiraku-jk-to-haijin-kyoushi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Blue Lock (`.../blue-lock`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | In This Life, I Will Be the Lord เกิดใหม่ชาตินี้ฉันจะเป็นเจ้าตระกูล (`.../in-this-life-i-will-be-the-lord`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | In This Life, I Will Be the Lord เกิดใหม่ชาตินี้ฉันจะเป็นเจ้าตระกูล (`.../in-this-life-i-will-be-the-lord`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 215 | ตอนที่ 0 (`.../in-this-life-i-will-be-the-lord-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=In This Life, I Will Be the Lord เกิดใหม่ชาตินี้ฉันจะเป็นเจ้าตระกูล, URL=`.../in-this-life-i-will-be-the-lord` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.inu-manga.net/.../noimg165px.png` -> 4 manga URLs (examples: `.../onryou-biyori`, `.../you-are-at-the-end-of-the-downfall`, `.../i-possessed-the-most-terrifying-stepmother-in-history`) |  |  |  |
| thumbnail | PASS | `https://www.inu-manga.net/.../In-This-Life-I-Will-Be-the-Lord.jpg` (image/jpeg, 77891 bytes, 400x573) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../in-this-life-i-will-be-the-lord` |  |  |  |
| details thumbnail URL | PASS | `https://www.inu-manga.net/.../In-This-Life-I-Will-Be-the-Lord.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Historical, Manhwa, Psychological, Romance, Shoujo, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | อ่าน In This Life, I Will Be the Lord อ่าน เกิดใหม่ชาตินี้ฉันจะเป็นเจ้าตระกูล |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 215 chapters |  |  |  |
| chapter dates | PASS | 215 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://img.inu-manga.com/.../ZHVEC2TQ78-1652153518.jpg` to `https://img.inu-manga.net/.../ZHVEC2TQ78-1652153518.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://img.inu-manga.com/.../ZHVEC2TQ78-1652153518.jpg` (image/jpeg, 163215 bytes, 1000x1250) |  |  |  |
