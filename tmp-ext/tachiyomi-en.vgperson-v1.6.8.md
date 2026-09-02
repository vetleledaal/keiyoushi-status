# Extension Validation Report

- Extension: tachiyomi-en.vgperson-v1.6.8
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 2
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8735588151075137817
- Source name: vgperson
- Source language: en
- Selected manga input: popular offset 0: The Festive Monster's Cheerful Failure (`<redacted URL #1: manga resource; relative; no scheme; query parameters: m>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 3 | The Festive Monster's Cheerful Failure (`<redacted URL #1: selected resource; relative; no scheme; query parameters: m>`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Festive Monster's Cheerful Failure (`<redacted URL #1: selected resource; relative; no scheme; query parameters: m>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Festive Monster's Cheerful Failure (`<redacted URL #1: selected resource; relative; no scheme; query parameters: m>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 35 | Chapter 1 - The Modern Classmate Nose What's Good (`<redacted URL #2: selected resource; relative; no scheme; query parameters: m and c>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Festive Monster's Cheerful Failure, URL=`?m=1` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 4/4 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 4/4 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.imgur.com/.../kEK10GL.png` (image/png, 203354 bytes, 246x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `?m=1` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../kEK10GL.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Written by the brother-sister unit Manbo-Dead-Behind-the-House-P (You Takahashi and Tsukasa Ryuuguu). It tells the story of a human in a class of monsters who's invited to form a band, and all the bizarre days that ensue. The issues were readable on Gangan Online each month, but no longer.  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | LINT | All 35 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=35 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i.imgur.com/.../jdoDr.jpg` (image/jpeg, 231261 bytes, 870x1236) |  |  |  |
