# Extension Validation Report

- Extension: tachiyomi-en.asuratoons-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 1355417827809951744
- Source name: Asuratoons (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Currently Filming (`.../currently-filming`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Currently Filming (`.../currently-filming`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Me and the Prez, Drinking Under the Stars (`.../me-and-the-prez-drinking-under-the-stars`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Lust [Lezhin] (`.../lust-lezhin`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Ogh Reboot (`.../ogh-reboot`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Currently Filming (`.../currently-filming`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Currently Filming (`.../currently-filming`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Chapter 1 (`.../currently-filming-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Currently Filming, URL=`currently-filming` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://objects.asurassets.shop/.../cover.webp` (image/webp (encoding: lossy), 10560 bytes, 219x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `currently-filming` |  |  |  |
| details thumbnail URL | PASS | `https://objects.asurassets.shop/.../cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Mature |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The moment he took pictures of the women at the academy using a mysterious camera he had stumbled upon, their attitudes suddenly changed?!  “Wh-What did… I just see?!”<br><br>**Alternative Names:**<br>- En Plena Grabación / 촬영 중입니다 / Actualmente estamos filmando / We are currently filming. / Filming in progress |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://objects.asurassets.shop/.../1.webp` (image/webp (encoding: lossy), 423992 bytes, 1080x9000) |  |  |  |
