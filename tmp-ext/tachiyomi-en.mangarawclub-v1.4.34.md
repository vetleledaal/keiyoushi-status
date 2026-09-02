# Extension Validation Report

- Extension: tachiyomi-en.mangarawclub-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 734865402529567092
- Source name: MangaGeko
- Source language: en
- Selected manga input: popular offset 0: Magic Emperor (`.../magic-emperor-mg1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Magic Emperor (`.../magic-emperor-mg1`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Eternally Regressing Knight (`.../eternally-regressing-knight`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 24 | The Strongest Wife In The Hidden Dungeon (`.../ura-dungeon-okusan`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Clever Cleaning Life Of The Returned Genius Hunter (`.../clever-cleaning-life-of-the-returned-genius`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Magic Emperor (`.../magic-emperor-mg1`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Magic Emperor (`.../magic-emperor-mg1`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 906 | Chapter 1 (`.../magic-emperor-chapter-1-eng-li`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 214 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Magic Emperor, URL=`.../magic-emperor-mg1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imgsrv5.com/.../2026-05-16-01-38-06-1778938686956.jpg` (image/jpeg, 65999 bytes, 288x412) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../magic-emperor-mg1` |  |  |  |
| details thumbnail URL | PASS | `https://imgsrv5.com/.../2026-05-16-01-38-06-1778938686956.jpg` |  |  |  |
| details author | PASS | Nightingale (Original) + No Two Comics , |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Martial Arts, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS |  Zhuo Yifan was a magic emperor or could be called a demon emperor because he had an ancient emperor’s book called the Book of the Nine Secrets, he was targeted by all the experts, and he was even betrayed and killed by his students. Then his soul enters and comes back to life in a family servant boy named Zhuo Fan. Because some demonic magic is holding him back, he must unite the child’s memories and cannot ignore the family and the mistress he serves. How can he lead this descending family back to the pinnacle of this continent!<br><br>Alternative Names:<br>- Carp Reborn<br>- Devil Housekeeper<br>- Emperor<br>- First Dragon<br>- Nguyên Long<br>- Yuan Long<br>- Yuanlong<br>- 元龙<br>- 魔皇大管家 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 906 chapters |  |  |  |
| chapter dates | LINT | 3 of 906 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 214 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imgsrv5.com/.../01.jpg` (image/jpeg, 47882 bytes, 750x586) |  |  |  |
