# Extension Validation Report

- Extension: tachiyomi-en.manhwaz-v1.6.44
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 651625426989893977
- Source name: ManhwaZ
- Source language: en
- Selected manga input: popular offset 0: Éminence Grise Female Lead Is Trying To Make Me Her Stepmom (`.../coffee-eminence-grise-female-lead-is-trying-to-make-me-her-stepmom`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Éminence Grise Female Lead Is Trying To Make Me Her Stepmom (`.../coffee-eminence-grise-female-lead-is-trying-to-make-me-her-stepmom`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Éminence Grise Female Lead Is Trying To Make Me Her Stepmom (`.../coffee-eminence-grise-female-lead-is-trying-to-make-me-her-stepmom`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Yuukoku No Rasputin (`.../comizy-mogmmm5j`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Éminence Grise Female Lead Is Trying To Make Me Her Stepmom (`.../coffee-eminence-grise-female-lead-is-trying-to-make-me-her-stepmom`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Éminence Grise Female Lead Is Trying To Make Me Her Stepmom (`.../coffee-eminence-grise-female-lead-is-trying-to-make-me-her-stepmom`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 119 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 135 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Éminence Grise Female Lead Is Trying To Make Me Her Stepmom, URL=`.../coffee-eminence-grise-female-lead-is-trying-to-make-me-her-stepmom` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 93/93 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 93/93 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.manhwaz.cc/.../coffee <redacted query values: url>` (image/webp (encoding: lossy), 13298 bytes, 225x324) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../coffee-eminence-grise-female-lead-is-trying-to-make-me-her-stepmom` |  |  |  |
| details thumbnail URL | PASS | `https://api.manhwaz.cc/.../coffee <redacted query values: url>` |  |  |  |
| details author | PASS | updating |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 119 chapters |  |  |  |
| chapter dates | LINT | All 119 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=119 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 135 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.manhwaz.cc/.../coffee <redacted query values: url>` (image/webp (encoding: lossy), 14412 bytes, 1500x1500) |  |  |  |
