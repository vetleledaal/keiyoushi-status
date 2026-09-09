# Extension Validation Report

- Extension: tachiyomi-en.mangauno-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 4237239660432093896
- Source name: Manga.uno
- Source language: en
- Selected manga input: popular offset 0: Chainsaw Man (`.../chainsaw-man`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Chainsaw Man (`.../chainsaw-man`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | [Oshi no Ko] (`.../oshi-no-ko`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Return of the Calamity-Class Death Knight (`.../return-of-the-calamity-class-death-knight`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Goinmul Healer ga Neomu Ganghada (`.../goinmul-healer-ga-neomu-ganghada`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 6 | Chainsaw Man (`.../chainsaw-man`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Chainsaw Man (`.../chainsaw-man`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 233 | Ch. 1 — Vol. 1 — Dog and Chainsaw (`.../818359`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Chainsaw Man, URL=`chainsaw-man` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://xz7.fstr-cdn.com/.../chainsaw-man.webp` (image/webp (encoding: lossy), 49592 bytes, 300x471) |  |  |  |
| details identity | PASS | Details preserved selected URL `chainsaw-man` |  |  |  |
| details thumbnail URL | PASS | `https://xz7.fstr-cdn.com/.../chainsaw-man.webp` |  |  |  |
| details author | PASS | Fujimoto Tatsuki |  |  |  |
| details artist | PASS | Fujimoto Tatsuki |  |  |  |
| details genres | PASS | Action, Comedy, Horror, Award Winning, Monsters, Demons, Gore, Supernatural |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | The name says it all! Denji's life of poverty is changed forever when he merges with his pet chainsaw dog, Pochita! Now he's living in the big city and an official Devil Hunter. But he's got a lot to learn about his new job and chainsaw powers!<br><br><br><br>(Source: MANGA Plus)<br><br><br><br>Notes:<br><br>- Nominated for the 2020 Manga Taisho Award.<br><br>- Winner of the 2021 Kono Manga ga Sugoi Award.<br><br>- Winner of the 66th Shogakukan Manga Award in the shounen category.<br><br>- Winner of the 2021 and 2022 Harvey Award for Best Manga.<br><br>- Chapters 1-97 were released in Weekly Shounen Jump from Dec 3, 2018 to Dec 13, 2020. The series resumed from Ch. 98 in Shounen Jump+ on July 12, 2022 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 74 name, chapter 152 name |  |  |  |
| chapters | PASS | 233 chapters |  |  |  |
| chapter dates | PASS | 233 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://xz7.fstr-cdn.com/.../1.webp` (image/webp (encoding: lossy), 93956 bytes, 1067x1600) |  |  |  |
