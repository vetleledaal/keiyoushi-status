# Extension Validation Report

- Extension: tachiyomi-en.multporn-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1483013328567191791
- Source name: Multporn
- Source language: en
- Selected manga input: latest offset 0: More than Pals (`.../more_than_pals`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | Sultry Summer Book 1 (`.../sultry_summer_book_1 <redacted query values: r>`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 15 | Double Trouble - Incognitymous (`.../double_trouble_incognitymous <redacted query values: r>`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 15 | More than Pals (`.../more_than_pals`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | Upgrades - Tiddybaa (`.../upgrades_tiddybaa`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | More than Pals (`.../more_than_pals`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | More than Pals (`.../more_than_pals`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter (`.../more_than_pals`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | <1s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=More than Pals, URL=`.../more_than_pals` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 62/62 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 62/62 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://multporn.net/.../more_than_pals_sehkmet_covers.png <redacted query values: itok>` (image/jpeg, 104534 bytes, 391x558; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../more_than_pals` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Kinkymation |  |  |  |
| details artist | PASS | Kinkymation |  |  |  |
| details genres | PASS | Erotic, Fantasy, Romance, Straight, Furry, Oral, Blowjob, Deepthroat, Creampie, Big Ass, X-Ray, Palworld |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Section:<br>Palworld<br><br>Pages:<br>11 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://multporn.net/.../sehkmet_covers.png` (image/png, 1025893 bytes, 723x1024) |  |  |  |
