# Extension Validation Report

- Extension: tachiyomi-all.manhwa18net-v1.6.14
- Input artifact: APK
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
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
- Source ID: 687150405919946955
- Source name: Manhwa18.Net
- Source language: en
- Selected manga input: latest offset 0: Slave Code (`.../slave-code`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Secret class (`.../secret-class`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Absolute Hypnosis in Another World (`.../absolute-hypnosis-in-another-world`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Slave Code (`.../slave-code`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Paradise Villa (`.../paradise-villa`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Slave Code (`.../slave-code`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Slave Code (`.../slave-code`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 21 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Slave Code, URL=`.../slave-code` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://min.manhwa18.net/.../20260529195203_238991_y7uCGSxP.jpg` (image/jpeg, 539801 bytes, 800x1120) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../slave-code` |  |  |  |
| details thumbnail URL | PASS | `https://min.manhwa18.net/.../20260529195203_238991_y7uCGSxP.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Adult, Mature |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Seungwoo's preferences shift depending on the situation he's in as well as his partner. He's a sadist one day and a masochist another. In his various relationships, he slowly discovers his own hidden desires by restricting himself and others, while also freeing them too… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://min.manhwa18.net/.../20260529195220_403978_QU7meV1g.jpg` (image/jpeg, 4993695 bytes, 720x16609) |  |  |  |
