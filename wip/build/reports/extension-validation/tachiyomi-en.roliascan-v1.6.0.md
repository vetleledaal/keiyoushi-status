# Extension Validation Report

- Extension: tachiyomi-en.roliascan-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangataro
- Source ID: 3390167717659783669
- Source name: Rolia Scan
- Source language: en
- Selected manga input: popular offset 0: My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 21 | My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 23 | I Was Mistaken as a Monstrous Genius Actor (`.../%7B%22id%22:%2210560%22,%22slug%22:%22i-was-mistaken-as-a-monstrous-genius-actor%22%7D`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 120 | The Fight Is Too Easy (`.../%7B%22id%22:%22329701%22,%22slug%22:%22the-fight-is-too-easy%22%7D`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 120 | The Concept-Grasping Magical Genius (`.../%7B%22id%22:%22315000%22,%22slug%22:%22the-concept-grasping-magical-genius%22%7D`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Bias Gets on the Last Train (`.../%7B%22id%22:%227%22,%22slug%22:%22my-bias-gets-on-the-last-train%22%7D`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 92 | Chapter 1 (`.../ch1-9545`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | <1s |

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
| popular listing | PASS | 21 entries |  |  |  |
| latest listing | PASS | 120 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Bias Gets on the Last Train, URL=`{"id":"7","slug":"my-bias-gets-on-the-last-train"}` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=The Concept-Grasping Magical Genius, URL=`{"id":"315000","slug":"the-concept-grasping-magical-genius"}` at page 1 offset 115 and page 2 offset 0, title=My Quiet Blacksmith Life in Another World, URL=`{"id":"314977","slug":"my-quiet-blacksmith-life-in-another-world"}` at page 1 offset 116 and page 2 offset 1, title=I was Summoned to Another World, but I Got the Power to Cut Anything, so It was Easy Mode, URL=`{"id":"314668","slug":"i-was-summoned-to-another-world-but-i-got-the-power-to-cut-anything-so-it-was-easy-mode"}` at page 1 offset 117 and page 2 offset 2, title=The Descent of the Demonic Master, URL=`{"id":"314655","slug":"the-descent-of-the-demonic-master"}` at page 1 offset 118 and page 2 offset 3, title=Becoming a God, Starting as a Water Monkey, URL=`{"id":"314516","slug":"becoming-a-god-starting-as-a-water-monkey"}` at page 1 offset 119 and page 2 offset 4 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 1 manga entry: title=The Extra’s Academy Survival Guide, URL=`{"id":"10990","slug":"the-extra-s-academy-survival-guide"}`; Popular page 2 repeats 9 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 285/285 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 285/285 manga have thumbnail URLs |  |  |  |
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
