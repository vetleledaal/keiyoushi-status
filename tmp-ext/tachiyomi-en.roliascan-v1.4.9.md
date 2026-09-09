# Extension Validation Report

- Extension: tachiyomi-en.roliascan-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangataro
- Source ID: 3390167717659783669
- Source name: Rolia Scan
- Source language: en
- Selected manga input: popular offset 0: My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 22 | My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 22 | The Knight Who Only Lives Today (`.../%7B%22id%22:%2211040%22,%22slug%22:%22the-knight-who-only-lives-today%22%7D`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 120 | Rooster Fighter (`.../%7B%22id%22:%22318645%22,%22slug%22:%22rooster-fighter%22%7D`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 110 | FFF-Class Trashero (`.../%7B%22id%22:%22302386%22,%22slug%22:%22fff-class-trashero%22%7D`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 92 | Chapter 1 (`.../ch1-9545`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 38 |  |  | 1-10s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 120 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Bias Gets on the Last Train, URL=`{"id":"7","slug":"my-bias-gets-on-the-last-train"}` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=FFF-Class Trashero, URL=`{"id":"302386","slug":"fff-class-trashero"}` at page 1 offset 117 and page 2 offset 0, title=Dungeon Reset, URL=`{"id":"302383","slug":"dungeon-reset"}` at page 1 offset 118 and page 2 offset 1, title=Solo Camping for Two, URL=`{"id":"301982","slug":"solo-camping-for-two"}` at page 1 offset 119 and page 2 offset 2 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 1 manga entry: title=The Extra’s Academy Survival Guide, URL=`{"id":"10990","slug":"the-extra-s-academy-survival-guide"}`; Popular page 2 repeats 10 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 275/275 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 275/275 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://roliascan.com/.../178671l.webp` (image/webp (encoding: lossy), 46758 bytes, 414x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `{"id":"7","slug":"my-bias-gets-on-the-last-train"}` |  |  |  |
| details thumbnail URL | PASS | `https://roliascan.com/.../178671l.webp` |  |  |  |
| details author | PASS | Jixksee |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Every night, Yeo-un takes the last train home—same route, same time, same routine. But one thing keeps catching his eye: a girl with a guitar and a presence that lingers in his mind. When a shared love for the indie band Long Afternoon sparks a conversation, their late-night encounters begin to turn into something more. But Hae-in isn't just another fan—she's the voice behind the band, a secret she can't afford to reveal. As music draws them closer, the truth may threaten to pull them apart. When the final note plays, will their story end in harmony… or heartbreak?<br>(Source: Webtoon Entertainment)<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 25 name |  |  |  |
| chapters | PASS | 92 chapters |  |  |  |
| chapter dates | PASS | 92 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangataro.yachts/.../001.webp` (image/webp (encoding: lossy), 40274 bytes, 900x1360) |  |  |  |
