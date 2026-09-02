# Extension Validation Report

- Extension: tachiyomi-en.sacachispa-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 388932303664463452
- Source name: SACACHISPA
- Source language: en
- Selected manga input: popular offset 0: What Shall We Do After The Last Train? (`.../what-shall-we-do-after-the-last-train`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | What Shall We Do After The Last Train? (`.../what-shall-we-do-after-the-last-train`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | What Shall We Do After The Last Train? (`.../what-shall-we-do-after-the-last-train`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | What Shall We Do After The Last Train? (`.../what-shall-we-do-after-the-last-train`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 2 | Chapter 1 (`.../1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | <1s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=What Shall We Do After The Last Train?, URL=`what-shall-we-do-after-the-last-train` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 18/18 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 18/18 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://uwu.sacachispa.site/.../99e5943a-36d6-4d2a-ab1b-c308575f3263.jpg` (image/jpeg, 4027990 bytes, 2720x1920) |  |  |  |
| details identity | PASS | Details preserved selected URL `what-shall-we-do-after-the-last-train` |  |  |  |
| details thumbnail URL | PASS | `https://uwu.sacachispa.site/.../99e5943a-36d6-4d2a-ab1b-c308575f3263.jpg` |  |  |  |
| details author | PASS | Ryoko seto |  |  |  |
| details artist | PASS | Ryoko seto |  |  |  |
| details genres | PASS | Romance, Office Workers, Ecchi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Masaki and Satsuki are two government office workers who are worn out from being pushed to their limits by endless overtime. Although she initially brushed him off for being a little too friendly, things take an unexpected turn when they miss the last train. After scaring off a few creeps who were harassing her on the street, Masaki takes her to a hidden spot: a 24-hour batting center. As they blow off the stress of work by swinging away, the awkwardness between them fades, and these two coworkers begin creating their own exclusive late-night adventures. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://uwu.sacachispa.site/.../4aee22f1-cc07-470b-81ca-eabb0662311a.jpg` (image/jpeg, 1585284 bytes, 1360x1920) |  |  |  |
