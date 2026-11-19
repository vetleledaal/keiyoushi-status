# Extension Validation Report

- Extension: tachiyomi-pt.timelinecomics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 28
- Lint: 2
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7115586439863780878
- Source name: Timeline Comics
- Source language: pt-BR
- Selected manga input: popular offset 0: Amazing Spider-Man - 1963 (Marvel) (`.../homem-aranha.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Amazing Spider-Man - 1963 (Marvel) (`.../homem-aranha.html`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Lights Out - 2013 (DC) (`.../event-lights-out-dc.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Amazing X-Men - 2014 (Marvel) (`.../amazing-x-men-volume-2-marvel.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Amazing Spider-Man - 1963 (Marvel) (`.../homem-aranha.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Amazing Spider-Man - 1963 (Marvel) (`.../homem-aranha.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 673 | 01 HQ EM VIDEO (`.../open <redacted query values: id>`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.io.IOException: This file isn't available on Google Drive | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.io.IOException: This file isn't available on Google Drive | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Amazing Spider-Man - 1963 (Marvel), URL=`.../homem-aranha.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../Amazing_Spider-Man_Vol_1_1.jpg` (image/jpeg, 50692 bytes, 300x449) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../homem-aranha.html` |  |  |  |
| details thumbnail URL | PASS | `https://blogger.googleusercontent.com/.../Amazing_Spider-Man_Vol_1_1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Homem Aranha |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 673 chapters |  |  |  |
| chapter dates | LINT | All 673 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=673 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | This file isn't available on Google Drive |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
