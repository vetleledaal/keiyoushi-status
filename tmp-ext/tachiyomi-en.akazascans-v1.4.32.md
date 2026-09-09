# Extension Validation Report

- Extension: tachiyomi-en.akazascans-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8513894820944573933
- Source name: Akaza Scans
- Source language: en
- Selected manga input: latest offset 0: The Investment Method of a Wall Street Genius on Borrowed Time (`.../the-investment-method-of-a-wall-street-genius-on-borrowed-time`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Fair Trade Commission (`.../fair-trade-commission`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 18 | The Investment Method of a Wall Street Genius on Borrowed Time (`.../the-investment-method-of-a-wall-street-genius-on-borrowed-time`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Investment Method of a Wall Street Genius on Borrowed Time (`.../the-investment-method-of-a-wall-street-genius-on-borrowed-time`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Investment Method of a Wall Street Genius on Borrowed Time (`.../the-investment-method-of-a-wall-street-genius-on-borrowed-time`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 6 | Chapter 1 (`.../the-investment-method-of-a-wall-street-genius-on-borrowed-time-chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Investment Method of a Wall Street Genius on Borrowed Time, URL=`.../the-investment-method-of-a-wall-street-genius-on-borrowed-time` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://akazascans.org/.../i536966-230x300.png` (image/png, 152565 bytes, 230x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-investment-method-of-a-wall-street-genius-on-borrowed-time` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://akazascans.org/.../i536966.png` (image/png, 220483 bytes, 300x392) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasy, Office, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ha Siheon is a genius investor who amassed a fortune worth hundreds of billions of won on Wall Street. But just as he is about to meet his death after being diagnosed with a rare disease that even money cannot cure, he regresses ten years into the past, back to his days as a rookie Wall Street employee. After realizing that an astronomical amount of money is needed to develop a new drug that could cure his disease, Siheon once again begins building an enormous fortune in order to survive… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://akazascans.org/.../0d3e6309c05f8df5595c04a5e3e177df.jpg` (image/jpeg, 3604116 bytes, 690x14795) |  |  |  |
