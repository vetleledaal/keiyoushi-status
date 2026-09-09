# Extension Validation Report

- Extension: tachiyomi-all.comikey-v1.6.10
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2769857481066602061
- Source name: Comikey
- Source language: en
- Selected manga input: popular offset 0: Kengan Omega (`.../10`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Kengan Omega (`.../10`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Smoking Behind the Supermarket with You (`.../527`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | Kengan Omega (`.../10`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | The Quest for the Luxury Liner: Seize the Rich Life with a Ship-Summoning Skill in Another World (`.../848`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kengan Omega (`.../10`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kengan Omega (`.../10`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 372 | Chapter 0: Prologue (`.../chapter-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Unknown error: RangeError: Invalid array length | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Unknown error: RangeError: Invalid array length | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kengan Omega, URL=`.../10` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.comikey.com/.../1a93e87a435e.png` (image/jpeg, 27035 bytes, 240x360) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../10` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://comikey.com/.../a0af677ab5db.png` (image/png, 1162567 bytes, 800x1200) |  |  |  |
| details author | PASS | SANDROVICH Yabako |  |  |  |
| details artist | PASS | Daromeon |  |  |  |
| details genres | PASS | Drama, Action, Martial Arts, Shonen, Thriller, Tragedy, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | "In the underground arena that will never see the light of day, two beasts are facing off. Wishing upon their fists."<br><br>Two years after the events of Kengan Ashura, a young man named Narushima Koga aims to enter the Kengan matches, while also seeking out Tokita Ohma for a mysterious reason. He begins to work under Yamashita Kazuo when he meets Gaoh Ryuki, the spitting image of Ohma. Now with a massive showdown between the Kengan Association and Purgatory, another underground martial-arts fighting organization, looming in the background, how will Kouga become strong enough to take part in the legendary Kengan fights? |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 121 name, chapter 178 name |  |  |  |
| chapters | PASS | 372 chapters |  |  |  |
| chapter dates | PASS | 372 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Unknown error: RangeError: Invalid array length |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
