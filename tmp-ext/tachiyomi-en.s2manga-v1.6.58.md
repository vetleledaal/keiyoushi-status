# Extension Validation Report

- Extension: tachiyomi-en.s2manga-v1.6.58
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 3
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4870917758913494428
- Source name: S2Manga
- Source language: en
- Selected manga input: popular offset 0: Under the Oak Tree (`.../4073`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Under the Oak Tree (`.../4073`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | I Got Married To A Villain (`.../58201`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | The Dilettante (`.../77877`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The Baby Isn’t Yours (`.../92174`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Under the Oak Tree (`.../4073`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Under the Oak Tree (`.../4073`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 229 | Chap 62 (`.../chap-62`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| chapters | PASS | 229 chapters |  |  |  |
| chapter dates | LINT | 95 of 229 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=95 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `chapter-142` at offsets 24, 25, `chapter-135` at offsets 32, 33, 34, 35, `chapter-117` at offsets 53, 54, `chapter-114` at offsets 57, 58 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
