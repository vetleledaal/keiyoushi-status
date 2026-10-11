# Extension Validation Report

- Extension: tachiyomi-ja.pashup-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4500173675620672840
- Source name: Pash Up!
- Source language: ja
- Selected manga input: popular offset 0: え、社内システム全てワンオペしている私を解雇ですか？ (`.../00001500`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | え、社内システム全てワンオペしている私を解雇ですか？ (`.../00001500`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | 婚約破棄された令嬢を拾った俺が、イケナイことを教え込む　〜美味しいものを食べさせておしゃれをさせて、世界一幸せな少女にプロデュース！〜 (`.../00000368`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | 皇帝陛下のあたため係 〜冷血白蛇陛下は田舎娘のぬくもりをご所望です!?〜 (`.../00003106`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | 虐げられた秀才令嬢と隣国の腹黒研究者様の甘やかな薬草実験室 (`.../00003052`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | え、社内システム全てワンオペしている私を解雇ですか？ (`.../00001500`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | え、社内システム全てワンオペしている私を解雇ですか？ (`.../00001500`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | 🔒 え、社内システム全てワンオペしている私を解雇ですか？1 (`.../00001958`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.Exception: Log in via WebView and purchase this product to read. | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.Exception: Log in via WebView and purchase this product to read. | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=え、社内システム全てワンオペしている私を解雇ですか？, URL=`00001500` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.pash-up.jp/.../00001500-t.jpg` (image/jpeg, 74724 bytes, 200x200) |  |  |  |
| details identity | PASS | Details preserved selected URL `00001500` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.pash-up.jp/.../00001500-t.jpg` |  |  |  |
| details author | PASS | 漫画: 伊於, 原作: 下城米雪, キャラクター原案: icchi |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 社内システムをワンオペしていた佐藤愛は、社長交代を機に解雇予告を受ける。 退職後、ファミレスでひとり悲しみに暮れていた愛は、幼馴染の鈴木健太と再会する。そして健太は彼女を自らのスタートアップに招待した。 相手の心に寄り添うために始めた事業、その名も「真のプログラマ塾」。 佐藤愛の熱く、時に破天荒な講義で受講生たちは少しだけ前を向く。 ストレス社会で頑張る全ての人たちへ。 明日がちょっとだけ笑顔になれるお話です。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Log in via WebView and purchase this product to read. |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
