# Extension Validation Report

- Extension: tachiyomi-tr.mikrokosmosfansub-v1.6.16
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1959637408417261960
- Source name: Mikrokosmos Fansub
- Source language: tr
- Selected manga input: popular offset 0: Missing Love/ A Married Man (`.../a-married-man.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 8 | Missing Love/ A Married Man (`.../a-married-man.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Borderline (GÜNCEL) (`.../borderline.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Missing Love/ A Married Man (`.../a-married-man.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Missing Love/ A Married Man (`.../a-married-man.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 78 | Bölüm 1 (`.../bolum-1_19.html`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Missing Love/ A Married Man, URL=`.../a-married-man.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 29/29 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 29/29 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../20210910170111_1631260871231%20%283%29.webp` (image/jpeg, 119763 bytes, 600x931) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-married-man.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../20210910170111_1631260871231%20%283%29.webp` (image/jpeg, 119763 bytes, 600x931) |  |  |  |
| details author | PASS | In Hyerin |  |  |  |
| details artist | PASS | In Hyerin |  |  |  |
| details genres | PASS | Angst, BL, Drama, Mafya, Yaoi, Yetişkin |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Bir fahişe olarak gangsterlerin acımasız dünyasına atılan Geom, insanlığın en çirkin yanlarını görmüştür. Ortadan kaybolduğu acımasız sekiz yılın ardından, bir zamanlar sevdiği adam olan Wooyeon ile yaklaşan evliliğini kutlamak için yeniden bir araya gelir. Wooyeon'u çok derin ve karanlık bir uçurumun içindeki bir ışık olarak gören Geom, kendini yeniden ona doğru çekilirken bulur. Ancak sapkın Rieder ve saplantılı Savcı Lee tarafından ayak bileklerine pranga vurulmuşken, kurtuluş için gerçekten bir umut var mıdır?<br><br>Alternative name(s): Missing Love, Missing Love Türkçe, 결혼하는 남자 ; A Man Getting Married ; A Man Who’s Getting Married, A Married Man Türkçe, |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 23 name, chapter 61 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name |  |  |  |
| chapters | PASS | 78 chapters |  |  |  |
| chapter dates | PASS | 78 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../1.png` (image/webp (container: extended), 1720468 bytes, 689x3816) |  |  |  |
