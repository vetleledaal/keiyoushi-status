# Extension Validation Report

- Extension: tachiyomi-en.guya-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 3
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: guya
- Source ID: 4637971935551651734
- Source name: Guya
- Source language: en
- Selected manga input: popular offset 0: Kaguya Wants To Be Confessed To Official Doujin (`.../Kaguya-Wants-To-Be-Confessed-To-Official-Doujin`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 6 | Kaguya Wants To Be Confessed To Official Doujin (`.../Kaguya-Wants-To-Be-Confessed-To-Official-Doujin`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 6 | Renai Daikou (`.../Renai-Daikou`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Kaguya Wants To Be Confessed To Official Doujin (`.../Kaguya-Wants-To-Be-Confessed-To-Official-Doujin`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kaguya Wants To Be Confessed To Official Doujin (`.../Kaguya-Wants-To-Be-Confessed-To-Official-Doujin`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 35 | 1 - The Student Council Boys Want to Tell Her (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 6 entries |  |  |  |
| latest listing | PASS | 6 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kaguya Wants To Be Confessed To Official Doujin, URL=`Kaguya-Wants-To-Be-Confessed-To-Official-Doujin` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 13/13 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 13/13 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://guya.cubari.moe/.../04.png` (image/png, 3848810 bytes, 1436x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `Kaguya-Wants-To-Be-Confessed-To-Official-Doujin` |  |  |  |
| details thumbnail URL | PASS | `https://guya.cubari.moe/.../04.png` |  |  |  |
| details author | PASS | Sakayama Shinta |  |  |  |
| details artist | PASS | Sakayama Shinta |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | "Kaguya Wants to Be Confessed to" is a manga about “the war of love and brains” between two high school geniuses who try to make the other confess. This, however, is an "ero spinoff" that’ll make you wish it were part of the main series! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | PASS | 35 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://guya.cubari.moe/.../01.png` (image/png, 923271 bytes, 800x1142) |  |  |  |
