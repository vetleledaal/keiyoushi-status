# Extension Validation Report

- Extension: tachiyomi-en.deathtollscans-v1.6.6
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: foolslide
- Source ID: 4722346859737894698
- Source name: Death Toll Scans
- Source language: en
- Selected manga input: popular offset 0: A Diary of Embellished Patches (`.../a_diary_of_embellished_patches`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | A Diary of Embellished Patches (`.../a_diary_of_embellished_patches`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | God, you bastard, I wanna kill you! (`.../god_you_bastard_i_wanna_kill_you`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 9 | The Chronicle of Seven Cities (`.../the_chronicle_of_seven_cities`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 13 | D.Diver (`.../ddiver`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Diary of Embellished Patches (`.../a_diary_of_embellished_patches`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Diary of Embellished Patches (`.../a_diary_of_embellished_patches`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 1st Story: Pond (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | <1s |

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
| latest listing | PASS | 9 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Diary of Embellished Patches, URL=`.../a_diary_of_embellished_patches` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Ka「」Ku「」Shi「」Go「」To「, URL=`.../kakushigoto` at page 1 offsets 2, 7 and page 2 offsets 1, 3, 7, 9, 11, title=Textbook of Revenge, URL=`.../textbook_of_revenge` at page 1 offset 3 and page 2 offset 5, title=D.Diver, URL=`.../ddiver` at page 1 offsets 4, 6, 8 and page 2 offsets 0, 2, 4, 6, 8, 10, 12 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 3 manga entries; Latest page 2 repeats 10 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 48/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reader.deathtollscans.net/.../Cover.png` (image/png, 1547871 bytes, 987x1400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a_diary_of_embellished_patches` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://reader.deathtollscans.net/.../thumb_Cover.png` (image/png, 95663 bytes, 177x250) |  |  |  |
| details author | PASS | Itou Junji |  |  |  |
| details artist | PASS | Itou Junji |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A short anthology of horror stories by the acclaimed mangaka of the genre. Not all of them, and perhaps just the first, will be done by Death Toll. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://reader.deathtollscans.net/.../A%20Diary%20of%20Embellished%20Patches%20Story%201%20by%20Death%20Toll%20Scanlations%20page%2001.png` (image/png, 1886820 bytes, 1653x2400) |  |  |  |
