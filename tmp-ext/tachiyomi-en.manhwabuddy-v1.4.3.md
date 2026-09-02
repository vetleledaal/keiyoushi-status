# Extension Validation Report

- Extension: tachiyomi-en.manhwabuddy-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 397029358682805931
- Source name: ManhwaBuddy
- Source language: en
- Selected manga input: latest offset 0: Super God Gene (`.../super-god-gene`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Stop Smoking (`.../stop-smoking`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Super God Gene (`.../super-god-gene`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Reincarnated as an Aristocrat with an Appraisal Skill (`.../reincarnated-as-an-aristocrat-with-an-appraisal-skill`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Super God Gene (`.../super-god-gene`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Super God Gene (`.../super-god-gene`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 482 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Super God Gene, URL=`.../super-god-gene` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Reincarnated as an Aristocrat with an Appraisal Skill, URL=`.../reincarnated-as-an-aristocrat-with-an-appraisal-skill` at page 1 offset 23 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 69/69 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 69/69 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhwabuddy.com/.../super-god-gene-cover.jpg` (image/jpeg, 34456 bytes, 262x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../super-god-gene` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Twelve-Winged Dark Seraphim |  |  |  |
| details artist | PASS | Yuewen Manhua |  |  |  |
| details genres | PASS | Action, Drama, Fantasy, Sci-fi, Shounen, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | In a future interstellar world, countless strange beasts invade. Humans can gain their genes by consuming them, leading to a new era of rapid genetic evolution.<br>Han Sen, a newcomer who has just arrived at a shelter, is looked down on by others and even mocked as a “weird guy.” But behind the scenes, he has another identity—someone everyone admires and calls a “legendary figure.”<br>Han Sen: “Sorry, but I’m the only one who can obtain super god-level genes!” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 482 chapters |  |  |  |
| chapter dates | LINT | 1 of 482 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img03.manhwabuddy.com/.../1-251.jpg` (image/jpeg, 585757 bytes, 800x7670) |  |  |  |
