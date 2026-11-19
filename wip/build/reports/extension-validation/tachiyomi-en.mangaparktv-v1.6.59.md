# Extension Validation Report

- Extension: tachiyomi-en.mangaparktv-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 4265503553734005106
- Source name: MangaPark.tv (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Jinx (Uncensored) (`.../282`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Jinx (Uncensored) (`.../282`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Paws & Claws (Uncensored) (`.../264`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | See You My King (`.../138`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Prison Breakfast (Uncensored) (`.../256`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Jinx (Uncensored) (`.../282`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (Uncensored) (`.../282`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 217 | Chapter 1 (`.../jinx-uncensored-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jinx (Uncensored), URL=`282` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangapark.tv/.../jinx-49109-193x278-282-175x238.avif` (image/avif (format: avif), 10021 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `282` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangapark.tv/.../jinx-49109-193x278-282.avif` (image/avif (format: avif), 30661 bytes, 193x278) |  |  |  |
| details author | PASS | Mingwa |  |  |  |
| details artist | PASS | Mingwa |  |  |  |
| details genres | PASS | BL, BL Uncensored, Yaoi, Manhwa, Webtoons |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Jinx (Uncensored)<br><br>Physical therapist Kim Dan has been down on his luck for as long as he can remember. Between an ailing grandmother, menacing loansharks, and an old boss making it almost impossible for him to find work, Dan is truly running out of options. Naturally, it feels like a dream come true when he’s finally hired to treat top-paid MMA fighter Joo Jaekyung, especially when the man then calls him out for a treatment the night before a match with an oh-so-tantalizing offer of five thousand dollars. He claims to have a “jinx” in need of a particular type of “treatment,” but it’s one that Dan isn’t quite prepared to offer… You see, Jaekyung may be a beast in the ring, but he’s even rougher in the bedroom, and Dan’s not sure he can survive Jaekyung at his most primal. Nevertheless, the promise of much-needed cash has Dan agreeing to this ill-fated deal… Could a night together be the thing to help Jaekyung break this jinx once and for all?Show more Show more |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 217 chapters |  |  |  |
| chapter dates | PASS | 217 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangapark.tv/.../1-1-000001.jpg` (image/jpeg, 752572 bytes, 3000x1500) |  |  |  |
