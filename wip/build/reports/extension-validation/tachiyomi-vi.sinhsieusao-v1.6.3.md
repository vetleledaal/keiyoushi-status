# Extension Validation Report

- Extension: tachiyomi-vi.sinhsieusao-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4780099289691520887
- Source name: SinhSieuSao
- Source language: vi
- Selected manga input: popular offset 0: Kou iu no ga ii (`.../12`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Kou iu no ga ii (`.../12`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Album Phú Bà Arisa Nguyễn (`.../107`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Phỏng vấn Ochako: Bạn với Deku có mối quan hệ gì? (`.../91`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kou iu no ga ii (`.../12`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kou iu no ga ii (`.../12`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 55 | Người yêu (`.../21`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 26 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kou iu no ga ii, URL=`12` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://sinhsieusao.comhttps/.../card-faebb668b4c41cb5653472ad602982b9.jpg` could not be downloaded: java.net.UnknownHostException: sinhsieusao.comhttps | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `12` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://sinhsieusao.comhttps/.../processed-4486d10c39d2eb5c0b3fb8903572a380.jpg` could not be downloaded: java.net.UnknownHostException: sinhsieusao.comhttps | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | Souryuu \| 双龍 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Original, Souryuu, Series, Comedy, Slice of Life, Kou iu no ga ii |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cuộc sống tự do tự tại của đôi bạn trẻ không muốn có người yêu |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 55 chapters |  |  |  |
| chapter dates | PASS | 55 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://sinhsieusao.comhttps/.../processed-4f31ef683a13479e8abeff8d6ec37b66.jpg` could not be downloaded: java.net.UnknownHostException: sinhsieusao.comhttps: Name or service not known | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
