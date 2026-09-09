# Extension Validation Report

- Extension: tachiyomi-en.duskscans-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6702526497040269835
- Source name: Dusk Scans
- Source language: en
- Selected manga input: popular offset 0: Ultimate Son In Law (`.../ultimate-son-in-law`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 115 | Ultimate Son In Law (`.../ultimate-son-in-law`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 115 | Former Supreme (`.../former-supreme`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ultimate Son In Law (`.../ultimate-son-in-law`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ultimate Son In Law (`.../ultimate-son-in-law`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 401 | Chapter 1 (`.../cmrsaacxc03bfoq11vagvdgnr`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | <1s |

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
| popular listing | PASS | 115 entries |  |  |  |
| latest listing | PASS | 115 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ultimate Son In Law, URL=`ultimate-son-in-law` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 231/231 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 231/231 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.duskscans.com/.../1784076114475-991a0ece-c8ec-4f5b-8112-1f8c60ec97d2.webp` (image/webp (encoding: lossy), 254562 bytes, 1085x1450) |  |  |  |
| details identity | PASS | Details preserved selected URL `ultimate-son-in-law` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.duskscans.com/.../1784076114475-991a0ece-c8ec-4f5b-8112-1f8c60ec97d2.webp` |  |  |  |
| details author | PASS | Yuewen Manhua (阅文漫画) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Wuxia, Harem, Medical, Action, Fantasy, Adventure, Comedy, Drama, Isekai, Romance, Historical |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | Shen Lang traveled to the past and became a matrilocal son-in-law of a wealthy family. And yet he was kicked out for being a good-for-nothing. So he swore that he would marry a more powerful and striking noblewoman.<br><br>I'm not going to practice martial arts in my whole life! I'll groom my wife to be the No.1 martial master in the world! She will kick the ass of anyone who dares to mess with me! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 401 chapters |  |  |  |
| chapter dates | PASS | 401 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://duskscans.com/.../ultimate-son-in-law` to `https://duskscans.com/.../ultimate-son-in-law <redacted query values: _rsc>` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.duskscans.com/.../001.webp` (image/webp (encoding: lossy), 617510 bytes, 800x13000) |  |  |  |
