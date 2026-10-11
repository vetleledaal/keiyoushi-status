# Extension Validation Report

- Extension: tachiyomi-en.s2manga-v1.6.60
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4870917758913494428
- Source name: S2Manga
- Source language: en
- Selected manga input: popular offset 0: Under the Oak Tree (`.../4073`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Under the Oak Tree (`.../4073`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | What It Means to be You? (`.../54752`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Witch in the Emperor’s Quarters (`.../95220`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Finding a Ticket Into Your Heart (`.../94348`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Under the Oak Tree (`.../4073`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Under the Oak Tree (`.../4073`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 233 | Chap 62 (`.../chap-62`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Under the Oak Tree, URL=`4073` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-1.s2read.com/.../thumbnail.webp` (image/webp (encoding: lossy), 89126 bytes, 480x707) |  |  |  |
| details identity | PASS | Details preserved selected URL `4073` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-1.s2read.com/.../thumbnail.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Historical, Magic, Manga, Manhua, Manhwa, Manhwa Hot, Mature, Romance, Webtoons, Comic |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “Warning: Mature content: This manga contains materials that might not be suitable to children under 17. By proceeding, you are confirming that you are 17 or older.”The daughter of a duke, the stuttering Maximilian, married a knight of lowly status at her father’s coercion. After their first night, her husband departed for an expedition without another word. He comes back three years later, this time as a famous knight in the whole continent. How would Maximilian face him on his return? “The more I think of you, the more lonely and lonely I become. I don’t know why I can’t quit even though it’s so painful.”<br><br>Search for series of same genre(s)<br><br>Welcome to S2manga site, you can read and enjoy all kinds of Manga trending such as Drama, Manhua, Manhwa, Fantasy, v.vv…, for free here. All of the manga new will be update with high standards every 24 hours. If you are a Comics book (Manga Hot ), S2manga is your best choice, don’t hesitate, just read and feel !<br><br>Alternative Names: 상수리나무 아래, Sangsurinamu Arae, Sous le chêne, Sotto la quercia, Debaixo do carvalho, Debajo del roble, Pod dubem, Під дубом, Под дубом, A Tölgyfa Alatt, تحت شجرة البلوط, Meşe Ağacının Altında, Царс модон дор, 橡树之下, 橡树下, Dưới gốc cây sồi, Dưới tán cây sồi, Pod dębowym drzewem, Ooku no Ki no Shita |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 233 chapters |  |  |  |
| chapter dates | PASS | 233 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `chapter-142` at offsets 28, 29, `chapter-135` at offsets 36, 37, 38, 39, `chapter-117` at offsets 57, 58, `chapter-114` at offsets 61, 62 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://cdn2.s2read.com/.../1.jpg` could not be downloaded: java.net.UnknownHostException: cdn2.s2read.com: Name or service not known | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
