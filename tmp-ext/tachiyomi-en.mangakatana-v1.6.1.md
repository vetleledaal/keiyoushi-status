# Extension Validation Report

- Extension: tachiyomi-en.mangakatana-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3170561626848540385
- Source name: MangaKatana
- Source language: en
- Selected manga input: popular offset 0: "Aishiteru", Uso Dakedo. (`.../aishiteru-uso-dakedo.10797`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | "Aishiteru", Uso Dakedo. (`.../aishiteru-uso-dakedo.10797`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 19 | (Tomato that is) Going Bad (`.../tomato-that-is-going-bad.1976`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Dai Dark (`.../dai-dark.22430`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Gal and otaku can't understand each other (`.../gal-and-otaku-cant-understand-each-other.17319`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | "Aishiteru", Uso Dakedo. (`.../aishiteru-uso-dakedo.10797`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Chapter 1 : Story 1 (`.../c1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| thumbnail | PASS | `https://mangakatana.com/.../39bbc.jpg` (image/jpeg, 28022 bytes, 225x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../aishiteru-uso-dakedo.10797` |  |  |  |
| details thumbnail URL | PASS | `https://mangakatana.com/.../39bbc.jpg` |  |  |  |
| details author | PASS | Mitsuki Miko |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, School Life, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | From Chibi Manga: He's a liar. He's a player. He's the worst. Even if I knew that...why did I fall in love with him? This is the story about the encounter between a charismatic handsome boy and a serious girl...<br><br>Alt name(s): 「愛してる」、嘘だけど。 ; 虽然爱你是谎言 ; "Aishiteru", Uso dakedo ; "Aishiteru," Uso Da Kedo. ; "Aishiteru," Uso Dakedo. ; "I Love You," but It's a Lie. ; Aishiteru, Uso dakedo ; I Love You..., But It's a Lie |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mangakatana.com/.../1 <redacted query values: search and search_by>` to `https://mangakatana.com/.../aishiteru-uso-dakedo.10797` (1 redirects) |  |  |  |
| page load | PASS | `https://i1.mangakatana.com/.../0.jpg` (image/jpeg, 106695 bytes, 750x612; server Content-Type: application/octet-stream) |  |  |  |
