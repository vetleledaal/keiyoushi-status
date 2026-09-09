# Extension Validation Report

- Extension: tachiyomi-ja.bigcomics-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 2944603286439592172
- Source name: Big Comics
- Source language: ja
- Selected manga input: popular offset 0: 昭和天皇物語 (`.../4cfe28e931e27`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 昭和天皇物語 (`.../4cfe28e931e27`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | ヴィンテージ・トーキョー (`.../38a3488d70896`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 9 | 白天狗の贄嫁　〜毒持ちの令嬢はかりそめの妻となる〜 (`.../f01b84991e489`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 昭和天皇物語 (`.../4cfe28e931e27`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 昭和天皇物語 (`.../4cfe28e931e27`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 161 | 第1話◎森の皇子 (`.../5c400901e5d23`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=昭和天皇物語, URL=`.../4cfe28e931e27` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 66/66 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 66/66 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.bigcomics.jp/.../20230518134656334D8B7347FB1970730E216D25AEB12286B-lg.webp` (image/webp (encoding: lossy), 34698 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../4cfe28e931e27` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.bigcomics.jp/.../20230518134656334D8B7347FB1970730E216D25AEB12286B.png` (image/png, 1293563 bytes, 1280x672) |  |  |  |
| details author | PASS | 能條純一, 半藤一利, 志波秀宇 |  |  |  |
| details artist | PASS | 能條純一, 半藤一利, 志波秀宇 |  |  |  |
| details genres | PASS | ヒューマンドラマ, ビッグコミックオリジナル, 歴史・伝記・戦争 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 若き青年君主の凄絶な生涯に迫る!!<br>祖父は明治天皇、父は大正天皇。<br>神として国を背負い、世界で最も大きな戦争を経験し、人としてその生涯を終えた昭和天皇・裕仁。<br>生まれた時から名字はなく、友人も同僚もなく、その立場から降りることもできず、国家そのものであり続けた巨人。<br>使命を帯びた人々や、思惑を持った者たちに囲まれ、彼の人は何に喜び、涙し、怒り震えたのか。<br>圧倒的な人間ドラマを大胆な解釈で描く超話題作!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 161 chapters |  |  |  |
| chapter dates | PASS | 161 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.bigcomics.jp/.../master-1685463735969-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 4, 14, 15, 13, 8, 5, 12, 1, 11, 9, 10, 2, 3, 6, 7\]` (image/jpeg, 250767 bytes, 847x1200) |  |  |  |
