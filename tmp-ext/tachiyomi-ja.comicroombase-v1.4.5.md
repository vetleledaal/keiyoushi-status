# Extension Validation Report

- Extension: tachiyomi-ja.comicroombase-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1887776535756811938
- Source name: Comic Room Base
- Source language: ja
- Selected manga input: popular offset 0: 不倫暴露パーティ (`.../2275649236cd2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 不倫暴露パーティ (`.../2275649236cd2`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 8 | 死に戻った妃は華麗なる復讐を遂げる (`.../4f80e8286edcc`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 不倫暴露パーティ (`.../2275649236cd2`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 不倫暴露パーティ (`.../2275649236cd2`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 14 | 第1回不倫暴露パーティ：キングと元カノ (`.../3ec0c2bddcc13`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=不倫暴露パーティ, URL=`.../2275649236cd2` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20251027142102085F21600A880C344177A7390BCF80044AE-lg.webp` (image/webp (encoding: lossy), 19744 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2275649236cd2` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20251027142102085F21600A880C344177A7390BCF80044AE.png` (image/png, 1899361 bytes, 2560x1344) |  |  |  |
| details author | PASS | 葵衣ころも／COMIC ROOM |  |  |  |
| details artist | PASS | 葵衣ころも／COMIC ROOM |  |  |  |
| details genres | PASS | ヒューマンドラマ, 不倫, 復讐 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 鈴木あゆみは悩んでいた。学生時代「キング」と呼ばれていた夫・拓也のモラハラぶりについていけないのだ。<br>夫は青春の延長の如く”いつメン”たちを家に招き、あゆみに酒や食事を用意させては飲めや歌えの大騒ぎ。<br>それでも辛抱強く夫に尽くすあゆみだったが、ある日いつメンの一人であるヤンキー女と夫の不倫関係が発覚！まぐわいながら、睦言の様にあゆみの悪口を垂れ流す二人に、あゆみの我慢もついに限界を迎え…？<br>不倫暴露パーティ、開催決定！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 14 chapters |  |  |  |
| chapter dates | PASS | 14 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.comic-room-base.com/.../master-1760590128483-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 4, 13, 9, 8, 12, 2, 7, 15, 3, 14, 5, 1, 6, 11, 0\]` (image/jpeg, 390409 bytes, 1125x1600) |  |  |  |
