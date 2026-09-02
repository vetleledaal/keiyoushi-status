# Extension Validation Report

- Extension: tachiyomi-en.octopusmanga-v1.6.54
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
- Source ID: 2527256034272235453
- Source name: OctopusManga
- Source language: en
- Selected manga input: popular offset 0: Jinx [Octopusmanga] (`.../1126`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Jinx [Octopusmanga] (`.../1126`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Accidental Baby (`.../4209`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Moon Embracing The Sun (Yaoi) (`.../2581`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | DESIRE ME IF YOU CAN (`.../3943`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Jinx [Octopusmanga] (`.../1126`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx [Octopusmanga] (`.../1126`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 270 | 0 (`.../n-a`) |  | <1s |
| pages | `getPageList(chapter)` | success | 1 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jinx \[Octopusmanga\], URL=`1126` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://octopusmanga.com/.../tall-1-175x238.jpg` (image/jpeg, 10802 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1126` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://octopusmanga.com/.../tall-1-193x278.jpg` (image/jpeg, 13439 bytes, 193x278) |  |  |  |
| details author | PASS | Mingwa, Mingwa(Story&Art) |  |  |  |
| details artist | PASS | Octopusmanga |  |  |  |
| details genres | PASS | Adult, BL, Drama, Smut, Sports, Yaoi, fanart, Full Color, Jinx Season 2, JinxEnglishsub, jinxmanhwa, Jinxmingwa, Jinxnewchapter, joojaekyung, kimdan, Manhwa, Mature, Medical, Romance, Slice of Life, Violence, Webtoon, Yaoi(BL), 징크스 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Physical therapist Kim Dan has been down on his luck for as long as he can remember. Between an ailing grandmother, menacing loansharks, and an old boss making it almost impossible for him to find work, Dan is truly running out of options. Naturally, it feels like a dream come true when he’s finally hired to treat top-paid MMA fighter Joo Jaekyung, especially when the man then calls him out for a treatment the night before a match with an oh-so-tantalizing offer of five thousand dollars. He claims to have a “jinx” in need of a particular type of “treatment,” but it’s one that Dan isn’t quite prepared to offer… You see, Jaekyung may be a beast in the ring, but he’s even rougher in the bedroom, and Dan’s not sure he can survive Jaekyung at his most primal. Nevertheless, the promise of much-needed cash has Dan agreeing to this ill-fated deal… Could a night together be the thing to help Jaekyung break this jinx once and for all?<br><br>Alternative Names: Jinx/ Jinx Season 2/징크스. .../%E3%82%B8%E3%83%B3%E3%82%AF%E3%82%B9 / Vận xui / Джинкс/ kutukan, nasib sial |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 270 chapters |  |  |  |
| chapter dates | LINT | 83 of 270 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=83 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 1 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://octopusmanga.com/.../000.jpg` (image/jpeg, 107858 bytes, 690x1174) |  |  |  |
