# Extension Validation Report

- Extension: tachiyomi-ja.comicmedu-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7310112963091407823
- Source name: G-Comi
- Source language: ja
- Selected manga input: popular offset 0: たゆたうふたり (`.../fef424c168c44`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | たゆたうふたり (`.../fef424c168c44`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 勇者さまは報酬に人妻をご希望です (`.../ec10b3f00d2ee`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 街裏ぴんくの超実録！ももいろ体験談 (`.../654850c01109c`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | たゆたうふたり (`.../fef424c168c44`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | たゆたうふたり (`.../fef424c168c44`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 7 | 1服目 (`.../195fcbdc0d24d`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=たゆたうふたり, URL=`fef424c168c44` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202604211830298206144DE8C23209240B8F928D17F407D17-lg.webp` (image/webp (encoding: lossy), 38700 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `fef424c168c44` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202604211830298206144DE8C23209240B8F928D17F407D17.png` (image/png, 3825446 bytes, 2560x1344) |  |  |  |
| details author | PASS | ぷえぶろ |  |  |  |
| details artist | PASS | ぷえぶろ |  |  |  |
| details genres | PASS | NOiPA, 青年マンガ, 百合・GL, ギャグ・コメディー, 学園, 男性向け |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 『タトゥー喫煙先輩×地味カメラ後輩』<br><br>引っ込み思案な大学1年生の『かおり』は念願の女子美大の写真科に入学したものの未だぼっち。<br>理想のキャンパスライフとの落差に落ち込んでいた──…。<br>しかしムカデのタトゥーが印象的な先輩美女『あすか』の喫煙姿に一目惚れし、かおりの大学生活は色づき始めて…！？<br><br>撮って出会って一緒に暮らす！<br>ワクワク×ドキドキ×モクモクな癒しのゆるイチャ女子美大ライフ開幕♪ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 7 chapters |  |  |  |
| chapter dates | PASS | 7 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.g-comi.jp/.../master-1776318444310-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 12, 7, 14, 6, 13, 15, 9, 8, 0, 4, 11, 1, 3, 10, 2\]` (image/jpeg, 1043159 bytes, 1450x2048) |  |  |  |
