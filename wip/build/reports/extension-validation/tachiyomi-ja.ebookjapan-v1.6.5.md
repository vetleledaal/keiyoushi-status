# Extension Validation Report

- Extension: tachiyomi-ja.ebookjapan-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 124967435702149192
- Source name: eBookJapan
- Source language: ja
- Selected manga input: popular offset 0: 地味令嬢、しごでき皇妃になる！ (`.../1022969`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 地味令嬢、しごでき皇妃になる！ (`.../1022969`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | 呪われ侯爵様の訳ありメイド (`.../870707`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | 大正學生愛妻家 (`.../862793`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | 陽キャ集団にいる芹沢は、俺の前だと様子がおかしい (`.../945762`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 地味令嬢、しごでき皇妃になる！ (`.../1022969`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 地味令嬢、しごでき皇妃になる！ (`.../1022969`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 🔒 (Preview) 地味令嬢、しごでき皇妃になる！１　契約婚のはずなのに冷血皇帝に溺愛されています (`.../B00167208909`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=地味令嬢、しごでき皇妃になる！, URL=`1022969` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 4 manga entries; Latest page 2 repeats 1 manga entry: title=変幻退魔夜行 カルラ舞う!【完全版】, URL=`593403` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 202/202 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 202/202 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cache2-ebookjapan.akamaized.net/.../S3100547989861.jpg` (image/jpeg, 213461 bytes, 844x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `1022969` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cache2-ebookjapan.akamaized.net/.../S3100547989861.jpg <redacted query values: 1794818474000>` (image/jpeg, 213461 bytes, 844x1200) |  |  |  |
| details author | PASS | ｎａｏｔｏ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「目立たないように大人しく静かにしていろ！」婚約者から命じられ、本来の自分を隠し地味な姿で生きてきた公爵令嬢・ルシェル。理不尽に婚約破棄された宴の場で、隣国の≪冷血皇帝≫カイナスから「私のところに嫁いでくる気はないか？」と突然のプロポーズ！　しかも、皇帝の正体はルシェルが大ファンの小説家で……!?多忙なカイナスを支えるパートナーとしての婚姻を受け入れ、持ち前の能力を発揮していくルシェル。見た目は関係なく、皇妃として妻として必要とし溺愛してくるカイナスに、次第に惹かれていき――取り戻した本当の姿で、趣味もお仕事も恋愛も手に入れる。地味を脱ぎ捨てた令嬢の溺愛×お仕事ストーリー、開幕！<br><br>Publisher: KADOKAWA |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 404 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
