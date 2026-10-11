# Extension Validation Report

- Extension: tachiyomi-all.lunaranime-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T13:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37+dirty
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.l
- Source ID: 7328677245254276970
- Source name: Lunar Manga
- Source language: en
- Selected manga input: popular offset 0: The Cliff (`.../the-cliff`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | The Cliff (`.../the-cliff`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Savior Complex (`.../savior-complex`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | My Insatiable Duke in a Three-Year Marriage (`.../my-insatiable-duke-in-a-three-year-marriage`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Not Sober (`.../not-sober`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | The Cliff (`.../the-cliff`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Cliff (`.../the-cliff`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | Chapter 1 (`.../1 <redacted query values: lang>`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Cliff, URL=`.../the-cliff` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://vault.lunarx.to/.../c502fa4c-e237-4db5-a80e-19eac56c5c80.jpg` (image/jpeg, 57106 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-cliff` |  |  |  |
| details thumbnail URL | PASS | `https://vault.lunarx.to/.../c502fa4c-e237-4db5-a80e-19eac56c5c80.jpg` |  |  |  |
| details author | PASS | Seongdae Oh |  |  |  |
| details artist | PASS | Seongdae Oh |  |  |  |
| details genres | PASS | Shounen, Manhwa, Drama, Horror, Psychological, Adapted to Movie, Dead Friend/s, Death, Delusions, Guilt, Revenge, South Korea, Survival, Webtoon/Webcomic |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tensions rise as two men wait for someone to save their lives after falling and getting stranded on the cliffside of a dangerous hiking trail. When days pass with no indication of help, the cliff becomes a stage for confrontation, violence, and madness.<br><br><br><br>Alternative Titles: Geisterklippe, ผาหลอน ซ่อนปม, 崖に潜む死霊, 悬崖鬼, 懸崖鬼, 絕壁鬼, 절벽귀 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | LINT | All 9 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=9 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | `https://api.lunarx.to/.../z4XAOvxWBuMmkyir.png` (image/png, 63697 bytes, 461x143); known placeholder: lunar: scraper-only placeholder | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
