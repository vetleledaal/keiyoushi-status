# Extension Validation Report

- Extension: tachiyomi-ja.zenon-v1.4.10
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 21
- Lint: 1
- Warnings: 1
- Skipped: 11
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5353704886651317926
- Source name: Zenon
- Source language: ja
- Selected manga input: popular offset 0: 北斗の拳 世紀末ドラマ撮影伝 (`.../3269632237267691927`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 186 | 北斗の拳 世紀末ドラマ撮影伝 (`.../3269632237267691927`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 北斗の拳 世紀末ドラマ撮影伝 (`.../3269632237267691927`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 北斗の拳 世紀末ドラマ撮影伝 (`.../3269632237267691927`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 122 | 💴 (Volume) 北斗の拳 世紀末ドラマ撮影伝 1巻 (`.../12207421983537139625`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | java.lang.Exception: This chapter is either unavailable or must be purchased. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: This chapter is either unavailable or must be purchased. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 186 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=北斗の拳 世紀末ドラマ撮影伝, URL=`.../3269632237267691927` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 11 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 187/187 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 187/187 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-zenon.com%2Fpublic%2Fseries-sub-thumbnail-horizontal-with-logo%2F3269632237267470364-4e924eca8497627aaa2e382b9c5cb40e%3F1785144880` (image/jpeg, 120663 bytes, 688x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../3269632237267691927` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.comic-zenon.com%2Fpublic%2Fseries-thumbnail%2F3269632237267470364-b5c49907265c046cfcab9bb241922d32%3F1782192422` (image/jpeg, 115572 bytes, 484x484) |  |  |  |
| details author | PASS | 武論尊・原哲夫.../%E5%80%89%E5%B0%BE%E5%AE%8F |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 時は世紀末。 海は枯れ、地は裂けた世界。 弱きを傷つける悪に立ち向かう革ジャンの男。 敵を華麗に倒す姿に大きな叫び声が重なる。 「カーーーット！」 枯れた海も、裂けた地も大規模なドラマセット。 これはドラマ『北斗の拳』を日夜撮影する者たちの血と涙と汗の記録。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 122 chapters |  |  |  |
| chapter dates | PASS | 122 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | This chapter is either unavailable or must be purchased. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
