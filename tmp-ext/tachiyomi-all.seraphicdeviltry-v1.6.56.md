# Extension Validation Report

- Extension: tachiyomi-all.seraphicdeviltry-v1.6.56
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5395306515630347602
- Source name: SeraphicDeviltry
- Source language: en
- Selected manga input: popular offset 0: Heartless (`.../6885`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Heartless (`.../6885`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 11 | Somaru (`.../6836`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Haiyuki no Machi no Sabaaka (`.../7332`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 11 | Somaru (`.../6836`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Heartless (`.../6885`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Heartless (`.../6885`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Heartless, URL=`6885` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 71/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://seraphic-deviltry.com/.../cover-heartless-175x238.jpg` (image/jpeg, 13514 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `6885` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://seraphic-deviltry.com/.../cover-heartless.jpg` (image/jpeg, 18293 bytes, 185x260) |  |  |  |
| details author | PASS | NISHIN Masumi |  |  |  |
| details artist | PASS | NISHIN Masumi |  |  |  |
| details genres | PASS | Horror, Smut, Supernatural, Tragedy, Yaoi, Completed, Japanese Manga – Read from right to left |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | A beautiful “incubus” luring humans with his looks and eating them lives in the present age. With him lives his “lover,” a man called Manuel. Before the two living quietly in the woods, appears a self-entitled heresy hunting cult…<br><br>Drawn with overwhelming reality, a never-before-experienced survivor horror BL |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://seraphic-deviltry.com/.../%5BSDS%5D-Heartless---Chapter-1---001.jpg` (image/jpeg, 115893 bytes, 700x500) |  |  |  |
