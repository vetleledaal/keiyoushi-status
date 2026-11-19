# Extension Validation Report

- Extension: tachiyomi-en.ohjoysextoy-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 3
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4502591927177845825
- Source name: Oh Joy Sex Toy
- Source language: en
- Selected manga input: popular offset 0: Sex Drive Differences (`.../sex-drive-differences-tessa-luicart`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 84 | Sex Drive Differences (`.../sex-drive-differences-tessa-luicart`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 84 | Critical Hit (`.../critical-hit-shyle-zalewski`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 4 | Sex Drive Differences (`.../sex-drive-differences-tessa-luicart`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 84 | Sex Drive Differences (`.../sex-drive-differences-tessa-luicart`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sex Drive Differences (`.../sex-drive-differences-tessa-luicart`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oh Joy Sex Toy - Sex Drive Differences by Tessa Luicart (`.../sex-drive-differences-tessa-luicart`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 84 entries |  |  |  |
| latest listing | PASS | 4 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sex Drive Differences, URL=`.../sex-drive-differences-tessa-luicart` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 256/256 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 172/256 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.ohjoysextoy.com/.../SexDriveDifferences__OJST_preview-sm.png` (image/png, 33117 bytes, 396x396) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sex-drive-differences-tessa-luicart` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.ohjoysextoy.com/.../SexDriveDifferences__twitter.jpg` (image/jpeg, 107503 bytes, 1200x630) |  |  |  |
| details author | PASS | Tessa Luicart |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comic, Guest Comics, Non-Fiction Comics, Sex & Sexuality, Shareable Comics, Transcribed |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Tess Luicart's libido is pretty high. Their girlfriend's, however, is pretty low. How can an otherwise compatible couple navigate this kind of conflict? LET'S FIND OUT, in today wonderful autiobio comic!...<br><br>Instagram: https://www.instagram.com/.../that.artist.tess<br>LinkTr.ee: https://linktr.ee/.../that.artist.tess<br>Portfolio: https://tessaluicart.carrd.co<br><br>(Full description and credits in WebView) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.ohjoysextoy.com/.../1` to `https://www.ohjoysextoy.com/.../comic` (1 redirects) |  |  |  |
| page load | PASS | `https://www.ohjoysextoy.com/.../2026-11-17-Sex-Drive-Differences-Tessa-Luicart-1.png` (image/png, 741211 bytes, 1536x2718) |  |  |  |
