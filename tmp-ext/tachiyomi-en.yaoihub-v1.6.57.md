# Extension Validation Report

- Extension: tachiyomi-en.yaoihub-v1.6.57
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
- Source ID: 6718273076571980404
- Source name: Yaoihub
- Source language: en
- Selected manga input: popular offset 0: Jinx (`.../1849`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Jinx (`.../1849`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Honey Trouble (`.../1889`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Jinx (`.../1849`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | MILF Hunter in Another World (`.../2541`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Jinx (`.../1849`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (`.../1849`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 110 | Chapter - 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 97 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jinx, URL=`1849` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 103/103 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 103/103 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yaoihub.org/.../read-Jinx-yaoi-webtoon-free-350x476.jpg` (image/jpeg, 34378 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `1849` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yaoihub.org/.../read-Jinx-yaoi-webtoon-free-193x278.jpg` (image/jpeg, 14221 bytes, 193x278) |  |  |  |
| details author | PASS | Mingwa |  |  |  |
| details artist | PASS | Mingwa |  |  |  |
| details genres | PASS | Action, Adult, Drama, Manhwa, Romance, Shounen Ai, Smut, Webtoon, Yaoi, read Jinx online free, read Jinx yaoi all chapter for free, read Jinx yaoi webtoon, read Jinx yaoi webtoon free |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | read Jinx yaoi webtoon free, read Jinx yaoi webtoon, read Jinx online free, read Jinx yaoi all chapter for free<br><br>Physical therapist Kim Dan has been down on his luck for as long as he can remember. Between an ailing grandmother, menacing loansharks, and an old boss making it almost impossible for him to find work, Dan is truly running out of options. Naturally, it feels like a dream come true when he’s finally hired to treat top-paid MMA fighter Joo Jaekyung, especially when the man then calls him out for a treatment the night before a match with an oh-so-tantalizing offer of five thousand dollars. He claims to have a “jinx” in need of a particular type of “treatment,” but it’s one that Dan isn’t quite prepared to offer… You see, Jaekyung may be a beast in the ring, but he’s even rougher in the bedroom, and Dan’s not sure he can survive Jaekyung at his most primal. Nevertheless, the promise of much-needed cash has Dan agreeing to this ill-fated deal… Could a night together be the thing to help Jaekyung break this jinx once and for all? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 110 chapters |  |  |  |
| chapter dates | LINT | 22 of 110 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=22 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 97 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://yaoihub.org/.../C82002C-N1916777N-2.jpg` (image/jpeg, 38434 bytes, 700x513) |  |  |  |
