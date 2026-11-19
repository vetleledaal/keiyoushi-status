# Extension Validation Report

- Extension: tachiyomi-all.seinagi-v1.6.7
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: foolslide
- Source ID: 89967806248598714
- Source name: Seinagi
- Source language: en
- Selected manga input: popular offset 0: Boku wa Tomodachi ga Sukunai Biyori (`.../boku_wa_tomodachi_ga_sukunai_biyori`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Boku wa Tomodachi ga Sukunai Biyori (`.../boku_wa_tomodachi_ga_sukunai_biyori`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 13 | Sakura Sakura (Morishige) (`.../sakura_sakura_morishige`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 22 | Ninomae Shii no Tsukai Kata (`.../ninomae_shii_no_tsukai_kata`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Boku wa Tomodachi ga Sukunai Biyori (`.../boku_wa_tomodachi_ga_sukunai_biyori`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Boku wa Tomodachi ga Sukunai Biyori (`.../boku_wa_tomodachi_ga_sukunai_biyori`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | Chapter 1: Club Video Plan (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 13 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Boku wa Tomodachi ga Sukunai Biyori, URL=`.../boku_wa_tomodachi_ga_sukunai_biyori` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Sakura Sakura (Morishige), URL=`.../sakura_sakura_morishige` at page 1 offsets 0, 2, 4, 7, 9 and page 2 offsets 2, 12, 19, title=Boku wa Tomodachi ga Sukunai Biyori, URL=`.../boku_wa_tomodachi_ga_sukunai_biyori` at page 1 offsets 1, 3, 5, 8 and page 2 offset 1, title=Hana to Harinezumi, URL=`.../hana_to_harinezumi` at page 1 offset 10 and page 2 offsets 5, 7, 13, 16, 20, title=Ninomae Shii no Tsukai Kata, URL=`.../ninomae_shii_no_tsukai_kata` at page 1 offset 12 and page 2 offsets 0, 8 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 8 manga entries; Latest page 2 repeats 15 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 46/46 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 9/46 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reader.seinagi.org.es/.../haganai-hiyori.jpg` (image/jpeg, 157301 bytes, 343x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../boku_wa_tomodachi_ga_sukunai_biyori` |  |  |  |
| details thumbnail URL | PASS | `https://reader.seinagi.org.es/.../haganai-hiyori.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | The successor of Shobon, Boku wa Tomodachi ga Sukunai Hiyori is a collection of oneshots about the Neighbor's Club's activities. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://reader.seinagi.org.es/.../00a.jpg` (image/jpeg, 329221 bytes, 700x1000) |  |  |  |
