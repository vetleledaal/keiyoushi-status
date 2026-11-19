# Extension Validation Report

- Extension: tachiyomi-en.desirescans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5668074094100591641
- Source name: DesireScans
- Source language: en
- Selected manga input: popular offset 0: Nice to See You (`.../nice-to-see-you`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Nice to See You (`.../nice-to-see-you`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Jinx (`.../jinx`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Piece of Acting (`.../piece-of-acting`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | One Bell Two Knocks (`.../one-bell-two-knocks-3`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Nice to See You (`.../nice-to-see-you`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Nice to See You (`.../nice-to-see-you`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 23 | Ch.1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Nice to See You, URL=`nice-to-see-you` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://desirescans.com/.../cover-265a78b5ae74da98798b1ccd86123be3.webp` (image/webp (container: extended), 381478 bytes, 2400x3200) |  |  |  |
| details identity | PASS | Details preserved selected URL `nice-to-see-you` |  |  |  |
| details thumbnail URL | PASS | `https://desirescans.com/.../cover-265a78b5ae74da98798b1ccd86123be3.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Comedy, Romance, Smut, Yaoi |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | Ko Ideum is a total shut in who knows how to do one thing, and one thing only: write passionate BL smut. There’s just one small problem: Ideum is a complete and total virgin. To try and stimulate his brain (among other things), Ideum takes to…well, “taking care of himself” in front of the window, imagining all sorts of sensual scenarios to jumpstart his creative juices. Sure, there may be an apartment right across from him, but nobody’s lived there for years…until now! Mid self-love session, he looks up to see a man staring at him from across the street - and not just any man, but the bisexual icon and surely soon-to-be celeb, acting major Kwon Jaeyi. Some might say their situation is a little too close for comfort…but maybe it’s just the right distance for something more.<br><br>**Type:** Manhwa · **Origin:** Korean · **Tags:** First-time Intercourse, Modern Day, Voyeurism, Younger Love Interests<br><br>**Alternative Names:**<br>- Der zu nahe Nachbar<br>- 너무 가까운 이웃<br>- Un voisin trop proche<br>- Vecinos íntimos<br>- เพื่อนบ้านประตูถัดไป<br>- 近すぎる隣人<br>- 近距離鄰居 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | PASS | 23 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.desirescans.com/.../p-44537a90-f62b-4c17-86ac-8c002478bcc9.webp` (image/webp (encoding: lossy), 461984 bytes, 800x3805) |  |  |  |
