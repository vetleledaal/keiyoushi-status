# Extension Validation Report

- Extension: tachiyomi-en.inkr-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6949560025265725268
- Source name: INKR
- Source language: en
- Selected manga input: popular offset 0: Private School (`.../ik-title-46`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Private School (`.../ik-title-46`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | success | 20 | Descendants — Dizzy's New Fortune (`.../ik-title-29`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Elemental Kings (`.../ik-title-362`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | success | 20 | Yanagihara Is a Sex Addict. (`.../ik-title-2466`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Private School (`.../ik-title-46`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Private School (`.../ik-title-46`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Vol.1 Chapter 1: We're Looking For A Few Good Men (`.../ik-chapter-1442`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Private School, URL=`ik-title-46` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=A Tail's Tale, URL=`ik-title-4207` at page 1 offset 19 and page 2 offset 17 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.inkr.com/.../900.jpg` (image/jpeg, 59734 bytes, 520x780) |  |  |  |
| details identity | PASS | Details preserved selected URL `ik-title-46` |  |  |  |
| details thumbnail URL | PASS | `https://i1.inkr.com/.../900.jpg` |  |  |  |
| details author | PASS | Tokyopop, Brandon Montclare, Michael Sheifer |  |  |  |
| details artist | PASS | Tokyopop, Brandon Montclare, Michael Sheifer |  |  |  |
| details genres | PASS | Manga, Action, Comedy, Ecchi, School, Military, Teen Boys |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | After Black Ops special forces face budget cuts, the nation turns to the education sector to save it<br>A training facility is disguised as an elite school, with its members posing as high school students<br>Military personnel engage in goofy and raunchy situations to perfect the illusion of a teenage world |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.inkr.com/.../w1600.ikc` (image/webp (container: extended), 288496 bytes, 1500x2231; server Content-Type: application/octet-stream) |  |  |  |
