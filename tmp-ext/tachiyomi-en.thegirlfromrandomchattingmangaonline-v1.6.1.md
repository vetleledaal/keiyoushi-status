# Extension Validation Report

- Extension: tachiyomi-en.thegirlfromrandomchattingmangaonline-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 0
- Warnings: 0
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7628399752617522749
- Source name: The Girl from Random Chatting Manga Online
- Source language: en
- Selected manga input: popular offset 0: The Girl from Random Chatting (`.../the-girl-from-random-chatting`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | The Girl from Random Chatting (`.../the-girl-from-random-chatting`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Girl from Random Chatting (`.../the-girl-from-random-chatting`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Girl from Random Chatting (`.../the-girl-from-random-chatting`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 351 | Chapter 1 (`.../the-girl-from-random-chatting-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Girl from Random Chatting, URL=`the-girl-from-random-chatting` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thegirlfromrandomchatting.com/.../The-Girl-from-Random-Chatting-Manga-Volume-2.webp` (image/webp (encoding: lossy), 39934 bytes, 592x768) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-girl-from-random-chatting` |  |  |  |
| details thumbnail URL | PASS | `https://thegirlfromrandomchatting.com/.../The-Girl-from-Random-Chatting-Manga-Volume-2.webp` |  |  |  |
| details author | PASS | Eun Hyuk, Park |  |  |  |
| details artist | PASS | Eun Hyuk, Park |  |  |  |
| details genres | PASS | Action, Drama, Comedy, Romance, Slice of Life, Shounen, Harem |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | If you lived through – or are still living through – high school, you can relate to Joon-Woo. An outcast and a loner, his only joy comes from the hours he spends on his phone, randomly chatting with strangers. It’s all weird and meaningless, until Joon-Woo strikes gold – as he’s matched in a private chat with a pretty young girl his age. Jackpot! But when he discovers that this same pretty girl is actually his classmate Seung Ah, things get a little too real for a guy who’s never even remotely been kissed.<br>(sourced from Webtoon) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 351 chapters |  |  |  |
| chapter dates | PASS | 351 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://scans.granddwarf.com/.../001.webp` (image/webp (encoding: lossy), 32522 bytes, 700x1158) |  |  |  |
