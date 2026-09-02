# Extension Validation Report

- Extension: tachiyomi-en.manganow-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 855054225815309342
- Source name: MangaNow
- Source language: en
- Selected manga input: latest offset 0: Hiding Out in an Apocalypse (`.../hiding-out-in-an-apocalypse`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | Martial Peak (`.../martial-peak`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 16 | BLACK CLOVER (`.../black-clover`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 16 | Hiding Out in an Apocalypse (`.../hiding-out-in-an-apocalypse`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | Mightiest Melee Magician (`.../mightiest-melee-magician`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Hiding Out in an Apocalypse (`.../hiding-out-in-an-apocalypse`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Hiding Out in an Apocalypse (`.../hiding-out-in-an-apocalypse`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 43 | Chapter 0 (`.../chapter-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hiding Out in an Apocalypse, URL=`.../hiding-out-in-an-apocalypse` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../5974b1deba69da17_1717659011.webp <redacted query values: w and resize>` (image/jpeg, 33079 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hiding-out-in-an-apocalypse` |  |  |  |
| details thumbnail URL | PASS | `https://i2.wp.com/.../5974b1deba69da17_1717659011.webp <redacted query values: w and resize>` |  |  |  |
| details author | PASS | Road Warrior, DD |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Seinen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A brief description of the manhwa Hiding Out in an Apocalypse: Gyu Park is a survivor who predicted and prepared for the coming apocalypse. In this ruined world, he is willing to do anything and everything he can to protect the comforts of his bomb shelter.<br><br>Alternative Title: Hidden House in the Apocalypse, Hide Your House in the Apocalypse, Hiding Your Home in the Apocalypse, 아포칼립스에 집을 숨김 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 43 chapters |  |  |  |
| chapter dates | LINT | All 43 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=43 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | FAIL | First page URL `https://www.mangaread.org/.../3.jpeg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
