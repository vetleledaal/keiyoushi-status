# Extension Validation Report

- Extension: tachiyomi-ja.comicgardo-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 27
- Lint: 1
- Warnings: 0
- Skipped: 8
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 3118962894631295374
- Source name: Comic Gardo
- Source language: ja
- Selected manga input: popular offset 0: お気楽領主の楽しい領地防衛　～生産系魔術で名もなき村を最強の城塞都市に～ (`.../3269754496561189230`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 131 | お気楽領主の楽しい領地防衛　～生産系魔術で名もなき村を最強の城塞都市に～ (`.../3269754496561189230`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 131 | 生贄姫の幸福　～孤独な贄の少女は、魔物の王の花嫁となる～ (`.../2551460909949112123`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | お気楽領主の楽しい領地防衛　～生産系魔術で名もなき村を最強の城塞都市に～ (`.../3269754496561189230`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | お気楽領主の楽しい領地防衛　～生産系魔術で名もなき村を最強の城塞都市に～ (`.../3269754496561189230`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 123 | 💴 (Volume) お気楽領主の楽しい領地防衛 1 (`.../4856001361321536511`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: This chapter is either unavailable or must be purchased. | <1s |

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
| popular listing | PASS | 131 entries |  |  |  |
| latest listing | PASS | 131 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=お気楽領主の楽しい領地防衛　～生産系魔術で名もなき村を最強の城塞都市に～, URL=`3269754496561189230` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 263/263 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 263/263 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-gardo.com/.../3269754496561189230-67f02dae7d484773c26d14530746715c <redacted query values: 1779337119>` (image/jpeg, 154723 bytes, 500x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `3269754496561189230` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-gardo.com/.../3269754496561189230-67f02dae7d484773c26d14530746715c <redacted query values: 1779337119>` |  |  |  |
| details author | PASS | 青色まろ.../%E8%B5%A4%E6%B1%A0 宗.../%E8%BB%A2 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 貴族の少年ヴァンに転生した男は、努力の末神童扱いを受けるまでに成長するも「生産魔術」の持ち主と知れると、即辺境の村の領主へと追いやられてしまう。しかし、役立たずと呼ばれた魔術は、材料さえあれば何でも生産できるまさに規格外！　前世の知識とチート魔術で、小さく貧しい村は巨大都市へと成長してゆき――!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 123 chapters |  |  |  |
| chapter dates | PASS | 123 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | This chapter is either unavailable or must be purchased. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
