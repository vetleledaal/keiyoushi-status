# Extension Validation Report

- Extension: tachiyomi-ja.shonenjumpplus-v1.4.11
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 23
- Lint: 2
- Warnings: 1
- Skipped: 8
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5161357527629843269
- Source name: Shonen Jump+
- Source language: ja
- Selected manga input: latest offset 0: アスラの沙汰 (`.../17106567261425739175`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 97 | 打ち切られ漫画家と同人女 (`.../17107094915405394153`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | アスラの沙汰 (`.../17106567261425739175`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | アスラの沙汰 (`.../17106567261425739175`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | アスラの沙汰 (`.../17106567261425739175`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 52 | 💴 (Volume) アスラの沙汰 1 (`.../17106567263376077117`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: This chapter is either unavailable or must be purchased. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: This chapter is either unavailable or must be purchased. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 97 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=アスラの沙汰, URL=`.../17106567261425739175` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 6 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 110/110 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 110/110 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-ak-img.shonenjumpplus.com%2Fpublic%2Fseries-thumbnail%2F17106567261425153061-f6981e25c2f2f02423aeef60f7e7c70b%3F1780486207` (image/jpeg, 17688 bytes, 216x216) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../17106567261425739175` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-ak-img.shonenjumpplus.com%2Fpublic%2Fseries-thumbnail%2F17106567261425153061-f6981e25c2f2f02423aeef60f7e7c70b%3F1780486207` (image/jpeg, 59554 bytes, 482x482) |  |  |  |
| details author | PASS | 宇乃花空樹 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | <隔週木曜更新>あなたは善いことをするのよ――亡くなった母の教えを守り、善い行いに励むアスラ。どれだけいじめられても、悪い奴には天罰が下ると信じて笑顔で過ごしていた。しかしある日、路地裏で不気味なおじいさんから「地獄の扉を開く鍵」を手渡され… \[JC4巻発売中\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | LINT | 4 of 52 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=4 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | This chapter is either unavailable or must be purchased. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
