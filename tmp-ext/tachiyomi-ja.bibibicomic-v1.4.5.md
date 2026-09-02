# Extension Validation Report

- Extension: tachiyomi-ja.bibibicomic-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3726193166490568923
- Source name: Bibibi Comic
- Source language: ja
- Selected manga input: popular offset 0: 超かぐやメシ！ (`.../41de76fc8df5f`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 超かぐやメシ！ (`.../41de76fc8df5f`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | 別世界ガール (`.../702a130522ef4`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 3 | ムーンブラッドに踊る (`.../a9a63e771874e`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 超かぐやメシ！ (`.../41de76fc8df5f`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 超かぐやメシ！ (`.../41de76fc8df5f`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | 0話 (`.../7e06f5b186c99`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 12 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=超かぐやメシ！, URL=`.../41de76fc8df5f` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 66/66 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 66/66 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260805161357531A45E420D728A3FDB47CE0DD65B21C6F0-lg.webp` (image/webp (encoding: lossy), 18346 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../41de76fc8df5f` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260805161357531A45E420D728A3FDB47CE0DD65B21C6F0.png` (image/png, 1368387 bytes, 2560x1344) |  |  |  |
| details author | PASS | テルヤ, スタジオクロマト・スタジオコロリド |  |  |  |
| details artist | PASS | テルヤ, スタジオクロマト・スタジオコロリド |  |  |  |
| details genres | PASS | ギャグ・コメディー, 一般マンガ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 8000年ぶりに味覚を取り戻したら最初に何食べたい？かぐやが美味しいものを食べて食べて食べまくる！<br>“めでたし"の、その先を描く『超かぐや姫！』公式スピンオフグルメコメディ。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.bibibi-comic.com/.../master-1786013982189-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 0, 7, 10, 1, 8, 12, 5, 15, 14, 2, 9, 11, 4, 6, 3\]` (image/jpeg, 326402 bytes, 850x1200) |  |  |  |
