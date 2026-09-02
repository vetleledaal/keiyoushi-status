# Extension Validation Report

- Extension: tachiyomi-en.mangakatana-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3170561626848540385
- Source name: MangaKatana
- Source language: en
- Selected manga input: latest offset 0: The Angel Next Door Spoils Me Rotten: After the Rain (`.../the-angel-next-door-spoils-me-rotten-after-the-rain.27195`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | "Aishiteru", Uso Dakedo. (`.../aishiteru-uso-dakedo.10797`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 19 | (Tomato that is) Going Bad (`.../tomato-that-is-going-bad.1976`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | The Angel Next Door Spoils Me Rotten: After the Rain (`.../the-angel-next-door-spoils-me-rotten-after-the-rain.27195`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | The S-Classes That I Raised (`.../the-s-classes-that-i-raised.26037`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Angel Next Door Spoils Me Rotten: After the Rain (`.../the-angel-next-door-spoils-me-rotten-after-the-rain.27195`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 46 | Chapter 1: Out of Season (`.../c1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 79/79 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 79/79 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangakatana.com/.../1560f.jpg` (image/jpeg, 29577 bytes, 230x325) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-angel-next-door-spoils-me-rotten-after-the-rain.27195` |  |  |  |
| details thumbnail URL | PASS | `https://mangakatana.com/.../1560f.jpg` |  |  |  |
| details author | PASS | Puyo, Saeki-San |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Shounen, Romance, Comedy, School Life, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A spin-off of the series The Angel Next Door Spoils Me Rotten which comicalizes the stories from Volume 5.5 of the Light Novel and its special edition booklet, which contains additional short stories.<br><br>Alt name(s): お隣の天使様にいつの間にか駄目人間にされていた件 after the rain ; Otonari no Tenshi-sama ni Itsu no Ma ni ka Dame Ningen ni Sareteita Ken: After the Rain |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | PASS | 46 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i1.mangakatana.com/.../0.jpg` (image/jpeg, 289546 bytes, 1200x1707; server Content-Type: application/octet-stream) |  |  |  |
