# Extension Validation Report

- Extension: tachiyomi-ja.mangabu-v1.4.5
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
- Source ID: 1497299793762441095
- Source name: MangaBu
- Source language: ja
- Selected manga input: popular offset 0: タイムズ・テテパム (`.../6cc74ee4ab789`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | タイムズ・テテパム (`.../6cc74ee4ab789`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 3 | IRUKA (`.../9cafb6d7119c7`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | タイムズ・テテパム (`.../6cc74ee4ab789`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | タイムズ・テテパム (`.../6cc74ee4ab789`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 3 | 第1話 すでに関係している (`.../5b2054580f7d6`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 3 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=タイムズ・テテパム, URL=`.../6cc74ee4ab789` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 19/19 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 19/19 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202608121109392130DA5BD57514048202C773F5325A0CADD-lg.webp` (image/webp (encoding: lossy), 31940 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../6cc74ee4ab789` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202608121109392130DA5BD57514048202C773F5325A0CADD.png` (image/png, 2615524 bytes, 2560x1344) |  |  |  |
| details author | PASS | 井上まい |  |  |  |
| details artist | PASS | 井上まい |  |  |  |
| details genres | PASS | ギャグ・コメディー, 青年マンガ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ひとはふしぎと、隣り合って暮らしてる。<br>引っ越しを考えていた青年・佐藤はひょんな事から「コーポ 宇の舟」へ身を寄せる。彼を出迎えたのは大家の姉妹、そして「ててぱむ！」と喋る謎の生き物（？）だった。戸惑いながらも過ごす日々で、“他人”だった誰かが少しずつ“隣人”になっていく。ゆるやかながらに謎へも迫る、新感覚の生活譚！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.mangabu.jp/.../master-1786697992388-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 3, 6, 1, 13, 14, 0, 9, 11, 15, 7, 2, 5, 12, 8, 4\]` (image/jpeg, 236234 bytes, 844x1200) |  |  |  |
