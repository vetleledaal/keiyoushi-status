# Extension Validation Report

- Extension: tachiyomi-all.hentaienvy-v1.6.11
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: galleryadults
- Source ID: 8073115021554725655
- Source name: HentaiEnvy
- Source language: en
- Selected manga input: popular offset 0: Artist - Nia4294 (`.../1569763`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | Artist - Nia4294 (`.../1569763`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | [Juicebox Koujou (Juna Juna Juice) Boku No Harem Academia (+ BONUS) "Bakugou Mama to no Natsuyasumi Kouhen Ge" (`.../1550184`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | [Kamejirouya-san (Kametaro)] Taihai Tsuma 2 Taihaikei Hitozuma o Yachin Kawari ni Koki Tsukaeru Hanashi (Horrible MTL) / Desparate Scans (`.../1622222`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | Freshly Squeezed Art (`.../1622086`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Artist - Nia4294 (`.../1569763`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../1569763`) |  | <1s |
| pages | `getPageList(chapter)` | success | 337 |  |  | <1s |

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
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 112/112 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 112/112 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://m11.hentaienvy.com/.../thumb.jpg` (image/jpeg, 54036 bytes, 250x353) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1569763` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | nia4294 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big ass, big breasts, big penis, blowjob, bodysuit, dark skin, eye-covering bang, ghost, huge breasts, latex, masturbation, milf, paizuri, pregnant, very long hair, western imageset |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Languages**: english<br><br>**Category**: western<br><br>**Pages**: 337 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 337 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://m11.hentaienvy.com/.../1.webp` (image/webp (encoding: lossy), 263756 bytes, 1280x1810) |  |  |  |
