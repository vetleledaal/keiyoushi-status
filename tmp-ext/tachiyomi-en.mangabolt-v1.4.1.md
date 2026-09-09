# Extension Validation Report

- Extension: tachiyomi-en.mangabolt-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 26
- Lint: 2
- Warnings: 2
- Skipped: 5
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 286088605022156276
- Source name: MangaBolt
- Source language: en
- Selected manga input: latest offset 0: Fairy Tail Re:Fantasia (`.../fairy-tail-re-fantasia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 0 |  |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Fairy Tail Re:Fantasia (`.../fairy-tail-re-fantasia`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Fairy Tail Re:Fantasia (`.../fairy-tail-re-fantasia`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | Fairy Tail Re:Fantasia Chapter 1 - WORDS AREN'T ENOUGH (`https://mangabolt.com/.../fairy-tail-re-fantasia-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 10/10 latest manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 10/10 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.imgur.com/.../jpVjoLx.png` (image/png, 226189 bytes, 322x321) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fairy-tail-re-fantasia` |  |  |  |
| details thumbnail URL | PASS | `https://i.imgur.com/.../jpVjoLx.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Fairy Tail Re:Fantasia is a Japanese manga series by Hiro Mashima and a side story to the main series Fairy Tail. Written and illustrated by Hiro Mashima, "Fairy Tail Re:Fantasia" is a weekly spin-off manga that was serialized in Kodansha's Weekly Shōnen Magazine from July 29, 2026 to September 23, 2026 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | LINT | All 6 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=6 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 6 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangabolt.com/.../manga-list.html` to `https://mangabolt.com/.../manga-list` (2 redirects); search: `https://mangabolt.com/.../manga-list.html` to `https://mangabolt.com/.../manga-list` (2 redirects) |  |  |  |
| page load | PASS | `https://cdn.mangabolt.com/.../1.png` (image/png, 1371883 bytes, 960x1376) |  |  |  |
