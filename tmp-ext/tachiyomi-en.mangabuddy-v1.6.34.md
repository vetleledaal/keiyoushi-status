# Extension Validation Report

- Extension: tachiyomi-en.mangabuddy-v1.6.34
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5020395055978987501
- Source name: MangaK
- Source language: en
- Selected manga input: popular offset 0: Jinx (`.../jinx`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Jinx (`.../jinx`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Solo Max-Level Newbie (`.../solo-max-level-newbie`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Tale of the Floating Sages (`.../tale-of-the-floating-sages`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Loving Aunt (`.../loving-aunt`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Jinx (`.../jinx`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (`.../jinx`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 198 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 98 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jinx, URL=`.../jinx` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rx.resmk.org/.../60adf5a9b476.webp` (image/webp (encoding: lossy), 13644 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jinx` |  |  |  |
| details thumbnail URL | PASS | `https://rx.resmk.org/.../60adf5a9b476.webp` |  |  |  |
| details author | PASS | Mingwa |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Smut, Drama, Boys Love, Sports, Adult, Webtoons, Yaoi, Mature, Romance, Slice of life, Manhwa, Martial arts, Tragedy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Physical therapist Kim Dan has been down on his luck for as long as he can remember. Between an ailing grandmother, menacing loansharks, and an old boss making it almost impossible for him to find work, Dan is truly running out of options. Naturally, it feels like a dream come true when he’s finally hired to treat top-paid MMA fighter Joo Jaekyung, especially when the man then calls him out for a treatment the night before a match with an oh-so-tantalizing offer of five thousand dollars. He claims to have a “jinx” in need of a particular type of “treatment," but it's one that Dan isn't quite prepared to offer… You see, Jaekyung may be a beast in the ring, but he’s even rougher in the bedroom, and Dan’s not sure he can survive Jaekyung at his most primal. Nevertheless, the promise of much-needed cash has Dan agreeing to this ill-fated deal... Could a night together be the thing to help Jaekyung break this jinx once and for all?<br><br>\[Original Webtoon\](https://www.lezhin.com/.../jinx)<br><br>**Official Translations:**  <br>*Uncensored:* \[English\](https://www.lezhinus.com/.../jinx_en), \[Spanish\](https://www.lezhin.es/.../jinx-sin-censura), \[French\](https://www.lezhinfr.com/.../bt_1111096), \[T.Chinese\](https://www.bomtoon.tw/.../jinx), \[Thai\](https://www.lezhinth.com/.../jinx), \[German\](https://www.lezhinde.com/.../dbd_00393)    <br>*Censored:* \[Spanish\](https://www.lezhin.es/.../jinx), \[French\](https://www.lezhinfr.com/.../bt_1110970), \[German\](https://www.lezhinde.com/.../dbd_00331)   <br>Japanese: \[Lezhin\](https://www.lezhin.jp/.../jinx), \[Beltoon\](https://www.beltoon.jp/.../jinx) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 198 chapters |  |  |  |
| chapter dates | PASS | 198 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 98 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://rx.qvzrb.org/.../7fefa5bd2eff.webp` (image/webp (encoding: lossy), 47736 bytes, 720x1159) |  |  |  |
