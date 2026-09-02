# Extension Validation Report

- Extension: tachiyomi-en.manhuahot-v1.6.54
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
- Source ID: 7638481723868333116
- Source name: ManhuaHot
- Source language: en
- Selected manga input: popular offset 0: Deliverance of the Counterattack (`.../2176`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Deliverance of the Counterattack (`.../2176`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Sissy (`.../2541`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | My Secretary Wants to Kill Me! (`.../11384`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | The Fragile Sparrow in the Palm (`.../11183`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Deliverance of the Counterattack (`.../2176`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Deliverance of the Counterattack (`.../2176`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 445 | Chap 0 (`.../chap-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Deliverance of the Counterattack, URL=`2176` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://manhuahot.com/.../55892346._SX318_-175x238.jpg` (image/jpeg, 11627 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `2176` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://manhuahot.com/.../55892346._SX318_-193x278.jpg` (image/jpeg, 14021 bytes, 193x278) |  |  |  |
| details author | PASS | Haier, Popeye 2000 released. |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | BL, Comedy, Manhua, Romance, Shounen Ai, Webtoon, Deliverance of the Counterattack |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Having a two-faced bitch as a love rival isn’t scary… What’s scary is that the bitch has the upper hand—reincarnating as his little brother! Due to his “little brother,” his lover was snatched away, his grandfather suffered a terrible death, the family business was taken over, and on top of all that, he was chained and thrown into prison. However, on the night before his release, he got laid by a man in the midst of confusion and became pregnant. After he got out of prison, he came back anew; he opened a restaurant and made a fortune while raising his child. He lived a vibrant life, but certainly didn’t forget to deal with his horrible ex and bitch.<br><br>Alternative Names: The Art of Taming His Husband, 逆袭之好孕人生; 娇奶爸休想逃, counterattack through pregnancy |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 445 chapters |  |  |  |
| chapter dates | LINT | 124 of 445 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=124 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.manhuahot.com/.../0-(1).jpg` (image/jpeg, 505738 bytes, 800x15033) |  |  |  |
