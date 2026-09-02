# Extension Validation Report

- Extension: tachiyomi-en.monochromescans-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6808348229250819000
- Source name: Monochrome Scans
- Source language: en
- Selected manga input: popular offset 0: Patchwork Future (`.../79141782-bc73-44fe-a1b2-eff842ca6123`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 5 | Patchwork Future (`.../79141782-bc73-44fe-a1b2-eff842ca6123`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Patchwork Future (`.../79141782-bc73-44fe-a1b2-eff842ca6123`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Patchwork Future (`.../79141782-bc73-44fe-a1b2-eff842ca6123`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 24 | Chapter 1 - The Miraculous Childhood Friends (`.../8176da5d-f19d-413b-85e3-a4626eb9f268%7C1%7C124`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 124 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Patchwork Future, URL=`79141782-bc73-44fe-a1b2-eff842ca6123` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 6/6 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 6/6 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.manga.d34d.one/.../cover.jpg <redacted query values: version>` (image/jpeg, 201473 bytes, 960x1280) |  |  |  |
| details identity | PASS | Details preserved selected URL `79141782-bc73-44fe-a1b2-eff842ca6123` |  |  |  |
| details thumbnail URL | PASS | `https://api.manga.d34d.one/.../cover.jpg <redacted query values: version>` |  |  |  |
| details author | PASS | Yayoi Sou |  |  |  |
| details artist | PASS | Yayoi Sou |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | From the creator of ReLIFE, YayoiSo, comes a long-awaited new series overflowing with love and sadness. The story is about three childhood friends - Haruta, Izumi, and Ichika - who were all seriously injured while trespassing into a scrapyard. Twelve years later, after being in the same school and class since kindergarten, they are now working together in the same company and department. The manga follows their miraculous recovery and bond, as well as the tender lies and hidden secrets. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | PASS | 24 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 124 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://api.manga.d34d.one/.../1.jpg <redacted query values: version>` (image/jpeg, 100759 bytes, 800x1200) |  |  |  |
