# Extension Validation Report

- Extension: tachiyomi-id.riztranslation-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7209416153926734838
- Source name: Riztranslation
- Source language: id
- Selected manga input: popular offset 0: Moon Light for (`.../64`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Moon Light for (`.../64`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Tonari no Gyaru ga Miyabi Sugiru!? (`.../34`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 12 | Moon Light for (`.../64`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Tagahumika (`.../1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Moon Light for (`.../64`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Moon Light for (`.../64`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 0 - Oneshot (`.../177`) |  | <1s |
| pages | `getPageList(chapter)` | success | 61 |  |  | <1s |

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
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Moon Light for, URL=`64` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Tagahumika, URL=`1` at page 1 offset 11 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 63/63 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 63/63 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://res.cloudinary.com/.../wsmvxvcr7hhnggbajkch.webp` (image/webp (container: extended), 248578 bytes, 1133x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `64` |  |  |  |
| details thumbnail URL | PASS | `https://res.cloudinary.com/.../wsmvxvcr7hhnggbajkch.webp` |  |  |  |
| details author | PASS | Poroyama Aki |  |  |  |
| details artist | PASS | Poroyama Aki |  |  |  |
| details genres | PASS | Drama, Romance, Slice of Life |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 61 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://res.cloudinary.com/.../k6wwcdwrndx7loyqs8ib.webp` (image/webp (container: extended), 264732 bytes, 1133x1600) |  |  |  |
