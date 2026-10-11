# Extension Validation Report

- Extension: tachiyomi-ja.zenon-v1.6.1
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
- Source ID: 5353704886651317926
- Source name: Zenon
- Source language: ja
- Selected manga input: popular offset 0: 北斗の拳 世紀末ドラマ撮影伝 (`.../3269632237267470364`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 175 | 北斗の拳 世紀末ドラマ撮影伝 (`.../3269632237267470364`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 175 | オタクに優しいギャルはいない!? (`.../3269754496537756414`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 北斗の拳 世紀末ドラマ撮影伝 (`.../3269632237267470364`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 北斗の拳 世紀末ドラマ撮影伝 (`.../3269632237267470364`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 124 | 💴 (Volume) 北斗の拳 世紀末ドラマ撮影伝 1巻 (`.../12207421983537139625`) |  | 1-10s |
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
| popular listing | PASS | 175 entries |  |  |  |
| latest listing | PASS | 175 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=北斗の拳 世紀末ドラマ撮影伝, URL=`3269632237267470364` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 351/351 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 351/351 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-zenon.com/.../3269632237267470364-b5c49907265c046cfcab9bb241922d32 <redacted query values: 1782192422>` (image/png, 423329 bytes, 504x504) |  |  |  |
| details identity | PASS | Details preserved selected URL `3269632237267470364` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-zenon.com/.../3269632237267470364-b5c49907265c046cfcab9bb241922d32 <redacted query values: 1782192422>` |  |  |  |
| details author | PASS | 武論尊・原哲夫.../%E5%80%89%E5%B0%BE%E5%AE%8F |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 時は世紀末。<br>海は枯れ、地は裂けた世界。<br>弱きを傷つける悪に立ち向かう革ジャンの男。<br>敵を華麗に倒す姿に大きな叫び声が重なる。<br><br>「カーーーット！」<br>枯れた海も、裂けた地も大規模なドラマセット。<br>これはドラマ『北斗の拳』を日夜撮影する者たちの血と涙と汗の記録。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 124 chapters |  |  |  |
| chapter dates | PASS | 124 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | This chapter is either unavailable or must be purchased. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
