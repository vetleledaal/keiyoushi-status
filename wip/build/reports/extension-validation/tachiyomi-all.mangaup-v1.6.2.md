# Extension Validation Report

- Extension: tachiyomi-all.mangaup-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7689478295161479290
- Source name: Manga UP!
- Source language: en
- Selected manga input: popular offset 0: The Apothecary Diaries (`.../164`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 452 | The Apothecary Diaries (`.../164`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 452 | Betrothed to a Fox Demon (`.../652`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 450 | The Apothecary Diaries: Xiaolan’s Story (`.../739`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Apothecary Diaries (`.../164`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 257 | Chapter 1.1 - The Curse of the Inner Court (`.../14826`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | <1s |

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
| popular listing | PASS | 452 entries |  |  |  |
| latest listing | PASS | 452 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=The Apothecary Diaries, URL=`164` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 1354/1354 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 1354/1354 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://global-img.manga-up.com/.../164.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 20496 bytes, 480x270) |  |  |  |
| details identity | PASS | Details preserved selected URL `164` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://global-img.manga-up.com/.../164.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 57318 bytes, 960x540) |  |  |  |
| details author | PASS | Hyuganatsu, Nekokurage, Itsuki Nanao |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Suspense, Historical, Media Tie-ins, Big Gangan, Winter_2025_Anime |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Maomao, a young woman trained in the art of herbal medicine, is forced to work as a lowly servant in the inner palace. Though she yearns for life outside its perfumed halls, she isn’t long for a life of drudgery! Using her wits to break a “curse” afflicting the imperial heirs, Maomao attracts the attentions of the handsome eunuch Jinshi and is promoted to attendant food taster. But Jinshi has other plans for the erstwhile apothecary, and soon Maomao is back to brewing potions and…solving mysteries?!<br><br>(C)2026 Hyuganatsu/Imagica Infos Co., Ltd.<br>(C)Nekokurage/SQUARE ENIX<br>(C)Itsuki Nanao/SQUARE ENIX<br><br>Check on the 25th monthly for new chapter updates |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 257 chapters |  |  |  |
| chapter dates | LINT | 3 of 257 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=3 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://global-img.manga-up.com/.../1.webp.enc <redacted query values: h and e>` (image/webp (encoding: lossy), 42710 bytes, 1080x1539; server Content-Type: application/octet-stream) |  |  |  |
