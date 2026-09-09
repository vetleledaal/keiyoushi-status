# Extension Validation Report

- Extension: tachiyomi-ja.mangakingdom-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 23
- Lint: 0
- Warnings: 1
- Skipped: 12
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3806352284314527898
- Source name: Manga Kingdom
- Source language: ja
- Selected manga input: popular offset 0: あなたのお城の小人さん　～御飯下さい、働きますっ～（コミック） (`.../207506`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | あなたのお城の小人さん　～御飯下さい、働きますっ～（コミック） (`.../207506`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 100 | 美醜の大地～復讐のために顔を捨てた女～（分冊版） (`.../97553`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 100 | 刀剣乱舞 あうとどあ異聞 刀剣野営(話売り) (`.../180298`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | あなたのお城の小人さん　～御飯下さい、働きますっ～（コミック） (`.../207506`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | あなたのお城の小人さん　～御飯下さい、働きますっ～（コミック） (`.../207506`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | error | 0 |  | java.lang.NullPointerException | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=あなたのお城の小人さん　～御飯下さい、働きますっ～（コミック）, URL=`207506` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 303/303 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 303/303 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cf.image-cdn.k-manga.jp/.../b207506_5_200.jpg` (image/jpeg, 24485 bytes, 200x284) |  |  |  |
| details identity | PASS | Details preserved selected URL `207506` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cf.image-cdn.k-manga.jp/.../b207506_1_320.jpg` (image/jpeg, 50879 bytes, 320x455) |  |  |  |
| details author | PASS | 美袋和仁, п猫R, 栗原一実 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 女性漫画, SF・ファンタジー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
