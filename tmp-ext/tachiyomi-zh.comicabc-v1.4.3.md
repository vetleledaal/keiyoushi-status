# Extension Validation Report

- Extension: tachiyomi-zh.comicabc-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8110122805257580230
- Source name: 無限動漫
- Source language: zh
- Selected manga input: popular offset 0: 勇者死了!是因為勇者掉進了作為村民的我挖的陷阱裡 (`.../12200.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 48 | 勇者死了!是因為勇者掉進了作為村民的我挖的陷阱裡 (`.../12200.html`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 41 | 威鳴神斗 (`.../25451.html`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 48 | T.T Lovers.-乒乓戀人- (`.../25016.html`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 48 | 間諜在魔教的生活 (`.../25295.html`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 勇者死了!是因為勇者掉進了作為村民的我挖的陷阱裡 (`.../12200.html`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 勇者死了!是因為勇者掉進了作為村民的我挖的陷阱裡 (`.../12200.html`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 203 | 1話 (`https://articles.onemoreplace.tw/.../new-12200.html <redacted query values: ch>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=勇者死了!是因為勇者掉進了作為村民的我挖的陷阱裡, URL=`.../12200.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=間諜在魔教的生活, URL=`.../25295.html` at page 1 offsets 11, 23, 24 and page 2 offset 0, title=嫁神隨神, URL=`.../18402.html` at page 1 offset 47 and page 2 offset 1 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 7 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 186/186 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 186/186 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.8comic.com/.../12200.jpg` (image/jpeg, 21126 bytes, 240x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12200.html` |  |  |  |
| details thumbnail URL | PASS | `https://www.8comic.com/.../12200.jpg` |  |  |  |
| details author | PASS | スバルイチ |  |  |  |
| details artist | PASS | スバルイチ |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 　　這裡就是那有名的地獄之門,三年前,勇者史昂用聖劍之力把這裡封印起來,惡魔侵入村莊,勇者大人前來救場,皆大歡喜,然而!貪食的勇者大人居然掉進布滿尖刺的陷阱死翹翹了,在我一不小心殺了勇者之後..輕鬆的生活開始崩壞!!成為了勇者的村民與屍術師的大冒險! |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 203 chapters |  |  |  |
| chapter dates | LINT | All 203 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=203 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 203 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img7.8comic.com/.../001_fHM.jpg` (image/jpeg, 155807 bytes, 715x1013) |  |  |  |
