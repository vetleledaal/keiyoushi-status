# Extension Validation Report

- Extension: tachiyomi-all.lemoon-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2363849104410739815
- Source name: Lemoon
- Source language: all
- Selected manga input: popular offset 0: The Dreams (`.../1763060356`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | The Dreams (`.../1763060356`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Hamster Crickets (`.../8995573695955274531`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Ezely Out of Time (`.../1514642576150283211`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | The Dreams (`.../1763060356`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Dreams (`.../1763060356`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Prologue: Un drôle de rêve (`.../1763413563`) |  | <1s |
| pages | `getPageList(chapter)` | success | 66 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Dreams, URL=`1763060356` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.lemoon.io/.../691b027275552947555243.png` (image/png, 1135021 bytes, 960x1440) |  |  |  |
| details identity | PASS | Details preserved selected URL `1763060356` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.lemoon.io/.../691b027275552947555243.png` |  |  |  |
| details author | PASS | mlh22 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Slice Of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Deux amies prennent la décision de quitter leurs familles pour aller vivre un de leur rêve. Aller étudié dans un pays étranger, elles ont donc décidé d'aller en Corée du Sud un pays qui les attires depuis des années. Arrivée la bas, elles vont faire pleins de rencontres, des bonne comme des moins bonnes. Mais tout ne va pas se dérouler comme elles le pensaient. Leur vie d'étudiante va être très vite chamboulée. Que vont-elles choisir? Leur vie d'étudiante tranquille où suivre leur autre rêve?<br><br>**Language:** French |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 66 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.lemoon.io/.../691b02f6c6d18185132991.jpg` (image/jpeg, 60509 bytes, 940x2000) |  |  |  |
