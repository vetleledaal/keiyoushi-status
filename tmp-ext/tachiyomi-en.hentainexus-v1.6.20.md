# Extension Validation Report

- Extension: tachiyomi-en.hentainexus-v1.6.20
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7719798645438596394
- Source name: HentaiNexus
- Source language: en
- Selected manga input: popular offset 0: Establishing an Isekai Harem With a Single Magic Wand Vol.1 (`.../14542`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Establishing an Isekai Harem With a Single Magic Wand Vol.1 (`.../14542`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | I Can't Get it Up Without Two Pairs of Big Breasts, So My Wife Brought Her Friend: Compilation (`.../20377`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Age Gap Couple: Mita and Urabayashi 1 (`.../22024`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | The Exiled Tamer’s NTR Revenge 4 (`.../21976`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Establishing an Isekai Harem With a Single Magic Wand Vol.1 (`.../14542`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Establishing an Isekai Harem With a Single Magic Wand Vol.1 (`.../14542`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../14542`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Establishing an Isekai Harem With a Single Magic Wand Vol.1, URL=`.../14542` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.hentainexus.com/.../001.png.thumb.jpg` (image/jpeg, 73374 bytes, 480x672) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../14542` |  |  |  |
| details thumbnail URL | PASS | `https://images.hentainexus.com/.../001.png.thumb.jpg` |  |  |  |
| details author | PASS | Kame Ranppa Hi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ahegao, busty, creampie, deity, dilf, fantasy, fingering, hentai, isekai, light hair, squirting, story arc, toys, uncensored, unlimited, very long hair, x-ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Magazine: Dascomi Vol.24<br>Parody: Original Work<br>Publisher: FAKKU<br>Pages: 21<br>Favorites: 387 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://images.hentainexus.com/.../001.webp` (image/webp (encoding: lossy), 370550 bytes, 1337x1920) |  |  |  |
