# Extension Validation Report

- Extension: tachiyomi-ja.younganimal-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 3590997004623427971
- Source name: Young Animal
- Source language: ja
- Selected manga input: popular offset 0: 捕虜英雄 ～捨て駒にされた剣奴は敵国で成り上がる～ (`.../d74f505c01de1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 捕虜英雄 ～捨て駒にされた剣奴は敵国で成り上がる～ (`.../d74f505c01de1`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 6 | ぼくの好きな人が好きな人 (`.../145fe0e303563`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 捕虜英雄 ～捨て駒にされた剣奴は敵国で成り上がる～ (`.../d74f505c01de1`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 捕虜英雄 ～捨て駒にされた剣奴は敵国で成り上がる～ (`.../d74f505c01de1`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 27 | 第1話 (`.../82c0a6e509a83`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| latest listing | PASS | 6 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=捕虜英雄 ～捨て駒にされた剣奴は敵国で成り上がる～, URL=`.../d74f505c01de1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 39/39 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 39/39 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202503251801482562EFFA95301FAFA6ECA9F009922791EDF-lg.webp` (image/webp (encoding: lossy), 34644 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../d74f505c01de1` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202503251801482562EFFA95301FAFA6ECA9F009922791EDF.png` (image/png, 3904778 bytes, 2560x1344) |  |  |  |
| details author | PASS | 海空りく, 真じろう |  |  |  |
| details artist | PASS | 海空りく, 真じろう |  |  |  |
| details genres | PASS | バトル・アクション, ファンタジー, ヤングアニマル, 異世界・転生 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 戦争の英雄は「奴隷」だった――。<br>魔力を持たないものは「劣等種」とみなされる国、ユースタシア。<br>そんな国で剣奴として見世物になっていたディノは、サンダリア国との戦争に強制出兵されるが…？<br>最強の奴隷が新天地で生きる意味を見出す バトルファンタジー再生譚!!<br>海空りく先生X:@misorariku<br>真じろう先生X:@sinjiro4649 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 27 chapters |  |  |  |
| chapter dates | PASS | 27 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.younganimal.com/.../master-1742891839962-01_q95.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 4, 14, 15, 6, 13, 9, 12, 10, 5, 3, 0, 2, 1, 8, 11\]` (image/jpeg, 338297 bytes, 850x1200) |  |  |  |
