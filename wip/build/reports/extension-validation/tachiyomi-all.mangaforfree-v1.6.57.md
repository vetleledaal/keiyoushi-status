# Extension Validation Report

- Extension: tachiyomi-all.mangaforfree-v1.6.57
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: madara
- Source ID: 7450882931813509619
- Source name: MangaForFree.net
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../760`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Secret Class (`.../760`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Absolute Hypnosis in Another World (`.../633`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | It’s A Lie, But It’s Okay (`.../26802`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Taming A Female Bully (`.../25860`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 9 | Secret Class (`.../760`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../760`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 325 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`760` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 109/109 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 109/109 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaforfree.net/.../Secret-Class-manga-Net-175x238.jpg` (image/jpeg, 11677 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `760` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangaforfree.net/.../Secret-Class-manga-Net-193x278.jpg` (image/jpeg, 14354 bytes, 193x278) |  |  |  |
| details author | PASS | Gang-cheol Wang |  |  |  |
| details artist | PASS | Minachan |  |  |  |
| details genres | PASS | Adult, Comedy, Drama, Manhwa, Mature, Romance, Seinen, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Description Secret Class: Dae Ho, who became an orphan at the age of 13, was adopted by his father’s friend. However, Dae Ho in adulthood knew nothing about the relationship between men and women. Aunt and sisters decided to give pure Dae Ho a secret class… This story is about a wife of two cheating on her husband with whom she has two daughters and a boy they took in.<br><br>Alternative Names: Bimilsueop ; 비밀 수업 ; 秘密教學 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 325 chapters |  |  |  |
| chapter dates | PASS | 325 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangaforfree.net/.../1.jpg` (image/jpeg, 92366 bytes, 720x880) |  |  |  |
