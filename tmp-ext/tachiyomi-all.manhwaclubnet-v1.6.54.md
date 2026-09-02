# Extension Validation Report

- Extension: tachiyomi-all.manhwaclubnet-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 6720687475375335817
- Source name: ManhwaClub.net
- Source language: en
- Selected manga input: popular offset 0: Secret Class (`.../444`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Secret Class (`.../444`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Small Beast (`.../1976`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Money Games (`.../2351`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The owner of the deserted island (`.../2475`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 9 | Secret Class (`.../444`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class (`.../444`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 311 | Chapter 1 (`.../chapter-1`) |  | <1s |
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
| chapters | PASS | 311 chapters |  |  |  |
| chapter dates | LINT | 23 of 311 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=23 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `http://manhwaclub.net/.../1.jpg` (image/jpeg, 92366 bytes, 720x880) |  |  |  |
