# Extension Validation Report

- Extension: tachiyomi-en.otranslations-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8863679261776988936
- Source name: O Translations
- Source language: en
- Selected manga input: latest offset 0: I Became The Patron of Villains (`.../the-patron-of-villains`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 19 | Miss Regular Customer Wants to Enjoy (`.../miss-regular-customer-wants-to-enjoy`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 19 | I Became The Patron of Villains (`.../the-patron-of-villains`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Became The Patron of Villains (`.../the-patron-of-villains`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Became The Patron of Villains (`.../the-patron-of-villains`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 51 | Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 89 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 19 entries |  |  |  |
| latest listing | PASS | 19 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Became The Patron of Villains, URL=`the-patron-of-villains` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 39/39 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 39/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://otl.moe/.../cover-v2.webp` (image/webp (encoding: lossy), 163052 bytes, 690x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-patron-of-villains` |  |  |  |
| details thumbnail URL | PASS | `https://otl.moe/.../cover-v2.webp` |  |  |  |
| details author | PASS | LICO, Bom Han Bang-ul (봄한방울), Namisa (나미사) |  |  |  |
| details artist | PASS | Jogen (조겐) |  |  |  |
| details genres | PASS | Manhwa, Action, Comedy, Adventure, Isekai, Drama, Fantasy, Reincarnation, Monsters, Magic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 2025 · Teen<br><br>One day, I woke up as a noble inside the game I used to play. Unfortunately, the game ends in an apocalypse.<br><br>With ten years left, I track down the future villains while they’re still kids and decide to raise them myself, hoping that a better childhood could stop them from destroying the world.<br><br>Now, with criminals dropping like flies, the kingdom thinks I’m the terrifying mastermind pulling all the strings. What on earth is happening? I just wanted to enjoy the sweet noble life!<br><br>**Alternative title:**<br>- 악당들의 후원자가 되었다<br><br>**Links:**<br>- \[Naver Webtoon (raw)\](https://comic.naver.com/.../list <redacted query values: titleId>) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 51 chapters |  |  |  |
| chapter dates | LINT | All 51 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=51 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 89 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://otl.moe/.../001.webp` (image/webp (encoding: lossy), 216204 bytes, 690x2343) |  |  |  |
