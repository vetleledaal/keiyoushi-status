# Extension Validation Report

- Extension: tachiyomi-en.toonizy-v1.6.60
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source theme: madara
- Source ID: 5404499323728358840
- Source name: Toonizy
- Source language: en
- Selected manga input: popular offset 0: My Stepmom (`.../626`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | My Stepmom (`.../626`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | The Perfect Roommates (`.../778`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | The Unknown Plague (`.../2670`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Wife for 1000 Days (`.../2376`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | My Stepmom’s Plan (`.../838`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Stepmom (`.../626`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 52 | Prologue - My Stepmom (`.../p626-ch-prologue-eb80de3`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 17 |  |  | 10s+ |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=My Stepmom, URL=`626` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 102/102 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 102/102 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://toonizy.com/.../thumbnail-175x238.jpg` (image/jpeg, 8230 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `626` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://toonizy.com/.../thumbnail-193x278.jpg` (image/jpeg, 10209 bytes, 193x278) |  |  |  |
| details author | PASS | Andromeda11 |  |  |  |
| details artist | PASS | Andromeda11 |  |  |  |
| details genres | PASS | Comedy, Drama |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | My stepmom is 10 years older than me, but she doesn’t look like it… And she seems to be hiding a secret?! I wonder what it is…<br><br>Alternative Names: My Stepmom |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | PASS | 52 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://toonizy.com/.../001.jpg` to `https://cdn.toonizy.com/.../001.jpg` (1 redirects); popular: `https://toonizy.com/.../thumbnail-175x238.jpg` to `https://cdn.toonizy.com/.../thumbnail-175x238.jpg` (1 redirects) |  |  |  |
| page load | PASS | `https://toonizy.com/.../001.jpg` (image/jpeg, 193967 bytes, 720x3400) |  |  |  |
