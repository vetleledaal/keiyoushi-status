# Extension Validation Report

- Extension: tachiyomi-ja.raw1001-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: liliana
- Source ID: 3349575794425308347
- Source name: Raw1001
- Source language: ja
- Selected manga input: popular offset 0: アオアシ (`.../aoashi004`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 42 | アオアシ (`.../aoashi004`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 42 | 手に入れた催眠アプリで夢のハーレム生活を送りたい (`.../shouni-rureta-cui-mianapuride-mengnoharemu-sheng-huowo-songritai`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | 生まれた直後に捨てられたけど、前世が大賢者だったので余裕で生きてます (`.../shengmareta-zhi-houni-sheteraretakedo-qian-shiga-da-xian-zhedattanode-yu-yude-shengkitemasu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 極悪令嬢は仁義を貫く (`.../ji-e-ling-niangha-ren-yiwo-guanku`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | アオアシ ブラザーフット (`.../aoashi-burazafutto`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | アオアシ (`.../aoashi004`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 410 | 第1話 (`.../di1hua`) |  | <1s |
| pages | `getPageList(chapter)` | success | 63 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 42 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=アオアシ, URL=`.../aoashi004` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 134/134 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 134/134 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://raw1001.net/.../aoashi004.jpg <redacted query values: 1728346956>` (image/jpeg, 86585 bytes, 360x506) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../aoashi004` |  |  |  |
| details thumbnail URL | PASS | `https://raw1001.net/.../aoashi004.jpg <redacted query values: 1728346956>` |  |  |  |
| details author | PASS | 未詳 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 愛媛に暮らす中学三年生・青井葦人（あおいアシト）。粗削りながら、強烈なサッカーの才能を秘めているアシトだったが、まっすぐすぎる性格が災いして、大きな挫折を経験することに―――そんなアシトの前に、東京にある強豪Ｊクラブ「東京シティ・エスペリオン」のユースチーム監督・福田達也（ふくだたつや）が現れる。アシトの無限の可能性を見抜いた福田は、東京で開催される自チームのセレクションを受けるよう勧めて！？将来、日本のサッカーに革命を起こすことになる少年の運命は、ここから急速に回り始める！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 410 chapters |  |  |  |
| chapter dates | PASS | 410 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 63 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://sg.cdnkk.top/.../0000.webp` (image/webp (encoding: lossy), 186346 bytes, 800x1142) |  |  |  |
