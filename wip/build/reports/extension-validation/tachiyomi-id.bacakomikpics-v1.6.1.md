# Extension Validation Report

- Extension: tachiyomi-id.bacakomikpics-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3514720791890439676
- Source name: BacaKomik.pics
- Source language: id
- Selected manga input: popular offset 0: Mertua Doyan Tubuh Menantu (Tsumibukai yokubō) (`.../mertua-doyan-tubuh-menantu-tsumibukai-yokubo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Mertua Doyan Tubuh Menantu (Tsumibukai yokubō) (`.../mertua-doyan-tubuh-menantu-tsumibukai-yokubo`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Vagina Saudari Tiriku Ingin Aku Sodok (`.../vagina-saudari-tiriku-ingin-aku-sodok`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Nenekku Mudah Sekali Crot (`.../nenekku-mudah-sekali-crot`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mertua Doyan Tubuh Menantu (Tsumibukai yokubō) (`.../mertua-doyan-tubuh-menantu-tsumibukai-yokubo`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mertua Doyan Tubuh Menantu (Tsumibukai yokubō) (`.../mertua-doyan-tubuh-menantu-tsumibukai-yokubo`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 22 | CHAPTER 1 (`.../mertua-doyan-tubuh-menantu-tsumibukai-yokubo-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 87 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mertua Doyan Tubuh Menantu (Tsumibukai yokubō), URL=`.../mertua-doyan-tubuh-menantu-tsumibukai-yokubo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 71/71 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 71/71 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bacakomik.pics/.../sinful-lust.jpg` (image/jpeg, 90548 bytes, 559x559) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mertua-doyan-tubuh-menantu-tsumibukai-yokubo` |  |  |  |
| details thumbnail URL | PASS | `https://bacakomik.pics/.../sinful-lust.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Full Color, Smut, Uncensored |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | **Alternative Names:**<br>- Mertua Doyan Tubuh Menantu, Tsumibukai yokubō, Sinful Lust |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | LINT | All 22 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=22 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 87 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://warungkomikcdn.icu/.../KOMIKDEWASA.ART_KOMIKDEWASA.ART_Tsumibukai-yokubo-Chapter-1009.jpg` (image/jpeg, 391824 bytes, 600x849) |  |  |  |
