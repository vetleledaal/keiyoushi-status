# Extension Validation Report

- Extension: tachiyomi-id.komikindo-v1.6.9
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1210328269637877420
- Source name: Komikindo
- Source language: id
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Secret Class (`.../secret-class`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Wireless Onahole (Swehwangjorongie) (`.../wireless-onahole-swehwangjorongie`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | My Sex Partners Were Actually (`.../my-sex-partners-were-actually`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Taming Female Buly (`.../taming-female-buly`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 326 | Chapter 01 (`.../secret-class-chapter-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`.../secret-class` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i3.wp.com/.../1599143273-1587994562-18d05012257a6c75f0716ca4809cdb40.jpg <redacted query values: resize>` (image/webp (encoding: lossy), 10518 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i3.wp.com/.../1599143273-1587994562-18d05012257a6c75f0716ca4809cdb40.jpg <redacted query values: resize>` (image/webp (encoding: lossy), 5032 bytes, 165x225) |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Mina-chan |  |  |  |
| details genres | PASS | Action, Adult, Manwha, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Komik Manhwa Secret Class Terjemahan Bahasa Indonesia yang jelas anak di buang dan netnot ama bibinya |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 326 chapters |  |  |  |
| chapter dates | PASS | 326 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://1.komikindo.shop/.../manga <redacted query values: page and order>` to `https://2.komikindo.shop/.../manga <redacted query values: page and order>` (1 redirects); popular: `https://1.komikindo.shop/.../manga <redacted query values: page and order>` to `https://2.komikindo.shop/.../manga <redacted query values: page and order>` (1 redirects); popular: `https://1.komikindo.shop/.../manga <redacted query values: page and order>` to `https://2.komikindo.shop/.../manga <redacted query values: page and order>` (1 redirects); popular: `https://1.komikindo.shop/.../secret-class` to `https://2.komikindo.shop/.../secret-class` (1 redirects); popular: `https://1.komikindo.shop/.../manga <redacted query values: title, page, status, type, and order>` to `https://2.komikindo.shop/.../manga <redacted query values: title, page, status, type, and order>` (1 redirects); popular: `https://1.komikindo.shop/.../secret-class-chapter-01` to `https://2.komikindo.shop/.../secret-class-chapter-01` (1 redirects); popular: `https://1.komikindo.shop/.../admin-ajax.php` to `https://2.komikindo.shop/.../admin-ajax.php` (1 redirects); popular: `https://1.komikindo.shop/.../manga <redacted query values: page and order>` to `https://2.komikindo.shop/.../manga <redacted query values: page and order>` (1 redirects); popular: `https://1.komikindo.shop/.../admin-ajax.php` to `https://2.komikindo.shop/.../admin-ajax.php` (1 redirects) |  |  |  |
| page load | PASS | `https://komik.fajarsumatera.com/.../Secret-Class-Chapter-01-Bahasa-Indonesia.jpg` (image/jpeg, 59325 bytes, 720x880) |  |  |  |
