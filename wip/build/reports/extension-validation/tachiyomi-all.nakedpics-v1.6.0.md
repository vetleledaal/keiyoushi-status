# Extension Validation Report

- Extension: tachiyomi-all.nakedpics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6711216111994206341
- Source name: NakedPics
- Source language: all
- Selected manga input: popular offset 0: Tanned Russian girl and beautiful friend come to guy for anal threesome (`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Tanned Russian girl and beautiful friend come to guy for anal threesome (`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Lesbian girls squirt while participating in an all-black female orgy (`.../lesbian-girls-squirt-while-participating-in-an-allblack-female-orgy-69079102`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Spizoo performed by Blanche Summer Naked Photos (`.../spizoo-performed-by-blanche-summer-naked-photos-15152901`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Love Her Tattoos performed by Ravyn Alexa Nude Photos (`.../love-her-tattoos-performed-by-ravyn-alexa-nude-photos-19264803`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tanned Russian girl and beautiful friend come to guy for anal threesome (`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tanned Russian girl and beautiful friend come to guy for anal threesome (`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tanned Russian girl and beautiful friend come to guy for anal threesome, URL=`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdni.hotnakedwomen.com/.../31486675_001_7815.jpg` (image/jpeg, 91574 bytes, 920x1371) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675` |  |  |  |
| details thumbnail URL | PASS | `https://cdni.hotnakedwomen.com/.../31486675_001_7815.jpg` |  |  |  |
| details author | PASS | Summer Breeze |  |  |  |
| details artist | PASS | Butt Man |  |  |  |
| details genres | PASS | Threesome, Russian, High Heels, Anal Gape, Blonde Small Tits, Groupsex, Beautiful Russian, Long Legs High Heels |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 16 photos<br><br>**Models:**<br>- \[Summer Breeze\](https://hotnakedwomen.com/.../summer-breeze)<br><br>**Channel:**<br>- \[Butt Man\](https://hotnakedwomen.com/.../butt-man) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hotnakedwomen.com/.../Tanned-Russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome` to `https://hotnakedwomen.com/.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome` (1 redirects) |  |  |  |
| page load | PASS | `https://cdni.hotnakedwomen.com/.../31486675_001_7815.jpg` (image/jpeg, 125544 bytes, 1080x1657) |  |  |  |
