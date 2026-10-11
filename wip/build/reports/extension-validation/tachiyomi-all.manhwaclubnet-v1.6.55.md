# Extension Validation Report

- Extension: tachiyomi-all.manhwaclubnet-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: madara
- Source ID: 6720687475375335817
- Source name: ManhwaClub.net
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../444`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Secret Class (`.../444`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Small Beast (`.../1976`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Pet Beastman (`.../2633`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Money Games (`.../2351`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 9 | Secret Class (`.../444`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../444`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 317 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class, URL=`444` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 109/109 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 109/109 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://manhwaclub.net/.../Secret-Class.jpg` (image/jpeg, 18772 bytes, 200x280) |  |  |  |
| details identity | PASS | Details preserved selected URL `444` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhwaclub.net/.../Secret-Class.jpg` (image/jpeg, 18772 bytes, 200x280) |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Mina-Chan |  |  |  |
| details genres | PASS | Adult, Drama, Manhwa, Mature, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dae Ho, who became an orphan at the age of 13, was adopted by his father’s friend. However, Dae Ho in adulthood knew nothing about the relationship between men and women. Aunt and sisters decided to give pure Dae Ho a secret class… This story is about a wife of two cheating on her husband with whom she has two daughters and a boy they took in.<br><br>Alternative Names: Bimilsueop ; 비밀 수업 ; 秘密教學; Kelas Rahasia; Kelas Tersembunyi |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 317 chapters |  |  |  |
| chapter dates | PASS | 317 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `http://manhwaclub.net/.../1.jpg` to `https://manhwaclub.net/.../1.jpg` (1 redirects); popular: `http://manhwaclub.net/.../Secret-Class.jpg` to `https://manhwaclub.net/.../Secret-Class.jpg` (1 redirects) |  |  |  |
| page load | PASS | `http://manhwaclub.net/.../1.jpg` (image/jpeg, 92366 bytes, 720x880) |  |  |  |
