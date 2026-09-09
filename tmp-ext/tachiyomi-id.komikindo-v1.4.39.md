# Extension Validation Report

- Extension: tachiyomi-id.komikindo-v1.4.39
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1210328269637877420
- Source name: Komikindo
- Source language: id
- Selected manga input: popular offset 0: Secret Class (`.../secret-class`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class (`.../secret-class`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Wireless Onahole (Swehwangjorongie) (`.../wireless-onahole-swehwangjorongie`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Tenshi ga Ie ni Tomari ni Kita (`.../tenshi-ga-ie-ni-tomari-ni-kita`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Danjo no Teiso Kannen ga Gyaku ni natta Sekai (jake) (`.../danjo-no-teiso-kannen-ga-gyaku-ni-natta-sekai-jake`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Secret Class (`.../secret-class`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Secret Class (`.../secret-class`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 322 | Chapter 01 (`.../secret-class-chapter-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| chapters | PASS | 322 chapters |  |  |  |
| chapter dates | PASS | 322 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://komik.fajarsumatera.com/.../Secret-Class-Chapter-01-Bahasa-Indonesia.jpg` (image/jpeg, 59325 bytes, 720x880) |  |  |  |
