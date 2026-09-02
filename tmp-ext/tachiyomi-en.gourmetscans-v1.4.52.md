# Extension Validation Report

- Extension: tachiyomi-en.gourmetscans-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3694940277826033657
- Source name: Gourmet Scans
- Source language: en
- Selected manga input: popular offset 0: It’s Time to Change the Genre (`.../its-time-to-change-the-genre`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | It’s Time to Change the Genre (`.../its-time-to-change-the-genre`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 0 |  |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 0 |  |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 12 | The Blue Dragon Clan’s Very Suspicious Little Chick (`.../the-blue-dragon-clans-very-suspicious-little-chick`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | It’s Time to Change the Genre (`.../its-time-to-change-the-genre`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 123 | Chapter 1 (`https://gourmetsupremacy.com/.../chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 104 |  |  | 1-10s |

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
| latest listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 12 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | FAIL | Page 2 is empty despite page 1 advertising a next page | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest pagination | SKIP | Page 1 has no manga to check |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 24/24 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 24/24 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gourmetsupremacy.com/.../ITTCTG-S3-cover-350x476.jpg` (image/jpeg, 62934 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../its-time-to-change-the-genre` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://gourmetsupremacy.com/.../ITTCTG-S3-cover-193x278.jpg` (image/jpeg, 30273 bytes, 193x278) |  |  |  |
| details author | PASS | Ken |  |  |  |
| details artist | PASS | Garine |  |  |  |
| details genres | PASS | Comedy, Fantasy, Historical, Isekai, Romance, Royalty-Nobility, Shoujo, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | I reincarnated into my favorite genre for novels.<br><br>I became the villainous aunt who mistreats the young protagonist. I felt sorry for my nephew who would grow up as the protagonist in a revengeful plot, so I’ll try my best to take care of my nephew until his uncle shows up and takes him as per the original plot.<br><br>But then…<br><br>“M-Mom!”<br><br>I’ve become his mother all of a sudden?<br><br>“I don’t know your circumstances, but how could I bear to separate a mother from her son? Lady, come with us to Winterwald.”<br><br>Hey, Kim Luca! How are you going to fix this misunderstanding? (Synopsis: Gourmet Scans)<br><br>Alternative Names: 장르를 바꿔보도록 하겠습니다, The Villainess Flips the Script, I Will Change the Genre |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 123 chapters |  |  |  |
| chapter dates | LINT | All 123 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=123 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 123 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 104 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://gourmetsupremacy.com/.../0-ITTCTG-cover.jpg` (image/jpeg, 310352 bytes, 720x760) |  |  |  |
