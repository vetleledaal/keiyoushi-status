# Extension Validation Report

- Extension: tachiyomi-en.aurora-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 26
- Lint: 1
- Warnings: 0
- Skipped: 9
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9148518200946142514
- Source name: Aurora
- Source language: en
- Selected manga input: popular offset 0: Aurora -  (`.../chap-1-1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 31 | Aurora -  (`.../chap-1-1`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.UnsupportedOperationException | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Aurora -  (`.../chap-1-1`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 32 | 1.1.1 (`.../1-1-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | SKIP | java.lang.UnsupportedOperationException |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 31 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | search operation did not complete successfully |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 31/31 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 31/31 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://comicaurora.com/.../TITLES-_001-2-724x1024.png` (image/png, 668914 bytes, 724x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../chap-1-1` |  |  |  |
| details thumbnail URL | PASS | `https://comicaurora.com/.../TITLES-_001-2-724x1024.png` |  |  |  |
| details author | PASS | OSP-Red |  |  |  |
| details artist | PASS | OSP-Red |  |  |  |
| details genres | PASS | fantasy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Aurora is a fantasy webcomic (updates M/W/F) written and illustrated by Red, better known for her work on the YouTube channel “Overly Sarcastic Productions.” It’s been in the works for over a decade, and she’s finally decided to stop putting it off.<br><br>If you’d like to discuss the comic, it now has a subreddit, as well as a dedicated twitter and a tumblr where you can ask questions. There’s also a dedicated room on the channel discord for conversations about it!<br><br>Find Red’s general ramblings on Twitter, alongside her cohost Blue, at OSPYouTube. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: title |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | PASS | 32 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://comicaurora.com/.../CH1_001-1.png` (image/png, 5466394 bytes, 2000x2828) |  |  |  |
