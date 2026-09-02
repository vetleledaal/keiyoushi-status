# Extension Validation Report

- Extension: tachiyomi-en.killsixbilliondemons-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 25
- Lint: 2
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5520021760150818261
- Source name: KillSixBillionDemons
- Source language: en
- Selected manga input: popular offset 0: Book 1: Kill Six Billion Demons (`.../kill-six-billion-demons`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 6 | Book 1: Kill Six Billion Demons (`.../kill-six-billion-demons`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | error | 0 |  | java.lang.Exception: Search functionality is not available. | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Book 1: Kill Six Billion Demons (`.../kill-six-billion-demons`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 92 | Chapter 1 - KILL SIX BILLION DEMONS – Chapter 1 (`.../kill-six-billion-demons-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 1 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | ERROR | java.lang.Exception: Search functionality is not available. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | Search functionality is not available. |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 6/6 popular manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 6/6 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://killsixbilliondemons.com/.../ksbdcoverchapter1-685x1024.jpg` (image/jpeg, 178736 bytes, 685x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kill-six-billion-demons` |  |  |  |
| details thumbnail URL | PASS | `https://killsixbilliondemons.com/.../ksbdcoverchapter1-685x1024.jpg` |  |  |  |
| details author | PASS | Abbadon |  |  |  |
| details artist | PASS | Abbadon |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Q: What is this all about?<br>This is a webcomic! It’s graphic novel style, meaning it’s meant to be read in large chunks, but you can subject yourself to the agony of reading it a couple pages a week!<br><br>Q: Do you have a twitter/tumble machine? Just who the hell draws this thing anyway?<br>A mysterious comics goblin named Abbadon draws this mess. My twitter is @orbitaldropkick, my tumblr is orbitaldropkick.tumblr.com. If you’re feeling dangerous, you can e-mail me at <redacted email address><br><br>Q: A webcomic, eh? When does it update?<br>Tuesday and Friday evenings (and occasionally weekends). Sometimes it will be up quite late on those days.<br><br>Q: Who’s this YISUN guy that keeps getting talked about?<br>Someone has not read their Psalms and Spasms recently!<br><br>Q: What’s this about suggestions?<br>KSBD will periodically take suggestions, mostly on characters to stick in the background. You can also stick fanart, character ideas, concepts, and literature in the ‘Submit’ section up above. You need tumblr for this. If you want to suggest directly, the best way to do it is through the comments section below the comic! A huge chunk of minor characters have been named and inspired by reader comments so far.<br><br>Q: Can I buy this book in a more traditional format?<br>You absolutely can. You can get your hands on a print copy of the first and second books from Image comics in your local comics shop or anywhere else you can get comics. It looks fantastic in print and if you don’t like reading stuff online I highly recommend it. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 92 chapters |  |  |  |
| chapter dates | LINT | All 92 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=92 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://killsixbilliondemons.com/.../ksbdcoverchapter1.jpg` (image/jpeg, 440378 bytes, 750x1120) |  |  |  |
