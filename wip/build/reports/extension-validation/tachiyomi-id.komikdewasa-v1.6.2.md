# Extension Validation Report

- Extension: tachiyomi-id.komikdewasa-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8753851309776247979
- Source name: Komik Dewasak
- Source language: id
- Selected manga input: popular offset 0: Kebugaran Tanpa Sensor (`.../kebugaran-tanpa-sensor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Kebugaran Tanpa Sensor (`.../kebugaran-tanpa-sensor`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Lubang Wireless (`.../lubang-wireless`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Teman-teman Kuliahku yang Cabul (`.../teman-teman-kuliahku-yang-cabul`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Rahasia Asisten Rumah Tangga (`.../rahasia-asisten-rumah-tangga`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Kebugaran Tanpa Sensor (`.../kebugaran-tanpa-sensor`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kebugaran Tanpa Sensor (`.../kebugaran-tanpa-sensor`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 107 | Chapter 00 (`.../kebugaran-tanpa-sensor-chapter-00`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kebugaran Tanpa Sensor, URL=`.../kebugaran-tanpa-sensor` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../thumbnail.webp <redacted query values: resize>` (image/webp (encoding: lossless), 108144 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kebugaran-tanpa-sensor` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://i2.wp.com/.../thumbnail.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | manhwa |  |  |  |
| details artist | PASS | manhwa |  |  |  |
| details genres | PASS | Adult, Big, Blow job, Drama, Manhua, Manhwa, Mature, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Baca Komik Manhwa Dewasa Fitness Uncensored Bahasa Indonesia Terbaru dan Terupdate Hanya Dikomikindo |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 107 chapters |  |  |  |
| chapter dates | PASS | 107 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn5.fajarsumatera.com/.../1.jpg` (image/jpeg, 340703 bytes, 720x3764) |  |  |  |
