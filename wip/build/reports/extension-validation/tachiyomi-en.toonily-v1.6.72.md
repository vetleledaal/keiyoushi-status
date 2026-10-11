# Extension Validation Report

- Extension: tachiyomi-en.toonily-v1.6.72
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: madara
- Source ID: 5190569675461947007
- Source name: Toonily
- Source language: en
- Selected manga input: popular offset 0: A Wonderful New World (`.../5871`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | A Wonderful New World (`.../5871`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Mercenary Enrollment (`.../11290`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Meek Cat (`.../148025`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Relationship Reversal (`.../40817`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Wonderful New World (`.../5871`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Wonderful New World (`.../5871`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 271 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Wonderful New World, URL=`5871` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.tnlycdn.com/.../Read-A-Wonderful-New-World-manhwa-toptoon-free-175x238.jpg` (image/jpeg, 15044 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `5871` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://static.tnlycdn.com/.../Read-A-Wonderful-New-World-manhwa-toptoon-free-224x320.jpg` (image/jpeg, 15044 bytes, 300x420) |  |  |  |
| details author | PASS | Go Sonjak |  |  |  |
| details artist | PASS | Yoon Gon-ji |  |  |  |
| details genres | PASS | Drama, Seinen, Mature |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Ho-Sung, an unpopular office worker who works for one of the largest corporations in Korea, is crouched over like a sinner because he was accused of setting up a camera in the women’s bathroom. In the end, however, he was proven to be innocent. Then one day, he was suddenly notified of his reassignment by the team manager. It seemed that she was victorious, until…<br><br><br><br>A Wonderful New World (also known as 멋진 신세계, Brave New World) is a completed Korean drama manhwa , written by Go Sonjak and illustrated by Yoon Gon-ji, published by Toptoon.<br><br>It is also commonly searched as “A Wonderful New World manga”, even though it follows the Korean manhwa/webtoon format. Readers who want to read A Wonderful New World online in English can explore this series for its engaging plot, character-driven storytelling, and distinctive artwork.<br><br>Whether you search for A Wonderful New World manhwa or A Wonderful New World manga, it offers a strong reading experience within the drama genre.<br><br>Alternative Names: 멋진 신세계, Brave New World |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 271 chapters |  |  |  |
| chapter dates | PASS | 271 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://data.tnlycdn.com/.../Brave-New-World_00.jpg` (image/jpeg, 368560 bytes, 720x8553) |  |  |  |
