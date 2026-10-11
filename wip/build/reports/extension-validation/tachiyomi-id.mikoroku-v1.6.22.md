# Extension Validation Report

- Extension: tachiyomi-id.mikoroku-v1.6.22
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6023755854762172558
- Source name: MikoRoku
- Source language: id
- Selected manga input: popular offset 0: Gokusotsu Kraken (`.../detail.html <redacted query values: slug>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 83 | Gokusotsu Kraken (`.../detail.html <redacted query values: slug>`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 83 | Isekai 100-nin Giri (`.../detail.html <redacted query values: slug>`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Gokusotsu Kraken (`.../detail.html <redacted query values: slug>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Gokusotsu Kraken (`.../detail.html <redacted query values: slug>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 49 | Chapter 01 (`.../932451510427964295`) |  | <1s |
| pages | `getPageList(chapter)` | success | 69 |  |  | 1-10s |

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
| popular listing | PASS | 83 entries |  |  |  |
| latest listing | PASS | 83 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gokusotsu Kraken, URL=`.../detail.html <redacted query values: slug>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 167/167 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 167/167 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `cover/gokusotsu kraken.jpg` could not be downloaded: java.lang.IllegalArgumentException: Expected URL scheme 'http' or 'https' but no scheme was found for cover/... | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../detail.html <redacted query values: slug>` |  |  |  |
| details thumbnail URL | FAIL | Thumbnail URL `cover/gokusotsu kraken.jpg` is not an absolute HTTP(S) URL (malformed URL) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | Takahiro |  |  |  |
| details artist | PASS | Toru Kei |  |  |  |
| details genres | PASS | Action, Fantasy, Isekai, Harem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Shimizu Kuuma, seorang laki-laki, yang baru saja kembali dari wawancara kerja yang tidak bisa dia selesaikan, tiba-tiba dikirim ke dunia lain, di sana dia bertemu dengan seorang gadis tertentu yang membantunya dan memberinya pekerjaan di penjara tetapi yang tidak dia ketahui adalah bahwa itu hanya jebakan. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 49 chapters |  |  |  |
| chapter dates | PASS | 49 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 69 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../00.jpg` (image/jpeg, 172458 bytes, 1000x1416) |  |  |  |
