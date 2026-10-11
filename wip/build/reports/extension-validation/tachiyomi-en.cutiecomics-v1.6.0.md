# Extension Validation Report

- Extension: tachiyomi-en.cutiecomics-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7821715230468497947
- Source name: Cutie Comics
- Source language: en
- Selected manga input: popular offset 0: TOMODACHI NO MAMA GA BOKU NO DEKACHIN DE IKIMAKUTTA HALLOWEEN (`.../22845-tomodachi-no-mama-ga-boku-no-dekachin-de-ikimakutta-halloween.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | TOMODACHI NO MAMA GA BOKU NO DEKACHIN DE IKIMAKUTTA HALLOWEEN (`.../22845-tomodachi-no-mama-ga-boku-no-dekachin-de-ikimakutta-halloween.html`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | success | 20 | IS THIS TRULY A PRAYER? | KORE WA HONTOU NI INORI NANO DESHOU KA? (`.../22825-is-this-truly-a-prayer-kore-wa-hontou-ni-inori-nano-deshou-ka.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | TOMODACHI NO MAMA GA BOKU NO DEKACHIN DE IKIMAKUTTA HALLOWEEN (`.../22845-tomodachi-no-mama-ga-boku-no-dekachin-de-ikimakutta-halloween.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | TOMODACHI NO MAMA GA BOKU NO DEKACHIN DE IKIMAKUTTA HALLOWEEN (`.../22845-tomodachi-no-mama-ga-boku-no-dekachin-de-ikimakutta-halloween.html`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../22845-tomodachi-no-mama-ga-boku-no-dekachin-de-ikimakutta-halloween.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 47 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=TOMODACHI NO MAMA GA BOKU NO DEKACHIN DE IKIMAKUTTA HALLOWEEN, URL=`.../22845-tomodachi-no-mama-ga-boku-no-dekachin-de-ikimakutta-halloween.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cutiecomics.com/.../1791709058_1.webp` (image/webp (encoding: lossy), 30486 bytes, 290x409) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../22845-tomodachi-no-mama-ga-boku-no-dekachin-de-ikimakutta-halloween.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cutiecomics.com/.../1791709124_1.jpg` (image/jpeg, 233635 bytes, 900x1275) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big Breasts, Bikini, Cheating, Collar, Cowgirl, Eye-Covering Bang, Facesitting, Kemonomimi, Lactation, Mosaic Censorship, Nakadashi, Rimjob, Rough Translation, Sole Female, Sole Male, Stockings, Sweating, Swimsuit, Multi-Work Series |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 47 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://cutiecomics.com/.../1` to `https://cutiecomics.com` (1 redirects); popular: `https://cutiecomics.com/.../2` to `https://cutiecomics.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://cutiecomics.com/.../1791709124_1.jpg` (image/jpeg, 233635 bytes, 900x1275) |  |  |  |
