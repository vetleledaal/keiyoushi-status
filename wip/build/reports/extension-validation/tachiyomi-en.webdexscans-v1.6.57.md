# Extension Validation Report

- Extension: tachiyomi-en.webdexscans-v1.6.57
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3534396555218651855
- Source name: Webdex Scans
- Source language: en
- Selected manga input: popular offset 0: Legend of Star General (`.../1424cfb4-fe65-475c-87fd-42877aa8fc84`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Legend of Star General (`.../1424cfb4-fe65-475c-87fd-42877aa8fc84`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | I Really Don’t Want to Remake (`.../cfac2cb0-a431-4a57-a618-93155b6b96e4`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Logging 10,000 Years into the Future (`.../c7b6b754-1f4b-4347-b5c5-b9cd91e2d3cc`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | A Cool and Quiet University Girl Sits Beside Me at a Standing Bar (`.../e3fb2f57-10b1-478e-a7f0-f866d2793be1`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Legend of Star General (`.../1424cfb4-fe65-475c-87fd-42877aa8fc84`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Legend of Star General (`.../1424cfb4-fe65-475c-87fd-42877aa8fc84`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 408 | Chapter 01 (`.../5e374c6c-77da-49c2-8c93-1d76c1b211f3`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Legend of Star General, URL=`1424cfb4-fe65-475c-87fd-42877aa8fc84` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.webdexscans.com/.../Legend-Of-Star-General-cover-image-e1772038336721.webp` (image/webp (container: extended), 50622 bytes, 418x567) |  |  |  |
| details identity | PASS | Details preserved selected URL `1424cfb4-fe65-475c-87fd-42877aa8fc84` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.webdexscans.com/.../Legend-Of-Star-General-cover-image-e1772038336721.webp` |  |  |  |
| details author | PASS | 乐想动漫 |  |  |  |
| details artist | PASS | 乐想动漫 |  |  |  |
| details genres | PASS | Action, Fantasy, Shounen, Martial Arts, Sci-Fi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Song Yunxiang, the last Star Soul General of the Human Race, brought the system back to the campus era. When he was a teenager, he was blinded by the incomplete soul, because he was weak and could only watch his relatives and friends die in front of him. In this life, he returned with a system rebirth, with 60 years of combat experience and knowledge and technology, and returned to school. From then on, he used to build mechas to fight monsters... The things that have regretted, the people who have missed, this time will not leave regrets. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 408 chapters |  |  |  |
| chapter dates | PASS | 408 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://webdexscans.com/.../01.jpg` to `https://cdn.webdexscans.com/.../01.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://webdexscans.com/.../01.jpg` (image/jpeg, 342049 bytes, 800x1429) |  |  |  |
