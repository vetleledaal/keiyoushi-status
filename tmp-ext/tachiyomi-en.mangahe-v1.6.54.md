# Extension Validation Report

- Extension: tachiyomi-en.mangahe-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1406386535599331231
- Source name: MangaHe
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../252`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Secret Class (`.../252`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Switch ON (Uncensored) (`.../932`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | HOT A Theme For Every Building (`.../24449`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | HOT The Regressed Man (`.../25587`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | Secret Class (`.../252`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../252`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 628 | Chapter 1 (`.../chapter1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`252` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 105/105 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 105/105 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangahe.com/.../Secret-Class-v4-new-193x278-252-175x238.jpg` (image/jpeg, 10437 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `252` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangahe.com/.../Secret-Class-v4-new-193x278-252.jpg` (image/jpeg, 14210 bytes, 193x278) |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Minachan |  |  |  |
| details genres | PASS | Adult, Comedy, Harem, Romance, Seinen, Slice of Life, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After losing his parents at 13, Dae Ho was taken in by a close friend of his father. Now an adult, he remains completely clueless about relationships between men and women. To guide him, his aunt and sisters decide to give Dae Ho a discreet and private lesson… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 628 chapters |  |  |  |
| chapter dates | LINT | 5 of 628 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangahe.com/.../2-01.jpg` (image/jpeg, 696444 bytes, 1440x10000) |  |  |  |
