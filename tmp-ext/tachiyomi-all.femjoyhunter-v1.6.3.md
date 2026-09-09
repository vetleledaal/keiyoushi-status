# Extension Validation Report

- Extension: tachiyomi-all.femjoyhunter-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: masonry
- Source ID: 9185590742756804817
- Source name: Femjoy Hunter
- Source language: all
- Selected manga input: popular offset 0: Lana Lane amazes us by revealing her love holes and breasts but also her sexy feet after divesting in a fitness (`.../lana-lane-amazes-us-by-revealing-her-love-holes-and-breasts-but-also-her-sexy-feet-66646`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Lana Lane amazes us by revealing her love holes and breasts but also her sexy feet after divesting in a fitness (`.../lana-lane-amazes-us-by-revealing-her-love-holes-and-breasts-but-also-her-sexy-feet-66646`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Luna Art in Red Lingerie from Femjoy (`.../luna-art-in-red-lingerie`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lana Lane amazes us by revealing her love holes and breasts but also her sexy feet after divesting in a fitness (`.../lana-lane-amazes-us-by-revealing-her-love-holes-and-breasts-but-also-her-sexy-feet-66646`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../lana-lane-amazes-us-by-revealing-her-love-holes-and-breasts-but-also-her-sexy-feet-66646`) |  | <1s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | HTTP error 403 |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 40/40 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 40/40 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.femjoyhunter.com/.../18845_masonry_1200.jpg` (image/jpeg, 426660 bytes, 1200x1745) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../lana-lane-amazes-us-by-revealing-her-love-holes-and-breasts-but-also-her-sexy-feet-66646` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Lana Lane |  |  |  |
| details artist | PASS | Lana Lane |  |  |  |
| details genres | PASS | Feet, Short Hair |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Lana Lane amazes us by revealing her love holes and breasts but also her sexy feet after divesting in a fitness |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.femjoyhunter.com/.../1` to `https://www.femjoyhunter.com/.../newest` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.femjoyhunter.com/.../0006-01_1800.jpg` (image/jpeg, 287163 bytes, 1800x1198) |  |  |  |
