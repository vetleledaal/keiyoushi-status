# Extension Validation Report

- Extension: tachiyomi-en.gourmetscans-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3694940277826033657
- Source name: Gourmet Scans
- Source language: en
- Selected manga input: popular offset 0: It’s Time to Change the Genre (`.../2953`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | It’s Time to Change the Genre (`.../2953`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | NG Impossible (`.../3261`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Roxana (`.../3726`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | I Don’t Want the Obsession of a Twisted Archduke (`.../7980`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | It’s Time to Change the Genre (`.../2953`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 123 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 104 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gourmetsupremacy.com/.../ITTCTG-S3-cover-350x476.jpg` (image/jpeg, 62934 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2953` |  |  |  |
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
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 104 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://gourmetsupremacy.com/.../0-ITTCTG-cover.jpg` (image/jpeg, 310352 bytes, 720x760) |  |  |  |
