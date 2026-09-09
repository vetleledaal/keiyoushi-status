# Extension Validation Report

- Extension: tachiyomi-ja.comicroombase-v1.4.5
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
- Source ID: 1887776535756811938
- Source name: Comic Room Base
- Source language: ja
- Selected manga input: latest offset 0: ブリンブリン皇国物語～古の皇女と七人の護人～ (`.../bd6d01982bfd1`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 不倫暴露パーティ (`.../2275649236cd2`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 5 | ブリンブリン皇国物語～古の皇女と七人の護人～ (`.../bd6d01982bfd1`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ブリンブリン皇国物語～古の皇女と七人の護人～ (`.../bd6d01982bfd1`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ブリンブリン皇国物語～古の皇女と七人の護人～ (`.../bd6d01982bfd1`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 39 | 偽りの貴族令嬢 (`.../56a7e2dc73976`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 43 |  |  | 1-10s |

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
| latest listing | PASS | 5 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ブリンブリン皇国物語～古の皇女と七人の護人～, URL=`.../bd6d01982bfd1` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 38/38 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 38/38 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260121165950761BC07A4EC10629661B5144DDAAE54FEC2-sm.webp` (image/webp (encoding: lossy), 17756 bytes, 320x168) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bd6d01982bfd1` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260121165950761BC07A4EC10629661B5144DDAAE54FEC2.png` (image/png, 5290498 bytes, 2560x1344) |  |  |  |
| details author | PASS | さく⛤にい／COMIC ROOM |  |  |  |
| details artist | PASS | さく⛤にい／COMIC ROOM |  |  |  |
| details genres | PASS | バトル・アクション, ファンタジー・SF |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 虐げられし孤児だった少女の真の出自は、失われた魔法皇国の皇女だった！？<br>少女よ！運命に導かれし”七人の護人”と共に失われし祖国を復興せよ！<br>少女を次々と襲う数多なる苦難、そしてそれを救う仲間との絆と…愛！<br>気鋭の作家「さく⛤にい」と、日本最高の漫画制作集団コミックルームが贈る、渾身のハイファンタジー！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 39 chapters |  |  |  |
| chapter dates | PASS | 39 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 43 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.comic-room-base.com/.../master-1769567700646-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 10, 4, 13, 3, 12, 7, 6, 15, 5, 9, 11, 14, 1, 0, 8\]` (image/jpeg, 538919 bytes, 1125x1600) |  |  |  |
