# Extension Validation Report

- Extension: tachiyomi-en.hentaisco-v1.6.54
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
- Source implementation: keiyoushi.source.Generated
- Source ID: 6741034623728813910
- Source name: HentaiSco
- Source language: en
- Selected manga input: popular offset 0: Secret Class Uncensored (`.../3014`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Secret Class Uncensored (`.../3014`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | New Town (`.../1918`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | I Banged All My Classmates After Graduation (`.../4886`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | True or False? (Uncensored) (`.../4314`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Secret Class Uncensored (`.../3014`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class Uncensored (`.../3014`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 171 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 68 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class Uncensored, URL=`3014` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaisco.cc/.../secret-class-uncensored-175x238.jpg` (image/jpeg, 8265 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `3014` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaisco.cc/.../secret-class-uncensored.jpg` (image/jpeg, 14944 bytes, 250x350) |  |  |  |
| details author | PASS | Wang Kang Cheol |  |  |  |
| details artist | PASS | Mina-chan |  |  |  |
| details genres | PASS | Harem, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dae Ho, who became an orphan at the age of 13, was adopted by his father’s friend. However, Dae Ho in adulthood knew nothing about the relationship between men and women. Aunt and sisters decided to give pure Dae Ho a secret class…<br><br>Alternative Names: Secret Class, Bimilsueop ; 비밀 수업 ; 秘密教學 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 171 chapters |  |  |  |
| chapter dates | LINT | 101 of 171 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=101 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.hentaisco.com/.../01.jpg` (image/jpeg, 67247 bytes, 648x1229) |  |  |  |
