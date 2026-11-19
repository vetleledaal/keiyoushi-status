# Extension Validation Report

- Extension: tachiyomi-ja.dokiraw-v1.6.20
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3967449247820755680
- Source name: Dokiraw
- Source language: ja
- Selected manga input: popular offset 0: 婚約破棄されたので、好きにすることにした。 (`.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | 婚約破棄されたので、好きにすることにした。 (`.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | 星交O者 (`.../xing-jiao-ozhe`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | 女嫌い公爵はただ一人の令嬢にのみ恋をする (`.../nu-xian-igong-jue-hatadayi-ren-noling-niang-ninomilian-wosuru`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | ネカマの鈴屋さん (`.../nekamanoling-wu-san`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 婚約破棄されたので、好きにすることにした。 (`.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 婚約破棄されたので、好きにすることにした。 (`.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 108 | 第1.1話 (`.../chapter-1.1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=婚約破棄されたので、好きにすることにした。, URL=`.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 113/113 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 113/113 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://admin.mangarawad.quest/.../cover.jpg` (image/jpeg, 29405 bytes, 320x455) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita` |  |  |  |
| details thumbnail URL | PASS | `https://admin.mangarawad.quest/.../cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ファンタジー, ロマンス |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | メルディカル侯爵令嬢のクロエは、男尊女卑の根強いアダナーニ王国の第二王子・キリフのお飾り婚約者。しかしキリフに婚約破棄を突き付けられたショックで、OL・橘美紗としての前世の記憶を思い出した！「せっかく生まれ変わったのだから、もっと人生を楽しみたい――」すべてを捨てて自由に生きようと決意したクロエは、騒動に便乗して近衛騎士を辞めてきたエーリヒを相棒に、自由を求めて旅立った！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 108 chapters |  |  |  |
| chapter dates | PASS | 108 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://dokiraw.quest/.../hot <redacted query values: page>` to `https://dokiraw.men/.../hot <redacted query values: page>` (1 redirects); popular: `https://dokiraw.quest/.../manga <redacted query values: status, sort, and page>` to `https://dokiraw.men/.../manga <redacted query values: status, sort, and page>` (1 redirects); popular: `https://dokiraw.quest/.../hot <redacted query values: page>` to `https://dokiraw.men/.../hot <redacted query values: page>` (1 redirects); popular: `https://dokiraw.quest/.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita` to `https://dokiraw.men/.../hun-yue-po-qi-saretanode-hao-kinisurukotonishita` (1 redirects); popular: `https://dokiraw.quest/.../manga <redacted query values: keyword and page>` to `https://dokiraw.men/.../manga <redacted query values: keyword and page>` (1 redirects); popular: `https://dokiraw.quest/.../chapter-1.1` to `https://dokiraw.men/.../chapter-1.1` (1 redirects); popular: `https://dokiraw.quest/.../manga <redacted query values: status, sort, and page>` to `https://dokiraw.men/.../manga <redacted query values: status, sort, and page>` (1 redirects) |  |  |  |
| page load | PASS | `https://iphotomg.com/.../page_0.jpg` (image/jpeg, 169574 bytes, 720x1024) |  |  |  |
