# Extension Validation Report

- Extension: tachiyomi-all.pornpics-v1.6.2
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
- Source implementation: keiyoushi.source.a
- Source ID: 1459635082044256286
- Source name: PornPics
- Source language: en
- Selected manga input: popular offset 0: Tanned russian girl and beautiful friend come to guy for anal threesome (`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Tanned russian girl and beautiful friend come to guy for anal threesome (`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Petite blonde teen kylie teases with her incredible big tits ass in public (`.../petite-blonde-teen-kylie-teases-with-her-incredible-big-tits-ass-in-public-69919149`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Onlyfans noemy love naked porn pics (`.../onlyfans-noemy-love-naked-porn-pics-90182796`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Asian teen slips off a red bikini to model in the nude by a swimming pool (`.../asian-teen-slips-off-a-red-bikini-to-model-in-the-nude-by-a-swimming-pool-11584882`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tanned Russian girl and beautiful friend come to guy for anal threesome (`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675`) |  | <1s |
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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tanned Russian girl and beautiful friend come to guy for anal threesome, URL=`.../tanned-russian-girl-and-beautiful-friend-come-to-guy-for-anal-threesome-31486675` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdni.pornpics.com/.../31486675_001_7815.jpg` (image/jpeg, 91574 bytes, 920x1371) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Tanned russian girl and beautiful friend come to guy for anal threesome to Tanned Russian girl and beautiful friend come to guy for anal threesome |  |  |  |
| details thumbnail URL | PASS | `https://cdni.pornpics.com/.../31486675_001_7815.jpg` |  |  |  |
| details author | PASS | Innessa, Summer Breeze |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Evil Angel, Butt Man, Threesome, Russian, High Heels, Anal Gape, Groupsex, Doggy Style, Skinny, Anal, Ass Fucking, Blonde, Blonde Small Tits, Beautiful Russian, Long Legs High Heels, Surprise Threesome, Erect Nipples, Russian Anal, Butthole, Russian Pussy |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Rating: 100%; Views: 1,676,190 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdni.pornpics.com/.../31486675_001_7815.jpg` (image/jpeg, 125544 bytes, 1080x1657) |  |  |  |
