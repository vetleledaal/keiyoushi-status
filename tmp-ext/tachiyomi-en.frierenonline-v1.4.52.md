# Extension Validation Report

- Extension: tachiyomi-en.frierenonline-v1.4.52
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 24
- Lint: 1
- Warnings: 3
- Skipped: 8
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 27704135061035291
- Source name: Frieren Online
- Source language: en
- Selected manga input: popular offset 0: Frieren: Beyond Journey’s End (`.../sousou-no-frieren`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 1 | Frieren: Beyond Journey’s End (`.../sousou-no-frieren`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Frieren: Beyond Journey's End Manga (`.../sousou-no-frieren`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 162 | Frieren: Beyond Journey’s End, Chapter 1 (`.../sousou-no-frieren-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 35 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 1/1 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1/1 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.frieren.online/.../Frieren-Beyond-Journeys-End-Manga-175x238.jpg` (image/jpeg, 19179 bytes, 175x238) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Frieren: Beyond Journey’s End to Frieren: Beyond Journey's End Manga |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.frieren.online/.../Frieren-Beyond-Journeys-End-Manga.jpg` (image/jpeg, 147213 bytes, 333x524) |  |  |  |
| details author | PASS | YAMADA Kanehito |  |  |  |
| details artist | PASS | Tsukasa ABE |  |  |  |
| details genres | PASS | Adventure, Drama, Fantasy, Shounen, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Frieren is a member of the hero’s party that defeated the demon king. Both a magician and an elf, those are the things that separates her from the other members. Being able to live longer than others, her feelings are... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 162 chapters |  |  |  |
| chapter dates | LINT | All 162 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=162 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 35 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | details: `https://www.frieren.online/.../sousou-no-frieren` to `https://www.frieren.online` (1 redirects); chapters: `https://www.frieren.online/.../sousou-no-frieren` to `https://www.frieren.online` (1 redirects) |  |  |  |
| page load | PASS | `https://img.spoilerhat.com/.../img <redacted query values: url and mime>` (image/jpeg, 218224 bytes, 728x1044) |  |  |  |
