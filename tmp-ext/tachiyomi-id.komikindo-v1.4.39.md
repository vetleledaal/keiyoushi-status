# Extension Validation Report

- Extension: tachiyomi-id.komikindo-v1.4.39
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1210328269637877420
- Source name: Komikindo
- Source language: id
- Selected manga input: latest offset 0: Tsuihou Tamer no NTR Fukushuudan (`.../tsuihou-tamer-no-ntr-fukushuudan`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class (`.../secret-class`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Wireless Onahole (Swehwangjorongie) (`.../wireless-onahole-swehwangjorongie`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Tsuihou Tamer no NTR Fukushuudan (`.../tsuihou-tamer-no-ntr-fukushuudan`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Zettai Reibo (sawada) (`.../zettai-reibo-sawada`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Tsuihou Tamer no NTR Fukushuudan (`.../tsuihou-tamer-no-ntr-fukushuudan`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tsuihou Tamer no NTR Fukushuudan (`.../tsuihou-tamer-no-ntr-fukushuudan`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 4 | Chapter 01 (`.../tsuihou-tamer-no-ntr-fukushuudan-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tsuihou Tamer no NTR Fukushuudan, URL=`.../tsuihou-tamer-no-ntr-fukushuudan` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../thumbnail.webp <redacted query values: resize>` (image/jpeg, 43894 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tsuihou-tamer-no-ntr-fukushuudan` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../thumbnail.webp <redacted query values: resize>` (image/jpeg, 16186 bytes, 165x225) |  |  |  |
| details author | PASS | Eltoria |  |  |  |
| details artist | PASS | Eltoria |  |  |  |
| details genres | PASS | Ahegao, Big breasts, Nakadashi, Netorare, Rape, Manga |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Balas dendam NTR Sang Penjinak yang Diasingkan<br><br>Alternative Names: The Exiled Tamer’s NTR Revenge, NTR Revenge of the Banished Tamer |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://linksaya.com/.../2.jpg` (image/jpeg, 541706 bytes, 2266x3200) |  |  |  |
